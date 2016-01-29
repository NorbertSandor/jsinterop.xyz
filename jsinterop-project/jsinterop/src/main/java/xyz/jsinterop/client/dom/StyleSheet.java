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
public interface StyleSheet {
	@JsProperty
	public abstract boolean isDisabled();

	@JsProperty
	public abstract void setDisabled(final boolean value);

	@JsProperty
	public abstract String getHref();

	@JsProperty
	public abstract void setHref(final String value);

	@JsProperty
	public abstract MediaList getMedia();

	@JsProperty
	public abstract void setMedia(final MediaList value);

	@JsProperty
	public abstract Node getOwnerNode();

	@JsProperty
	public abstract void setOwnerNode(final Node value);

	@JsProperty
	public abstract StyleSheet getParentStyleSheet();

	@JsProperty
	public abstract void setParentStyleSheet(final StyleSheet value);

	@JsProperty
	public abstract String getTitle();

	@JsProperty
	public abstract void setTitle(final String value);

	@JsProperty
	public abstract String getType();

	@JsProperty
	public abstract void setType(final String value);
}
