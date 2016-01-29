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
public interface AudioNode extends EventTarget {
	@JsProperty
	public abstract double getChannelCount();

	@JsProperty
	public abstract void setChannelCount(final double value);

	@JsProperty
	public abstract String getChannelCountMode();

	@JsProperty
	public abstract void setChannelCountMode(final String value);

	@JsProperty
	public abstract String getChannelInterpretation();

	@JsProperty
	public abstract void setChannelInterpretation(final String value);

	@JsProperty
	public abstract AudioContext getContext();

	@JsProperty
	public abstract void setContext(final AudioContext value);

	@JsProperty
	public abstract double getNumberOfInputs();

	@JsProperty
	public abstract void setNumberOfInputs(final double value);

	@JsProperty
	public abstract double getNumberOfOutputs();

	@JsProperty
	public abstract void setNumberOfOutputs(final double value);

	@JsMethod
	public abstract void connect(final AudioNode destination);

	@JsMethod
	public abstract void connect(final AudioNode destination, final double output);

	@JsMethod
	public abstract void connect(final AudioNode destination, final double output, final double input);

	@JsMethod
	public abstract void disconnect();

	@JsMethod
	public abstract void disconnect(final double output);
}
