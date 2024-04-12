package com.demo.project.controller;

import com.demo.project.model.User;
import com.demo.project.service.SampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @Value("${app.name}")
    private String appName;

    @Value("${app.deleted.token:DEFAULT_DELETED_TOKEN}")
    private String deleted;

    @GetMapping(value = "/getAppName")
    public String getAppName() {
        return appName;
    }

    @GetMapping(value = "/getServiceName")
    public String getServiceName() {
        return sampleService.getServiceName();
    }

    @GetMapping(value = "/getNameById")
    public String getName(@RequestParam int id) {
        return sampleService.getUserNameById(id);
    }

    @PostMapping(value = "/saveUser")
    public Boolean saveUser(@RequestBody User user) {
        sampleService.saveUser(user);
        return true;
    }

    @GetMapping(value = "/getEmailById")
    public String getEmail(@RequestParam int id) {
        return sampleService.getEmailById(id);
    }


    @PostMapping(value = "/dummyPost")
    public User  dummyPost(@RequestBody User user) {
        log.info("Dummy Post End Point Called with following user {} input", user.toString());
        return user;
    }

    /*
        PathVariable : http://my-rest-url.org/rest/account/2 => http://my-rest-url.org/rest/account/{account} -> account value becomes 2 | url parameters
        RequestParam :  http://my-rest-url.org/rest/account?name=joy | query parameters
     */
    @GetMapping(value = "/dummyGet/{name}")
    public String dummyGet(@PathVariable("name") String name, @RequestParam int id) {
        log.info("Dummy Get End Point Called with following name {} and id {}", name, id);
        return name;
    }

    @DeleteMapping(value = "/dummyDelete/{name}")
    public String dummyDelete(@PathVariable("name") String name) {
        log.info("Started Deleting name : {}", name);
        return deleted;
    }
}