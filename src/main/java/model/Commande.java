package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commande")
public class Commande {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_cmd")
	private Integer id;
    @Column(name="quantite_cmd")
	private Integer quantite;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public Commande(int id, Integer quantite) {
		super();
		this.id = id;
		this.quantite = quantite;
	}
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Commande [id=" + id + ", quantite=" + quantite + "]";
	}
	
}
