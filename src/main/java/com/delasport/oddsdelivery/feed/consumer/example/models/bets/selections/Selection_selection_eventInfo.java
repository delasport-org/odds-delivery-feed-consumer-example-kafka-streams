package com.delasport.oddsdelivery.feed.consumer.example.models.bets.selections;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Selection_selection_eventInfo {

    private Long id;
    private String state;
    private String status;
    private Selection_selection_eventInfo_liveGamePeriod liveGamePeriod;
    private Integer liveMinute;
    private String startDate;
    private Selection_selection_eventInfo_sport sport;
    private Selection_selection_eventInfo_country country;
    private Selection_selection_eventInfo_league league;
    private Selection_selection_eventInfo_teams teams;

}
