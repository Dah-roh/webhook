package com.example.receiverest;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class apiController {


    @Autowired
    public employeeRepository employeeeRepository;

    @PostMapping(path= "/employees", consumes = "application/json", produces = "application/json")
    public void addEmployee (
            @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
            @RequestHeader(name = "X-COM-LOCATION", defaultValue = "NIGERIA") String headerLocation,
            @RequestBody Employee employee ) throws Exception
    {
        employeeeRepository.save(employee);
        System.out.println(employeeeRepository.findAll());

    }

    @GetMapping("/list")
    public List<Employee> addEmployee () {
        return employeeeRepository.findAll();

    }

}
