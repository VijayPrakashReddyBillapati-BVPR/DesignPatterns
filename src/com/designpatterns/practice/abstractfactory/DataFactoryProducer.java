package com.designpatterns.practice.abstractfactory;

public class DataFactoryProducer {

	public static DaoAbstractFactory produce(String factoryType)
	{
		DaoAbstractFactory daf =  null;
		if(factoryType.equalsIgnoreCase("xml"))
		{
			daf = new XMLDaoFactory();
		}else if(factoryType.equalsIgnoreCase("db"))
		{
			daf = new DBDaoFactory();
		}
		return daf;
	}
}
