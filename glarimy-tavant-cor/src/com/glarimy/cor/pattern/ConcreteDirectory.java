package com.glarimy.cor.pattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteDirectory implements Directory {
	List<String> names;

	public ConcreteDirectory() {
		names = new ArrayList<>();
	}

	@Override
	public void add(String name) throws DirectoryException {
		names.add(name);
	}
}
