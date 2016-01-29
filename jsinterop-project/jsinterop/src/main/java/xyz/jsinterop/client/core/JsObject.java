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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class JsObject {
	@JsConstructor
	public JsObject() {
	}

	/**
	 * Returns a date converted to a string using the current locale.
	 */
	@JsMethod
	public native String toLocaleString();

	/**
	 * Returns the primitive value of the specified object.
	 */
	@JsMethod
	public native Object valueOf();

	/**
	 * Determines whether an object has a property with the specified name.
	 * 
	 * @param v
	 *            A property name.
	 */
	@JsMethod
	public native boolean hasOwnProperty(String v);

	/**
	 * Determines whether an object exists in another object's prototype chain.
	 * 
	 * @param v
	 *            Another object whose prototype chain is to be checked.
	 */
	@JsMethod
	public native boolean isPrototypeOf(Object v);

	/**
	 * Determines whether a specified property is enumerable.
	 * 
	 * @param v
	 *            A property name.
	 */
	@JsMethod
	public native boolean propertyIsEnumerable(String v);
}
