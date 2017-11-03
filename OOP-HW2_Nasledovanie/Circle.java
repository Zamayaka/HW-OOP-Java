package com.gmail.zamayaka2013;

public class Circle extends Shape {
	private Point c;
	private Point d;

	public Circle(Point c, Point d) {
		super();
		this.c = c;
		this.d = d;
	}

	public Circle() {
	}

	@Override
	double getPerimetr() {
		return 2 * Math.PI * this.c.otr(this.d);
	}

	@Override
	double getArea() {
		return Math.PI * this.c.otr(this.d) * this.c.otr(this.d);
	}

	@Override
	public String toString() {
		return "Circle [centre=" + c + ", r=" + this.c.otr(this.d) + "]";
	}

}
