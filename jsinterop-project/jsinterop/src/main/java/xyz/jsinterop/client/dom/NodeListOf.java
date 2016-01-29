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
public interface NodeListOf<TNode> extends NodeList {
	@JsProperty
	public abstract double getLength();

	@JsProperty
	public abstract void setLength(final double value);

	// TODO rename to get()
	@JsOverlay
	public default TNode getAt(final int index) {
		return (TNode) xyz.jsinterop.client.core.JsArrays.getArrayItem(this, index);
	}

	// TODO rename to set()
	@JsOverlay
	public default void setAt(final int index, final TNode value) {
		xyz.jsinterop.client.core.JsArrays.setArrayItem(this, index, value);
	}

	@JsMethod(name = "item")
	public abstract TNode itemAt(final int index);
}
