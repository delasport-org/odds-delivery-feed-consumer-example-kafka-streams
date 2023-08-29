package com.delasport.oddsdelivery.feed.consumer.example.serde;

import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;
import io.confluent.kafka.schemaregistry.client.SchemaRegistryClient;
import io.confluent.kafka.schemaregistry.json.JsonSchemaProvider;
import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import io.confluent.kafka.streams.serdes.json.KafkaJsonSchemaSerde;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.kafka.core.ConsumerFactory;

import java.util.Collections;
import java.util.Map;

@Slf4j
public class SchemaRegistryDeserializer<T> implements Deserializer<T> {

    private Deserializer<T> deserializer;


    public SchemaRegistryDeserializer(final Class<T> pType, final ConsumerFactory<String, Object> kafkaConfig) {
        final Map<String, Object> serdeConfig = kafkaConfig.getConfigurationProperties();
        final var url = (String) serdeConfig.get(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG);
        final SchemaRegistryClient schemaRegistryClient = new CachedSchemaRegistryClient(url, 100,
                Collections.singletonList(new JsonSchemaProvider()), serdeConfig);
        try (final KafkaJsonSchemaSerde<T> serde = new KafkaJsonSchemaSerde<>(schemaRegistryClient, pType)) {
            serde.configure(serdeConfig, false);
            deserializer = serde.deserializer();
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage(), e);
        }
    }

    @Override
    public T deserialize(final String pTopic, final byte[] pBytes) {
        return deserializer.deserialize(pTopic, pBytes);
    }
}