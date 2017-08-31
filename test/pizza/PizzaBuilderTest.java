package pizza;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pizza.deliver.models.Crust;
import com.pizza.deliver.models.Pizza;
import com.pizza.deliver.models.PizzaType;
import com.pizza.deliver.models.Topping;
import com.pizza.deliver.utils.PizzaBuilder;

/**
 * This test class test PizzaBuilder class.
 * @author vikhyat_kaushik
 *
 */
public class PizzaBuilderTest {

	/**
	 * Create a pizza with custom crust and toppings. 
	 */
	@Test
	public void testMexicanGreenWavePizzaWithCheeseBurst() {
		Pizza pizza = new PizzaBuilder(PizzaType.MEXICAN_GREEN_WAVE).withCrust(Crust.CHEESEBURST).withTopping(Topping.OLIVE).withTopping(Topping.CORN).build();
		assertEquals(PizzaType.MEXICAN_GREEN_WAVE.getDisplayName(),pizza.getName());
		assertEquals(Crust.CHEESEBURST,pizza.getCrust());
		assertTrue(pizza.getToppings().contains(Topping.OLIVE));
		assertTrue(pizza.getToppings().contains(Topping.CORN));
		assertEquals(410, pizza.getPrice(), 0);
	}
	
	/**
	 * Create a pizza and replace the toppings.
	 */
	@Test
	public void testReplaceToppingOfCheeseAndTomatoPizzaByOlive() {
		Pizza pizza = new PizzaBuilder(PizzaType.CHEESE_N_TOMATO).replaceTopping(Topping.TOMATO, Topping.OLIVE).build();
		assertEquals(PizzaType.CHEESE_N_TOMATO.getDisplayName(),pizza.getName());
		assertEquals(Crust.PAN,pizza.getCrust());
		assertTrue(pizza.getToppings().contains(Topping.OLIVE));
		assertFalse(pizza.getToppings().contains(Topping.TOMATO));
		assertEquals(220, pizza.getPrice(), 0);
	}
}
