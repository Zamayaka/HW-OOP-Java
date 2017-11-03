package com.gmail.zamayaka2013;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	@Override
	double getPerimetr() {
		return a.otr(b) + b.otr(c) + c.otr(a);
	}

	@Override
	double getArea() {
		double polP = this.getPerimetr() / 2.0;
		return Math.sqrt(polP * (polP - a.otr(b)) * (polP - b.otr(c)) * (polP - c.otr(a)));
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}