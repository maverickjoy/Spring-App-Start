package com.demo.project.SpringDemoApp.service;

import com.demo.project.SpringDemoApp.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


@Slf4j
@Service
public class SampleService {

    private HashMap<Integer, String> userIdToName;

    public SampleService() {
        this.userIdToName = new HashMap<>();
        userIdToName.put(1, "vikram"); // sample
    }

    public String getServiceName() {
        log.info("Service Name Called");
        return "Spring Demo App";
    }

    public String getUserNameById(int id) {
        log.info("Getting user name for id {}", id);
        return userIdToName.getOrDefault(id, "Id not present");
    }

    public String getEmailById(int id) {
        sendDummyGetRequest();
        return "email";
    }

    public User saveUser(User user) {
        log.info("Saving user : {}", user.toString());
        sendDummyPostRequest();
        return user;
    }

    private void sendDummyGetRequest() {
        log.info("Sending Dummy Get Request");
        final RestTemplate restTemplate = new RestTemplate();
        final HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-COM-PERSIST", "NO");
        headers.set("X-COM-LOCATION", "USA");

        final HttpEntity<String> entity = new HttpEntity<>(headers);
        String url = "http://localhost:1337/api/sample/dummyGet/{name}";
        Map<String, String> urlParams = new HashMap<>();
        urlParams.put("name", "joy");

        String urlWithVariables = UriComponentsBuilder.fromUriString(url)
                .buildAndExpand(urlParams)
                .toUriString();
        log.info("URL Query With Variables : {}", urlWithVariables);

        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(urlWithVariables)
                .queryParam("id", 2);
        log.info("Final URL Query : {}", uriBuilder.toUriString());

        ResponseEntity<String> responseEntity = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, entity, String.class);
        String res = responseEntity.getBody();
        log.info("Received response: {}", res);
    }

    private void sendDummyPostRequest() {
        log.info("Sending Dummy Post Request");
        final RestTemplate restTemplate = new RestTemplate();
        final HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-COM-PERSIST", "NO");
        headers.set("X-COM-LOCATION", "USA");

        User user = new User();
        user.setId(3);
        user.setName("vikram");
        user.setEmail("vikram@gmail.com");

        final HttpEntity<User> entity = new HttpEntity<>(user, headers);
        String url = "http://localhost:1337/api/sample/dummyPost";

        ResponseEntity<User> responseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, User.class);
        User res = responseEntity.getBody();
        log.info("Received response: {}", res.toString());
    }

}
