package model;

import java.util.Date;

public class Cheque extends ReglementPaiement {

	private Integer numeroCheque;
	private Date dateEcheance;
	private Float montantReglement;
	
	public Integer getNumeroCheque() {
		return numeroCheque;
	}
	public void setNumeroCheque(Integer numeroCheque) {
		this.numeroCheque = numeroCheque;
	}
	public Date getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	public Float getMontantReglement() {
		return montantReglement;
	}
	public void setMontantReglement(Float montantReglement) {
		this.montantReglement = montantReglement;
	}
	public Cheque(Long id, Date date, Integer numeroCheque, Date dateEcheance, Float montantReglement) {
		super(id, date);
		this.numeroCheque = numeroCheque;
		this.dateEcheance = dateEcheance;
		this.montantReglement = montantReglement;
	}
	@Override
	public String toString() {
		return "Cheque [numeroCheque=" + numeroCheque + ", dateEcheance=" + dateEcheance + ", montantReglement="
				+ montantReglement + "]";
	}
	
	
}
