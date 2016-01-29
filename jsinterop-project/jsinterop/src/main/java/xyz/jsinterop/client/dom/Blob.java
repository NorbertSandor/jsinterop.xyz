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
public interface Blob {
	@JsProperty
	public abstract double getSize();

	@JsProperty
	public abstract void setSize(final double value);

	@JsProperty
	public abstract String getType();

	@JsProperty
	public abstract void setType(final String value);

	@JsMethod
	public abstract void msClose();

	@JsMethod
	public abstract Object msDetachStream();

	@JsMethod
	public abstract Blob slice();

	@JsMethod
	public abstract Blob slice(final double start);

	@JsMethod
	public abstract Blob slice(final double start, final double end);

	@JsMethod
	public abstract Blob slice(final double start, final double end, final String contentType);
}
