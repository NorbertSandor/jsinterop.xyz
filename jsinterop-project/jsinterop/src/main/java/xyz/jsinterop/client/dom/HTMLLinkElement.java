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
public interface HTMLLinkElement extends HTMLElement, LinkStyle {
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

	@JsProperty
	public abstract boolean isDisabled();

	@JsProperty
	public abstract void setDisabled(final boolean value);

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
	 * Sets or retrieves the MIME type of the object.
	 */
	@JsProperty
	public abstract String getType();

	/**
	 * Sets or retrieves the MIME type of the object.
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
