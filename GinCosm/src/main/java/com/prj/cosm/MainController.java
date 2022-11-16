package com.prj.cosm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prj.cosm.sales.orders.service.OrdersService;
import com.prj.cosm.sales.orders.service.OrdersVO;

@Controller
//@CrossOrigin("*")
public class MainController {
	
	@Autowired
	OrdersService service;
	
	
	//영업 - 주문조회 리스트
	@ResponseBody
	@GetMapping("/ajax/orders")
	public List<OrdersVO> ajaxOrder(Model model) {
		return service.salesOrderList();
	}
	
	//고객 --------------------------------
	// 첫 화면
	@RequestMapping("/main")
	public List<OrdersVO> main(Model model) {
		return service.salesOrderList();
	}

	// 고객 주문목록 관리 메인
	@RequestMapping("/order")
	public String cilentorder(Model model) {
		return "client/order";
	}
	// 고객 - 주문목록데이터
	@RequestMapping("/orderList")
	@ResponseBody
	public List<OrdersVO> clientorderList(Model model) {
		model.addAttribute("id", service.getOrderNo());
		return service.salesOrderList();
	}

	// 고객 주문관리 메인
	@RequestMapping("/insert")
	public String clientOrder(Model model) {
		return "client/insert";
	}
	
	//마이페이지
	@RequestMapping("/my")
	public String clientMypage(Model model) {
		return "client/myPage";
	}
	

	
	//영업팀 -----------------------------------

	//메인페이지 - 주문관리
	@RequestMapping("/test")
	public String test(Model model) {
		return "sales/dtest";
	}
	
	@GetMapping("/orders")
	public String salesorder(Model model) {
		return "sales/orders";
	}
	// 사원 - 주문목록데이터
	@GetMapping("/ordersList")
	@ResponseBody
	public List<OrdersVO> salesorderList(Model model) {
		model.addAttribute("id", service.getOrderNo());
		return service.salesOrderList();
	}
	
	/*main - 주문목록조회 = ajax, get*/
}
