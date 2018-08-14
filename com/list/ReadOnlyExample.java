package com.list;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ReadOnlyExample {

	// 不可变集合
	public static void main(String[] args) {
		Set set = new HashSet();
		List list = new LinkedList();
		set.add("a");
		set.add("b");
		set.add("c");
		set = Collections.unmodifiableSet(set);
		list = Collections.unmodifiableList(list);
		set.add("d");
	}
}
