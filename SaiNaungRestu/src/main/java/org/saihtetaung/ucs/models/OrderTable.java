package org.saihtetaung.ucs.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "orderitem")
public class OrderTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double qty;
	private double price;
	private Date pickup_date;
	private double total;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer=new Customer();
	
	 @OneToMany(mappedBy = "ordertable", targetEntity = OrderItem.class) 
	  List<OrderItem> orderitemList=new ArrayList<OrderItem>();
	
	public OrderTable() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getPickup_date() {
		return pickup_date;
	}
	public void setPickup_date(Date pickup_date) {
		this.pickup_date = pickup_date;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
