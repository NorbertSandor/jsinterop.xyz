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
public interface SVGLineElement
		extends SVGElement, SVGStylable, SVGTransformable, SVGTests, SVGLangSpace, SVGExternalResourcesRequired {
	@JsProperty
	public abstract SVGAnimatedLength getX1();

	@JsProperty
	public abstract void setX1(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getX2();

	@JsProperty
	public abstract void setX2(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getY1();

	@JsProperty
	public abstract void setY1(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getY2();

	@JsProperty
	public abstract void setY2(final SVGAnimatedLength value);

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
