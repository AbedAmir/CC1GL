package CcGroup;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestIngredient {

	@Test 
	public void testIngredientNom() {
		Ingredient x = new Ingredient("Mozza", 3);
		assertEquals(x.getNom(), "Mozza");
	}
	
	@Test // Question 1 
	public void testIngredientCout() {
		Ingredient x = new Ingredient("Mozza", 3);
		assertEquals(x.getCout(), 3);
	}

}
