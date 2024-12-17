package com.example.service;

import com.example.model.Order;

public class OrderCreatedDaoImpl implements OrderCreatedDao {

	Order order1 =null;
	
	@Override
	public void orderCreated(Order order) {
		if(order!=null) {
			order.setStatus("Created");
			order.setCreatedBy("user X");
		}
		order1=order;
	}

	@Override
	public Order getOrder() {
		if(order1!=null)
		 return order1;
		return order1;
	}

	@Override
	public void updateByReviewer(Order order) {
		if(order!=null) {
			order1=order;
		}
	}

	@Override
	public void rejectByReviewer(Order order) {
		if(order!=null) {
			order1=order;
		}
	}

	@Override
	public void approvedByReviewer(Order order) {
		if(order!=null) {
			order1=order;
		}
	}
}
