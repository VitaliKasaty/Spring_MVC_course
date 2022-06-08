package com.vitalikasaty.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
//	@RequestMapping("/showDetails")
//	public String showEmpDetails() {
//		return "show-emp-details-view";
//	}

	@RequestMapping("/showDetails")
	public String showEmpDetails(HttpServletRequest request, Model model) {
		
		String empName = request.getParameter("employeeName"); //Реквестом получаем значение по имени параметра
		empName = "Mr. " + empName;
		model.addAttribute("nameAttribute", empName); 
		//Model - это контейнер для хранения любых данных
		//"nameAttribute" - это имя атрибута по которому будем обращаться для получения значения
		//привязанного к нему в Model
		
		model.addAttribute("description", " - Java developer");
		
		return "show-emp-details-view";
	}

}
