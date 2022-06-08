package com.vitalikasaty.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/") // используется для связи вводимого адреса в браузера("/) и вызываемого метода
	public String showFirstView() {
		return "first-view";
	}
	
	@RequestMapping("/askDetails")
	public String askEmployeeDetails() {
		return "ask-emp-details-view";
	}
	
	@RequestMapping("/showDetails")
	public String showEmpDetails() {
		return "show-emp-details-view";
	}

}
