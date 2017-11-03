package com.gmail.zamayaka2013;

public class Main {

	public static void main(String[] args) {
		Group gr1 = new Group();
		// Наполнение Группы
		try {
			gr1.addToGroup(new Student("Mihailova", "Lena", 20, false, "OB03G", 103));
			gr1.addToGroup(new Student("Romanoff", "Pizza", 21, false, "OB02G", 54));
			gr1.addToGroup(new Student("Barentsev", "Vovan", 22, true, "1OB04G", 10));
			gr1.addToGroup(new Student("Glushkov", "Zheka", 18, true, "2OB04G", 23));
			gr1.addToGroup(new Student("Yatseniuk", "KuliaVLoba", 20, true, "3OB04G", 71));
			// Интерактивное добавление студента в группу
			//gr1.addToGroupInteractive();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Group contains:\n"+gr1);

		// Поиск по Фамилии
		// System.out.println("Поиск по фамилии 'Barentsev'\n" +
		// gr1.getStudent("Barentsev"));

		// Удаление из группы по номеру
		//	gr1.delFromGroup(2);

		System.out.println("Интерактивная Сортировка по параметру\n"+gr1.sortParametr());
		System.out.println("На службу идут\n"+new Group(gr1.naSluzhbu()));

	}

}
