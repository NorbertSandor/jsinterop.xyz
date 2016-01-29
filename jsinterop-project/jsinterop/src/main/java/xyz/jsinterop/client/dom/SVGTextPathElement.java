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
public interface SVGTextPathElement extends SVGTextContentElement, SVGURIReference {
	@JsProperty
	public abstract SVGAnimatedEnumeration getMethod();

	@JsProperty
	public abstract void setMethod(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getSpacing();

	@JsProperty
	public abstract void setSpacing(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedLength getStartOffset();

	@JsProperty
	public abstract void setStartOffset(final SVGAnimatedLength value);

	@JsProperty
	public abstract double getTEXTPATH_METHODTYPE_ALIGN();

	@JsProperty
	public abstract void setTEXTPATH_METHODTYPE_ALIGN(final double value);

	@JsProperty
	public abstract double getTEXTPATH_METHODTYPE_STRETCH();

	@JsProperty
	public abstract void setTEXTPATH_METHODTYPE_STRETCH(final double value);

	@JsProperty
	public abstract double getTEXTPATH_METHODTYPE_UNKNOWN();

	@JsProperty
	public abstract void setTEXTPATH_METHODTYPE_UNKNOWN(final double value);

	@JsProperty
	public abstract double getTEXTPATH_SPACINGTYPE_AUTO();

	@JsProperty
	public abstract void setTEXTPATH_SPACINGTYPE_AUTO(final double value);

	@JsProperty
	public abstract double getTEXTPATH_SPACINGTYPE_EXACT();

	@JsProperty
	public abstract void setTEXTPATH_SPACINGTYPE_EXACT(final double value);

	@JsProperty
	public abstract double getTEXTPATH_SPACINGTYPE_UNKNOWN();

	@JsProperty
	public abstract void setTEXTPATH_SPACINGTYPE_UNKNOWN(final double value);

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
