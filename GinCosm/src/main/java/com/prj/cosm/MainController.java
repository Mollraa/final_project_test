package com.prj.cosm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prj.cosm.sales.orders.service.SalesOrdersService;
import com.prj.cosm.sales.orders.service.SalesOrdersVO;

@Controller
public class MainController {
	
	@Autowired
	SalesOrdersService service;
	// 첫 화면
	@RequestMapping("/main")
	public String main(Model model) {
		return "index";
	}

	// 고객 주문목록 관리 메인
	@RequestMapping("/order")
	public String salesorder(Model model) {
		return "sales/order";
	}
	// 고객 - 주문목록데이터
	@RequestMapping("/orderList")
	@ResponseBody
	public List<SalesOrdersVO> salesorderList(Model model) {
		return service.salesOrderList();
	}

	// 고객 주문관리 메인
	@RequestMapping("/test")
	public String test(Model model) {
		return "sales/test";
	}
}
