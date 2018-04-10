package com.glarimy.proxy.pattern;

public interface Directory {

	void add(String name) throws DirectoryException;

	void print() throws DirectoryException;

}