package extension;

import dao.Dao;

public class DaoImplWS implements Dao {

	@Override
	public double getData() 
	{
		System.out.println("Version WS");
		
		return 90;
	}

}
