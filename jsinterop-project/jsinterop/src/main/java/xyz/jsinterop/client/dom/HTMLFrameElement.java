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
public interface HTMLFrameElement extends HTMLElement, GetSVGDocument {
	/**
	 * Specifies the properties of a border drawn around an object.
	 */
	@JsProperty
	public abstract String getBorder();

	/**
	 * Specifies the properties of a border drawn around an object.
	 */
	@JsProperty
	public abstract void setBorder(final String value);

	/**
	 * Sets or retrieves the border color of the object.
	 */
	@JsProperty
	public abstract Object getBorderColor();

	/**
	 * Sets or retrieves the border color of the object.
	 */
	@JsProperty
	public abstract void setBorderColor(final Object value);

	/**
	 * Retrieves the document object of the page or frame.
	 */
	@JsProperty
	public abstract Document getContentDocument();

	/**
	 * Retrieves the document object of the page or frame.
	 */
	@JsProperty
	public abstract void setContentDocument(final Document value);

	/**
	 * Retrieves the object of the specified.
	 */
	@JsProperty
	public abstract Window getContentWindow();

	/**
	 * Retrieves the object of the specified.
	 */
	@JsProperty
	public abstract void setContentWindow(final Window value);

	/**
	 * Sets or retrieves whether to display a border for the frame.
	 */
	@JsProperty
	public abstract String getFrameBorder();

	/**
	 * Sets or retrieves whether to display a border for the frame.
	 */
	@JsProperty
	public abstract void setFrameBorder(final String value);

	/**
	 * Sets or retrieves the amount of additional space between the frames.
	 */
	@JsProperty
	public abstract Object getFrameSpacing();

	/**
	 * Sets or retrieves the amount of additional space between the frames.
	 */
	@JsProperty
	public abstract void setFrameSpacing(final Object value);

	/**
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract Object getHeight();

	/**
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract void setHeight(final Object value);

	/**
	 * Sets or retrieves a URI to a long description of the object.
	 */
	@JsProperty
	public abstract String getLongDesc();

	/**
	 * Sets or retrieves a URI to a long description of the object.
	 */
	@JsProperty
	public abstract void setLongDesc(final String value);

	/**
	 * Sets or retrieves the top and bottom margin heights before displaying the
	 * text in a frame.
	 */
	@JsProperty
	public abstract String getMarginHeight();

	/**
	 * Sets or retrieves the top and bottom margin heights before displaying the
	 * text in a frame.
	 */
	@JsProperty
	public abstract void setMarginHeight(final String value);

	/**
	 * Sets or retrieves the left and right margin widths before displaying the
	 * text in a frame.
	 */
	@JsProperty
	public abstract String getMarginWidth();

	/**
	 * Sets or retrieves the left and right margin widths before displaying the
	 * text in a frame.
	 */
	@JsProperty
	public abstract void setMarginWidth(final String value);

	/**
	 * Sets or retrieves the frame name.
	 */
	@JsProperty
	public abstract String getName();

	/**
	 * Sets or retrieves the frame name.
	 */
	@JsProperty
	public abstract void setName(final String value);

	/**
	 * Sets or retrieves whether the user can resize the frame.
	 */
	@JsProperty
	public abstract boolean isNoResize();

	/**
	 * Sets or retrieves whether the user can resize the frame.
	 */
	@JsProperty
	public abstract void setNoResize(final boolean value);

	/**
	 * Raised when the object has been completely received from the server.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnload();

	/**
	 * Raised when the object has been completely received from the server.
	 */
	@JsProperty
	public abstract void setOnload(final EventListener<Event> value);

	/**
	 * Sets or retrieves whether the frame can be scrolled.
	 */
	@JsProperty
	public abstract String getScrolling();

	/**
	 * Sets or retrieves whether the frame can be scrolled.
	 */
	@JsProperty
	public abstract void setScrolling(final String value);

	/**
	 * Sets the value indicating whether the source file of a frame or iframe
	 * has specific security restrictions applied.
	 */
	@JsProperty
	public abstract Object getSecurity();

	/**
	 * Sets the value indicating whether the source file of a frame or iframe
	 * has specific security restrictions applied.
	 */
	@JsProperty
	public abstract void setSecurity(final Object value);

	/**
	 * Sets or retrieves a URL to be loaded by the object.
	 */
	@JsProperty
	public abstract String getSrc();

	/**
	 * Sets or retrieves a URL to be loaded by the object.
	 */
	@JsProperty
	public abstract void setSrc(final String value);

	/**
	 * Sets or retrieves the width of the object.
	 */
	@JsProperty
	public abstract Object getWidth();

	/**
	 * Sets or retrieves the width of the object.
	 */
	@JsProperty
	public abstract void setWidth(final Object value);

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
