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
public interface SVGFilterElement
		extends SVGElement, SVGUnitTypes, SVGStylable, SVGLangSpace, SVGURIReference, SVGExternalResourcesRequired {
	@JsProperty
	public abstract SVGAnimatedInteger getFilterResX();

	@JsProperty
	public abstract void setFilterResX(final SVGAnimatedInteger value);

	@JsProperty
	public abstract SVGAnimatedInteger getFilterResY();

	@JsProperty
	public abstract void setFilterResY(final SVGAnimatedInteger value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getFilterUnits();

	@JsProperty
	public abstract void setFilterUnits(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedLength getHeight();

	@JsProperty
	public abstract void setHeight(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getPrimitiveUnits();

	@JsProperty
	public abstract void setPrimitiveUnits(final SVGAnimatedEnumeration value);

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
	public abstract void setFilterRes(final double filterResX, final double filterResY);

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
