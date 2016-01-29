package xyz.jsinterop.client.dom;

import jsinterop.annotations.JsPackage;

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

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface HTMLOListElement extends HTMLElement {
	@JsProperty
	public abstract boolean isCompact();

	@JsProperty
	public abstract void setCompact(final boolean value);

	/**
	 * The starting number.
	 */
	@JsProperty
	public abstract double getStart();

	/**
	 * The starting number.
	 */
	@JsProperty
	public abstract void setStart(final double value);

	@JsProperty
	public abstract String getType();

	@JsProperty
	public abstract void setType(final String value);
}
