package com.delasport.oddsdelivery.feed.consumer.example.models.messages;

import com.delasport.oddsdelivery.feed.consumer.example.models.EventInfo;
import com.delasport.oddsdelivery.feed.consumer.example.models.LiveScores;
import com.delasport.oddsdelivery.feed.consumer.example.models.Origin;
import com.delasport.oddsdelivery.feed.consumer.example.models.Score;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventSportsComputedMessage {

    private Origin origin;

    private String id;

    private EventInfo eventInfo;

    private List<LiveScores> liveScores;

    private Map<String, Map<String, Score>> typedScores;

    private String timestamp;

    private String additionalInfo;
}
