package CcGroup;

import java.util.ArrayList;

public class Pizza implements Conponement{
	private final String nom; 
	private final String sauce;
	ArrayList<Ingredient> ingredients;
	ArrayList<Preparation> preparation;
	
	public static class Builder
	{
		private final String nomBuilder; 
		private final String sauceBuilder;
		ArrayList<Ingredient> ingredientsBuilder;
		ArrayList<Preparation> preparationBuilder;
		
		public Builder(String nom, String sauce)
		{
			this.nomBuilder = nom;
			this.sauceBuilder = sauce;
			ingredientsBuilder = new ArrayList<>();
			preparationBuilder = new ArrayList<>();
		}
		
		public Builder setIngredient(ArrayList<Ingredient> e)
		{
			this.ingredientsBuilder = e;
			return this;
		}
		
		public Builder setPreparation(ArrayList<Preparation> e)
		{
			this.preparationBuilder = e;
			return this;
		}
		
		public Pizza build()
		{
			return new Pizza(this);
		}

	}
	
	public Pizza(Builder builder)
	{
		this.nom = builder.nomBuilder;
		this.sauce = builder.sauceBuilder;
		this.ingredients = builder.ingredientsBuilder;
		this.preparation = builder.preparationBuilder;
	}

	public String getNom() {
		return nom;
	}

	public String getSauce() {
		return sauce;
	}

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	public ArrayList<Preparation> getPreparation() {
		return preparation;
	}

	@Override
	public void print() {
		System.out.println("Je suis une Pizza : " + this.getNom() + " avec sauce : "+ this.getSauce());
	}

	@Override
	public int getCout() {
		int cout = 0;
		for (Ingredient ingredient : ingredients) {
			cout = cout + ingredient.getCout();
		}
		for (Preparation preparation : preparation) {
			cout = cout + preparation.getCout();
		}
		return cout;
	}
	
	
}
