package com.cognixia.jump.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

	Inventory findByItemName(String itemName);
	
}
