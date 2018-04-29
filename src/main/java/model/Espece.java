package model;

import java.util.Date;

public class Espece extends ReglementPaiement{

	private Float montant;

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

	public Espece(Long id, Date date, Float montant) {
		super(id, date);
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Espece [montant=" + montant + "]";
	}
	
}
