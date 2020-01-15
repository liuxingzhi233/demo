package com.example.demo.controller;


import com.example.demo.controller.param.PayMentListParam;
import com.example.demo.model.PayMent;
import com.example.demo.service.PayMentRecerivedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/PayMentRecerived/*")
public class PayMentRecerivedController {

    @Autowired
    PayMentRecerivedService payMentRecrivedService;


    @PostMapping("/all-list")
    public List<PayMent> getPayMentList(PayMentListParam payMentListParam){

        return payMentRecrivedService.getPayMentList();
    }

    @PostMapping("/all-receivedAmount")
    public BigDecimal getAllReceivedAmount(){

        return payMentRecrivedService.getAllReceivedAmount();
    }

}
