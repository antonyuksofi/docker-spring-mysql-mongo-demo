package com.myapps.dockerdemo.common;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class MongoDBClient {

    private final MongoClient mongoClient;
    private final MongoDatabase database;

    MongoDBClient(@Value("${mongo.uri}") String mongoUri,
                  @Value("${mongo.db.name}") String mongoDBName) {
        mongoClient = MongoClients.create(mongoUri);
        database = mongoClient.getDatabase(mongoDBName);
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    @PreDestroy
    public void closeConnection() {
        mongoClient.close();
    }
}
