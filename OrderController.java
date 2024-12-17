package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Order;
import com.example.service.OrderCreatedDaoImpl;

@RestController
public class OrderController {

	OrderCreatedDaoImpl orderCreated=new OrderCreatedDaoImpl();

	@PostMapping("/")
	public void createdOrderController(@RequestBody Order order) {
		orderCreated.orderCreated(order);
	}
	@GetMapping("/getOrderDetails")
	public Order createdOrderController() {
		Order order=orderCreated.getOrder();
		return order;
	}
	@PutMapping("/updateOrderByReviewer")
	public void updateByOrderReviewer(@RequestBody Order order) {
		orderCreated.updateByReviewer(order);
	}
	@PutMapping("/rejectOrderByReviewer")
	public void rejectedOrderByReviewer(@RequestBody Order order) {
		orderCreated.rejectByReviewer(order);
	}
	@PutMapping("/approvedOrderByReviewer")
	public void approvedOrderByReviewer(@RequestBody Order order) {
		orderCreated.approvedByReviewer(order);
	}
}
