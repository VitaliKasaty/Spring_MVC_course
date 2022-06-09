package com.vitalikasaty.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {
	
	@RequestMapping("/") // используется для связи вводимого адреса в браузера("/) и вызываемого метода
	public String showFirstView() {
		return "first-view";
	}
	
	@RequestMapping("/askDetails")
	public String askEmployeeDetails(Model model) {
		
		model.addAttribute("employee", new Employee());
		return "ask-emp-details-view";
	}
	
//	@RequestMapping("/showDetails")
//	public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//		//@RequestParam	- аннотация привязывает к параметру значение поля без использования реквеста
//		empName = "Mr. " + empName + "!";
//		model.addAttribute("nameAttribute", empName); 
//		
//		return "show-emp-details-view";
//	}
	
	@RequestMapping("/showDetails")
	public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
		
		String name = emp.getName();
		emp.setName("Mr. " + name);
		int salary = emp.getSalary();
		emp.setSalary(salary * 2);
		return "show-emp-details-view";
	}

}
