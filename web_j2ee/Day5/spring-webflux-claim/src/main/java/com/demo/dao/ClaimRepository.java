package com.demo.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.demo.model.Claim;

import reactor.core.publisher.Flux;
 
public interface ClaimRepository extends ReactiveMongoRepository<Claim, Integer> {
    @Query("{ 'name': ?0 }")
    Flux<Claim> findByName(final String name);
}