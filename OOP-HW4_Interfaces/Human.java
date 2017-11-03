package com.gmail.zamayaka2013;

public class Human {
	private String lastname;
	private String name;
	private int age;
	private boolean sex;

	public Human(String lastname, String name, int age, boolean sex) {
		super();
		this.lastname = lastname;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Human() {
		super();
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {

		String stringSex = "";

		if (sex == true) {
			stringSex = "Boy";
		} else {
			stringSex = "Girl";
		}

		return lastname + " " + name  + "\t age " + age + "\t" + stringSex;
	}

}
