package persentation;

import dao.DaoImpl;
import extension.DaoImpl2;
import metier.MetierImpl;

public class Presentation {

	public static void main(String[] args) 
	{
		/*
		 * Injection des dépendances par instanciation statique
		 */
		DaoImpl2 dao = new DaoImpl2();
		MetierImpl metier = new MetierImpl(dao);
		//metier.setDao(dao);
		System.out.println("Resultat = "+metier.calcul());

	}

}
