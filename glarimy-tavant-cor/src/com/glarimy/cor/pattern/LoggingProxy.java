package com.glarimy.cor.pattern;

public class LoggingProxy implements Directory {
	private Directory target;

	public LoggingProxy(Directory target) {
		this.target = target;
	}

	@Override
	public void add(String name) throws DirectoryException {
		System.out.println("LoggingProxy: Adding " + name);
		try {
			target.add(name);
			System.out.println("LoggingProxy: Added " + name);
		} catch (DirectoryException e) {
			System.out.println("LoggingProxy Failed to add " + name);
		}
	}

}
