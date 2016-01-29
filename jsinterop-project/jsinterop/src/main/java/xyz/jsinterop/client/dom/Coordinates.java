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
public interface Coordinates {
	@JsProperty
	public abstract double getAccuracy();

	@JsProperty
	public abstract void setAccuracy(final double value);

	@JsProperty
	public abstract double getAltitude();

	@JsProperty
	public abstract void setAltitude(final double value);

	@JsProperty
	public abstract double getAltitudeAccuracy();

	@JsProperty
	public abstract void setAltitudeAccuracy(final double value);

	@JsProperty
	public abstract double getHeading();

	@JsProperty
	public abstract void setHeading(final double value);

	@JsProperty
	public abstract double getLatitude();

	@JsProperty
	public abstract void setLatitude(final double value);

	@JsProperty
	public abstract double getLongitude();

	@JsProperty
	public abstract void setLongitude(final double value);

	@JsProperty
	public abstract double getSpeed();

	@JsProperty
	public abstract void setSpeed(final double value);
}
