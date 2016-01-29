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

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface BiquadFilterNode extends AudioNode {
	@JsProperty
	public abstract AudioParam getQ();

	@JsProperty
	public abstract void setQ(final AudioParam value);

	@JsProperty
	public abstract AudioParam getDetune();

	@JsProperty
	public abstract void setDetune(final AudioParam value);

	@JsProperty
	public abstract AudioParam getFrequency();

	@JsProperty
	public abstract void setFrequency(final AudioParam value);

	@JsProperty
	public abstract AudioParam getGain();

	@JsProperty
	public abstract void setGain(final AudioParam value);

	@JsProperty
	public abstract String getType();

	@JsProperty
	public abstract void setType(final String value);

	@JsMethod
	public abstract void getFrequencyResponse(final Float32Array frequencyHz, final Float32Array magResponse,
			final Float32Array phaseResponse);
}
