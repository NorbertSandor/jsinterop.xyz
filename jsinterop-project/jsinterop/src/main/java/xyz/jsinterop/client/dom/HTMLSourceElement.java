package xyz.jsinterop.client.dom;

import jsinterop.annotations.JsPackage;

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

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface HTMLSourceElement extends HTMLElement {
	/**
	 * Gets or sets the intended media type of the media source.
	 */
	@JsProperty
	public abstract String getMedia();

	/**
	 * Gets or sets the intended media type of the media source.
	 */
	@JsProperty
	public abstract void setMedia(final String value);

	@JsProperty
	public abstract String getMsKeySystem();

	@JsProperty
	public abstract void setMsKeySystem(final String value);

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

	/**
	 * Gets or sets the MIME type of a media resource.
	 */
	@JsProperty
	public abstract String getType();

	/**
	 * Gets or sets the MIME type of a media resource.
	 */
	@JsProperty
	public abstract void setType(final String value);
}
