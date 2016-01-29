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
public interface HTMLParamElement extends HTMLElement {
	/**
	 * Sets or retrieves the name of an input parameter for an element.
	 */
	@JsProperty
	public abstract String getName();

	/**
	 * Sets or retrieves the name of an input parameter for an element.
	 */
	@JsProperty
	public abstract void setName(final String value);

	/**
	 * Sets or retrieves the content type of the resource designated by the
	 * value attribute.
	 */
	@JsProperty
	public abstract String getType();

	/**
	 * Sets or retrieves the content type of the resource designated by the
	 * value attribute.
	 */
	@JsProperty
	public abstract void setType(final String value);

	/**
	 * Sets or retrieves the value of an input parameter for an element.
	 */
	@JsProperty
	public abstract String getValue();

	/**
	 * Sets or retrieves the value of an input parameter for an element.
	 */
	@JsProperty
	public abstract void setValue(final String value);

	/**
	 * Sets or retrieves the data type of the value attribute.
	 */
	@JsProperty
	public abstract String getValueType();

	/**
	 * Sets or retrieves the data type of the value attribute.
	 */
	@JsProperty
	public abstract void setValueType(final String value);
}
