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
public class Selection_selection_lineInfo {

    private Long id;
    private String index;
    private String updatedAt;
    private Selection_selection_lineInfo_marketType marketType;
    private Selection_selection_lineInfo_lineEntity lineEntity;
    private Selection_selection_lineInfo_gamePeriod gamePeriod;
    private Boolean isValid;
    private Double spread;

}
