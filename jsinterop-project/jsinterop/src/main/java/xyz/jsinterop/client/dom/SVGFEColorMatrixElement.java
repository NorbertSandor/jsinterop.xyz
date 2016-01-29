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
public interface SVGFEColorMatrixElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
	@JsProperty
	public abstract SVGAnimatedString getIn1();

	@JsProperty
	public abstract void setIn1(final SVGAnimatedString value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getType();

	@JsProperty
	public abstract void setType(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedNumberList getValues();

	@JsProperty
	public abstract void setValues(final SVGAnimatedNumberList value);

	@JsProperty
	public abstract double getSVG_FECOLORMATRIX_TYPE_HUEROTATE();

	@JsProperty
	public abstract void setSVG_FECOLORMATRIX_TYPE_HUEROTATE(final double value);

	@JsProperty
	public abstract double getSVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA();

	@JsProperty
	public abstract void setSVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA(final double value);

	@JsProperty
	public abstract double getSVG_FECOLORMATRIX_TYPE_MATRIX();

	@JsProperty
	public abstract void setSVG_FECOLORMATRIX_TYPE_MATRIX(final double value);

	@JsProperty
	public abstract double getSVG_FECOLORMATRIX_TYPE_SATURATE();

	@JsProperty
	public abstract void setSVG_FECOLORMATRIX_TYPE_SATURATE(final double value);

	@JsProperty
	public abstract double getSVG_FECOLORMATRIX_TYPE_UNKNOWN();

	@JsProperty
	public abstract void setSVG_FECOLORMATRIX_TYPE_UNKNOWN(final double value);

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
