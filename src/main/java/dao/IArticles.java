package dao;

import java.util.List;

import model.Articles;

	
public interface IArticles {

		
		List<Articles> findAll();
	    List<Articles> findById();
	   void  ajoutArticles(Articles articles);
	   void updateArticles(Articles articles);
	   void deleteArticles(Articles articles);

}
