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
 * Javascript related utility functions.
 */
public final class JsUtils {
	/**
	 * Cast an object to another type.<br>
	 * The main usage is to cast an Javascript object to another Javascript type:
	 * <p> 
	 * Note: this is a potentially unsafe operation, the cast is performed at runtime!
	 * </p>
	 */
	public static native <T> T cast(Object object)
	/*-{
		return object;
	}-*/;

	/**
	 * Invokes the Javascript {@code typeof} operator.
	 */
	public static native String typeOf(Object object)
	/*-{
		return typeof(object);
	}-*/;

	public static native String getPropertyString(Object object, String property)
	/*-{
		return object[property];
	}-*/;

	private JsUtils() {
	}
}
