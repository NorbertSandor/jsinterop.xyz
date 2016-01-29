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
public interface DeviceMotionEvent extends Event {
	@JsProperty
	public abstract DeviceAcceleration getAcceleration();

	@JsProperty
	public abstract void setAcceleration(final DeviceAcceleration value);

	@JsProperty
	public abstract DeviceAcceleration getAccelerationIncludingGravity();

	@JsProperty
	public abstract void setAccelerationIncludingGravity(final DeviceAcceleration value);

	@JsProperty
	public abstract double getInterval();

	@JsProperty
	public abstract void setInterval(final double value);

	@JsProperty
	public abstract DeviceRotationRate getRotationRate();

	@JsProperty
	public abstract void setRotationRate(final DeviceRotationRate value);

	@JsMethod
	public abstract void initDeviceMotionEvent(final String type, final boolean bubbles, final boolean cancelable,
			final DeviceAccelerationDict acceleration, final DeviceAccelerationDict accelerationIncludingGravity,
			final DeviceRotationRateDict rotationRate, final double interval);
}
