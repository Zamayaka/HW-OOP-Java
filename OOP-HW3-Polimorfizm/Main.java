package com.gmail.zamayaka2013;

public class Main {

	public static void main(String[] args) {
		Group OneA = new Group();
		// Наполнение Группы
		try {
			OneA.addToGroup(new Student("Lena", 20, "OB-04G", 155103));
			OneA.addToGroup(new Student("Max", 20, "OB-04G", 5634));
			OneA.addToGroup(new Student("IGOR", 20, "OB-04G", 1553453453));
			OneA.addToGroup(new Student("ROMAN", 20, "OB-04G", 245587868));
			OneA.addToGroup(new Student("LUDA", 20, "OB-04G", 15008973));
			OneA.addToGroup(new Student("Ira", 20, "OB-04G", 974530));
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		// Вывод группы на экран (отсортированной)
		System.out.println(OneA);

		// Удаление из группы по номеру
		OneA.delFromGroup(11);
		OneA.delFromGroup(3);

		System.out.println();
		System.out.println(OneA);
		System.out.println("Поиск по имени 'iran' - " + OneA.getStudentNumber("iran"));
		System.out.println("Поиск по имени 'ira' - " + OneA.getStudentNumber("ira"));

	}

}
