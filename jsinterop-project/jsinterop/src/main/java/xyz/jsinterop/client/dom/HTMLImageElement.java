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
public interface HTMLImageElement extends HTMLElement {
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
	 * Sets or retrieves a text alternative to the graphic.
	 */
	@JsProperty
	public abstract String getAlt();

	/**
	 * Sets or retrieves a text alternative to the graphic.
	 */
	@JsProperty
	public abstract void setAlt(final String value);

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
	 * Retrieves whether the object is fully loaded.
	 */
	@JsProperty
	public abstract boolean isComplete();

	/**
	 * Retrieves whether the object is fully loaded.
	 */
	@JsProperty
	public abstract void setComplete(final boolean value);

	@JsProperty
	public abstract String getCrossOrigin();

	@JsProperty
	public abstract void setCrossOrigin(final String value);

	@JsProperty
	public abstract String getCurrentSrc();

	@JsProperty
	public abstract void setCurrentSrc(final String value);

	/**
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract double getHeight();

	/**
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract void setHeight(final double value);

	/**
	 * Sets or retrieves the width of the border to draw around the object.
	 */
	@JsProperty
	public abstract double getHspace();

	/**
	 * Sets or retrieves the width of the border to draw around the object.
	 */
	@JsProperty
	public abstract void setHspace(final double value);

	/**
	 * Sets or retrieves whether the image is a server-side image map.
	 */
	@JsProperty
	public abstract boolean isIsMap();

	/**
	 * Sets or retrieves whether the image is a server-side image map.
	 */
	@JsProperty
	public abstract void setIsMap(final boolean value);

	/**
	 * Sets or retrieves a Uniform Resource Identifier (URI) to a long
	 * description of the object.
	 */
	@JsProperty
	public abstract String getLongDesc();

	/**
	 * Sets or retrieves a Uniform Resource Identifier (URI) to a long
	 * description of the object.
	 */
	@JsProperty
	public abstract void setLongDesc(final String value);

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

	@JsProperty
	public abstract String getMsPlayToPreferredSourceUri();

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
	 * The original height of the image resource before sizing.
	 */
	@JsProperty
	public abstract double getNaturalHeight();

	/**
	 * The original height of the image resource before sizing.
	 */
	@JsProperty
	public abstract void setNaturalHeight(final double value);

	/**
	 * The original width of the image resource before sizing.
	 */
	@JsProperty
	public abstract double getNaturalWidth();

	/**
	 * The original width of the image resource before sizing.
	 */
	@JsProperty
	public abstract void setNaturalWidth(final double value);

	/**
	 * The address or URL of the a media resource that is to be considered.
	 */
	@JsProperty
	public abstract String getSrc();

	/**
	 * The address or URL of the a media resource that is to be considered.
	 */
	@JsProperty
	public abstract void setSrc(final String value);

	@JsProperty
	public abstract String getSrcset();

	@JsProperty
	public abstract void setSrcset(final String value);

	/**
	 * Sets or retrieves the URL, often with a bookmark extension (#name), to
	 * use as a client-side image map.
	 */
	@JsProperty
	public abstract String getUseMap();

	/**
	 * Sets or retrieves the URL, often with a bookmark extension (#name), to
	 * use as a client-side image map.
	 */
	@JsProperty
	public abstract void setUseMap(final String value);

	/**
	 * Sets or retrieves the vertical margin for the object.
	 */
	@JsProperty
	public abstract double getVspace();

	/**
	 * Sets or retrieves the vertical margin for the object.
	 */
	@JsProperty
	public abstract void setVspace(final double value);

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

	@JsProperty
	public abstract double getX();

	@JsProperty
	public abstract void setX(final double value);

	@JsProperty
	public abstract double getY();

	@JsProperty
	public abstract void setY(final double value);

	@JsMethod
	public abstract Object msGetAsCastingSource();
}
