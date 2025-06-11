package com.berkayerol.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {

    @Scheduled(cron = "* 30 12 * * *")
    public void write1to10() {
        for(int i=1;i<=10;i++){
            System.out.print(i+ " ");
        }

    }
}
