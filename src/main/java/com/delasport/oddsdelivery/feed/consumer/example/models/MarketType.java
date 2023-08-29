package com.delasport.oddsdelivery.feed.consumer.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MarketType {

    protected String id;

    protected String name;
}
