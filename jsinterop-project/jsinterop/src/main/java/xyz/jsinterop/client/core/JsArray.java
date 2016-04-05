/*
 * #%L
 * jsinterop
 * %%
 * Copyright (C) 2016 Norbert Sándor
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

import xyz.jsinterop.shared.core.util.ListOf;

public final class JsArray<T> extends JavaScriptObject implements ListOf<T> {
	private final class ListImpl implements List<T> {
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
		public Iterator<T> iterator() {
			return new Iterator<T>() {
				private int currentIndex = -1;

				@Override
				public boolean hasNext() {
					return currentIndex + 1 < size();
				}

				@Override
				public T next() {
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
		public boolean add(T e) {
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
		public boolean addAll(Collection<? extends T> c) {
			if (c.isEmpty()) {
				return false;
			}

			for (T e : c) {
				add(e);
			}

			return true;
		}

		@Override
		public boolean addAll(int index, Collection<? extends T> c) {
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
		public T get(int index) {
			return JsArray.this.get(index);
		}

		@Override
		public T set(int index, T element) {
			T previous = get(index);
			JsArray.this.set(index, element);
			return previous;
		}

		@Override
		public void add(int index, T element) {
			splice(index, 0, element);
		}

		@Override
		public T remove(int index) {
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
		public ListIterator<T> listIterator() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}

		@Override
		public ListIterator<T> listIterator(int index) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}

		@Override
		public List<T> subList(int fromIndex, int toIndex) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}
	}

	public static <T> JsArray<T> of() {
		return JavaScriptObject.createArray().cast();
	}

	public static <T> JsArray<T> of(T... items) {
		JsArray<T> array = of();
		array.push(items);
		return array;
	}

	protected JsArray() {
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
	public int push(T... items) {
		// TODO call native
		for (T item : items) {
			push(item);
		}

		return getLength();
	}

	public native int push(T item)
	/*-{
		return this.push(item);
	}-*/;

	/**
	 * Removes the last element from an array and returns it.
	 */
	public native T pop()
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
	public native JsArray<T> splice(int start);
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
	public native JsArray<T> splice(int start, int deleteCount)
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
	public native JsArray<T> splice(int start, int deleteCount, T item)
	/*-{
		return this.splice(start, deleteCount, item);
	}-*/;

	@Override
	public final native T get(int index)
	/*-{
		return this[index];
	}-*/;

	@Override
	public final native void set(int index, T value)
	/*-{
		this[index] = value;
	}-*/;

	@Override
	public final native void add(T value)
	/*-{
		this.push(value);
	}-*/;

	@Override
	public int size() {
		return getLength();
	}

	@Override
	public List<T> asList() {
		return new ListImpl();
	}
}
