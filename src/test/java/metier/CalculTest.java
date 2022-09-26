package metier;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {

	private Calcul calcul;
	@Test
	public void testSomme() 
	{
		calcul= new Calcul();
		double premierNombre=5,deuxiemeNombre=9;
		double expected = 14;
		double resultat=calcul.somme2Nombre(premierNombre, deuxiemeNombre);
		
		//Assert.assertEquals(expected, resultat);
		Assert.assertTrue(expected==resultat);
	}

}
