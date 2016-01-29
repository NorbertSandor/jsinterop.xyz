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
public interface AudioParam {
	@JsProperty
	public abstract double getDefaultValue();

	@JsProperty
	public abstract void setDefaultValue(final double value);

	@JsProperty
	public abstract double getValue();

	@JsProperty
	public abstract void setValue(final double value);

	@JsMethod
	public abstract void cancelScheduledValues(final double startTime);

	@JsMethod
	public abstract void exponentialRampToValueAtTime(final double value, final double endTime);

	@JsMethod
	public abstract void linearRampToValueAtTime(final double value, final double endTime);

	@JsMethod
	public abstract void setTargetAtTime(final double target, final double startTime, final double timeConstant);

	@JsMethod
	public abstract void setValueAtTime(final double value, final double startTime);

	@JsMethod
	public abstract void setValueCurveAtTime(final Float32Array values, final double startTime, final double duration);
}
