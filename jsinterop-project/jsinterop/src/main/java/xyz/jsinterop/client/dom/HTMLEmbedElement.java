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
public interface HTMLEmbedElement extends HTMLElement, GetSVGDocument {
	/**
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract String getHeight();

	/**
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract void setHeight(final String value);

	@JsProperty
	public abstract Object getHidden();

	@JsProperty
	public abstract void setHidden(final Object value);

	/**
	 * Gets or sets whether the DLNA PlayTo device is available.
	 */
	@JsProperty
	public abstract boolean isMsPlayToDisabled();

	/**
	 * Gets or sets whether the DLNA PlayTo device is available.
	 */
	@JsProperty
	public abstract void setMsPlayToDisabled(final boolean value);

	/**
	 * Gets or sets the path to the preferred media source. This enables the
	 * Play To target device to stream the media content, which can be DRM
	 * protected, from a different location, such as a cloud media server.
	 */
	@JsProperty
	public abstract String getMsPlayToPreferredSourceUri();

	/**
	 * Gets or sets the path to the preferred media source. This enables the
	 * Play To target device to stream the media content, which can be DRM
	 * protected, from a different location, such as a cloud media server.
	 */
	@JsProperty
	public abstract void setMsPlayToPreferredSourceUri(final String value);

	/**
	 * Gets or sets the primary DLNA PlayTo device.
	 */
	@JsProperty
	public abstract boolean isMsPlayToPrimary();

	/**
	 * Gets or sets the primary DLNA PlayTo device.
	 */
	@JsProperty
	public abstract void setMsPlayToPrimary(final boolean value);

	/**
	 * Gets the source associated with the media element for use by the
	 * PlayToManager.
	 */
	@JsProperty
	public abstract Object getMsPlayToSource();

	/**
	 * Gets the source associated with the media element for use by the
	 * PlayToManager.
	 */
	@JsProperty
	public abstract void setMsPlayToSource(final Object value);

	/**
	 * Sets or retrieves the name of the object.
	 */
	@JsProperty
	public abstract String getName();

	/**
	 * Sets or retrieves the name of the object.
	 */
	@JsProperty
	public abstract void setName(final String value);

	/**
	 * Retrieves the palette used for the embedded document.
	 */
	@JsProperty
	public abstract String getPalette();

	/**
	 * Retrieves the palette used for the embedded document.
	 */
	@JsProperty
	public abstract void setPalette(final String value);

	/**
	 * Retrieves the URL of the plug-in used to view an embedded document.
	 */
	@JsProperty
	public abstract String getPluginspage();

	/**
	 * Retrieves the URL of the plug-in used to view an embedded document.
	 */
	@JsProperty
	public abstract void setPluginspage(final String value);

	@JsProperty
	public abstract String getReadyState();

	@JsProperty
	public abstract void setReadyState(final String value);

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
	 * Sets or retrieves the height and width units of the embed object.
	 */
	@JsProperty
	public abstract String getUnits();

	/**
	 * Sets or retrieves the height and width units of the embed object.
	 */
	@JsProperty
	public abstract void setUnits(final String value);

	/**
	 * Sets or retrieves the width of the object.
	 */
	@JsProperty
	public abstract String getWidth();

	/**
	 * Sets or retrieves the width of the object.
	 */
	@JsProperty
	public abstract void setWidth(final String value);

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
