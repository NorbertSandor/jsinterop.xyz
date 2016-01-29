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
import xyz.jsinterop.client.core.Float32Array;
import xyz.jsinterop.client.core.Uint8Array;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface AnalyserNode extends AudioNode {
	@JsProperty
	public abstract double getFftSize();

	@JsProperty
	public abstract void setFftSize(final double value);

	@JsProperty
	public abstract double getFrequencyBinCount();

	@JsProperty
	public abstract void setFrequencyBinCount(final double value);

	@JsProperty
	public abstract double getMaxDecibels();

	@JsProperty
	public abstract void setMaxDecibels(final double value);

	@JsProperty
	public abstract double getMinDecibels();

	@JsProperty
	public abstract void setMinDecibels(final double value);

	@JsProperty
	public abstract double getSmoothingTimeConstant();

	@JsProperty
	public abstract void setSmoothingTimeConstant(final double value);

	@JsMethod
	public abstract void getByteFrequencyData(final Uint8Array array);

	@JsMethod
	public abstract void getByteTimeDomainData(final Uint8Array array);

	@JsMethod
	public abstract void getFloatFrequencyData(final Float32Array array);

	@JsMethod
	public abstract void getFloatTimeDomainData(final Float32Array array);
}
