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
public interface SVGFEBlendElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
	@JsProperty
	public abstract SVGAnimatedString getIn1();

	@JsProperty
	public abstract void setIn1(final SVGAnimatedString value);

	@JsProperty
	public abstract SVGAnimatedString getIn2();

	@JsProperty
	public abstract void setIn2(final SVGAnimatedString value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getMode();

	@JsProperty
	public abstract void setMode(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_COLOR();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_COLOR(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_COLOR_BURN();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_COLOR_BURN(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_COLOR_DODGE();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_COLOR_DODGE(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_DARKEN();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_DARKEN(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_DIFFERENCE();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_DIFFERENCE(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_EXCLUSION();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_EXCLUSION(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_HARD_LIGHT();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_HARD_LIGHT(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_HUE();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_HUE(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_LIGHTEN();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_LIGHTEN(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_LUMINOSITY();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_LUMINOSITY(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_MULTIPLY();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_MULTIPLY(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_NORMAL();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_NORMAL(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_OVERLAY();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_OVERLAY(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_SATURATION();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_SATURATION(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_SCREEN();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_SCREEN(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_SOFT_LIGHT();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_SOFT_LIGHT(final double value);

	@JsProperty
	public abstract double getSVG_FEBLEND_MODE_UNKNOWN();

	@JsProperty
	public abstract void setSVG_FEBLEND_MODE_UNKNOWN(final double value);

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
