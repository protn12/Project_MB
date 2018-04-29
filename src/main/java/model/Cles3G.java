package model;

public class Cles3G extends Articles{
	
	private String numeroSerie;
	private String debitConnexion;
	private String capaciteMaxTelechargement;
	private Operateur operateur;
	
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public String getDebitConnexion() {
		return debitConnexion;
	}
	public void setDebitConnexion(String debitConnexion) {
		this.debitConnexion = debitConnexion;
	}
	public String getCapaciteMaxTelechargement() {
		return capaciteMaxTelechargement;
	}
	public void setCapaciteMaxTelechargement(String capaciteMaxTelechargement) {
		this.capaciteMaxTelechargement = capaciteMaxTelechargement;
	}

	public Operateur getOperateur() {
		return operateur;
	}
	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}
	public Cles3G(Long id, String quantiteSeuil, Integer prix, String numeroSerie, String debitConnexion,
			String capaciteMaxTelechargement, Operateur operateur) {
		super(id, quantiteSeuil, prix);
		this.numeroSerie = numeroSerie;
		this.debitConnexion = debitConnexion;
		this.capaciteMaxTelechargement = capaciteMaxTelechargement;
		this.operateur = operateur;
	}
	@Override
	public String toString() {
		return "Cles3G [numeroSerie=" + numeroSerie + ", debitConnexion=" + debitConnexion
				+ ", capaciteMaxTelechargement=" + capaciteMaxTelechargement + ", operateur=" + operateur + "]";
	}

	

	
	
}
