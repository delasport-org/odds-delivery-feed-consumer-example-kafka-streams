package com.delasport.oddsdelivery.feed.consumer.example.models.bets;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import com.delasport.oddsdelivery.feed.consumer.example.models.bets.selections.Selection_selection;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wager {
    private Wager_origin origin;
    private Long id;
    private String type;
    private String status;
    private String source;
    private Wager_member member;
    private Wager_session session;
    private Wager_currency currency;
    private Wager_brand brand;
    private Wager_odds odds;
    private Wager_stake stake;
    private Wager_potentialWinnings potentialWinnings;
    private Wager_gain gain;
    private Integer numberOfSelections;
    private String createdAt;
    private String updatedAt;
    private String handledAt;
    private String acceptedAt;
    private String timestamp;
    private List<Integer> selectedSystems;
    private String systemGroupName;
    private String selectionCombineKey;
    private List<Selection_selection> selections;

}
