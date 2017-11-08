package com.gmail.zamayaka2013;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {

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
