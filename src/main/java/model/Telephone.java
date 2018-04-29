package model;

public class Telephone extends Articles{

	private String refrence;
	private String marque;
	private String model;
	public String getRefrence() {
		return refrence;
	}
	public void setRefrence(String refrence) {
		this.refrence = refrence;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Telephone(Long id, String quantiteSeuil, Integer prix, String refrence, String marque, String model) {
		super(id, quantiteSeuil, prix);
		this.refrence = refrence;
		this.marque = marque;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Telephone [refrence=" + refrence + ", marque=" + marque + ", model=" + model + "]";
	}
	
}
