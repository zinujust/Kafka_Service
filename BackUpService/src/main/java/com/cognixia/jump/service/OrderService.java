package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


import com.cognixia.jump.model.Order;
import com.cognixia.jump.repository.OrderRepository;

@Service  
public class OrderService {


	@Autowired
	OrderRepository repo;
	
	@KafkaListener(topics = "order", groupId = "backup_group_id")
	public void consume(Order order) {
		System.out.println("Backing up order " + order);
		repo.save(order);
	}
}
