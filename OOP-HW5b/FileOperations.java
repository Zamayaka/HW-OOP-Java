package com.gmail.zamayaka2013;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	
	public static void eqWord(File fileOne, File fileTwo, File fileSum) {
		String str = "";
		String strOne = "";
		String strTwo = "";
		String st = "";
		int pointer = 0;
		try (BufferedReader fr1 = new BufferedReader(new FileReader(fileOne));
				BufferedReader fr2 = new BufferedReader(new FileReader(fileTwo));
				FileWriter fwr = new FileWriter(fileSum, true)) {
			if ((fileOne.length()) <= 0 || (fileTwo.length()) <= 0) {
				System.out.println("One or more Files are Empty");
				return;
			}
			for (; (str = fr1.readLine()) != null;) {
				strOne += str;
			}
			for (; (str = fr2.readLine()) != null;) {
				strTwo += str;
			}
			str = "";
			for (; pointer < strOne.lastIndexOf(" ");) {
				str = strOne.substring(pointer, strOne.indexOf(" ", pointer += 1));
				pointer += str.length();
				if (strTwo.contains(str) && !st.contains(str)) {
					fwr.write("\n" + str);
					st += str;
				}
			}
			if (pointer < strOne.length()) {
				str = strOne.substring(pointer, strOne.length());
				if (strTwo.contains(str) && !st.contains(str)) {
					fwr.write("\n" + str);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void TwoInOne(File fileOne, File fileTwo, File fileSum) {

		try (FileInputStream isOne = new FileInputStream(fileOne);
				FileInputStream isTwo = new FileInputStream(fileTwo);
				FileOutputStream osSum = new FileOutputStream(fileSum)) {

			byte[] b = new byte[1024 * 1024];
			int pointer;
			if ((fileOne.length()) <= 0 || (fileTwo.length()) <= 0) {
				System.out.println("One or more Files are Empty");
				return;
			}
			for (; (pointer = isOne.read(b)) > 0;) {
				osSum.write(b, 0, pointer);
			}
			osSum.write(new String("\n\nNextFile=>\n\n").getBytes());
			for (; (pointer = isTwo.read(b)) > 0;) {
				osSum.write(b, 0, pointer);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println(fileSum.getName() + " exist - " + fileSum.exists());
	}

}
