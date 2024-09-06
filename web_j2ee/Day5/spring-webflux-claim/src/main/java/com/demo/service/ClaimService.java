package com.demo.service;

import com.demo.dao.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Claim;
 
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
@Service
public class ClaimService implements IClaimService {
     
    @Autowired
    ClaimRepository ClaimRepo;
 
    public void create(Claim e) {
        ClaimRepo.save(e).subscribe();
    }
 
    public Mono<Claim> findById(Integer id) {
        return ClaimRepo.findById(id);
    }
 
    public Flux<Claim> findByName(String name) {
        return ClaimRepo.findByName(name);
    }
 
    public Flux<Claim> findAll() {
        return ClaimRepo.findAll();
    }
 
    public Mono<Claim> update(Claim e) {
        return ClaimRepo.save(e);
    }
 
    public Mono<Void> delete(Integer id) {
        return ClaimRepo.deleteById(id);
    }
 
}