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
public interface NamedNodeMap {
	@JsProperty
	public abstract double getLength();

	@JsProperty
	public abstract void setLength(final double value);

	@JsOverlay
	public default Attr get(final int index) {
		return (Attr) xyz.jsinterop.client.core.JsArrays.getArrayItem(this, index);
	}

	@JsOverlay
	public default void set(final int index, final Attr value) {
		xyz.jsinterop.client.core.JsArrays.setArrayItem(this, index, value);
	}

	@JsMethod
	public abstract Attr getNamedItem(final String name);

	@JsMethod
	public abstract Attr getNamedItemNS(final String namespaceURI, final String localName);

	@JsMethod
	public abstract Attr item(final double index);

	@JsMethod
	public abstract Attr removeNamedItem(final String name);

	@JsMethod
	public abstract Attr removeNamedItemNS(final String namespaceURI, final String localName);

	@JsMethod
	public abstract Attr setNamedItem(final Attr arg);

	@JsMethod
	public abstract Attr setNamedItemNS(final Attr arg);
}
