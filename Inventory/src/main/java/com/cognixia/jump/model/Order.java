package com.cognixia.jump.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Order{
	private Integer id;
	
	private Date date;
	
	private String itemName;
	
	private Integer qty;
	
	public Order () {
		
	}

	public Order(Integer id, @NotNull Date date, @NotNull String itemName, @NotNull Integer qty) {
		super();
		this.id = id;
		this.date = date;
		this.itemName = itemName;
		this.qty = qty;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", itemName=" + itemName + ", qty=" + qty + "]";
	}
	
}
