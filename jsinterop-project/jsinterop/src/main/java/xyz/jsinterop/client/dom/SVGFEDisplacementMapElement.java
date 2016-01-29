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
public interface SVGFEDisplacementMapElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
	@JsProperty
	public abstract SVGAnimatedString getIn1();

	@JsProperty
	public abstract void setIn1(final SVGAnimatedString value);

	@JsProperty
	public abstract SVGAnimatedString getIn2();

	@JsProperty
	public abstract void setIn2(final SVGAnimatedString value);

	@JsProperty
	public abstract SVGAnimatedNumber getScale();

	@JsProperty
	public abstract void setScale(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getXChannelSelector();

	@JsProperty
	public abstract void setXChannelSelector(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getYChannelSelector();

	@JsProperty
	public abstract void setYChannelSelector(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract double getSVG_CHANNEL_A();

	@JsProperty
	public abstract void setSVG_CHANNEL_A(final double value);

	@JsProperty
	public abstract double getSVG_CHANNEL_B();

	@JsProperty
	public abstract void setSVG_CHANNEL_B(final double value);

	@JsProperty
	public abstract double getSVG_CHANNEL_G();

	@JsProperty
	public abstract void setSVG_CHANNEL_G(final double value);

	@JsProperty
	public abstract double getSVG_CHANNEL_R();

	@JsProperty
	public abstract void setSVG_CHANNEL_R(final double value);

	@JsProperty
	public abstract double getSVG_CHANNEL_UNKNOWN();

	@JsProperty
	public abstract void setSVG_CHANNEL_UNKNOWN(final double value);

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
