package com.lzr.springcloudtest.controller;

import com.lzr.springcloudtest.entities.CommonResult;
import com.lzr.springcloudtest.entities.Payment;
import com.lzr.springcloudtest.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController
{
    @Resource
    private PaymentService paymentService;

    @PutMapping(value = "/payment/creat")
    public CommonResult creat(Payment payment)
    {
        int result = paymentService.creat(payment);
        log.info("******插入结果："+result);
        if(result>0)
        {
            return new CommonResult(200,"插入成功");
        }
        else
        {
            return new CommonResult(444,"插入成功");
        }
    }
}
