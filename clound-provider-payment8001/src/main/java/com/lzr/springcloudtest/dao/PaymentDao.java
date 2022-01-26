package com.lzr.springcloudtest.dao;

import com.lzr.springcloudtest.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao
{
    //曾删改查
    public int creat(Payment payment);
    public Payment getPaymentByid(@Param("id") Long id);
}
