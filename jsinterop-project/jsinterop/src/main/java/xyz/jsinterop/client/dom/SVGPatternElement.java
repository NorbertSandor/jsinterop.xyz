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
public interface SVGPatternElement extends SVGElement, SVGStylable, SVGTests, SVGLangSpace,
		SVGExternalResourcesRequired, SVGFitToViewBox, SVGURIReference, SVGUnitTypes {
	@JsProperty
	public abstract SVGAnimatedLength getHeight();

	@JsProperty
	public abstract void setHeight(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getPatternContentUnits();

	@JsProperty
	public abstract void setPatternContentUnits(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedTransformList getPatternTransform();

	@JsProperty
	public abstract void setPatternTransform(final SVGAnimatedTransformList value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getPatternUnits();

	@JsProperty
	public abstract void setPatternUnits(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedLength getWidth();

	@JsProperty
	public abstract void setWidth(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getX();

	@JsProperty
	public abstract void setX(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getY();

	@JsProperty
	public abstract void setY(final SVGAnimatedLength value);

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
