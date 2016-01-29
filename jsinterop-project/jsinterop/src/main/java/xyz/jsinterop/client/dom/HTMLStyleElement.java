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
public interface HTMLStyleElement extends HTMLElement, LinkStyle {
	/**
	 * Sets or retrieves the media type.
	 */
	@JsProperty
	public abstract String getMedia();

	/**
	 * Sets or retrieves the media type.
	 */
	@JsProperty
	public abstract void setMedia(final String value);

	/**
	 * Retrieves the CSS language in which the style sheet is written.
	 */
	@JsProperty
	public abstract String getType();

	/**
	 * Retrieves the CSS language in which the style sheet is written.
	 */
	@JsProperty
	public abstract void setType(final String value);

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
