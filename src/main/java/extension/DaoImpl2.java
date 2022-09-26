package extension;

import org.springframework.stereotype.Component;

import dao.Dao;

@Component("dao2")
public class DaoImpl2 implements Dao {

	@Override
	public double getData() 
	{
		System.out.println("version capteur");
		double temperature=1000;
		return temperature;
	}

}
