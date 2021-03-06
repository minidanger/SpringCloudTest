package com.lzr.springcloudtest.service.impl;

import com.lzr.springcloudtest.dao.PaymentDao;
import com.lzr.springcloudtest.entities.Payment;
import com.lzr.springcloudtest.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int creat(Payment payment)
    {
        return paymentDao.creat(payment);
    }
    public Payment getPaymentByid(@Param("id") Long id){

        return paymentDao.getPaymentByid(id);
    }
}
