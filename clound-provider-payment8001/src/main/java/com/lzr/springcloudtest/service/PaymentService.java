package com.lzr.springcloudtest.service;

import com.lzr.springcloudtest.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService
{
    public int creat(Payment payment);
    public Payment getPaymentByid(@Param("id") Long id);
}
