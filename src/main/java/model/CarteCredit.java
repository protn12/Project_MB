package model;

import java.util.Date;

public class CarteCredit extends ReglementPaiement{

	private Integer numeroCarte;
	private String codeSecret;
	public Integer getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(Integer numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	public String getCodeSecret() {
		return codeSecret;
	}
	public void setCodeSecret(String codeSecret) {
		this.codeSecret = codeSecret;
	}
	public CarteCredit(Long id, Date date, Integer numeroCarte, String codeSecret) {
		super(id, date);
		this.numeroCarte = numeroCarte;
		this.codeSecret = codeSecret;
	}
	@Override
	public String toString() {
		return "CarteCredit [numeroCarte=" + numeroCarte + ", codeSecret=" + codeSecret + "]";
	}
	
	
}
