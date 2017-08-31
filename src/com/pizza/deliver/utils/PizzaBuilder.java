package com.pizza.deliver.utils;

import com.pizza.deliver.models.Crust;
import com.pizza.deliver.models.Pizza;
import com.pizza.deliver.models.PizzaType;
import com.pizza.deliver.models.Topping;

/**
 * This class is used as a builder class which customizes pizza according to user's need.
 * @author vikhyat_kaushik
 *
 */
public class PizzaBuilder {

	private Pizza pizza;
	
	public PizzaBuilder(PizzaType pizzaType) {
		this.pizza = new Pizza(pizzaType);
	}
	
	/**
	 * Method to add topping to base pizza
	 * @param topping
	 * @return
	 */
	public PizzaBuilder withTopping(Topping topping) {
		pizza.getToppings().add(topping);
		pizza.addToPrice(topping.getCost());
		return this;
	}
	
	/**
	 * Method to customize the crust
	 * @param crust
	 * @return
	 */
	public PizzaBuilder withCrust(Crust crust) {
		pizza.setCrust(crust);
		pizza.addToPrice(crust.getCost());
		return this;
	}
	
	/**
	 * Method to replace existing topping with new one.
	 * In case price of new topping is higher the total price is adjusted accordingly.
	 * @param toppingToReplace
	 * @param toppingToReplaceWith
	 * @return
	 */
	public PizzaBuilder replaceTopping(Topping toppingToReplace, Topping toppingToReplaceWith) {
		if(toppingToReplace.getCost() == toppingToReplaceWith.getCost()) {
			pizza.getToppings().remove(toppingToReplace);
			pizza.getToppings().add(toppingToReplaceWith);
		} else {
			pizza.getToppings().remove(toppingToReplace);
			pizza.getToppings().add(toppingToReplaceWith);
			pizza.addToPrice(toppingToReplaceWith.getCost());
		}
		return this;
	}

	/**
	 * THis method returns the baked pizza with final cost.
	 * @return
	 */
	public Pizza build() {
		return pizza;
	}
}
