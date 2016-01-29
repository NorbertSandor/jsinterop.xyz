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
public interface SVGGradientElement
		extends SVGElement, SVGStylable, SVGExternalResourcesRequired, SVGURIReference, SVGUnitTypes {
	@JsProperty
	public abstract SVGAnimatedTransformList getGradientTransform();

	@JsProperty
	public abstract void setGradientTransform(final SVGAnimatedTransformList value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getGradientUnits();

	@JsProperty
	public abstract void setGradientUnits(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getSpreadMethod();

	@JsProperty
	public abstract void setSpreadMethod(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract double getSVG_SPREADMETHOD_PAD();

	@JsProperty
	public abstract void setSVG_SPREADMETHOD_PAD(final double value);

	@JsProperty
	public abstract double getSVG_SPREADMETHOD_REFLECT();

	@JsProperty
	public abstract void setSVG_SPREADMETHOD_REFLECT(final double value);

	@JsProperty
	public abstract double getSVG_SPREADMETHOD_REPEAT();

	@JsProperty
	public abstract void setSVG_SPREADMETHOD_REPEAT(final double value);

	@JsProperty
	public abstract double getSVG_SPREADMETHOD_UNKNOWN();

	@JsProperty
	public abstract void setSVG_SPREADMETHOD_UNKNOWN(final double value);

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
