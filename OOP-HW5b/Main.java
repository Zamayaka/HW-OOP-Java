package com.gmail.zamayaka2013;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		(new FileOperations()).eqWord(new File("One.txt"), new File("Two.txt"), new File("TWO_in_ONE.txt"));
	}
}