package com.delasport.oddsdelivery.feed.consumer.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LiveScores {

    protected LineEntity lineEntity;

    protected GamePeriod gamePeriod;

    protected Integer home;

    protected Integer away;
}
