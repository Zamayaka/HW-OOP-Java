package com.gmail.zamayaka2013;

public class Vector3D {
	private double x;
	private double y;
	private double z;

	public Vector3D(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3D() {
		super();
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

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Vector3D sumVectors(Vector3D b) {

		Vector3D sumVector = new Vector3D(this.x + b.x, this.y + b.y, this.z + b.z);
		return sumVector;

	}

	public Vector3D minusVectors(Vector3D b) {

		Vector3D minusVector = new Vector3D(this.x - b.x, this.y - b.y, this.z - b.z);
		return minusVector;

	}

	public double skalarMult(Vector3D b) {
		double skalarMultiVector = (this.x * b.x + this.y * b.y + this.z * b.z);
		return skalarMultiVector;

	}

	public Vector3D vectorMult(Vector3D b) {
		 return new Vector3D (this.y * b.z - this.z * b.y, this.z * b.x - this.x * b.z,
				this.x * b.y - this.y * b.x);
		 
		
	}

	public void vPrinte() {
		System.out.println("x=" + this.x + " y=" + this.y + " z=" + this.z );
	}

}
