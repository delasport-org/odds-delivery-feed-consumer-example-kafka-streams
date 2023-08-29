package com.delasport.oddsdelivery.feed.consumer.example.topology;

import com.delasport.oddsdelivery.feed.consumer.example.config.SportsDataConfig;
import com.delasport.oddsdelivery.feed.consumer.example.handlers.UncaughtExceptionHandler;
import com.delasport.oddsdelivery.feed.consumer.example.models.bets.Wager;
import com.delasport.oddsdelivery.feed.consumer.example.models.messages.EventSportsComputedMessage;
import com.delasport.oddsdelivery.feed.consumer.example.models.messages.MarketSportsComputedMessage;
import com.delasport.oddsdelivery.feed.consumer.example.models.messages.SettlementSportsComputedMessage;
import com.delasport.oddsdelivery.feed.consumer.example.serde.SchemaRegistryDeserializer;
import com.delasport.oddsdelivery.feed.consumer.example.serde.SchemaRegistrySerializer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.config.StreamsBuilderFactoryBean;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
@ConditionalOnProperty(value = "input.data.type", havingValue = "json", matchIfMissing = false)
public class KafkaStreamsJsonTopology {

    private final SportsDataConfig sportsDataConfig;

    private final ConsumerFactory<String, Object> kafkaConfig;

    private final StreamsBuilderFactoryBean streamsBuilderFactoryBean;

    @Autowired
    public void buildTopology(final StreamsBuilder streamsBuilder) {

        streamsBuilderFactoryBean.setStreamsUncaughtExceptionHandler(new UncaughtExceptionHandler());

        final KStream<String, EventSportsComputedMessage> eventSportsComputedMessageKStream = streamsBuilder.stream(
                sportsDataConfig.getComputedEventTopic(), Consumed.with(Serdes.String(),
                        Serdes.serdeFrom(new SchemaRegistrySerializer<>(EventSportsComputedMessage.class, kafkaConfig),
                                new SchemaRegistryDeserializer<>(EventSportsComputedMessage.class, kafkaConfig))));

        eventSportsComputedMessageKStream.peek((key, value) -> {
            log.info("Got Record From Event Stream with id {} - {}", key, value.toString());
        });

        final KStream<String, MarketSportsComputedMessage> marketSportsComputedMessageKStream = streamsBuilder.stream(
                sportsDataConfig.getComputedMarketTopic(), Consumed.with(Serdes.String(),
                        Serdes.serdeFrom(new SchemaRegistrySerializer<>(MarketSportsComputedMessage.class, kafkaConfig),
                                new SchemaRegistryDeserializer<>(MarketSportsComputedMessage.class, kafkaConfig))));

        marketSportsComputedMessageKStream.peek((key, value) -> {
            log.info("Got Record From Market Stream with id {} - {}",  key, value.toString());
        });

        final KStream<String, SettlementSportsComputedMessage> settlementSportsComputedMessageKStream = streamsBuilder.stream(
                sportsDataConfig.getComputedSettlementTopic(), Consumed.with(Serdes.String(),
                        Serdes.serdeFrom(new SchemaRegistrySerializer<>(SettlementSportsComputedMessage.class, kafkaConfig),
                                new SchemaRegistryDeserializer<>(SettlementSportsComputedMessage.class, kafkaConfig))));

        settlementSportsComputedMessageKStream.peek((key, value) -> {
            log.info("Got Record From Settlement Stream with id {} - {}",  key, value.toString());
        });

        final KStream<String, Wager> betSportsComputedMessageKStream = streamsBuilder.stream(
                sportsDataConfig.getComputedBetTopic(), Consumed.with(Serdes.String(),
                        Serdes.serdeFrom(new SchemaRegistrySerializer<>(Wager.class, kafkaConfig),
                                new SchemaRegistryDeserializer<>(Wager.class, kafkaConfig))));

        betSportsComputedMessageKStream.peek((key, value) -> {
            log.info("Got Record From Bet Stream with id {} - {}",  key, value.toString());
        });
    }
}
