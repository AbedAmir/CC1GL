package CcGroup;

import static org.junit.Assert.*;

import org.junit.Test;

import Exception.PreparationInsideElleMemeException;


public class TestPreparation {

	//Question 1.2
	@Test
	public void testInstanciationPreparation() throws PreparationInsideElleMemeException {
		Ingredient mozza = new Ingredient("Mozza", 3);
		Ingredient champignons = new Ingredient("Champignons", 5);
		Preparation reine = new Preparation("Reine");
		reine.add(mozza);
		reine.add(champignons);
		assertEquals(reine.getNom(), "Reine");
	}
	
	//Question 1.3
	@Test
	public void testCalculPreparation() throws PreparationInsideElleMemeException {
		Ingredient mozza = new Ingredient("Mozza", 3);
		Ingredient champignons = new Ingredient("Champignons", 5);
		Preparation reine = new Preparation("Reine");
		reine.add(mozza);
		reine.add(champignons);
		assertEquals(reine.getCout(), 8);
	}
	
	//Question 1.4
	@Test (expected = PreparationInsideElleMemeException.class)
	public void testPreparationInsideElleMeme() throws PreparationInsideElleMemeException {
		Ingredient mozza = new Ingredient("Mozza", 3);
		Ingredient champignons = new Ingredient("Champignons", 5);
		Preparation reine = new Preparation("Reine");
		reine.add(mozza);
		reine.add(champignons);
		reine.add(reine);
		assertEquals(reine.getCout(), 8);
	}
	
	//Question 1.5 pas eu le temps de finir
	/*@Test
	public void testPreparationInsideDescendante() throws PreparationInsideElleMemeException {
		Preparation reine = new Preparation("Reine");
		Preparation reine2 = new Preparation("Reine2");
		reine2.add(reine);
		reine.add(reine2);
		//assertEquals(5, 5);
	}*/

}
