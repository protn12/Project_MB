package model;

public class Articles {
	
	private Long id;
	private String quantiteSeuil;
	private Integer prix;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuantiteSeuil() {
		return quantiteSeuil;
	}
	public void setQuantiteSeuil(String quantiteSeuil) {
		this.quantiteSeuil = quantiteSeuil;
	}
	
	public Integer getPrix() {
		return prix;
	}
	public void setPrix(Integer prix) {
		this.prix = prix;
	}
	public Articles(Long id, String quantiteSeuil, Integer prix) {
		this.id = id;
		this.quantiteSeuil = quantiteSeuil;
		this.prix=prix;
	}
	@Override
	public String toString() {
		return "Articles [id=" + id + ", quantiteSeuil=" + quantiteSeuil + ", prix=" + prix + "]";
	}
	
	
	

}
