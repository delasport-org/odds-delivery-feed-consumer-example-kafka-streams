package com.delasport.oddsdelivery.feed.consumer.example.models.bets.selections;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Selection_selection_odds {

    private Selection_selection_odds_player player;
    private Selection_selection_odds_system system;

}
