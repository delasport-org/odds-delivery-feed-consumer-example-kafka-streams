package com.delasport.oddsdelivery.feed.consumer.example.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class Odd {

    protected String id;

    protected String key;

    protected Double value;

    protected Integer isValid;
}
