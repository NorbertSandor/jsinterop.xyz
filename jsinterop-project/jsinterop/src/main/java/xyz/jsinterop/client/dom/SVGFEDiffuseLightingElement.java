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
public interface SVGFEDiffuseLightingElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
	@JsProperty
	public abstract SVGAnimatedNumber getDiffuseConstant();

	@JsProperty
	public abstract void setDiffuseConstant(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedString getIn1();

	@JsProperty
	public abstract void setIn1(final SVGAnimatedString value);

	@JsProperty
	public abstract SVGAnimatedNumber getKernelUnitLengthX();

	@JsProperty
	public abstract void setKernelUnitLengthX(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getKernelUnitLengthY();

	@JsProperty
	public abstract void setKernelUnitLengthY(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getSurfaceScale();

	@JsProperty
	public abstract void setSurfaceScale(final SVGAnimatedNumber value);

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
