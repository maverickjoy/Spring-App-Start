package com.demo.project.SpringDemoApp.controller;

import com.demo.project.SpringDemoApp.model.User;
import com.demo.project.SpringDemoApp.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping(value = "/getServiceName")
    public String getName() {
        return sampleService.getServiceName();
    }

    @GetMapping(value = "/getNameById")
    public String getName(@RequestParam int id) {
        return sampleService.getUserNameById(id);
    }

    @PostMapping(value = "/saveUser")
    public Boolean saveName(@RequestBody User user) {
        sampleService.saveUser(user);
        return true;
    }
}
