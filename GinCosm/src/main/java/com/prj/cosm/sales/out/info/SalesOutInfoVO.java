package com.prj.cosm.sales.out.info;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SalesOutInfoVO {
//완제품 관리(출고, 검수)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date salesOrderDate; // 주문일자
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date salesDeliveryDate; // 납기일자
	private String salesState; // 진행상황
	private String salesNote; // 요청메세지
	private int clientNo; // 거래처번호
	private String salesInspection; // 검수여부
	private String registLOT; // LOT_NO
	private String codeNo; // 코드번호

}
