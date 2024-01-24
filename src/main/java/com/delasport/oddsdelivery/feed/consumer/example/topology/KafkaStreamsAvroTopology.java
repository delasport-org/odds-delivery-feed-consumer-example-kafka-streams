package com.delasport.oddsdelivery.feed.consumer.example.topology;

import com.delasport.oddsdelivery.feed.consumer.example.config.SportsDataConfig;
import com.delasport.oddsdelivery.feed.consumer.example.handlers.UncaughtExceptionHandler;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import models.avro.EventSportsStreamMessage;
import models.avro.MarketSportsStreamMessage;
import models.avro.SettlementSportsStreamMessage;
import models.avro.wager.Wager;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.config.StreamsBuilderFactoryBean;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@ConditionalOnProperty(value = "input.data.type", havingValue = "avro", matchIfMissing = false)
public class KafkaStreamsAvroTopology {


    private final SportsDataConfig sportsDataConfig;
    private final StreamsBuilderFactoryBean streamsBuilderFactoryBean;
    private final SpecificAvroSerde<Wager> wagerSpecificAvroSerde;
    private final SpecificAvroSerde<SettlementSportsStreamMessage> settlementSportsStreamMessageSpecificAvroSerde;
    private final SpecificAvroSerde<EventSportsStreamMessage> eventSportsStreamMessageSpecificAvroSerde;
    private final SpecificAvroSerde<MarketSportsStreamMessage> marketSportsStreamMessageSpecificAvroSerde;


    @Autowired
    public void defineTopology() throws Exception {

        StreamsBuilder builder = streamsBuilderFactoryBean.getObject();
        assert builder != null;

        streamsBuilderFactoryBean.setStreamsUncaughtExceptionHandler(new UncaughtExceptionHandler());

//        builder.stream(sportsDataConfig.getComputedBetTopic(), Consumed.with(Serdes.String(), wagerSpecificAvroSerde))
//
//                .peek((key, value) -> {
//                    log.info("Got Record From Bet Stream with id {} - {}", key, value.toString());
//                });

        builder.stream(sportsDataConfig.getComputedEventTopic(), Consumed.with(Serdes.String(), eventSportsStreamMessageSpecificAvroSerde))

                .peek((key, value) -> {
                            log.info("Got Record From Event Stream with id {} - {}", key, value.toString());
                        }
                );

        builder.stream(sportsDataConfig.getComputedMarketTopic(), Consumed.with(Serdes.String(), marketSportsStreamMessageSpecificAvroSerde))
                .peek((key, value) -> {
                    log.info("Got Record From Market Stream with id {} - {}", key, value.toString());
                });

        builder.stream(sportsDataConfig.getComputedSettlementTopic(), Consumed.with(Serdes.String(), settlementSportsStreamMessageSpecificAvroSerde))
                .peek((key, value) -> {
                    log.info("Got Record From Settlement Stream with id {} - {}", key, value.toString());
                });
    }

}
