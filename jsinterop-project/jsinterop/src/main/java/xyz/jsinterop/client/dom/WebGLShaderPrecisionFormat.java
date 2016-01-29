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
public interface WebGLShaderPrecisionFormat {
	@JsProperty
	public abstract double getPrecision();

	@JsProperty
	public abstract void setPrecision(final double value);

	@JsProperty
	public abstract double getRangeMax();

	@JsProperty
	public abstract void setRangeMax(final double value);

	@JsProperty
	public abstract double getRangeMin();

	@JsProperty
	public abstract void setRangeMin(final double value);
}
