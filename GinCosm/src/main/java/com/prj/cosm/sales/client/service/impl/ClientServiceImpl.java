package com.prj.cosm.sales.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prj.cosm.sales.client.mapper.ClientMapper;
import com.prj.cosm.sales.client.service.ClientService;
import com.prj.cosm.sales.orders.service.ordersVO;

@Service
public class ClientServiceImpl implements ClientService  {

	@Autowired
	ClientMapper mapper;
	
	@Override
	public int getOrderNo() {
		//주문번호 +1
		return 0;
	}

	@Override
	public List<ordersVO> salesOrderList() {
		// TODO Auto-generated method stub
		return null;
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
