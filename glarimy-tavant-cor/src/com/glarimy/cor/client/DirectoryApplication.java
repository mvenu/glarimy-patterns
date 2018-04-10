package com.glarimy.cor.client;

import com.glarimy.cor.pattern.Directory;
import com.glarimy.cor.pattern.DirectoryException;
import com.glarimy.cor.pattern.Factory;

public class DirectoryApplication {
	public static void main(String[] args) {
		Directory dir = Factory.getDirectory(new String[] { "logging", "validation" });
		try {
			dir.add("");
		} catch (DirectoryException de) {
		}
	}
}
