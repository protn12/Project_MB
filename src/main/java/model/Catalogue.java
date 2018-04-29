package model;

public class Catalogue {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Catalogue(Long id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Catalogue [id=" + id + "]";
	}
	
}
