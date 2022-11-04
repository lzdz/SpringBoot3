package com.ithema.controller;

import com.ithema.service.MyAsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAsyncController {
    @Autowired
    private MyAsyncService myAsyncService;
    @GetMapping("/sendSMS")
    public String sendSMS() throws Exception {
        Long startTime = System.currentTimeMillis();
        myAsyncService.sendSMS();
        Long endTime = System.currentTimeMillis();
        System.out.println("主流程耗时："+(endTime - startTime));
        return "success";
    }
}
