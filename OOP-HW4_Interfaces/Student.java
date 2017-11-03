package com.gmail.zamayaka2013;

public class Student extends Human {
	String gr;
	long zach;

	public Student(String lastname, String name, int age, boolean sex, String gr, long zach) {
		super(lastname, name, age, sex);
		this.gr = gr;
		this.zach = zach;
	}

	public Student() {
		super();

	}

	@Override
	public String getLastname() {
		// TODO Auto-generated method stub
		return super.getLastname();
	}

	@Override
	public void setLastname(String lastname) {
		// TODO Auto-generated method stub
		super.setLastname(lastname);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public boolean isSex() {
		// TODO Auto-generated method stub
		return super.isSex();
	}

	@Override
	public void setSex(boolean sex) {
		// TODO Auto-generated method stub
		super.setSex(sex);
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
		return super.toString() + "\t Group " + gr + "\t ¹" + zach;
	}

}
