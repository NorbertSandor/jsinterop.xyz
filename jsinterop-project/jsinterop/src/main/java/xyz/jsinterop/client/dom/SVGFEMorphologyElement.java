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
public interface SVGFEMorphologyElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
	@JsProperty
	public abstract SVGAnimatedString getIn1();

	@JsProperty
	public abstract void setIn1(final SVGAnimatedString value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getOperator();

	@JsProperty
	public abstract void setOperator(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedNumber getRadiusX();

	@JsProperty
	public abstract void setRadiusX(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getRadiusY();

	@JsProperty
	public abstract void setRadiusY(final SVGAnimatedNumber value);

	@JsProperty
	public abstract double getSVG_MORPHOLOGY_OPERATOR_DILATE();

	@JsProperty
	public abstract void setSVG_MORPHOLOGY_OPERATOR_DILATE(final double value);

	@JsProperty
	public abstract double getSVG_MORPHOLOGY_OPERATOR_ERODE();

	@JsProperty
	public abstract void setSVG_MORPHOLOGY_OPERATOR_ERODE(final double value);

	@JsProperty
	public abstract double getSVG_MORPHOLOGY_OPERATOR_UNKNOWN();

	@JsProperty
	public abstract void setSVG_MORPHOLOGY_OPERATOR_UNKNOWN(final double value);

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
