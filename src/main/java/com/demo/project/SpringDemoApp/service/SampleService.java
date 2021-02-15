package com.demo.project.SpringDemoApp.service;

import com.demo.project.SpringDemoApp.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;


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

    public User saveUser(User user) {
        log.info("Saving user : {}", user.toString());
        return user;
    }
}
