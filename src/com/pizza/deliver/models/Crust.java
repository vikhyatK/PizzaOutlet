package com.pizza.deliver.models;

/**
 * Enum which specifies all available crusts.
 * @author vikhyat_kaushik
 *
 */
public enum Crust {

	PAN(0),
	THIN(40),
	CHEESEBURST(80);

	private float cost;

	private Crust(float cost) {
		this.cost = cost;
	}

	public float getCost() {
		return cost;
	}
}
