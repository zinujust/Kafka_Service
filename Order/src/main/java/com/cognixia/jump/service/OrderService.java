package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Order;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String, Order> km;
	
	public void produce(Order order) {
		System.out.println("Producing message: " + order);
		km.send("order", order);
	}
	
}
