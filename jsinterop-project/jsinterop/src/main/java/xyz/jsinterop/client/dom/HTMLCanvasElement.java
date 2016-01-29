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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface HTMLCanvasElement extends HTMLElement {
	/**
	 * Gets or sets the height of a canvas element on a document.
	 */
	@JsProperty
	public abstract double getHeight();

	/**
	 * Gets or sets the height of a canvas element on a document.
	 */
	@JsProperty
	public abstract void setHeight(final double value);

	/**
	 * Gets or sets the width of a canvas element on a document.
	 */
	@JsProperty
	public abstract double getWidth();

	/**
	 * Gets or sets the width of a canvas element on a document.
	 */
	@JsProperty
	public abstract void setWidth(final double value);

	@JsOverlay
	public default CanvasRenderingContext2D getContext2d() {
		return (CanvasRenderingContext2D) getContext("2d");
	}

	@JsOverlay
	public default WebGLRenderingContext getContextExperimentalWebgl() {
		return (WebGLRenderingContext) getContext("experimental-webgl");
	}

	@JsMethod
	public abstract Object getContext(final String contextId);

	@JsMethod
	public abstract Object getContext(final String contextId, final Object args);

	/**
	 * Returns a blob object encoded as a Portable Network Graphics (PNG) format
	 * from a canvas image or drawing.
	 */
	@JsMethod
	public abstract Blob msToBlob();

	/**
	 * Returns the content of the current canvas as an image that you can use as
	 * a source for another canvas or an HTML element.
	 * 
	 * @param type
	 *            The standard MIME type for the image format to return. If you
	 *            do not specify this parameter, the default value is a PNG
	 *            format image.
	 */
	@JsMethod
	public abstract String toDataURL();

	/**
	 * Returns the content of the current canvas as an image that you can use as
	 * a source for another canvas or an HTML element.
	 * 
	 * @param type
	 *            The standard MIME type for the image format to return. If you
	 *            do not specify this parameter, the default value is a PNG
	 *            format image.
	 */
	@JsMethod
	public abstract String toDataURL(final String type);

	/**
	 * Returns the content of the current canvas as an image that you can use as
	 * a source for another canvas or an HTML element.
	 * 
	 * @param type
	 *            The standard MIME type for the image format to return. If you
	 *            do not specify this parameter, the default value is a PNG
	 *            format image.
	 */
	@JsMethod
	public abstract String toDataURL(final String type, final Object args);
}
