package com.restaurant.project.payment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_table")
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int payment_id;
	private boolean isDone;
	private int cartId;
	private int coupn_id;
	private int menu_id;
	public Payment() {
		super();
	}
	public Payment(int payment_id, boolean isDone, int cartId, int coupn_id, int menu_id) {
		super();
		this.payment_id = payment_id;
		this.isDone = isDone;
		this.cartId = cartId;
		this.coupn_id = coupn_id;
		this.menu_id = menu_id;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getCoupn_id() {
		return coupn_id;
	}
	public void setCoupn_id(int coupn_id) {
		this.coupn_id = coupn_id;
	}
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", isDone=" + isDone + ", cartId=" + cartId + ", coupn_id="
				+ coupn_id + ", menu_id=" + menu_id + "]";
	}
	
}
