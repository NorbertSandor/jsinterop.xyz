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
public interface HTMLBlockElement extends HTMLElement {
	/**
	 * Sets or retrieves reference information about the object.
	 */
	@JsProperty
	public abstract String getCite();

	/**
	 * Sets or retrieves reference information about the object.
	 */
	@JsProperty
	public abstract void setCite(final String value);

	@JsProperty
	public abstract String getClear();

	@JsProperty
	public abstract void setClear(final String value);

	/**
	 * Sets or retrieves the width of the object.
	 */
	@JsProperty
	public abstract double getWidth();

	/**
	 * Sets or retrieves the width of the object.
	 */
	@JsProperty
	public abstract void setWidth(final double value);
}
