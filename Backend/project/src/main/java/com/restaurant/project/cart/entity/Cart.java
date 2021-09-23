package com.restaurant.project.cart.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cart_id;
	
	private Date orderDate;
	private Date deliveryDate;
	private int coupon_id;
	private int food_id;
	private int customer_id;
	
	public Cart() {
		super();
	}

	public Cart(int cart_id, Date orderDate, Date deliveryDate, int coupon_id, int food_id, int customer_id) {
		super();
		this.cart_id = cart_id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.coupon_id = coupon_id;
		this.food_id = food_id;
		this.customer_id = customer_id;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public int getCoupon_id() {
		return coupon_id;
	}

	public void setCoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
	}

	public int getFood_id() {
		return food_id;
	}

	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", coupon_id=" + coupon_id + ", food_id=" + food_id + ", customer_id=" + customer_id + "]";
	}
	
	
	
}
