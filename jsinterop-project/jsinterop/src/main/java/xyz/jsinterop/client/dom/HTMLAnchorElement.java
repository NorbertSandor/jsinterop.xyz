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
public interface HTMLAnchorElement extends HTMLElement {
	@JsProperty
	public abstract String getMethods();

	@JsProperty
	public abstract void setMethods(final String value);

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
	 * Contains the anchor portion of the URL including the hash sign (#).
	 */
	@JsProperty
	public abstract String getHash();

	/**
	 * Contains the anchor portion of the URL including the hash sign (#).
	 */
	@JsProperty
	public abstract void setHash(final String value);

	/**
	 * Contains the hostname and port values of the URL.
	 */
	@JsProperty
	public abstract String getHost();

	/**
	 * Contains the hostname and port values of the URL.
	 */
	@JsProperty
	public abstract void setHost(final String value);

	/**
	 * Contains the hostname of a URL.
	 */
	@JsProperty
	public abstract String getHostname();

	/**
	 * Contains the hostname of a URL.
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
	 * Sets or retrieves the language code of the object.
	 */
	@JsProperty
	public abstract String getHreflang();

	/**
	 * Sets or retrieves the language code of the object.
	 */
	@JsProperty
	public abstract void setHreflang(final String value);

	@JsProperty
	public abstract String getMimeType();

	@JsProperty
	public abstract void setMimeType(final String value);

	/**
	 * Sets or retrieves the shape of the object.
	 */
	@JsProperty
	public abstract String getName();

	/**
	 * Sets or retrieves the shape of the object.
	 */
	@JsProperty
	public abstract void setName(final String value);

	@JsProperty
	public abstract String getNameProp();

	@JsProperty
	public abstract void setNameProp(final String value);

	/**
	 * Contains the pathname of the URL.
	 */
	@JsProperty
	public abstract String getPathname();

	/**
	 * Contains the pathname of the URL.
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
	 * Contains the protocol of the URL.
	 */
	@JsProperty
	public abstract String getProtocol();

	/**
	 * Contains the protocol of the URL.
	 */
	@JsProperty
	public abstract void setProtocol(final String value);

	@JsProperty
	public abstract String getProtocolLong();

	@JsProperty
	public abstract void setProtocolLong(final String value);

	/**
	 * Sets or retrieves the relationship between the object and the destination
	 * of the link.
	 */
	@JsProperty
	public abstract String getRel();

	/**
	 * Sets or retrieves the relationship between the object and the destination
	 * of the link.
	 */
	@JsProperty
	public abstract void setRel(final String value);

	/**
	 * Sets or retrieves the relationship between the object and the destination
	 * of the link.
	 */
	@JsProperty
	public abstract String getRev();

	/**
	 * Sets or retrieves the relationship between the object and the destination
	 * of the link.
	 */
	@JsProperty
	public abstract void setRev(final String value);

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
	 * Retrieves or sets the text of the object as a string.
	 */
	@JsProperty
	public abstract String getText();

	/**
	 * Retrieves or sets the text of the object as a string.
	 */
	@JsProperty
	public abstract void setText(final String value);

	@JsProperty
	public abstract String getType();

	@JsProperty
	public abstract void setType(final String value);

	@JsProperty
	public abstract String getUrn();

	@JsProperty
	public abstract void setUrn(final String value);

	/**
	 * Returns a string representation of an object.
	 */
	@JsMethod
	public abstract String toString();
}
