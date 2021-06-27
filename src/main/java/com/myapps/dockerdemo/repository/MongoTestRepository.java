package com.myapps.dockerdemo.repository;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.myapps.dockerdemo.common.MongoDBClient;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;

@Repository
public class MongoTestRepository {

    private MongoDatabase database;
    private MongoCollection<Document> collection;

    @Autowired
    MongoDBClient mongoDBClient;

    @PostConstruct
    private void populateDB() {
        this.database = mongoDBClient.getDatabase();
        this.collection = database.getCollection("my_first_collection");
    }

    public String insert(Map<String, String> map) {
        Document document = new Document();
        document.put("_id", new ObjectId());
        document.putAll(map);

        collection.insertOne(document);

        return String.valueOf(document.get("_id"));
    }

    public String get(String key, String value) {
        return String.valueOf(collection.find(new Document(key, value))
                .first());
    }

    public String getAll() {
        StringBuilder stringBuilder = new StringBuilder();

        MongoCursor<Document> cursor = collection.find()
                .cursor();

        while (cursor.hasNext()) {
                stringBuilder.append(cursor.next());
        }

        return stringBuilder.toString();
    }
}
