package com.gmail.zamayaka2013;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File fileOne = new File("One.txt");
		File fileTwo = new File("Two.txt");
		File fileSum = new File("TWO_in_ONE.txt");
		
		System.out.println(fileOne.getName() + " - " + fileOne.exists() + "\n" + fileTwo.getName()+" - "+ fileTwo.exists() + "\n");
		FileOperations.TwoInOne(fileOne, fileTwo, fileSum);
		
	}

}
