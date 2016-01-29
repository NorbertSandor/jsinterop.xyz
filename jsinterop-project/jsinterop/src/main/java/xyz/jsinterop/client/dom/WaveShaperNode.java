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
import xyz.jsinterop.client.core.Float32Array;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface WaveShaperNode extends AudioNode {
	@JsProperty
	public abstract Float32Array getCurve();

	@JsProperty
	public abstract void setCurve(final Float32Array value);

	@JsProperty
	public abstract String getOversample();

	@JsProperty
	public abstract void setOversample(final String value);
}
