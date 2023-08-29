package com.delasport.oddsdelivery.feed.consumer.example.serde;

import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;
import io.confluent.kafka.schemaregistry.client.SchemaRegistryClient;
import io.confluent.kafka.schemaregistry.json.JsonSchemaProvider;
import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import io.confluent.kafka.streams.serdes.json.KafkaJsonSchemaSerde;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serializer;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.ProducerFactory;

import java.util.Collections;
import java.util.Map;

@Slf4j
public class SchemaRegistrySerializer<T> implements Serializer<T> {

    private Serializer<T> serializer;

    public SchemaRegistrySerializer(final Class<T> pType, final ConsumerFactory<String, Object> kafkaConfig) {
        final Map<String, Object> serdeConfig = kafkaConfig.getConfigurationProperties();
        final var url = (String) serdeConfig.get(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG);
        final SchemaRegistryClient schemaRegistryClient = new CachedSchemaRegistryClient(url, 100,
                Collections.singletonList(new JsonSchemaProvider()), serdeConfig);
        try (final KafkaJsonSchemaSerde<T> serde = new KafkaJsonSchemaSerde<>(schemaRegistryClient, pType)) {
            serde.configure(serdeConfig, false);
            serializer = serde.serializer();
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage(), e);
        }
    }

    @Override
    public byte[] serialize(final String topic, T data) {
        return serializer.serialize(topic, data);
    }

    @Override
    public void configure(final Map<String, ?> configs, final boolean isKey) {

    }
}