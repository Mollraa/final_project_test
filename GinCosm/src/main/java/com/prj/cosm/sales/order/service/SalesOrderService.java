package com.prj.cosm.sales.order.service;

import java.util.List;

public interface SalesOrderService {
//고객의 주문정보
	
	//주문번호순으로 정렬
	public int getOrderNo();
	
	//주문 전체조회
	public List<SalesOrderVO> salesOrderList();
	
	//주문 단건조회
	public SalesOrderVO selectOrderInfo(SalesOrderVO vo);
	
	//주문 등록 
	//public int insertOrder(int orderNo);
	public SalesOrderVO insertOrder(SalesOrderVO vo);
	
	//주문 내역삭제
	//public int deleteOrderInfo(int orderNo);
	public SalesOrderVO deleteOrderInfo(SalesOrderVO vo);
	
}
