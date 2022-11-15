package com.prj.cosm.sales.orders.mapper;

import java.util.List;

import com.prj.cosm.sales.orders.service.ordersVO;

public interface ordersMapper {
//주문
	
		//주문번호순으로 정렬
		public int getOrderNo();
		
		//주문 전체조회
		public List<ordersVO> orderList();
		
		//주문 단건조회
		public ordersVO orderInfo(ordersVO vo);
		
		//주문 등록 
		//public int insertOrder(int orderNo);
		public ordersVO insertOrder(ordersVO vo);
		
		//주문 내역삭제
		//public int deleteOrderInfo(int orderNo);
		//체크박스 -> 여러건 삭제 
		public ordersVO deleteOrder(ordersVO vo);
		
		//수정 - 주문상태
		
		//수정 - 재고입출고 상황
		
		//수정 - 배송상황
		
		
}
