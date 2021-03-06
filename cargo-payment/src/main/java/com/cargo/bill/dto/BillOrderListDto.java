package com.cargo.bill.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: xinzs
 * @Date: 2020/11/9 16:37
 */
@ApiModel("付款审核列表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillOrderListDto extends BillOrderDto{

    /**
     * 订单号
     */
    @ApiModelProperty("订单号")
    private String orderNo;

    /**
     * 承运商名所属组织ID
     */
    @ApiModelProperty("承运商名所属组织ID")
    private String orgId;

    /**
     * 账单状态（1、待审核；2、待付款；3、已付款）
     */
    @ApiModelProperty("账单状态（1、待审核；2、待付款；3、已付款）")
    private String billStatus;

    /**
     * 支付模式（1、APP端；2、PC端）
     */
    @ApiModelProperty("支付模式（1、APP端；2、PC端）")
    private String paymentSource;

    /**
     * 支付方式（1、支付宝）
     */
    @ApiModelProperty("支付方式（1、支付宝）")
    private String paymentType;

    @ApiModelProperty("开始时间")
    private String startTime;

    @ApiModelProperty("结束时间")
    private String endTime;
}
