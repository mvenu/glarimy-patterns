package com.glarimy.cor.pattern;

public class Factory {
	public static Directory getDirectory(String[] options) {
		Directory o = new ConcreteDirectory();
		if (options.length == 1) {
			if (options[0] == "logging")
				return new LoggingProxy(o);
			else
				return new ValidationProxy(o);
		}
		if (options.length == 2) {
			if (options[0] == "logging") {
				Directory vp = new ValidationProxy(o);
				return new LoggingProxy(vp);

			} else {
				Directory lp = new LoggingProxy(o);
				return new ValidationProxy(lp);

			}
		}
		return new ConcreteDirectory();
	}
}
