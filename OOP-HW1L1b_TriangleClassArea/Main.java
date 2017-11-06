package com.gmail.zamayaka;

public class Main {

	public static void main(String[] args) {
		Triangle tr1 = new Triangle(20, 20, 30);
		Triangle tr2 = new Triangle();
		tr2.setA(30);
		tr2.setB(40);
		tr2.setC(50);
		System.out.println("Triangle 1 Area equals " +tr1. getArea());
		System.out.println("Triangle 2 Area equals " + tr2.getArea());

	}

}
