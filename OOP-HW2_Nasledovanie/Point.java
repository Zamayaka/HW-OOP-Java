package com.gmail.zamayaka2013;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double otr(Point d) {

		return Math.sqrt(Math.pow(d.x - this.x, 2) + Math.pow(d.y - this.y, 2));
	}

	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}