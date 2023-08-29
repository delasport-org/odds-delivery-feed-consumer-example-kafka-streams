package com.delasport.oddsdelivery.feed.consumer.example;

import com.delasport.oddsdelivery.feed.consumer.example.config.SportsDataConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@EnableKafka
@EnableKafkaStreams
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.*"})
@EnableConfigurationProperties({SportsDataConfig.class})
public class OddsDeliveryFeedConsumerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(OddsDeliveryFeedConsumerExampleApplication.class, args);
    }

}
