package BDManipulation;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Client;
import model.Commande;


public class Testhibernate {

	public static void main(String[] args) {
		// Récupération d'une session Hibernate
		
		Session s = HibernateUtils.getSession();
		// Début de la transactio
		Transaction t = s.beginTransaction();

		// Création d'un objet Event
		 Client c = new Client();
		c.setCin(045);
		c.setAdresse("tunis");
		c.setEmail("ffff");
		c.setNom("gh");
		c.setPrenom("ddd");
		Date d= new Date();
		// System.out.println(c);
		Commande cmd =new Commande ();
		cmd.setQuantite(33);
		// System.out.println(cmd);

		/*BonDeCommande bdc =new BonDeCommande (1,2,c,cmd);
		Fournisseur four = new Fournisseur(1,"ggg",2,"hhh");
		Stock stk = new Stock(1,2,"str");
		Produit p=new Produit(1,"str",d,2,stk);
		MatierePremiere mp = new MatierePremiere(1,"et",stk);
		Facture fac =new Facture (1,"ff",d,2,four,mp);
		Gamme g=new Gamme(1,"sss",p);*/
		
		
		// Enregistrement de l'event
		s.save(c);
		s.save(cmd);
		t.commit();
		// Fermeture de la session Hibernate
		s.close();
	}
}