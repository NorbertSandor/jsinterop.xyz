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
public interface DeviceOrientationEvent extends Event {
	@JsProperty
	public abstract boolean isAbsolute();

	@JsProperty
	public abstract void setAbsolute(final boolean value);

	@JsProperty
	public abstract double getAlpha();

	@JsProperty
	public abstract void setAlpha(final double value);

	@JsProperty
	public abstract double getBeta();

	@JsProperty
	public abstract void setBeta(final double value);

	@JsProperty
	public abstract double getGamma();

	@JsProperty
	public abstract void setGamma(final double value);

	@JsMethod
	public abstract void initDeviceOrientationEvent(final String type, final boolean bubbles, final boolean cancelable,
			final double alpha, final double beta, final double gamma, final boolean absolute);
}
