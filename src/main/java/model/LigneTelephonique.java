package model;

public class LigneTelephonique extends Articles{

	private Integer numeroTelephone;
	private Operateur operateur;
	private Integer montantMinConsommation;
	public Integer getNumeroTelephone() {
		return numeroTelephone;
	}
	public void setNumeroTelephone(Integer numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	public Operateur getOperateur() {
		return operateur;
	}
	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}
	public Integer getMontantMinConsommation() {
		return montantMinConsommation;
	}
	public void setMontantMinConsommation(Integer montantMinConsommation) {
		this.montantMinConsommation = montantMinConsommation;
	}
	public LigneTelephonique(Long id, String quantiteSeuil, Integer prix, Integer numeroTelephone, Operateur operateur,
			Integer montantMinConsommation) {
		super(id, quantiteSeuil, prix);
		this.numeroTelephone = numeroTelephone;
		this.operateur = operateur;
		this.montantMinConsommation = montantMinConsommation;
	}
	@Override
	public String toString() {
		return "LigneTelephonique [numeroTelephone=" + numeroTelephone + ", operateur=" + operateur
				+ ", montantMinConsommation=" + montantMinConsommation + "]";
	}
	
}
