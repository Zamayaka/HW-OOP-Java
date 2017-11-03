package com.gmail.zamayaka2013;

public class Main {

	public static void main(String[] args) {
		Point a = new Point(0, 0);
		Point b = new Point(0, 5);
		Point c = new Point(5, 5);
		Point d = new Point(5, 0);
		Board board1 = new Board();

		Triangle tr1 = new Triangle(a, b, c);
		Rectangle rec1 = new Rectangle(a, b, c, d);
		Circle cir = new Circle(a, b);

		System.out.println("A-" + a + " B-" + b + " C-" + c + " D-" + d);
		System.out.println();
		System.out.println("Perimetr ABC = " + tr1.getPerimetr() + " || Area ABC = " + tr1.getArea());
		System.out.println();
		System.out.println("Perimetr ABCD = " + rec1.getPerimetr() + " || Area ABCD = " + rec1.getArea());
		System.out.println();
		System.out.println("Perimetr Circle " + cir.getPerimetr() + " || Area Circle =" + cir.getArea());
		System.out.println();
		board1.addToBoard(tr1);
		board1.addToBoard(rec1);
		board1.addToBoard(cir);

		System.out.println(board1);
		
		System.out.println();
		board1.delFromBoard(cir);
		System.out.println(board1);
		board1.delFromBoard(cir);
	}

}
