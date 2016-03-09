/*
 * #%L
 * JsInterop.xyz
 * %%
 * Copyright (C) 2016 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */
package xyz.jsinterop.shared.core.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListOfString implements ListOfString {
	private final ArrayList<String> list;

	public ArrayListOfString(int initialCapacity) {
		list = new ArrayList<>(initialCapacity);
	}

	public ArrayListOfString() {
		list = new ArrayList<>();
	}

	public ArrayListOfString(Iterable<String> values) {
		this();

		for (String value : values) {
			list.add(value);
		}
	}

	public ArrayListOfString(Collection<String> values) {
		list = new ArrayList<>(values.size());
		list.addAll(values);
	}

	@Override
	public String get(int index) {
		return list.get(index);
	}

	@Override
	public void set(int index, String value) {
		list.set(index, value);
	}

	@Override
	public void add(String value) {
		list.add(value);
	}

	@Override
	public List<String> asList() {
		return list;
	}

	@Override
	public int size() {
		return list.size();
	}
}
