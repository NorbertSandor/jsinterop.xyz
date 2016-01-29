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
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface Geolocation {
	@JsMethod
	public abstract void clearWatch(final double watchId);

	@JsMethod
	public abstract void getCurrentPosition(final PositionCallback successCallback);

	@JsMethod
	public abstract void getCurrentPosition(final PositionCallback successCallback,
			final PositionErrorCallback errorCallback);

	@JsMethod
	public abstract void getCurrentPosition(final PositionCallback successCallback,
			final PositionErrorCallback errorCallback, final PositionOptions options);

	@JsMethod
	public abstract double watchPosition(final PositionCallback successCallback);

	@JsMethod
	public abstract double watchPosition(final PositionCallback successCallback,
			final PositionErrorCallback errorCallback);

	@JsMethod
	public abstract double watchPosition(final PositionCallback successCallback,
			final PositionErrorCallback errorCallback, final PositionOptions options);
}
