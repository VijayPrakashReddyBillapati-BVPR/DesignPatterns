package com.designpatterns.practice.factory;

public class ChickenPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println(" Preparing Chicken Pizza");

	}

	@Override
	public void bake() {
		System.out.println(" Baking Chicken Pizza");

	}

	@Override
	public void cut() {
		System.out.println("cutting Chicken pizza");
	}


}
