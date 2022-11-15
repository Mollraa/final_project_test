package com.prj.cosm.sales.orders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prj.cosm.sales.orders.mapper.ordersMapper;
import com.prj.cosm.sales.orders.service.ordersService;
import com.prj.cosm.sales.orders.service.ordersVO;

@Service
public class ordersServiceImpl implements ordersService{

	@Autowired
	ordersMapper mapper;
	
	@Override
	public int getOrderNo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ordersVO> salesOrderList() {
		// TODO Auto-generated method stub
		return mapper.orderList();
	}

	@Override
	public ordersVO selectOrderInfo(ordersVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ordersVO insertOrder(ordersVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ordersVO deleteOrderInfo(ordersVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
