package org.saihtetaung.ucs.models;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name = "fooditem")
public class FoodItem implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private double qty;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="menu_id")
	private Menu menu=new Menu();
	
	@OneToMany(mappedBy = "foodItem", targetEntity = OrderItem.class)	
	List<OrderItem> fooditemList=new ArrayList<OrderItem>();
	
	public FoodItem() {
		super();
	}
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
	public FoodItem(Long id, String name, double qty, double price, Menu menu, List<OrderItem> fooditemList) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.menu = menu;
		this.fooditemList = fooditemList;
	}
	
	
}
