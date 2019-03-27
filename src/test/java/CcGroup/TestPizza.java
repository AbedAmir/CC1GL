package CcGroup;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Exception.PreparationInsideElleMemeException;

public class TestPizza {

	//Question 2.1
	@Test
	public void testInstanciationNom() {
		Ingredient mozza = new Ingredient("Mozza", 3);
		ArrayList<Ingredient> ingredients = new ArrayList<>();
		ingredients.add(mozza);
		Pizza pizza = new Pizza.Builder("Margerita", "tomate").setIngredient(ingredients).build();
		assertEquals(pizza.getNom(), "Margerita");
	}

	@Test
	public void testInstanciationSauce() {
		Ingredient mozza = new Ingredient("Mozza", 3);
		ArrayList<Ingredient> ingredients = new ArrayList<>();
		ingredients.add(mozza);
		Pizza pizza = new Pizza.Builder("Margerita", "tomate").setIngredient(ingredients).build();
		assertEquals(pizza.getSauce(), "tomate");
	}

	@Test
	public void testInstanciationIngredient() {
		Ingredient mozza = new Ingredient("Mozza", 3);
		ArrayList<Ingredient> ingredients = new ArrayList<>();
		ingredients.add(mozza);
		Pizza pizza = new Pizza.Builder("Margerita", "tomate").setIngredient(ingredients).build();
		assertEquals(pizza.getIngredients().size(), ingredients.size());
	}

	// Question 2.2

	@Test
	public void testCalculPrixPizzaReine() throws PreparationInsideElleMemeException {
		ArrayList<Ingredient> ingredients = new ArrayList<>();
		ArrayList<Preparation> preparations = new ArrayList<>();
		Ingredient mozza = new Ingredient("Mozza", 3);
		Ingredient mozzaSupplement = new Ingredient("Mozza", 3);
		Ingredient champignons = new Ingredient("Champignons", 5);
		Preparation reine = new Preparation("Reine");
		reine.add(mozza);
		reine.add(champignons);
		preparations.add(reine);
		ingredients.add(mozzaSupplement);
		Pizza reineSuppMozza = new Pizza.Builder("ReineSuppMozza", "tomate")
				.setIngredient(ingredients)
				.setPreparation(preparations)
				.build();
		assertEquals(reineSuppMozza.getCout(), 11);
	} 

}
