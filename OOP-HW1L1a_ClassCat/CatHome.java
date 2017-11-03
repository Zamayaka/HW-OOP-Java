package com.gmail.zamayaka;

class  CatHome {
	public String name;
	public int age;
	public double weight;
	public String colour;
	public String poroda;

	public CatHome(String name, int age, double weight, String colour, String poroda) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.colour = colour;
		this.poroda = poroda;
	}

	public CatHome() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getPoroda() {
		return poroda;
	}

	public void setPoroda(String poroda) {
		this.poroda = poroda;
	}

	@Override
	public String toString() {
		System.out.println();
		return "My Cat " + name + ",   is " + age + " years old,   " + (int) weight + " kilo(s),   and it's " + colour + "   ( "
				+ poroda+" )";
		
	}

}
