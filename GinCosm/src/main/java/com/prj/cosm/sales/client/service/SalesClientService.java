package com.prj.cosm.sales.client.service;

import java.util.List;

import com.prj.cosm.sales.order.service.SalesOrderVO;

public interface SalesClientService {
//고객 정보 - 마이페이지

	// 주문번호순으로 정렬
	public int getOrderNo();

	// 주문 전체조회
	public List<SalesOrderVO> salesOrderList();

	// 주문 단건조회
	public SalesOrderVO selectOrderInfo(SalesOrderVO vo);

	// 주문 등록
	// public int insertOrder(int orderNo);
	public SalesOrderVO insertOrder(SalesOrderVO vo);

	// 주문 내역삭제
	
	// 수정-담당자, 주소, 연락처
	
	// 삭제-탈퇴
	// public int deleteOrderInfo(int orderNo);
	public SalesOrderVO deleteOrderInfo(SalesOrderVO vo);

}
