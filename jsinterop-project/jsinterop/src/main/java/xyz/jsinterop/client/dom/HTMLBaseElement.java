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
public interface HTMLBaseElement extends HTMLElement {
	/**
	 * Gets or sets the baseline URL on which relative links are based.
	 */
	@JsProperty
	public abstract String getHref();

	/**
	 * Gets or sets the baseline URL on which relative links are based.
	 */
	@JsProperty
	public abstract void setHref(final String value);

	/**
	 * Sets or retrieves the window or frame at which to target content.
	 */
	@JsProperty
	public abstract String getTarget();

	/**
	 * Sets or retrieves the window or frame at which to target content.
	 */
	@JsProperty
	public abstract void setTarget(final String value);
}
