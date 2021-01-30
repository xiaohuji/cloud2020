package com.sy.fourteenstack.service.impl;

import com.sy.fourteenstack.entities.Payment;
import com.sy.fourteenstack.dao.PaymentDao;
import com.sy.fourteenstack.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
