package model;

public class Facture {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Facture [id=" + id + "]";
	}

	public Facture(Long id) {
		super();
		this.id = id;
	}
	
}
