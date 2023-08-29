package com.delasport.oddsdelivery.feed.consumer.example.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class LiveScore {

    protected String lineEntityId;

    protected String lineEntityName;

    protected String gamePeriodId;

    protected String gamePeriodName;

    protected Integer homeTeam;

    protected Integer awayTeam;
}
