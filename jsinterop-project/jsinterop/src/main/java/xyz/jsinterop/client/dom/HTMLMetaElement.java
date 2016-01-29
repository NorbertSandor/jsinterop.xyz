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
public interface HTMLMetaElement extends HTMLElement {
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
	 * Gets or sets meta-information to associate with httpEquiv or name.
	 */
	@JsProperty
	public abstract String getContent();

	/**
	 * Gets or sets meta-information to associate with httpEquiv or name.
	 */
	@JsProperty
	public abstract void setContent(final String value);

	/**
	 * Gets or sets information used to bind the value of a content attribute of
	 * a meta element to an HTTP response header.
	 */
	@JsProperty
	public abstract String getHttpEquiv();

	/**
	 * Gets or sets information used to bind the value of a content attribute of
	 * a meta element to an HTTP response header.
	 */
	@JsProperty
	public abstract void setHttpEquiv(final String value);

	/**
	 * Sets or retrieves the value specified in the content attribute of the
	 * meta object.
	 */
	@JsProperty
	public abstract String getName();

	/**
	 * Sets or retrieves the value specified in the content attribute of the
	 * meta object.
	 */
	@JsProperty
	public abstract void setName(final String value);

	/**
	 * Sets or retrieves a scheme to be used in interpreting the value of a
	 * property specified for the object.
	 */
	@JsProperty
	public abstract String getScheme();

	/**
	 * Sets or retrieves a scheme to be used in interpreting the value of a
	 * property specified for the object.
	 */
	@JsProperty
	public abstract void setScheme(final String value);

	/**
	 * Sets or retrieves the URL property that will be loaded after the
	 * specified time has elapsed.
	 */
	@JsProperty
	public abstract String getUrl();

	/**
	 * Sets or retrieves the URL property that will be loaded after the
	 * specified time has elapsed.
	 */
	@JsProperty
	public abstract void setUrl(final String value);
}
