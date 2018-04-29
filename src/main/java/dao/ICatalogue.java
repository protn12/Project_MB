package dao;

import java.util.List;

import model.Catalogue;

public interface ICatalogue {
	
	List<Catalogue> findAll();
    List<Catalogue> findById();
   void  ajoutCatalogue(Catalogue catalogue);
   void updateCatalogue(Catalogue catalogue);
   void deleteCatalogue(Catalogue catalogue);
 
}
