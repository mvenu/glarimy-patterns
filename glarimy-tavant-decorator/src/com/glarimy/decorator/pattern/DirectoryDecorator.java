package com.glarimy.decorator.pattern;

public class DirectoryDecorator extends Directory {
	private Directory target;

	public DirectoryDecorator(Directory target) {
		this.target = target;
	}

	@Override
	public void add(String name) {
		target.add(name);
	}

	@Override
	public void print() {
		for (String name : target.names) {
			System.out.println(name.toUpperCase());
		}
	}
}
