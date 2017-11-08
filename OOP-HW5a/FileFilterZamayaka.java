package com.gmail.zamayaka;

import java.io.File;
import java.io.FileFilter;

public class FileFilterZamayaka implements FileFilter {
	private String[] extensions;

	public FileFilterZamayaka(String[] extensions) {
		super();
		this.extensions = extensions;
	}

	private boolean check(String ext) {
		for (String extension : extensions) {
			if (ext.equalsIgnoreCase(extension)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File path) {
		int indexOfPoint = path.getName().lastIndexOf(".");
		if (indexOfPoint == -1) {
			return false;
		}
		String ext = path.getName().substring(indexOfPoint + 1);
		return check(ext);
	}

}
