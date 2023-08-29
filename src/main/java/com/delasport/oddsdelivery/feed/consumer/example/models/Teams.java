package com.delasport.oddsdelivery.feed.consumer.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Teams {

    protected Team home;

    protected Team away;
}
