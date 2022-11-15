package com.prj.cosm.sales.orders.service;

import java.util.List;

public interface ordersService {
//고객의 주문정보
	
	//주문번호순으로 정렬
	public int getOrderNo();
	
	//주문 전체조회
	public List<ordersVO> salesOrderList();
	
	//주문 단건조회
	public ordersVO selectOrderInfo(ordersVO vo);
	
	//주문 등록 
	//public int insertOrder(int orderNo);
	public ordersVO insertOrder(ordersVO vo);
	
	//주문 내역삭제
	//public int deleteOrderInfo(int orderNo);
	public ordersVO deleteOrderInfo(ordersVO vo);
	
}
