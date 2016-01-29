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
import xyz.jsinterop.client.core.Uint8Array;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface MSMediaKeyMessageEvent extends Event {
	@JsProperty
	public abstract String getDestinationURL();

	@JsProperty
	public abstract void setDestinationURL(final String value);

	@JsProperty
	public abstract Uint8Array getMessage();

	@JsProperty
	public abstract void setMessage(final Uint8Array value);
}
