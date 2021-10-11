package com.designpatterns.practice.singletone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		SingleTone single1 =  SingleTone.getInstance();
		SingleTone single2 =  SingleTone.getInstance();
		
		ObjectOutputStream output =  new ObjectOutputStream(new FileOutputStream(new File("file.txt")));
		output.writeObject(single1);
		
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("file.txt"));
		Object single3 = input.readObject();
		System.out.println(single1 == single2);
		System.out.println(single1 == single3);
		
		output.close();
		input.close();
	}

}
