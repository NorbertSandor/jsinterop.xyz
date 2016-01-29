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
public interface HTMLScriptElement extends HTMLElement {
	@JsProperty
	public abstract boolean isAsync();

	@JsProperty
	public abstract void setAsync(final boolean value);

	/**
	 * Sets or retrieves the character set used to encode the object.
	 */
	@JsProperty
	public abstract String getCharset();

	/**
	 * Sets or retrieves the character set used to encode the object.
	 */
	@JsProperty
	public abstract void setCharset(final String value);

	/**
	 * Sets or retrieves the status of the script.
	 */
	@JsProperty
	public abstract boolean isDefer();

	/**
	 * Sets or retrieves the status of the script.
	 */
	@JsProperty
	public abstract void setDefer(final boolean value);

	/**
	 * Sets or retrieves the event for which the script is written.
	 */
	@JsProperty
	public abstract String getEvent();

	/**
	 * Sets or retrieves the event for which the script is written.
	 */
	@JsProperty
	public abstract void setEvent(final String value);

	/**
	 * Sets or retrieves the object that is bound to the event script.
	 */
	@JsProperty
	public abstract String getHtmlFor();

	/**
	 * Sets or retrieves the object that is bound to the event script.
	 */
	@JsProperty
	public abstract void setHtmlFor(final String value);

	/**
	 * Retrieves the URL to an external file that contains the source code or
	 * data.
	 */
	@JsProperty
	public abstract String getSrc();

	/**
	 * Retrieves the URL to an external file that contains the source code or
	 * data.
	 */
	@JsProperty
	public abstract void setSrc(final String value);

	/**
	 * Retrieves or sets the text of the object as a string.
	 */
	@JsProperty
	public abstract String getText();

	/**
	 * Retrieves or sets the text of the object as a string.
	 */
	@JsProperty
	public abstract void setText(final String value);

	/**
	 * Sets or retrieves the MIME type for the associated scripting engine.
	 */
	@JsProperty
	public abstract String getType();

	/**
	 * Sets or retrieves the MIME type for the associated scripting engine.
	 */
	@JsProperty
	public abstract void setType(final String value);
}
