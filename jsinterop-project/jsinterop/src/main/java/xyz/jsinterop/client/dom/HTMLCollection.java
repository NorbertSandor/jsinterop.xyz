package xyz.jsinterop.client.dom;

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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface HTMLCollection {
	/**
	 * Sets or retrieves the number of objects in a collection.
	 */
	@JsProperty
	public abstract double getLength();

	/**
	 * Sets or retrieves the number of objects in a collection.
	 */
	@JsProperty
	public abstract void setLength(final double value);

	@JsOverlay
	public default Element get(final int index) {
		return (Element) xyz.jsinterop.client.core.JsArrays.getArrayItem(this, index);
	}

	@JsOverlay
	public default void set(final int index, final Element value) {
		xyz.jsinterop.client.core.JsArrays.setArrayItem(this, index, value);
	}

	/**
	 * Retrieves an object from various collections.
	 */
	@JsMethod
	public abstract Element item();

	/**
	 * Retrieves an object from various collections.
	 */
	@JsMethod
	public abstract Element item(final Object nameOrIndex);

	/**
	 * Retrieves an object from various collections.
	 */
	@JsMethod
	public abstract Element item(final Object nameOrIndex, final Object optionalIndex);

	/**
	 * Retrieves a select object or an object from an options collection.
	 */
	@JsMethod
	public abstract Element namedItem(final String name);
}
