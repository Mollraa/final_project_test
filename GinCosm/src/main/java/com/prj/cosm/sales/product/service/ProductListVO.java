package com.prj.cosm.sales.product.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ProductListVO {
//제품리스트 - 고객용
	private String productName; // 제품명
	private int productUnitPrice; // 단가
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date productPeriod; // 제작기간
	private String productInfomation; // 상세정보
	private String productImage; // 이미지
}
