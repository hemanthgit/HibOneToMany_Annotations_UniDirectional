package com.mhk.poc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ITEM")
public class Item {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="QUANTITY")
	private Integer quantity;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cart_id") // this line is optional here,as table name, Entity name and property name are identical.
	private Cart cart;
	
//	or
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="cart_id")// this is mandatory here
//	private Cartt cartt; // respective getters and setters should be there . then above line (32) is mandatory, because table name is not identical to Entity name.
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
}
