package com.designpatterns.practice.factory;

public class PizzaFactory {

	public static  Pizza createPizza(String type)
	{
		Pizza pizza = null;
		if(type.equalsIgnoreCase("Cheese"))
		{
			pizza = new CheesePizza();
		}else if(type.equalsIgnoreCase("Chicken"))
		{
			pizza = new ChickenPizza();
		}else if(type.equalsIgnoreCase("Veg"))
		{
			pizza =  new VegPizza();
		}
		return pizza;
	}
}
