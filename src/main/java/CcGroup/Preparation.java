package CcGroup;

import java.util.ArrayList;

import CcGroup.Conponement;
import Exception.PreparationInsideElleMemeException;

public class Preparation implements Conponement{
	private String nom;
	ArrayList<Conponement> ingredientPreparation;

	@Override
	public void print() {
		System.out.print("Je suis la preparation : " + this.getNom());
		if(this.getIngredientPreparation().isEmpty() == false)
		{
			System.out.println("Je contient les ingredient suivant : ");
			for (Conponement conponement : ingredientPreparation) {
				conponement.print();
			}
		}
	} 

	public Preparation(String nom)
	{
		this.nom = nom;
		ingredientPreparation = new ArrayList<>();
	}

	public void add(Conponement c) throws PreparationInsideElleMemeException
	{
		if(c.equals(this)) //Verifier si on ajoute la preparation a elle meme
		{
			throw new PreparationInsideElleMemeException();
		}
		/*if(c.getClass().equals(Preparation.class))
		{
			Preparation t = (Preparation)c;
			if(verifDescendante(t) == false )
			{
				throw new PreparationInsideElleMemeException();
			}
		}*/

		this.ingredientPreparation.add(c);
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Conponement> getIngredientPreparation() {
		return ingredientPreparation;
	}

	public int getCout()
	{
		int x =0 ;
		for (Conponement conponement : ingredientPreparation) {
			x = x + conponement.getCout();
		}
		return x;
	}

	public boolean verifDescendante(Preparation p)
	{
		for (Conponement conponement : ingredientPreparation) {
			if(conponement.getClass().equals(Preparation.class))
			{
				Preparation x = (Preparation)conponement;
				for (Conponement conponement2 : x.ingredientPreparation) {
					if(p.equals(conponement2))
					{
						return false;
					}
				}
			}
		}
		return true;
	}
}
