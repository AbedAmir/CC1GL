package CcGroup;

import CcGroup.Conponement;

public class Ingredient implements Conponement{
	private String nom;
	private int cout;
	@Override
	public void print() {
		System.out.println("Je suis l'ingredient " + this.getNom() + " mon cout est de : " + this.getCout());
	}
	
	public Ingredient(String nom, int cout)
	{
		this.nom = nom; 
		this.cout = cout;
	}

	public String getNom() {
		return nom;
	}

	public int getCout() {
		return cout;
	}
}
