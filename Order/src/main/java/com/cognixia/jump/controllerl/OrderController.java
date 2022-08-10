package com.cognixia.jump.controllerl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Order;
import com.cognixia.jump.repository.OrderRepository;
import com.cognixia.jump.service.OrderService;

@RequestMapping("/api")
@RestController
public class OrderController {

	@Autowired
	OrderRepository repo;
	
	@Autowired
	OrderService service;
	
	@PostMapping("/order")
	public ResponseEntity<?> createOrder(@RequestBody Order order) {
		order.setId(null);
		service.produce(order);
		repo.save(order);
		
		return ResponseEntity.status(201).body(order + " created");
	}
	
}
