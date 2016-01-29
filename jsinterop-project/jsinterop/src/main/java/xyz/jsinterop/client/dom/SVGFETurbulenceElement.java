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
public interface SVGFETurbulenceElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
	@JsProperty
	public abstract SVGAnimatedNumber getBaseFrequencyX();

	@JsProperty
	public abstract void setBaseFrequencyX(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getBaseFrequencyY();

	@JsProperty
	public abstract void setBaseFrequencyY(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedInteger getNumOctaves();

	@JsProperty
	public abstract void setNumOctaves(final SVGAnimatedInteger value);

	@JsProperty
	public abstract SVGAnimatedNumber getSeed();

	@JsProperty
	public abstract void setSeed(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getStitchTiles();

	@JsProperty
	public abstract void setStitchTiles(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getType();

	@JsProperty
	public abstract void setType(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract double getSVG_STITCHTYPE_NOSTITCH();

	@JsProperty
	public abstract void setSVG_STITCHTYPE_NOSTITCH(final double value);

	@JsProperty
	public abstract double getSVG_STITCHTYPE_STITCH();

	@JsProperty
	public abstract void setSVG_STITCHTYPE_STITCH(final double value);

	@JsProperty
	public abstract double getSVG_STITCHTYPE_UNKNOWN();

	@JsProperty
	public abstract void setSVG_STITCHTYPE_UNKNOWN(final double value);

	@JsProperty
	public abstract double getSVG_TURBULENCE_TYPE_FRACTALNOISE();

	@JsProperty
	public abstract void setSVG_TURBULENCE_TYPE_FRACTALNOISE(final double value);

	@JsProperty
	public abstract double getSVG_TURBULENCE_TYPE_TURBULENCE();

	@JsProperty
	public abstract void setSVG_TURBULENCE_TYPE_TURBULENCE(final double value);

	@JsProperty
	public abstract double getSVG_TURBULENCE_TYPE_UNKNOWN();

	@JsProperty
	public abstract void setSVG_TURBULENCE_TYPE_UNKNOWN(final double value);

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
