package com.glarimy.proxy.client;

import com.glarimy.proxy.pattern.Directory;
import com.glarimy.proxy.pattern.DirectoryException;
import com.glarimy.proxy.pattern.Factory;

public class DirectoryApplication {
	public static void main(String[] args) {
		Directory dir = Factory.getDirectory(true);
		try {
			dir.add("");
			System.out.println("Added empty name with validation");
		} catch (DirectoryException de) {
			System.out.println("Failed to add name with validation");
		}

		dir = Factory.getDirectory(false);
		try {
			dir.add("");
			System.out.println("Added empty name without validation");
		} catch (DirectoryException de) {
			System.out.println("Failed to add name without validation");
		}
	}
}
