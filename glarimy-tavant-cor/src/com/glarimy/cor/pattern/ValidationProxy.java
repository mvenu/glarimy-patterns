package com.glarimy.cor.pattern;

public class ValidationProxy implements Directory {
	private Directory target;

	public ValidationProxy(Directory target) {
		this.target = target;
	}

	@Override
	public void add(String name) throws DirectoryException {
		if (name == null || name.trim().length() == 0) {
			System.out.println("ValidationProxy: Validation failed");
			throw new DirectoryException();
		}
		System.out.println("ValidationProxy: Validation succeeded");
		target.add(name);
	}
}
