package model;

import java.util.Date;

public class ReglementPaiement {
	private Long id;
	private Date date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ReglementPaiement(Long id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}
	@Override
	public String toString() {
		return "ReglementPaiement [id=" + id + ", date=" + date + "]";
	}
	

}
