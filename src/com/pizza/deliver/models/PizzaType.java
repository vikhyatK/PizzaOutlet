package com.pizza.deliver.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This pizza type enum lists different pizzas available, their default toppings and category
 * @author vikhyat_kaushik
 *
 */
public enum PizzaType implements IPizzaType {

	MARGHARITA("Margharita", new ArrayList<Topping>(Arrays.asList(Topping.TOMATO)), Category.SIMPLY_VEG),
	CHEESE_N_TOMATO("Cheese N Tomato", new ArrayList<Topping>(Arrays.asList(Topping.TOMATO, Topping.CHEESE)), Category.SIMPLY_VEG),
	FARMHOUSE("Farmhouse", new ArrayList<Topping>(Arrays.asList(Topping.JALEPINO)), Category.CLASSIC_VEG),
	VEG_SUPREME("Veg Supreme", new ArrayList<Topping>(Arrays.asList(Topping.CHEESE)), Category.CLASSIC_VEG),
	MEXICAN_GREEN_WAVE("Mexican Green Wave", new ArrayList<Topping>(Arrays.asList(Topping.CORN)), Category.EXOTIC_VEG),
	PEPPY_PANEER("Peppy Paneer", new ArrayList<Topping>(Arrays.asList(Topping.PANEER, Topping.CAPSICUM)), Category.EXOTIC_VEG);


	private final String type;
	private final List<Topping> topping;
	private final Category category;
	
	PizzaType(String type, List<Topping> topping, Category category) {
		this.type = type;
		this.topping = topping;
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public List<Topping> getTopping() {
		return topping;
	}

	@Override
	public String getDisplayName() {
		return type;
	}
}
