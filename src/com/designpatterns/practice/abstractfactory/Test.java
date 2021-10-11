package com.designpatterns.practice.abstractfactory;

public class Test {

	public static void main(String[] args) {
		DaoAbstractFactory daf = DataFactoryProducer.produce("DB");
		daf.createDao("dept").save();
	}

}
