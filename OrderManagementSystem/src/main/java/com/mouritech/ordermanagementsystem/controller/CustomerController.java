package com.mouritech.ordermanagementsystem.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mouritech.ordermanagementsystem.model.Order;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	

	public List<Customer> orderList() {
		List<Customer> orders = new ArrayList<Customer>();
		orders.add(new Customer(123,"Prathamesh");
		orders.add(new Customer(123,"Vipul");
		orders.add(new Customer(123,"Raj");
		return customer;
		
	}

	@RequestMapping(value = "/listorder", method = RequestMethod.GET)
	  public String getUsers(Model model) throws Exception{
	    List<Customer> customers = customerList();
	    OrderListContainer neworderList = new OrderListContainer();
	    neworderList.setCus(customers);
	    model.addAttribute("Customer", neworderList);
	    return "customerlist";
	  }
}
