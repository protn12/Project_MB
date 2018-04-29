package dao;

import java.util.List;

import model.CarteCredit;

public interface ICarteCredit {
	
	List<CarteCredit> findAll();
    List<CarteCredit> findById();
   void ajoutCarteCredit(CarteCredit carteCredit);
   void updateCarteCredit(CarteCredit carteCredit);
   void deleteCarteCredit(CarteCredit carteCredit);

}
