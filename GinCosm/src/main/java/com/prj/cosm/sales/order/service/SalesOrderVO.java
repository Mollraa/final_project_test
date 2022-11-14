package com.prj.cosm.sales.order.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SalesOrderVO {
//고객 주문정보
	
	private int orderNo; //주문번호
	private int orderClientNo; //거래처번호
	private int orderProductNo; //제품번호
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDate; //주문일자
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDeliveryDate; //납기일자
	private String orderProductName; //제품명
	private int orderTotalNum; //수량
	private int orderTotalPrice; //공급가액(부가세 제외한 금액)
	private int orderSurtax;//부가세
	private int orderNote; //비고(요청사항)
	private String orderCode; //코드번호- 주문타입
	private String orderProgressCode; //코드번호 - 진행상황
}
