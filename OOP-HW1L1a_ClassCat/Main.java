package com.gmail.zamayaka;

public class Main {

	public static void main(String[] args) {
		CatHome catOne = new CatHome();
		catOne.setName("DEXTER");
		catOne.setAge(18);
		catOne.setWeight(1);
		catOne.setColour("Black");
		catOne.setPoroda("Persian + Angora");

		CatHome catThree = new CatHome("Patrick", 5, 5, "Black and White", "Scotish cat");
		CatHome catTwo = new CatHome("Belochka", 4, 3, "Whtie + Coffee", "Angora");

		System.out.println(catOne);
		System.out.println(catTwo);
		System.out.println(catThree);

	}

}
