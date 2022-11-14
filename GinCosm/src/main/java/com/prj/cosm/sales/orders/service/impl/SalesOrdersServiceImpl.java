package com.prj.cosm.sales.orders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prj.cosm.sales.orders.mapper.SalesOrdersMapper;
import com.prj.cosm.sales.orders.service.SalesOrdersService;
import com.prj.cosm.sales.orders.service.SalesOrdersVO;

@Service
public class SalesOrdersServiceImpl implements SalesOrdersService{

	@Autowired
	SalesOrdersMapper mapper;
	
	@Override
	public int getOrderNo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SalesOrdersVO> salesOrderList() {
		// TODO Auto-generated method stub
		return mapper.salesOrderList();
	}

	@Override
	public SalesOrdersVO selectOrderInfo(SalesOrdersVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalesOrdersVO insertOrder(SalesOrdersVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalesOrdersVO deleteOrderInfo(SalesOrdersVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
