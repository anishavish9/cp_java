package com.example.service;

import com.example.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IEmployee {
    void create(Employee e);
    Mono<Employee> findById(Integer id);
    Flux<Employee> findByName(String name);
    Flux<Employee> findAll();
}
