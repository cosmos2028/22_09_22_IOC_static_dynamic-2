package persentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.Metier;

public class PresentationAnnotation {

	public static void main(String[] args) 
	{
		/*
		 * lorsqu'on utilise les annotations il faut utiliser la class
		 * AnnotationConfigApplicationContext en précisant les packages
		 * qu'il doit scanner
		 */
		ApplicationContext context = new
				AnnotationConfigApplicationContext("dao","metier","extension");
		/*
		 * si on ne connait pas le nom ,on peut donner uniquement l'interface
		 * en ajoutant .class
		 */
		Metier metier = context.getBean(Metier.class);
		
		System.out.println("Resultats ann =>"+metier.calcul());

	}

}
