package com.pizza.deliver.models;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	private float price;
	private String name;
	private PizzaType type;
	private List<Topping> toppings = new ArrayList<>();
	private Crust crust = Crust.PAN;

	public Pizza(PizzaType type) {
		this.name = type.getDisplayName();
		this.type = type;
		this.toppings = type.getTopping();
		this.price  = type.getCategory().getCost();
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	public List<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(List<Topping> toppings) {
		this.toppings = toppings;
	}

	public Crust getCrust() {
		return crust;
	}

	public void setCrust(Crust crust) {
		this.crust = crust;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PizzaType getType() {
		return type;
	}

	public void setType(PizzaType type) {
		this.type = type;
	}
	
	public void addToPrice(float price) {
		this.price = this.price + price;
	}
}
