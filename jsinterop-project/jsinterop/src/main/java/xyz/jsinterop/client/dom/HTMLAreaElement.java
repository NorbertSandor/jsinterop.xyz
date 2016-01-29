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
public interface HTMLAreaElement extends HTMLElement {
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
	 * Sets or retrieves the coordinates of the object.
	 */
	@JsProperty
	public abstract String getCoords();

	/**
	 * Sets or retrieves the coordinates of the object.
	 */
	@JsProperty
	public abstract void setCoords(final String value);

	/**
	 * Sets or retrieves the subsection of the href property that follows the
	 * number sign (#).
	 */
	@JsProperty
	public abstract String getHash();

	/**
	 * Sets or retrieves the subsection of the href property that follows the
	 * number sign (#).
	 */
	@JsProperty
	public abstract void setHash(final String value);

	/**
	 * Sets or retrieves the hostname and port number of the location or URL.
	 */
	@JsProperty
	public abstract String getHost();

	/**
	 * Sets or retrieves the hostname and port number of the location or URL.
	 */
	@JsProperty
	public abstract void setHost(final String value);

	/**
	 * Sets or retrieves the host name part of the location or URL.
	 */
	@JsProperty
	public abstract String getHostname();

	/**
	 * Sets or retrieves the host name part of the location or URL.
	 */
	@JsProperty
	public abstract void setHostname(final String value);

	/**
	 * Sets or retrieves a destination URL or an anchor point.
	 */
	@JsProperty
	public abstract String getHref();

	/**
	 * Sets or retrieves a destination URL or an anchor point.
	 */
	@JsProperty
	public abstract void setHref(final String value);

	/**
	 * Sets or gets whether clicks in this region cause action.
	 */
	@JsProperty
	public abstract boolean isNoHref();

	/**
	 * Sets or gets whether clicks in this region cause action.
	 */
	@JsProperty
	public abstract void setNoHref(final boolean value);

	/**
	 * Sets or retrieves the file name or path specified by the object.
	 */
	@JsProperty
	public abstract String getPathname();

	/**
	 * Sets or retrieves the file name or path specified by the object.
	 */
	@JsProperty
	public abstract void setPathname(final String value);

	/**
	 * Sets or retrieves the port number associated with a URL.
	 */
	@JsProperty
	public abstract String getPort();

	/**
	 * Sets or retrieves the port number associated with a URL.
	 */
	@JsProperty
	public abstract void setPort(final String value);

	/**
	 * Sets or retrieves the protocol portion of a URL.
	 */
	@JsProperty
	public abstract String getProtocol();

	/**
	 * Sets or retrieves the protocol portion of a URL.
	 */
	@JsProperty
	public abstract void setProtocol(final String value);

	@JsProperty
	public abstract String getRel();

	@JsProperty
	public abstract void setRel(final String value);

	/**
	 * Sets or retrieves the substring of the href property that follows the
	 * question mark.
	 */
	@JsProperty
	public abstract String getSearch();

	/**
	 * Sets or retrieves the substring of the href property that follows the
	 * question mark.
	 */
	@JsProperty
	public abstract void setSearch(final String value);

	/**
	 * Sets or retrieves the shape of the object.
	 */
	@JsProperty
	public abstract String getShape();

	/**
	 * Sets or retrieves the shape of the object.
	 */
	@JsProperty
	public abstract void setShape(final String value);

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

	/**
	 * Returns a string representation of an object.
	 */
	@JsMethod
	public abstract String toString();
}
