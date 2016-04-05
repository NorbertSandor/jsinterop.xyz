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

public class ArrayListOf<E> implements ListOf<E> {
	private final ArrayList<E> list;

	public ArrayListOf(int initialCapacity) {
		list = new ArrayList<>(initialCapacity);
	}

	public ArrayListOf() {
		list = new ArrayList<>();
	}

	public ArrayListOf(Iterable<E> values) {
		this();

		for (E value : values) {
			list.add(value);
		}
	}

	public ArrayListOf(Collection<E> values) {
		list = new ArrayList<>(values.size());
		list.addAll(values);
	}

	@Override
	public E get(int index) {
		return list.get(index);
	}

	@Override
	public void set(int index, E value) {
		list.set(index, value);
	}

	@Override
	public void add(E value) {
		list.add(value);
	}

	@Override
	public List<E> asList() {
		return list;
	}

	@Override
	public int size() {
		return list.size();
	}
}
