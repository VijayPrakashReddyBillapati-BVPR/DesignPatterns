package com.designpatterns.practice.factory;

public class VegPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println(" Preparing Veg Pizza");

	}

	@Override
	public void bake() {
		System.out.println(" Baking Veg Pizza");

	}

	@Override
	public void cut() {
		System.out.println("cutting Veg pizza");
	}


}
