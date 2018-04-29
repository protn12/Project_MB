package model;

public class CarteTelephonique extends Articles {
	
	private Long code;
	private Integer dureeValidite;
	private Type type;
	private Operateur operateur;
	
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public Integer getDureeValidite() {
		return dureeValidite;
	}
	public void setDureeValidite(Integer dureeValidite) {
		this.dureeValidite = dureeValidite;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Operateur getOperateur() {
		return operateur;
	}
	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}
	public CarteTelephonique(Long id, String quantiteSeuil, Integer prix, Long code, Integer dureeValidite, Type type,
			Operateur operateur) {
		super(id, quantiteSeuil, prix);
		this.code = code;
		this.dureeValidite = dureeValidite;
		this.type = type;
		this.operateur = operateur;
	}
	@Override
	public String toString() {
		return "CarteTelephonique [code=" + code + ", dureeValidite=" + dureeValidite + ", type=" + type
				+ ", operateur=" + operateur + "]";
	}
	

}
