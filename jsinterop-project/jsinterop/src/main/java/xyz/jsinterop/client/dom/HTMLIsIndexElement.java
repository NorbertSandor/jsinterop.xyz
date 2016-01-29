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
public interface HTMLIsIndexElement extends HTMLElement {
	/**
	 * Sets or retrieves the URL to which the form content is sent for
	 * processing.
	 */
	@JsProperty
	public abstract String getAction();

	/**
	 * Sets or retrieves the URL to which the form content is sent for
	 * processing.
	 */
	@JsProperty
	public abstract void setAction(final String value);

	/**
	 * Retrieves a reference to the form that the object is embedded in.
	 */
	@JsProperty
	public abstract HTMLFormElement getForm();

	/**
	 * Retrieves a reference to the form that the object is embedded in.
	 */
	@JsProperty
	public abstract void setForm(final HTMLFormElement value);

	@JsProperty
	public abstract String getPrompt();

	@JsProperty
	public abstract void setPrompt(final String value);
}
