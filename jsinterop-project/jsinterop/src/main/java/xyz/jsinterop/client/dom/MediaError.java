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
public interface MediaError {
	@JsProperty
	public abstract double getCode();

	@JsProperty
	public abstract void setCode(final double value);

	@JsProperty
	public abstract double getMsExtendedCode();

	@JsProperty
	public abstract void setMsExtendedCode(final double value);

	@JsProperty
	public abstract double getMEDIA_ERR_ABORTED();

	@JsProperty
	public abstract void setMEDIA_ERR_ABORTED(final double value);

	@JsProperty
	public abstract double getMEDIA_ERR_DECODE();

	@JsProperty
	public abstract void setMEDIA_ERR_DECODE(final double value);

	@JsProperty
	public abstract double getMEDIA_ERR_NETWORK();

	@JsProperty
	public abstract void setMEDIA_ERR_NETWORK(final double value);

	@JsProperty
	public abstract double getMEDIA_ERR_SRC_NOT_SUPPORTED();

	@JsProperty
	public abstract void setMEDIA_ERR_SRC_NOT_SUPPORTED(final double value);

	@JsProperty
	public abstract double getMS_MEDIA_ERR_ENCRYPTED();

	@JsProperty
	public abstract void setMS_MEDIA_ERR_ENCRYPTED(final double value);
}
