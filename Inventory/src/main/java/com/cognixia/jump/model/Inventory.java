package com.cognixia.jump.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Inventory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	@NotNull
	private String itemName;
	
	@Column
	@NotNull
	private Double price;
	
	@Column
	@NotNull
	private Integer qty;
	
	public Inventory() {
		
	}

	public Inventory(Integer id, @NotNull String itemName, @NotNull Double price, @NotNull Integer qty) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", itemName=" + itemName + ", price=" + price + ", qty=" + qty + "]";
	}
	
}
