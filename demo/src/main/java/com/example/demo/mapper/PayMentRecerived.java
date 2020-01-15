package com.example.demo.mapper;


import com.example.demo.controller.param.PayMentListParam;
import com.example.demo.model.PayMent;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface PayMentRecerived {


    String BASE_INFO="paymentReceivedNo,keepingAccountsDate,serialNumber,receivedAmount,accountName,accountNo," +
            "subbranch,uses,projectId,provinceId,organizationId,status,pushStatus";





    /**
     * 根据编号，用户名，确认状态
     *
     *
     * */


    @Select({
            "<script>",
            "SELECT  ",BASE_INFO," FROM PaymentReceived  WHERE deleted=0  ",
            "<if test=\" null!=paymentReceivedNo \">",
            " AND paymentReceivedNo=#{paymentReceivedNo}",
            " </if>",
            "<if test=\" null!=accountName \">",
            " AND accountName LIKE  concat('%', #{accountName}, '%')",
            "</if>",
            "<if test=\" null!=pushStatus \">",
            " AND pushStatus=#{pushStatus} ",
            "</if>",
            "<if test=\" null!=organizationId \"> ",
            "AND organizationId=#{organizationId} " ,
            "</if>",
            "<if test=\" null!=startDate \"  >",
            " AND  keepingAccountsDate &gt; =#{startDate}",
            " </if>",
            "<if test=\" null!=endDate \"  >",
            " AND  keepingAccountsDate &lt; =#{endDate} ",
            "</if>",
            "<if test=\" null!=maxReceivedAmount \"  > ",
            "AND  receivedAmount &lt; =#{maxReceivedAmount}",
            " </if>",
            "<if test=\" null!=minReceivedAmount \"  > ",
            "AND  receivedAmount &gt; =#{minReceivedAmount} ",
            "</if>",
            "LIMIT #{offset},#{pageSize} ",
            "</script>"

    })
    public  List<PayMent> getPayMentList(PayMentListParam payMentListParam,int pageNum,int page);



    @Select("SELECT SUM(receivedAmount) FROM PaymentReceived WHERE deleted=0")
    public BigDecimal getAllReceivedAmount();


    @Select("SELECT organizationId FROM PaymentReceived WHERE  organizationId = #{organizationId}")
    public String getorganizationId();


}
