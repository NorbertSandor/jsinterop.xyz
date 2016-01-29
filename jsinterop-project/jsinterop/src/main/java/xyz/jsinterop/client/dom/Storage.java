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
public interface Storage {
	@JsProperty
	public abstract double getLength();

	@JsProperty
	public abstract void setLength(final double value);

	@JsOverlay
	public default Object get(final String key) {
		return (Object) xyz.jsinterop.client.core.JsMaps.getItem(this, key);
	}

	@JsOverlay
	public default void set(final String key, final Object value) {
		xyz.jsinterop.client.core.JsMaps.setItem(this, key, value);
	}

	@JsOverlay
	public default String get(final int index) {
		return (String) xyz.jsinterop.client.core.JsArrays.getArrayItem(this, index);
	}

	@JsOverlay
	public default void set(final int index, final String value) {
		xyz.jsinterop.client.core.JsArrays.setArrayItem(this, index, value);
	}

	@JsMethod
	public abstract void clear();

	@JsMethod
	public abstract Object getItem(final String key);

	@JsMethod
	public abstract String key(final double index);

	@JsMethod
	public abstract void removeItem(final String key);

	@JsMethod
	public abstract void setItem(final String key, final String data);
}
