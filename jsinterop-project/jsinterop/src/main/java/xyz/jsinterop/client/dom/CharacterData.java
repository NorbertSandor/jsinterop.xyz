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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface CharacterData extends Node, ChildNode {
	@JsProperty
	public abstract String getData();

	@JsProperty
	public abstract void setData(final String value);

	@JsProperty
	public abstract double getLength();

	@JsProperty
	public abstract void setLength(final double value);

	@JsMethod
	public abstract void appendData(final String arg);

	@JsMethod
	public abstract void deleteData(final double offset, final double count);

	@JsMethod
	public abstract void insertData(final double offset, final String arg);

	@JsMethod
	public abstract void replaceData(final double offset, final double count, final String arg);

	@JsMethod
	public abstract String substringData(final double offset, final double count);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener, final boolean useCapture);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener,
			final boolean useCapture);
}
