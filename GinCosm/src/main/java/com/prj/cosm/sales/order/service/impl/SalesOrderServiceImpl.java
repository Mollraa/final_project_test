package com.prj.cosm.sales.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prj.cosm.sales.order.mapper.SalesOrderMapper;
import com.prj.cosm.sales.order.service.SalesOrderService;
import com.prj.cosm.sales.order.service.SalesOrderVO;

@Service
public class SalesOrderServiceImpl implements SalesOrderService{

	@Autowired
	SalesOrderMapper mapper;
	
	@Override
	public int getOrderNo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SalesOrderVO> salesOrderList() {
		// TODO Auto-generated method stub
		return mapper.salesOrderList();
	}

	@Override
	public SalesOrderVO selectOrderInfo(SalesOrderVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalesOrderVO insertOrder(SalesOrderVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalesOrderVO deleteOrderInfo(SalesOrderVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
