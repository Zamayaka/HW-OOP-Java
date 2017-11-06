package com.gmail.zamayaka2013;

public class Board {
	private int nShapes = 4;
	private Shape[] board1 = new Shape[nShapes];

	public Board() {
		super();
	}

	public void addToBoard(Shape a) {
		int i = 0;
		if (a == null) {
			System.out.println("Nothing to Add!");
			return;
		}
		for (i = 0; i < nShapes - 1; i++) {
			if (board1[i] == null) {
				this.board1[i] = a;
				System.out.println("Shape "+a+" succesefull");
				return;
							}

		}
		if (i == nShapes) {
			System.out.println("The Board is Full");
		}
	}

	public void delFromBoard(int n) {

		if (board1[n - 1] != null) {
			System.out.println("Shape number " + n + " is DELETED => " + this.board1[n - 1]);
			this.board1[n - 1] = null;
			return;
		}

		System.out.println("Sorry, No Shape at number "+n);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		double totalarea = 0;

		for (int i = 0; i < board1.length; i++) {
			if (board1[i] != null) {
				sb.append(((i + 1) + ") " + board1[i]));
				totalarea += board1[i].getArea();
			} else {
				sb.append((i + 1) + ") " + "Empy");

			}
			sb.append(System.lineSeparator());
		}
		sb.append("Total Area = " + totalarea);
		return sb.toString();

	}

}
