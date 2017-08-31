package com.pizza.deliver.models;

/**
 * Enum which specifies valid toppings
 * @author vikhyat_kaushik
 *
 */
public enum Topping {

	TOMATO(10),
	JALEPINO(10),
	OLIVE(20),
	PANEER(20),
	CAPSICUM(10),
	CORN(10),
	CHEESE(30);

	private float cost;

	Topping(float cost) {
		this.cost = cost;
	}

	public float getCost() {
		return cost;
	};
}
