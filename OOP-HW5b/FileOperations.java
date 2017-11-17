package com.gmail.zamayaka2013;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	public static String readFile(File textFile) {
		String str = "";
		String strFile = "";
		try (BufferedReader fr = new BufferedReader(new FileReader(textFile))) {
			for (; (str = fr.readLine()) != null;) {
				strFile += str;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return strFile;
	}

	public static void writeFile(String strFinal, File file) {
		try (FileWriter fwr = new FileWriter(file)) {
			fwr.write(strFinal);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void eqWord(File fileOne, File fileTwo, File fileSum) {
		String strOne = readFile(fileOne);
		String strTwo = readFile(fileTwo);
		String str = "";
		String st = "";
		int pointer = 0;
		if (strOne == null || strTwo == null) {
			System.out.println("One or more Files are Empty");
			return;
		}
		for (; pointer < strOne.lastIndexOf(" ");) {
			str = strOne.substring(pointer, strOne.indexOf(" ", pointer += 1));
			pointer += str.length();
			if (strTwo.contains(str) && !st.contains(str)) {
				st += str + "\n";
			}
		}
		if (pointer < strOne.length()) {
			str = strOne.substring(pointer, strOne.length());
			if (strTwo.contains(str) && !st.contains(str)) {
				st += str;
			}
		}
		writeFile(st, fileSum);
	}
}
