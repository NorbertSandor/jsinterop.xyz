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

import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsMethod;
import xyz.jsinterop.shared.core.util.ListOfInt;

public final class JsArrayInt extends JavaScriptObject implements ListOfInt {
	public static JsArrayInt of() {
		return JavaScriptObject.createArray().cast();
	}

	public static JsArrayInt of(int... items) {
		JsArrayInt array = of();
		array.push(items);
		return array;
	}

	protected JsArrayInt() {
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
	@JsMethod
	public int push(int... items) {
		// TODO call native
		for (int item : items) {
			push(item);
		}

		return getLength();
	}

	@JsMethod
	public native int push(int item)
	/*-{
		return this.push(item);
	}-*/;

	/**
	 * Removes the last element from an array and returns it.
	 */
	@JsMethod
	public native int pop()
	/*-{
		return this.pop();
	}-*/;

	public final native int get(int index)
	/*-{
		return this[index];
	}-*/;

	public final native void set(int index, int value)
	/*-{
		this[index] = value;
	}-*/;
}
