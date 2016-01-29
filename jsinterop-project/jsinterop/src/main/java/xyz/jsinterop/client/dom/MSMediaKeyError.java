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
public interface MSMediaKeyError {
	@JsProperty
	public abstract double getCode();

	@JsProperty
	public abstract void setCode(final double value);

	@JsProperty
	public abstract double getSystemCode();

	@JsProperty
	public abstract void setSystemCode(final double value);

	@JsProperty
	public abstract double getMS_MEDIA_KEYERR_CLIENT();

	@JsProperty
	public abstract void setMS_MEDIA_KEYERR_CLIENT(final double value);

	@JsProperty
	public abstract double getMS_MEDIA_KEYERR_DOMAIN();

	@JsProperty
	public abstract void setMS_MEDIA_KEYERR_DOMAIN(final double value);

	@JsProperty
	public abstract double getMS_MEDIA_KEYERR_HARDWARECHANGE();

	@JsProperty
	public abstract void setMS_MEDIA_KEYERR_HARDWARECHANGE(final double value);

	@JsProperty
	public abstract double getMS_MEDIA_KEYERR_OUTPUT();

	@JsProperty
	public abstract void setMS_MEDIA_KEYERR_OUTPUT(final double value);

	@JsProperty
	public abstract double getMS_MEDIA_KEYERR_SERVICE();

	@JsProperty
	public abstract void setMS_MEDIA_KEYERR_SERVICE(final double value);

	@JsProperty
	public abstract double getMS_MEDIA_KEYERR_UNKNOWN();

	@JsProperty
	public abstract void setMS_MEDIA_KEYERR_UNKNOWN(final double value);
}
