package com.gmail.zamayaka2013;

public class Student extends Human {
	String gr;
	long zach;

	public Student(String name, int age, String gr, long zach) {
		super(name, age);
		this.gr = gr;
		this.zach = zach;

	}

	public Student() {
		super();

	}

	@Override
	public String getName() {

		return super.getName();
	}

	@Override
	public void setName(String name) {

		super.setName(name);
	}

	@Override
	public int getAge() {

		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	public String getGr() {
		return gr;
	}

	public void setGr(String gr) {
		this.gr = gr;
	}

	public long getZach() {
		return zach;
	}

	public void setZach(long zach) {
		this.zach = zach;
	}

	@Override
	public String toString() {
		return super.toString() + " Student [gr=" + gr + ", zach=" + zach + "]";
	}

}
