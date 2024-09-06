package com.example.controller;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = {"/create","/"},method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Employee e) {
        employeeService.create(e);
    }

    @RequestMapping(value = {"/id"},method = RequestMethod.GET)
    public ResponseEntity<Mono<Employee>> findById(@PathVariable("id") Integer id) {
        Mono<Employee> e = employeeService.findById(id);
        return new ResponseEntity<Mono<Employee>>(e,HttpStatus.FOUND);

    }

    @RequestMapping(value = {"/name"},method = RequestMethod.GET)
    public Flux<Employee> findByName(@PathVariable("name") String name) {
        return employeeService.findByName(name);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.ALL_VALUE)
    public Flux<Employee> findAll() {
        return (Flux<Employee>)employeeService.findAll();
    }
}
