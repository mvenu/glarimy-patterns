package com.glarimy.decorator.pattern;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	List<String> names;

	public Directory() {
		names = new ArrayList<>();
	}

	public void add(String name) {
		names.add(name);
	}

	public void print() {
		for (String name : names)
			System.out.println(name);
	}
}
