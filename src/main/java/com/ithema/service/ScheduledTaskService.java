package com.ithema.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname ScheduledTaskService
 * @Description TODO
 */
@Service
public class ScheduledTaskService {
    private static  final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private  Integer count1 = 1;
    private  Integer count2 = 1;
    private  Integer count3 = 1;

    @Scheduled(fixedRate = 60000)
    public void sheduledTaskImmediately(){
        System.out.println(String.format("fixedRate第%s次执行，当前时间为：%s",count1++,dateFormat.format(new Date())));
    }

    @Scheduled(fixedRate = 60000)
    public void sheduledTaskAfterSleep() throws InterruptedException {
        System.out.println(String.format("fixedDelay第%s次执行，当前时间为：%s", count2++, dateFormat.format(new Date())));
        Thread.sleep(10000);
    }

    @Scheduled(cron = "0 * * * * *")
    public void scheduledTaskCron(){
        System.out.println(String.format("cron第%s次执行，当前时间为：%s",count3++, dateFormat.format(new Date())));
    }
}
