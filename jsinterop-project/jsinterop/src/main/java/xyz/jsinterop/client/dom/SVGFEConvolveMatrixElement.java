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
public interface SVGFEConvolveMatrixElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
	@JsProperty
	public abstract SVGAnimatedNumber getBias();

	@JsProperty
	public abstract void setBias(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getDivisor();

	@JsProperty
	public abstract void setDivisor(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getEdgeMode();

	@JsProperty
	public abstract void setEdgeMode(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedString getIn1();

	@JsProperty
	public abstract void setIn1(final SVGAnimatedString value);

	@JsProperty
	public abstract SVGAnimatedNumberList getKernelMatrix();

	@JsProperty
	public abstract void setKernelMatrix(final SVGAnimatedNumberList value);

	@JsProperty
	public abstract SVGAnimatedNumber getKernelUnitLengthX();

	@JsProperty
	public abstract void setKernelUnitLengthX(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getKernelUnitLengthY();

	@JsProperty
	public abstract void setKernelUnitLengthY(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedInteger getOrderX();

	@JsProperty
	public abstract void setOrderX(final SVGAnimatedInteger value);

	@JsProperty
	public abstract SVGAnimatedInteger getOrderY();

	@JsProperty
	public abstract void setOrderY(final SVGAnimatedInteger value);

	@JsProperty
	public abstract SVGAnimatedBoolean getPreserveAlpha();

	@JsProperty
	public abstract void setPreserveAlpha(final SVGAnimatedBoolean value);

	@JsProperty
	public abstract SVGAnimatedInteger getTargetX();

	@JsProperty
	public abstract void setTargetX(final SVGAnimatedInteger value);

	@JsProperty
	public abstract SVGAnimatedInteger getTargetY();

	@JsProperty
	public abstract void setTargetY(final SVGAnimatedInteger value);

	@JsProperty
	public abstract double getSVG_EDGEMODE_DUPLICATE();

	@JsProperty
	public abstract void setSVG_EDGEMODE_DUPLICATE(final double value);

	@JsProperty
	public abstract double getSVG_EDGEMODE_NONE();

	@JsProperty
	public abstract void setSVG_EDGEMODE_NONE(final double value);

	@JsProperty
	public abstract double getSVG_EDGEMODE_UNKNOWN();

	@JsProperty
	public abstract void setSVG_EDGEMODE_UNKNOWN(final double value);

	@JsProperty
	public abstract double getSVG_EDGEMODE_WRAP();

	@JsProperty
	public abstract void setSVG_EDGEMODE_WRAP(final double value);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener, final boolean useCapture);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener,
			final boolean useCapture);
}
