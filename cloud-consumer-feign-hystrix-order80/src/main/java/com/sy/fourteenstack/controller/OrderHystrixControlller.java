package com.sy.fourteenstack.controller;

import com.sy.fourteenstack.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderHystrixControlller {

    @Resource
    private PaymentHystrixService paymentHystrixService;


}
