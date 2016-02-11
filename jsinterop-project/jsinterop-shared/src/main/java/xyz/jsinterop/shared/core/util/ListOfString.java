package xyz.jsinterop.shared.core.util;

import java.util.List;

public interface ListOfString {
	String get(int index);
	
	void set(int index, String value);
	
	int size();
	
	List<String> asList();
}
