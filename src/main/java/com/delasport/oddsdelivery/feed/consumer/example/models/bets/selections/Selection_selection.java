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
public class Selection_selection {

    private Long id;
    private String status;
    private Selection_selection_eventInfo eventInfo;
    private Selection_selection_lineInfo lineInfo;
    private Selection_selection_odd odd;

}

