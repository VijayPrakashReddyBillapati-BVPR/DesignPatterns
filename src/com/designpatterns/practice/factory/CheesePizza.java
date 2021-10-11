package com.designpatterns.practice.factory;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println(" Preparing Cheese Pizza");

	}

	@Override
	public void bake() {
		System.out.println(" Baking baking Pizza");

	}

	@Override
	public void cut() {
		System.out.println("cutting Cutting pizza");
	}

}
