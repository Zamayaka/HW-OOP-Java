package com.gmail.zamayaka2013;

public class Main {

	public static void main(String[] args) {

		Vector3D a = new Vector3D(1, 2, 5);
		Vector3D b = new Vector3D(2, 4, 7);
		Vector3D c = a.sumVectors(b);
		Vector3D d = a.vectorMult(b);
		double e = a.skalarMult(b);
		a.vPrinte();
		b.vPrinte();
		System.out.println();
		System.out.println("����� �������� a � b - ��� ������ 'c'");
		c.vPrinte();
		System.out.println("��������� ������������ a � b - ��� ������ '�'");
		d.vPrinte();
		System.out.println("��������� ������������ a � b - ��� ����� '�'= " + e);

	}

}
