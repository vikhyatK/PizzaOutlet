package com.pizza.deliver.models;

/**
 * Enum which denotes valid categories of pizzas available and their respective costs.
 * @author vikhyat_kaushik
 *
 */
public enum Category implements IPizzaType{

	SIMPLY_VEG(200, "Simply Veg"),
	CLASSIC_VEG(250, "Classic Veg"),
	EXOTIC_VEG(300, "Exotic Veg");
	
	private final String type;
	private final float cost;
	Category(float cost, String type) {
		this.type = type;
		this.cost = cost;
	}
	
	public float getCost() {
		return cost;
	}

	@Override
	public String getDisplayName() {
		return type;
	}
	
}
