package com.example;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.client.FindIterable;

public class LeituraBDMongo {
    public void teste() {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("todo-app-jwt");
            MongoCollection<Document> collection = database.getCollection("users");

            FindIterable<Document> iterable = collection.find();
            for (Document doc : iterable) {
                System.out.println("Nome: " + doc.getString("name") + " ,Email: " + doc.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
