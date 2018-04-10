package com.glarimy.proxy.pattern;

public class Factory {
	public static Directory getDirectory(boolean withValidation) {
		if (withValidation) {
			Directory o = new ConcreteDirectory();
			return new ValidationProxy(o);
		} else {
			return new ConcreteDirectory();
		}
	}
}
