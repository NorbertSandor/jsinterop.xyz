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
public interface HTMLBaseFontElement extends HTMLElement, DOML2DeprecatedColorProperty {
	/**
	 * Sets or retrieves the current typeface family.
	 */
	@JsProperty
	public abstract String getFace();

	/**
	 * Sets or retrieves the current typeface family.
	 */
	@JsProperty
	public abstract void setFace(final String value);

	/**
	 * Sets or retrieves the font size of the object.
	 */
	@JsProperty
	public abstract double getSize();

	/**
	 * Sets or retrieves the font size of the object.
	 */
	@JsProperty
	public abstract void setSize(final double value);

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
