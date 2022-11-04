package com.ithema.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyAsyncService {
    @Async
    public void sendSMS() throws Exception {
        System.out.println("调用短信验证码业务方法......");
        Long startTime = System.currentTimeMillis();
        Thread.sleep(500);
        Long endTime = System.currentTimeMillis();
        System.out.println("短信业务执行完成耗时："+(endTime - startTime));
    }
}
