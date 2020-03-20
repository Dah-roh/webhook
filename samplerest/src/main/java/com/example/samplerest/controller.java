package com.example.samplerest;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/")
public class controller {

    @RequestMapping("/employee")
    public String sendPost() throws URISyntaxException {

            RestTemplate restTemplate = new RestTemplate();
            final String baseUrl = "http://localhost:8890/employees/";
            URI uri = new URI(baseUrl);
            Employee employee = new Employee("Adam", "Gilly", "test@email.com");

            HttpHeaders headers = new HttpHeaders();
            headers.set("X-COM-PERSIST", "true");
            headers.set("X-COM-LOCATION", "NIGERIA");

            HttpEntity<Employee> request = new HttpEntity<>(employee, headers);
            ResponseEntity<String> send = restTemplate.postForEntity(uri, request, String.class);
        if(send!=null){
            return "Success";
        }
        return "failed";
    }
}
