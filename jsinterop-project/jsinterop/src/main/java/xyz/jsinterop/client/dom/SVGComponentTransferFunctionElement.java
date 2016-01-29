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
public interface SVGComponentTransferFunctionElement extends SVGElement {
	@JsProperty
	public abstract SVGAnimatedNumber getAmplitude();

	@JsProperty
	public abstract void setAmplitude(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getExponent();

	@JsProperty
	public abstract void setExponent(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getIntercept();

	@JsProperty
	public abstract void setIntercept(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getOffset();

	@JsProperty
	public abstract void setOffset(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getSlope();

	@JsProperty
	public abstract void setSlope(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumberList getTableValues();

	@JsProperty
	public abstract void setTableValues(final SVGAnimatedNumberList value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getType();

	@JsProperty
	public abstract void setType(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract double getSVG_FECOMPONENTTRANSFER_TYPE_DISCRETE();

	@JsProperty
	public abstract void setSVG_FECOMPONENTTRANSFER_TYPE_DISCRETE(final double value);

	@JsProperty
	public abstract double getSVG_FECOMPONENTTRANSFER_TYPE_GAMMA();

	@JsProperty
	public abstract void setSVG_FECOMPONENTTRANSFER_TYPE_GAMMA(final double value);

	@JsProperty
	public abstract double getSVG_FECOMPONENTTRANSFER_TYPE_IDENTITY();

	@JsProperty
	public abstract void setSVG_FECOMPONENTTRANSFER_TYPE_IDENTITY(final double value);

	@JsProperty
	public abstract double getSVG_FECOMPONENTTRANSFER_TYPE_LINEAR();

	@JsProperty
	public abstract void setSVG_FECOMPONENTTRANSFER_TYPE_LINEAR(final double value);

	@JsProperty
	public abstract double getSVG_FECOMPONENTTRANSFER_TYPE_TABLE();

	@JsProperty
	public abstract void setSVG_FECOMPONENTTRANSFER_TYPE_TABLE(final double value);

	@JsProperty
	public abstract double getSVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN();

	@JsProperty
	public abstract void setSVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN(final double value);
}
