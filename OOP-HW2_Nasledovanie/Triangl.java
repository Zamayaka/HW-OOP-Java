package com.gmail.zamayaka2013;

public class Triangl extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangl(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangl() {
		super();
	}

	@Override
	double getPerimetr() {
		return a.otr(b) + b.otr(c) + c.otr(a);
	}

	@Override
	public double getArea() {
		final double p;
		double s;
		p = getPerimetr() / 2.0;
		s = Math.sqrt(p * (p - a.otr(b)) * (p - b.otr(c)) * (p - c.otr(a)));
		return s;
	}

	@Override
	public String toString() {
		return "Triangl [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
