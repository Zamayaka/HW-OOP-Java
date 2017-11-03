package com.gmail.zamayaka2013;

import javax.swing.JOptionPane;

public class Group implements Voenkom {
	private Student[] stGroup = new Student[10];
	private int sortParametr = 0;

	public Group() {
		super();
	}

	public Group(Student[] studentArray) {
		super();
		this.stGroup = studentArray;
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

	// Интерактивное Добавление в Группу нового студента
	public void addToGroupInteractive() throws MyException {
		Student st = null;
		try {
			String lastName = getName("Input student Lastname");
			String name = getName("Input student Name");
			int age = getAge();
			boolean sex = getSex("Input Student sex -> Boy or Girl");
			String group = getName("Input Group");
			long zach = getZach("Input zach number");
			st = new Student(lastName, name, age, sex, group, zach);

			this.addToGroup(st);
			JOptionPane.showMessageDialog(null, "A New Student was successfully ADDED\n");
		} catch (NullPointerException e) {
			System.out.println("Canceled");
			return;
		}
	}

	private String getName(String message) throws NullPointerException {
		boolean ok = false;
		String name = "";
		for (; !ok;) {
			try {
				name = JOptionPane.showInputDialog(message);
				ok = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Invalid format");
			}
		}
		return name;
	}

	private int getAge() throws NullPointerException {
		boolean ok = false;
		int age = 0;
		for (; !ok;) {
			try {
				age = Integer.valueOf(JOptionPane.showInputDialog("Input student age"));
				ok = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Invalid ");
			}
		}
		return age;
	}

	private boolean getSex(String message) {
		boolean ok = false;
		boolean studentSex = false;
		for (; !ok;) {
			try {

				studentSex = JOptionPane.showInputDialog(message).equalsIgnoreCase("Boy");
				ok = true;

			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Invalid format");
			}

		}
		return studentSex;
	}

	private long getZach(String message) throws NullPointerException {
		boolean ok = false;
		long nZach = 0;
		for (; !ok;) {
			try {
				nZach = Long.valueOf(JOptionPane.showInputDialog(message));
				ok = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Invalid format");
			}
		}
		return nZach;
	}

	// Удаление студента из группы по номеру
	public void delFromGroup(int number) {
		if (number > 0 && number <= stGroup.length && stGroup[number - 1] != null) {
			System.out.println(number + ". " + stGroup[number - 1] + " DELETED");
			stGroup[number - 1] = null;
			return;
		}
		System.out.println("DELETE ERROR (Wrong Student Number)");
	}

	// СОРТИРОВКА
	public Group sortParametr() {
		sortParametr = -1;
		for (; sortParametr < 0 || sortParametr > 6;) {
			try {
				sortParametr = Integer.valueOf(JOptionPane.showInputDialog(
						"To Sort Your Student list - Input Sort Parametr\n1-Lastname\n2-name\n3-age\n4-sex\n5-Group\n6-zach\n'0'to Quit\n"));
				if (sortParametr == 0) {
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Invalid parametr format");
			}
		}

		for (int i = 0; i < stGroup.length - 1; i++) {
			for (int j = i + 1; j < stGroup.length; j++) {
				if (compareStudent(stGroup[i], stGroup[j]) > 0) {
					Student temp = stGroup[i];
					stGroup[i] = stGroup[j];
					stGroup[j] = temp;
				}
			}
		}
		return new Group(stGroup);
	}

	// Сравнение для сортировки sort
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

		switch (sortParametr) {
		case 0:
			System.out.println("Cancel Sorting");
			return 0;

		case 1:
			return (a.getLastname().compareTo(b.getLastname()));
		case 2:
			return (a.getName().compareTo(b.getName()));
		case 3:
			return (a.getAge() - b.getAge());
		case 4:
			return ((a.isSex()) ? 1 : -1);
		case 5:
			return (a.getGr().compareTo(b.getGr()));
		case 6:
			return ((a.getZach() > b.getZach()) ? 1 : -1);
		}
		return 0;
	}

	// Вывод Группы студентов
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < stGroup.length; i++) {
			if (stGroup[i] != null) {
				sb.append(((i + 1) + ". " + stGroup[i]));
				sb.append(System.lineSeparator());
			}

		}
		return sb.toString();
	}

	// Поиск студента по (Фамилии)
	public Student getStudent(String lastname) {
		for (Student st : stGroup) {
			if (st != null && st.getLastname().equalsIgnoreCase(lastname)) {
				return st;
			}
		}
		return null;
	}

	@Override
	public Student[] naSluzhbu() {

		int prizyvnikArraySize = 0;
		for (Student st : stGroup) {
			if (st != null && st.isSex() && st.getAge() >= 18) {
				prizyvnikArraySize += 1;
			}
		}
		Student[] prizyvnikArray = new Student[prizyvnikArraySize];
		int num = 0;
		for (Student st : stGroup) {
			if (st != null && st.isSex() && st.getAge() >= 18) {
				prizyvnikArray[num++] = st;
			}
		}
		return prizyvnikArray;
	}

}
