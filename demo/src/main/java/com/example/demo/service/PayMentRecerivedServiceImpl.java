package com.example.demo.service;



import com.example.demo.controller.param.PayMentListParam;
import com.example.demo.dto.PayMentDTO;
import com.example.demo.mapper.PayMentRecerived;
import com.example.demo.model.PayMent;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class PayMentRecerivedServiceImpl implements PayMentRecerivedService {

    @Autowired
    PayMentRecerived payMentRecrived;

    @Override
    public PageInfo<PayMentDTO> getPayMentList(PayMentListParam payMentListParam, int offset, int pageSize) {
            PageInfo<PayMentDTO> pageInfo=
        PageHelper.startPage()
        return ;
    }

    @Override
    public BigDecimal getAllReceivedAmount() {
        return payMentRecrived.getAllReceivedAmount();
    }
}
