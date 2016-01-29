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
public interface AudioBuffer {
	@JsProperty
	public abstract double getDuration();

	@JsProperty
	public abstract void setDuration(final double value);

	@JsProperty
	public abstract double getLength();

	@JsProperty
	public abstract void setLength(final double value);

	@JsProperty
	public abstract double getNumberOfChannels();

	@JsProperty
	public abstract void setNumberOfChannels(final double value);

	@JsProperty
	public abstract double getSampleRate();

	@JsProperty
	public abstract void setSampleRate(final double value);

	@JsMethod
	public abstract Float32Array getChannelData(final double channel);
}
