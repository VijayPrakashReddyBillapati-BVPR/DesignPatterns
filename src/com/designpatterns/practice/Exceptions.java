package com.designpatterns.practice;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions {

	public static void demo() {
		try {
			badMethod();
			System.out.println("A");
		} catch (IOException e) {
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
		System.out.println("E");
	}

	private static void badMethod() throws IOException {
		FileInputStream file = new FileInputStream("file.txt");
		file.close();
		int num = 15/0;
	}

	public static void main(String[] args) {
		demo();
	}

}
