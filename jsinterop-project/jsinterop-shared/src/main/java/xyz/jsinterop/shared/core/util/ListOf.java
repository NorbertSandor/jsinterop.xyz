package xyz.jsinterop.shared.core.util;

import java.util.List;

public interface ListOf<T> {
	T get(int index);
	
	void set(int index, T value);
	
	int size();
	
	List<T> asList();
}
