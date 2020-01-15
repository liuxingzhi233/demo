package com.example.demo.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PayMent {

    private Long id;

    private String paymentReceivedNo;

    private Date keepingAccountsDate;

    private String serialNumber;

    private BigDecimal receivedAmount;

    private String accountName;

    private String accountNo;

    private String subbranch;

    private String uses;

    private Long projectId;

    private Long provinceId;

    private Long organizationId;

    private Integer status;

    private Integer pushStatus;

    private String claimMemo;

    private Date createTime;

    private Date updateTime;

    private Boolean deleted;


}
