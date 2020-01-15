package com.example.demo.controller.param;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PayMentListParam {

    private String paymentReceivedNo;

    private  String accountName;

    private Integer pushStatus;

    private Long organizationId;

    private Date startDate;

    private Date endDate;

    private BigDecimal maxReceivedAmount;

    private BigDecimal minReceivedAmount;

    private int offset;

    private int pageSize;




}
