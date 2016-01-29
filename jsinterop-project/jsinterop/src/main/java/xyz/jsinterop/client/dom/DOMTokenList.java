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
public interface DOMTokenList {
	@JsProperty
	public abstract double getLength();

	@JsProperty
	public abstract void setLength(final double value);

	@JsOverlay
	public default String get(final int index) {
		return (String) xyz.jsinterop.client.core.JsArrays.getArrayItem(this, index);
	}

	@JsOverlay
	public default void set(final int index, final String value) {
		xyz.jsinterop.client.core.JsArrays.setArrayItem(this, index, value);
	}

	@JsMethod
	public abstract void add();

	@JsMethod
	public abstract void add(final Object token);

	@JsMethod
	public abstract boolean contains(final String token);

	@JsMethod
	public abstract String item(final double index);

	@JsMethod
	public abstract void remove();

	@JsMethod
	public abstract void remove(final Object token);

	@JsMethod
	public abstract String toString();

	@JsMethod
	public abstract boolean toggle(final String token);

	@JsMethod
	public abstract boolean toggle(final String token, final boolean force);
}
