package persentation;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.Dao;
import metier.Metier;

public class Presentation2 {

	public static void main(String[] args) throws Exception
	{

		/*
		 * Injection des dépendances par instanciation dynamique
		 */
		Scanner scanner = new Scanner(new File("config.txt"));
		/*
		 * Connaitre ou recuperer le nom de la class Dao qui se trouve dans le fichier
		 */
		String classNameDao= scanner.nextLine();
		/*
		 * charger le byte code de la class en memoire lors de l'execution
		 */
		Class classDao = Class.forName(classNameDao);
		
		/*
		 * recuperer un object de type Dao(interface)
		 * 
		 * exemple DaoImpl dao = new DaoImpl()
		 */
		Dao objectDao= (Dao)classDao.newInstance();
		
		//System.out.println(objectDao.getData());
		
		/*
		 * recuperer l'objet metier comme precedemment avec l'object Dao
		 */
		
		String classNameMetier= scanner.nextLine();
		Class classMetier = Class.forName(classNameMetier);
		Metier objectMetier= (Metier)classMetier.newInstance();
		
		/*
		 * effectuer ici l'injection de dependance 
		 * 
		 * creer un objet method
		 * 
		 */
		Method method = classMetier.getMethod("setDao", Dao.class);
		
		/*
		 * exécuter la method
		 * exemple : objectMetier.setDao(objectDao)
		 */
		method.invoke(objectMetier, objectDao);
		
		System.out.println("resultat =>"+objectMetier.calcul());
	}
	

}
