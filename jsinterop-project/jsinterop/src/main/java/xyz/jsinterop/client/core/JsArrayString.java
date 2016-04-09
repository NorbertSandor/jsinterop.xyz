/*
 * #%L
 * JsInterop.xyz
 * %%
 * Copyright (C) 2015 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */
package xyz.jsinterop.client.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import com.google.common.base.Objects;
import com.google.gwt.core.client.JavaScriptObject;

import xyz.jsinterop.shared.core.util.ListOfString;

public final class JsArrayString extends JavaScriptObject implements ListOfString {
	private final class ListImpl implements List<String> {
		@Override
		public int size() {
			return getLength();
		}

		@Override
		public boolean isEmpty() {
			return size() == 0;
		}

		@Override
		public boolean contains(Object o) {
			for (int i = 0; i < size(); i++) {
				Object e = get(i);
				if (Objects.equal(o, e)) {
					return true;
				}
			}

			return false;
		}

		@Override
		public Iterator<String> iterator() {
			return new Iterator<String>() {
				private int currentIndex = -1;

				@Override
				public boolean hasNext() {
					return currentIndex + 1 < size();
				}

				@Override
				public String next() {
					if (hasNext()) {
						return get(++currentIndex);
					} else {
						throw new NoSuchElementException();
					}
				}
				
				@Override
				public void remove() {
					ListImpl.this.remove(currentIndex--);
				}
			};
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}

		@Override
		public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean add(String e) {
			push(e);
			return true;
		}

		@Override
		public boolean remove(Object o) {
			for (int i = 0; i < size(); i++) {
				Object e = get(i);
				if (Objects.equal(o, e)) {
					remove(i);
					return true;
				}
			}

			return false;
		}

		@Override
		public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean addAll(Collection<? extends String> c) {
			if (c.isEmpty()) {
				return false;
			}

			for (String e : c) {
				add(e);
			}

			return true;
		}

		@Override
		public boolean addAll(int index, Collection<? extends String> c) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}

		@Override
		public void clear() {
			int size = size();
			while (size-- > 0) {
				pop();
			}
		}

		@Override
		public String get(int index) {
			return JsArrayString.this.get(index);
		}

		@Override
		public String set(int index, String element) {
			String previous = get(index);
			JsArrayString.this.set(index, element);
			return previous;
		}

		@Override
		public void add(int index, String element) {
			splice(index, 0, element);
		}

		@Override
		public String remove(int index) {
			return splice(index, 1).get(0);
		}

		@Override
		public int indexOf(Object o) {
			for (int i = 0; i < size(); i++) {
				Object e = get(i);
				if (Objects.equal(o, e)) {
					return i;
				}
			}
			
			return -1;
		}

		@Override
		public int lastIndexOf(Object o) {
			for (int i = size() - 1; i >= 0; i--) {
				Object e = get(i);
				if (Objects.equal(o, e)) {
					return i;
				}
			}
			
			return -1;
		}

		@Override
		public ListIterator<String> listIterator() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}

		@Override
		public ListIterator<String> listIterator(int index) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}

		@Override
		public List<String> subList(int fromIndex, int toIndex) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}
	}

	public static JsArrayString of() {
		return JavaScriptObject.createArray().cast();
	}

	public static JsArrayString of(String... items) {
		JsArrayString array = of();
		array.push(items);
		return array;
	}

	protected JsArrayString() {
	}

	/**
	 * Gets or sets the length of the array. This is a number one higher than
	 * the highest element defined in an array.
	 */
	public native int getLength()
	/*-{
		return this.length;
	}-*/;

	/**
	 * Appends new elements to an array, and returns the new length of the
	 * array.
	 * 
	 * @param items
	 *            New elements of the Array.
	 */
	public int push(String... items) {
		// TODO call native
		for (String item : items) {
			push(item);
		}

		return getLength();
	}

	public native int push(String item)
	/*-{
		return this.push(item);
	}-*/;

	/**
	 * Removes the last element from an array and returns it.
	 */
	public native int pop()
	/*-{
		return this.pop();
	}-*/;

	/**
	 * Removes elements from an array and, if necessary, inserts new elements in
	 * their place, returning the deleted elements.
	 * 
	 * @param start
	 *            The zero-based location in the array from which to start
	 *            removing elements.
	 */
	// FIXME GWT compile error: public native JsArrayString splice(int start);
	/*-{
		return this.splice(start);
	}-*/;

	/**
	 * Removes elements from an array and, if necessary, inserts new elements in
	 * their place, returning the deleted elements.
	 * 
	 * @param start
	 *            The zero-based location in the array from which to start
	 *            removing elements.
	 * @param deleteCount
	 *            The number of elements to remove.
	 */
	public native JsArrayString splice(int start, int deleteCount)
	/*-{
		return this.splice(start, deleteCount);
	}-*/;

	/**
	 * Removes elements from an array and, if necessary, inserts new elements in
	 * their place, returning the deleted elements.
	 * 
	 * @param start
	 *            The zero-based location in the array from which to start
	 *            removing elements.
	 * @param deleteCount
	 *            The number of elements to remove.
	 * @param items
	 *            Elements to insert into the array in place of the deleted
	 *            elements.
	 */
	public native JsArrayString splice(int start, int deleteCount, String item)
	/*-{
		return this.splice(start, deleteCount, item);
	}-*/;

	@Override
	public final native String get(int index)
	/*-{
		return this[index];
	}-*/;

	@Override
	public final native void set(int index, String value)
	/*-{
		this[index] = value;
	}-*/;

	@Override
	public final native void add(String value)
	/*-{
		this.push(value);
	}-*/;

	@Override
	public int size() {
		return getLength();
	}

	@Override
	public List<String> asList() {
		return new ListImpl();
	}
}
