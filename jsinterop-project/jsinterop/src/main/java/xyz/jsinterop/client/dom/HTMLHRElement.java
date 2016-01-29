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
public interface HTMLHRElement extends HTMLElement, DOML2DeprecatedColorProperty, DOML2DeprecatedSizeProperty {
	/**
	 * Sets or retrieves how the object is aligned with adjacent text.
	 */
	@JsProperty
	public abstract String getAlign();

	/**
	 * Sets or retrieves how the object is aligned with adjacent text.
	 */
	@JsProperty
	public abstract void setAlign(final String value);

	/**
	 * Sets or retrieves whether the horizontal rule is drawn with 3-D shading.
	 */
	@JsProperty
	public abstract boolean isNoShade();

	/**
	 * Sets or retrieves whether the horizontal rule is drawn with 3-D shading.
	 */
	@JsProperty
	public abstract void setNoShade(final boolean value);

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
