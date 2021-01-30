package com.sy.fourteenstack.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id){
        return "Thread pool: "+ Thread.currentThread().getName()+" OK, id: " + id;
    }

    public String paymentInfo_TimeOUT(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Thread pool: "+ Thread.currentThread().getName()+" TimeOUT, id: " + id;
    }
}
