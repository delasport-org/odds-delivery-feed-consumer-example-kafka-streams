package com.delasport.oddsdelivery.feed.consumer.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventInfo {

    private String id;

    private String state;

    private String status;

    private LiveGamePeriod liveGamePeriod;

    private Integer liveMinute;

    private Integer marketsCount;

    private String startDate;

    private String timeRange;

    private Sport sport;

    private Country country;

    private League league;

    private Teams teams;
}
