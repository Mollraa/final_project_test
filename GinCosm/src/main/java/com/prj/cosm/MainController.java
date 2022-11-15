package com.prj.cosm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prj.cosm.sales.orders.service.ordersService;
import com.prj.cosm.sales.orders.service.ordersVO;

@Controller
@CrossOrigin("*")
public class MainController {
	
	@Autowired
	ordersService service;
	//고객 --------------------------------
	// 첫 화면
	@RequestMapping("/main")
	public String main(Model model) {
		return "index";
	}

	// 고객 주문목록 관리 메인
	@RequestMapping("/order")
	public String cilentorder(Model model) {
		return "client/order";
	}
	// 고객 - 주문목록데이터
	@RequestMapping("/orderList")
	@ResponseBody
	public List<ordersVO> clientorderList(Model model) {
		model.addAttribute("id", service.getOrderNo());
		return service.salesOrderList();
	}

	// 고객 주문관리 메인
	@RequestMapping("/insert")
	public String clientOrder(Model model) {
		return "client/insert";
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
		return "client/modaltest";
	}
	
	
	
	//영업팀 -----------------------------------
	
	
	@RequestMapping("/orders")
	public String salesorder(Model model) {
		return "sales/order";
	}
	// 사원 - 주문목록데이터
	@RequestMapping("/orderList")
	@ResponseBody
	public List<ordersVO> salesorderList(Model model) {
		model.addAttribute("id", service.getOrderNo());
		return service.salesOrderList();
	}
}
