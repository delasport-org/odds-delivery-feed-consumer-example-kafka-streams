# odds-delivery-feed-consumer-example

### Base requirements
* java: ^17.0

### Docker Compose
* install docker
* install docker-compose

### How to start the application to consume from JSON topics
* In order to run the application run docker-compose -f docker-compose-prod.yml up in the terminal
* After a successful build you will start seeing data coming 

### How to start the application to consume from AVRO topics
* In order to run the application run docker-compose -f docker-compose-avro-prod.yml up in the terminal
* After a successful build you will start seeing data coming 

### Models of the computed messages

* Events - https://github.com/delasport-org/odds-delivery-feed-consumer-example-kafka-streams/blob/main/src/main/java/com/delasport/oddsdelivery/feed/consumer/example/models/messages/EventSportsComputedMessage.java
* Markets - https://github.com/delasport-org/odds-delivery-feed-consumer-example-kafka-streams/blob/main/src/main/java/com/delasport/oddsdelivery/feed/consumer/example/models/messages/MarketSportsComputedMessage.java
* Settlements - https://github.com/delasport-org/odds-delivery-feed-consumer-example-kafka-streams/blob/main/src/main/java/com/delasport/oddsdelivery/feed/consumer/example/models/messages/SettlementSportsComputedMessage.java
* Bets - https://github.com/delasport-org/odds-delivery-feed-consumer-example-kafka-streams/blob/main/src/main/java/com/delasport/oddsdelivery/feed/consumer/example/models/bets/Wager.java