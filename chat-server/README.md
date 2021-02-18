## Dependecies

# Kafka
# zookeper

## Before Running the Project 



*Start Zookeeper*
```shell script
zookeeper-server-start .\config\zookeeper.properties
```

*Start Kafka*
```shell script
kafka-server-start .\config\server.properties
```

*Create a Topic*
```
kafka-topics --create --topic ladygaga-chat --zookeeper localhost:2181 --replication-factor 1 --partitions 1
