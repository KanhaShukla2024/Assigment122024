package com.example.service;

import com.example.model.Order;

public interface OrderCreatedDao {
	
	public void orderCreated(Order order);
	public Order getOrder();
	public void updateByReviewer(Order order);
	public void rejectByReviewer(Order order);
	public void approvedByReviewer(Order order);
}
