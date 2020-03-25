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

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/")
public class controller {

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
        headers.set("Authorization", "Bearer sk_test_81faa90c2aad40bae29d9e9319ff6ebfd13a459b");
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(payStackJson, headers);
        ResponseEntity<String> send = restTemplate.postForEntity(uri, request, String.class);
        return payStackJson;
    }
}
