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
public interface PositionError {
	@JsProperty
	public abstract double getCode();

	@JsProperty
	public abstract void setCode(final double value);

	@JsProperty
	public abstract String getMessage();

	@JsProperty
	public abstract void setMessage(final String value);

	@JsProperty
	public abstract double getPERMISSION_DENIED();

	@JsProperty
	public abstract void setPERMISSION_DENIED(final double value);

	@JsProperty
	public abstract double getPOSITION_UNAVAILABLE();

	@JsProperty
	public abstract void setPOSITION_UNAVAILABLE(final double value);

	@JsProperty
	public abstract double getTIMEOUT();

	@JsProperty
	public abstract void setTIMEOUT(final double value);

	@JsMethod
	public abstract String toString();
}
