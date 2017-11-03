package com.gmail.zamayaka;

public class Triangle {
	private double a;
	private double b;
	public double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double TriangleArea() {
		double p;
		double s;
		p = (a + b + c) / 2;
		s = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}

}
