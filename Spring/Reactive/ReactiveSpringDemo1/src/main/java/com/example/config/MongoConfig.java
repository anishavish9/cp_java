package com.example.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories(basePackages = "com.example.repository")
public class MongoConfig extends AbstractReactiveMongoConfiguration {

    @Value("${dbName}")
    private String dbName;

    @Value("${port}")
    private String port;

    public MongoClient reactiveMongoClient() {
        return MongoClients.create();
    }


    protected String getDatabaseName() {
        return dbName;
    }


    public ReactiveMongoTemplate reactiveMongoTemplate() {
        return  new ReactiveMongoTemplate(reactiveMongoClient(), getDatabaseName());
    }


}
