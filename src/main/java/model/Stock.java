package model;

public class Stock {

	private Long id;
	private Integer quantite;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public Stock(Long id, Integer quantite) {
		super();
		this.id = id;
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", quantite=" + quantite + "]";
	}
	
}
