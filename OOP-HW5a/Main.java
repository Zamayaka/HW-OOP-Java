package com.gmail.zamayaka;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File folderSource = new File("fSource");
		System.out.println(folderSource.isDirectory());

		File folderAcceptor = new File("fAcceptor");
		folderAcceptor.mkdirs();

		FileFilterZamayaka newFF = new FileFilterZamayaka(new String[] { "txt", "jpg" });

		try {
			FileOperation.copyDirectory(folderSource, folderAcceptor, newFF);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
