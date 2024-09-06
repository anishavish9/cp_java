package com.demo.service;

import com.demo.model.Claim;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClaimService
{
    void create(Claim e);

    Mono<Claim> findById(Integer id);

    Flux<Claim> findByName(String name);

    Flux<Claim> findAll();

    Mono<Claim> update(Claim e);

    Mono<Void> delete(Integer id);
}