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
public interface SVGMarkerElement
		extends SVGElement, SVGStylable, SVGLangSpace, SVGExternalResourcesRequired, SVGFitToViewBox {
	@JsProperty
	public abstract SVGAnimatedLength getMarkerHeight();

	@JsProperty
	public abstract void setMarkerHeight(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getMarkerUnits();

	@JsProperty
	public abstract void setMarkerUnits(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedLength getMarkerWidth();

	@JsProperty
	public abstract void setMarkerWidth(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedAngle getOrientAngle();

	@JsProperty
	public abstract void setOrientAngle(final SVGAnimatedAngle value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getOrientType();

	@JsProperty
	public abstract void setOrientType(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedLength getRefX();

	@JsProperty
	public abstract void setRefX(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getRefY();

	@JsProperty
	public abstract void setRefY(final SVGAnimatedLength value);

	@JsProperty
	public abstract double getSVG_MARKERUNITS_STROKEWIDTH();

	@JsProperty
	public abstract void setSVG_MARKERUNITS_STROKEWIDTH(final double value);

	@JsProperty
	public abstract double getSVG_MARKERUNITS_UNKNOWN();

	@JsProperty
	public abstract void setSVG_MARKERUNITS_UNKNOWN(final double value);

	@JsProperty
	public abstract double getSVG_MARKERUNITS_USERSPACEONUSE();

	@JsProperty
	public abstract void setSVG_MARKERUNITS_USERSPACEONUSE(final double value);

	@JsProperty
	public abstract double getSVG_MARKER_ORIENT_ANGLE();

	@JsProperty
	public abstract void setSVG_MARKER_ORIENT_ANGLE(final double value);

	@JsProperty
	public abstract double getSVG_MARKER_ORIENT_AUTO();

	@JsProperty
	public abstract void setSVG_MARKER_ORIENT_AUTO(final double value);

	@JsProperty
	public abstract double getSVG_MARKER_ORIENT_UNKNOWN();

	@JsProperty
	public abstract void setSVG_MARKER_ORIENT_UNKNOWN(final double value);

	@JsMethod
	public abstract void setOrientToAngle(final SVGAngle angle);

	@JsMethod
	public abstract void setOrientToAuto();

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
