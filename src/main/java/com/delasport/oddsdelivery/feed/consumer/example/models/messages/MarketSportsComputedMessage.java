package com.delasport.oddsdelivery.feed.consumer.example.models.messages;

import com.delasport.oddsdelivery.feed.consumer.example.models.EventInfo;
import com.delasport.oddsdelivery.feed.consumer.example.models.LineInfo;
import com.delasport.oddsdelivery.feed.consumer.example.models.OddOddsHistory;
import com.delasport.oddsdelivery.feed.consumer.example.models.Origin;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarketSportsComputedMessage {

    private Origin origin;

    private String id;

    private EventInfo eventInfo;

    private LineInfo lineInfo;

    private List<OddOddsHistory> odds;

    private String timestamp;

}
