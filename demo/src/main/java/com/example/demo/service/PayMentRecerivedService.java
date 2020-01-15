package com.example.demo.service;



import com.example.demo.controller.param.PayMentListParam;
import com.example.demo.model.PayMent;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public interface PayMentRecerivedService {

    public List<PayMent> getPayMentList(PayMentListParam payMentListParam, int offset, int pageSize);

    public BigDecimal getAllReceivedAmount();


}
