package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements Dao 
{

	@Override
	public double getData() 
	{
		/*
		 * Se connecter à la BDD pour recuperer la temperature
		 */
		System.out.println("version BDD");
		double temperature= Math.random()*40;
		
		return temperature;
	}

}
