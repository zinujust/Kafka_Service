package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Inventory;
import com.cognixia.jump.model.Order;
import com.cognixia.jump.repository.InventoryRepository;

@Service  
public class InventoryService {


	@Autowired
	InventoryRepository repo;
	
	@KafkaListener(topics = "order", groupId = "order_group_id")
	public void consume(Order order) {
		System.out.println("cosnuming order " + order);
		Inventory inv = repo.findByItemName(order.getItemName());
		inv.setQty(inv.getQty() - order.getQty());
		repo.save(inv);
	}
}
