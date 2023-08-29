package com.delasport.oddsdelivery.feed.consumer.example.models.messages;

import com.delasport.oddsdelivery.feed.consumer.example.models.EventInfo;
import com.delasport.oddsdelivery.feed.consumer.example.models.LineInfo;
import com.delasport.oddsdelivery.feed.consumer.example.models.OddOddsHistory;
import com.delasport.oddsdelivery.feed.consumer.example.models.Origin;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class SettlementSportsComputedMessage {

    private Origin origin;

    private String id;

    private String status;

    private EventInfo eventInfo;

    private LineInfo lineInfo;

    private OddOddsHistory odd;

    private String timestamp;

}
