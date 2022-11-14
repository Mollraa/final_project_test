package com.prj.cosm.sales.client.service;

import java.util.List;

import com.prj.cosm.sales.orders.service.SalesOrdersVO;

public interface SalesClientService {
//고객 정보 - 마이페이지

	// 주문번호순으로 정렬
	public int getOrderNo();

	// 주문 전체조회
	public List<SalesOrdersVO> salesOrderList();

	// 주문 단건조회
	public SalesOrdersVO selectOrderInfo(SalesOrdersVO vo);

	// 주문 등록
	// public int insertOrder(int orderNo);
	public SalesOrdersVO insertOrder(SalesOrdersVO vo);

	// 주문 내역삭제
	
	// 수정-담당자, 주소, 연락처
	
	// 삭제-탈퇴
	// public int deleteOrderInfo(int orderNo);
	public SalesOrdersVO deleteOrderInfo(SalesOrdersVO vo);

}
