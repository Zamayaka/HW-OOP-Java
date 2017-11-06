package com.gmail.zamayaka2013;

public class Rectangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Rectangle() {
	}

	@Override
	double getPerimetr() {
		return a.otr(b) + b.otr(c) + c.otr(d) + d.otr(a);
	}

	@Override
	double getArea() {
		double polP1 = (a.otr(b) + b.otr(c) + c.otr(a)) / 2;
		double polP2 = (a.otr(c) + c.otr(d) + d.otr(a)) / 2;

		return Math.sqrt(polP1 * (polP1 - a.otr(b)) * (polP1 - b.otr(c)) * (polP1 - c.otr(a)))
				+ Math.sqrt(polP2 * (polP2 - a.otr(c)) * (polP2 - c.otr(d)) * (polP2 - d.otr(a)));
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}