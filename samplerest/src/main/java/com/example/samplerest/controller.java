package com.example.samplerest;


import com.example.samplerest.models.*;
import com.example.samplerest.repositories.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.hibernate.annotations.Parent;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.print.attribute.URISyntax;
import java.io.DataInput;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class controller {

//    @Autowired
//    private AuthorizationRepository authorizationRepository;
//    @Autowired
//    private CustomerRepository customerRepository;
//    @Autowired
//    private DataRepository dataRepository;
//    @Autowired
//    private HistoryRepository historyRepository;
//    @Autowired
//    private LogRepository logRepository;
//    @Autowired
//    private StatusRepository statusRepository;


//    @RequestMapping("/verification")
//    public String sendPost() throws URISyntaxException, IOException {
//
//            RestTemplate restTemplate = new RestTemplate();
//            final String baseUrl = "http://localhost:8890/verification/";
//            URI uri = new URI(baseUrl);
//            String date = "2020-10-01";
//            Date date1 = Date.valueOf(date);
//            String reference = "DG4uishudoq90LD";
//            Customer customer = new Customer(84312L, "CUS_hdhye17yj8qd2tx", "BoJack", "Horseman", "bojack@horseman.com");
//            Authorization authorization = new Authorization("AUTH_8dfhjjdt", "visa", "1381", "08", "2018", "412345", "TEST BANK", "card", true, "NG");
//            History history = new History("input", "Filled these fields: card number, card expiry, card cvv", 7);
//            historyRepository.save(history);
//            Log log = new Log( 9, 1, null, 0, true, false, null, null, history);
//        customerRepository.save(customer);
//        authorizationRepository.save(authorization);
//        logRepository.save(log);
//            Data data = new Data(27000l, "NGN", date1, "success", reference, "test", 0, "Successful", null, "card", "41.1.25.1", log, null, authorization, customer, "PLN_0as2m9n02c10kp6");
//            Status status = new Status(false, "Verification successful", data);
//            dataRepository.save(data);
//            statusRepository.save(status);
//            HttpHeaders headers = new HttpHeaders();
//            headers.set("X-COM-PERSIST", "true");
//            headers.set("X-COM-LOCATION", "NIGERIA");
//            ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
//            String stat = mapper.writeValueAsString(status);
//            HttpEntity<?> request = new HttpEntity<>(stat, headers);
//        System.out.println(status);
//            ResponseEntity<String> send = restTemplate.postForEntity(uri, request, String.class);
//
//        if(send!=null){
//            return "Success";
//        }
//        return "failed";
//    }

    @RequestMapping("/verify")
    public String sendPost() throws URISyntaxException, IOException {

        RestTemplate restTemplate = new RestTemplate();
        final String baseUrl = "http://localhost:8077/verification/";
        URI uri = new URI(baseUrl);
        String payStackJson = "\n" +
                "{  \n" +
                "   \"status\":true,\n" +
                "   \"message\":\"Verification successful\",\n" +
                "   \"data\":{  \n" +
                "      \"amount\":27000,\n" +
                "      \"currency\":\"NGN\",\n" +
                "      \"transaction_date\":\"2016-10-01T11:03:09.000Z\",\n" +
                "      \"status\":\"success\",\n" +
                "      \"reference\":\"DG4uishudoq90LD\",\n" +
                "      \"domain\":\"test\",\n" +
                "      \"metadata\":0,\n" +
                "      \"gateway_response\":\"Successful\",\n" +
                "      \"message\":null,\n" +
                "      \"channel\":\"card\",\n" +
                "      \"ip_address\":\"41.1.25.1\",\n" +
                "      \"log\":{  \n" +
                "         \"time_spent\":9,\n" +
                "         \"attempts\":1,\n" +
                "         \"authentication\":null,\n" +
                "         \"errors\":0,\n" +
                "         \"success\":true,\n" +
                "         \"mobile\":false,\n" +
                "         \"input\":[ ],\n" +
                "         \"channel\":null,\n" +
                "         \"history\":[  \n" +
                "            {  \n" +
                "               \"type\":\"input\",\n" +
                "              \"message\":\"Filled these fields: card number, card expiry, card cvv\",\n" +
                "               \"time\":7\n" +
                "            },\n" +
                "            {  \n" +
                "               \"type\":\"action\",\n" +
                "               \"message\":\"Attempted to pay\",\n" +
                "               \"time\":7\n" +
                "            },\n" +
                "            {  \n" +
                "               \"type\":\"success\",\n" +
                "               \"message\":\"Successfully paid\",\n" +
                "               \"time\":8\n" +
                "            },\n" +
                "            {  \n" +
                "               \"type\":\"close\",\n" +
                "               \"message\":\"Page closed\",\n" +
                "               \"time\":9\n" +
                "            }\n" +
                "         ]\n" +
                "      },\n" +
                "      \"fees\":null,\n" +
                "      \"authorization\":{  \n" +
                "         \"authorization_code\":\"AUTH_8dfhjjdt\",\n" +
                "         \"card_type\":\"visa\",\n" +
                "         \"last4\":\"1381\",\n" +
                "         \"exp_month\":\"08\",\n" +
                "         \"exp_year\":\"2018\",\n" +
                "         \"bin\":\"412345\",\n" +
                "         \"bank\":\"TEST BANK\",\n" +
                "         \"channel\":\"card\",\n" +
                "         \"reusable\":true,\n" +
                "         \"country_code\":\"NG\"\n" +
                "      },\n" +
                "      \"customer\":{  \n" +
                "         \"id\":84312,\n" +
                "         \"customer_code\":\"CUS_hdhye17yj8qd2tx\",\n" +
                "         \"first_name\":\"BoJack\",\n" +
                "         \"last_name\":\"Horseman\",\n" +
                "         \"email\":\"bojack@horseman.com\"\n" +
                "      },\n" +
                "      \"plan\":\"PLN_0as2m9n02cl0kp6\"\n" +
                "   }\n" +
                "}";
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-COM-PERSIST", "true");
        headers.set("X-COM-LOCATION", "Nigeria");
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(payStackJson, headers);
        ResponseEntity<String> send = restTemplate.postForEntity(uri, request, String.class);
        return payStackJson;
    }
}
