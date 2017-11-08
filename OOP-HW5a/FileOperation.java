package com.gmail.zamayaka;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {

	public static void copyFile(File from, File to) throws IOException {

		if (from == null || to == null) {
			throw new IllegalArgumentException("null file pointer");
		}

		try (FileInputStream fis = new FileInputStream(from); FileOutputStream fos = new FileOutputStream(to)) {

			byte[] buffer = new byte[1024 * 1024];
			for (; (fis.read(buffer)) > 0;) {
				fos.write(fis.read(buffer));
			}
		}
	}

	public static void copyDirectory(File folderSource, File folderAcceptor, FileFilter filter) throws IOException {

		if (folderSource == null || folderAcceptor == null || filter == null) {
			throw new IllegalArgumentException("Null pointer Exception");
		}
		File[] acceptedFiles = folderSource.listFiles(filter);
		for (File file : acceptedFiles) {
			copyFile(file, new File(folderAcceptor, file.getName()));
		}
	}
}
