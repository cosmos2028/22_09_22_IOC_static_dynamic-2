package persentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.Metier;

public class PresentationSpringXML 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//recuperer un composant bean dans le conteneur Spring(applicationContext.xml)
		Metier metier = (Metier) context.getBean("metier");
		
		System.out.println("Résultat xml=> "+metier.calcul());
	}

}
