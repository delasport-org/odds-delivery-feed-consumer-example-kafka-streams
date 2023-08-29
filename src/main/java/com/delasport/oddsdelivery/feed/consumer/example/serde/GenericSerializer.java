package com.delasport.oddsdelivery.feed.consumer.example.serde;

import io.confluent.kafka.serializers.KafkaJsonSerializer;

import java.util.HashMap;

public class GenericSerializer<T> extends KafkaJsonSerializer<T> {

    public GenericSerializer() {
        final HashMap<String, String> config = new HashMap<>();
        config.put("json.indent.output", "false");
        config.put("json.write.dates.iso8601", "false");
        configure(config, false);
    }
}
