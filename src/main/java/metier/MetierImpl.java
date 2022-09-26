package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dao.Dao;
/*
 * par default si on ne precise pas le nom il prend le nom de la class
 * precede par le package (metier.MetierImpl)
 * car c'est ce nom qui va contenir la reference de l'objet que Spring
 * va instancier via l'annotation @Component
 */
@Component("metier")
public class MetierImpl implements Metier 
{
	/*
	 * ici @Autowired on precise à spring de chercher un objet parmi les objets
	 * qu'il a déjà creé un object avec le type (Dao)
	 * et de l'injecter dans la variable dao lors de l'instanciation de 
	 * la class MetierImpl grace à @Component("metier")
	 */
	//@Autowired
	/*
	 * @Qualifier permet de distinguer ou de preciser l'intance qui va etre
	 * injecter via son nom quand il y a plusieurs implementation d'une meme interface
	 * 
	
	@Qualifier("dao2")
	*/
	Dao dao;
 
	/*
	 * Injection par constructeur
	 */
	
	public MetierImpl(@Qualifier("dao2")Dao dao) 
	{
		this.dao = dao;
	}
	

	@Override
	public double calcul() 
	{
		double temperature = dao.getData();
		double resultat = temperature*540/Math.cos(temperature*Math.PI);
		
		return resultat;
	}

	/*
	 * permettre d'injecter dans la variable dao un objet d'une class qui
	 * implement l'interface dao
	 */
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	
}
