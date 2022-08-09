package com.cognixia.jump.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull
	@Column
	private Date date;
	
	@NotNull
	@Column
	private String itemName;
	
	@NotNull
	@Column
	private Integer qty;
	
	public Order () {
		this(-1, null, "N/A", -1);
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
