package com.gmail.zamayaka2013;

public class Group implements Cloneable {
	private Student[] stGroup = new Student[10];

	public Group() {
		super();
	}

	// Добавление в Группу нового студента

	public void addToGroup(Student st) throws MyException {
		if (st == null) {
			throw new IllegalArgumentException("Null student");
		}
		for (int i = 0; i < stGroup.length; i++) {
			if (stGroup[i] == null) {
				stGroup[i] = st;
				return;
			}
		}
		throw new MyException();
	}

	// Удаление студента из группы по номеру

	public void delFromGroup(int number) {

		if (number >= 0 && number < stGroup.length && stGroup[number - 1] != null) {

			Student temp = stGroup[number - 1];
			stGroup[number - 1] = null;
			System.out.println("Student [" + temp + "] DELETED");
			return;
		}
		System.out.println("Student Number ERROR");
	}

	// СОРТИРОВКА
	private void sort() {
		for (int i = 0; i < stGroup.length - 1; i++) {
			for (int j = i + 1; j < stGroup.length; j++) {
				if (compareStudent(stGroup[i], stGroup[j]) > 0) {
					Student temp = stGroup[i];
					stGroup[i] = stGroup[j];
					stGroup[j] = temp;
				}
			}
		}
	}

	// Сравнение Compare для сортировки sort
	private int compareStudent(Student a, Student b) {
		if (a != null && b == null) {
			return -1;
		}
		if (a == null && b != null) {
			return 1;
		}
		if (a == null && b == null) {
			return 0;
		}
		return a.getName().compareTo(b.getName());
	}

	// Вывод отсортированного Списка студентов
	public String toString() {
		System.out.println("Group contains:");
		StringBuilder sb = new StringBuilder();
		sort();
		for (int i = 0; i < stGroup.length; i++) {
			if (stGroup[i] != null) {
				sb.append(((i + 1) + ") " + stGroup[i]));
				sb.append(System.lineSeparator());
			}

		}
		return sb.toString();
	}

	// Поиск студента по Имени (Фамилии)
	public Student getStudentNumber(String name) {
		for (Student st : stGroup) {
			if (st != null && st.getName().equalsIgnoreCase(name)) {
				return st;
			}
		}
		return null;
	}

}
