package com.glarimy.decorator.client;

import com.glarimy.decorator.pattern.Directory;
import com.glarimy.decorator.pattern.DirectoryDecorator;

public class DirectoryApplication {
	public static void main(String[] args) {
		Directory dir = new Directory();
		dir.add("Krishna");
		dir.add("Mohan");
		dir.add("Koyya");
		dir.print();
		DirectoryDecorator decorator = new DirectoryDecorator(dir);
		decorator.print();
	}
}
