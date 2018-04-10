package com.glarimy.proxy.pattern;

public class ValidationProxy implements Directory {
	private Directory target;

	public ValidationProxy(Directory target) {
		this.target = target;
	}

	@Override
	public void add(String name) throws DirectoryException {
		if (name == null || name.trim().length() == 0)
			throw new DirectoryException();
		target.add(name);
	}

	@Override
	public void print() {

	}
}
