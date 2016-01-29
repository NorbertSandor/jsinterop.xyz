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

/**
 * Javascript array related functions.
 */
public final class JsArrays {
	/**
	 * Returns true if a variable is an Javascript array, otherwise false.
	 */
	public static native boolean isArray(Object object)
	/*-{
		return Array.isArray(object);
	}-*/;

	public static native <T> T getArrayItem(Object object, int index)
	/*-{
		return object[index];
	}-*/;

	public static native <T> void setArrayItem(Object object, int index, T value)
	/*-{
		object[index] = value;
	}-*/;

	private JsArrays() {
	}
}
