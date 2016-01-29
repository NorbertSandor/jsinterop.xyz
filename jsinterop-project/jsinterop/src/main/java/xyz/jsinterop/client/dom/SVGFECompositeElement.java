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
public interface SVGFECompositeElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
	@JsProperty
	public abstract SVGAnimatedString getIn1();

	@JsProperty
	public abstract void setIn1(final SVGAnimatedString value);

	@JsProperty
	public abstract SVGAnimatedString getIn2();

	@JsProperty
	public abstract void setIn2(final SVGAnimatedString value);

	@JsProperty
	public abstract SVGAnimatedNumber getK1();

	@JsProperty
	public abstract void setK1(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getK2();

	@JsProperty
	public abstract void setK2(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getK3();

	@JsProperty
	public abstract void setK3(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getK4();

	@JsProperty
	public abstract void setK4(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedEnumeration getOperator();

	@JsProperty
	public abstract void setOperator(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract double getSVG_FECOMPOSITE_OPERATOR_ARITHMETIC();

	@JsProperty
	public abstract void setSVG_FECOMPOSITE_OPERATOR_ARITHMETIC(final double value);

	@JsProperty
	public abstract double getSVG_FECOMPOSITE_OPERATOR_ATOP();

	@JsProperty
	public abstract void setSVG_FECOMPOSITE_OPERATOR_ATOP(final double value);

	@JsProperty
	public abstract double getSVG_FECOMPOSITE_OPERATOR_IN();

	@JsProperty
	public abstract void setSVG_FECOMPOSITE_OPERATOR_IN(final double value);

	@JsProperty
	public abstract double getSVG_FECOMPOSITE_OPERATOR_OUT();

	@JsProperty
	public abstract void setSVG_FECOMPOSITE_OPERATOR_OUT(final double value);

	@JsProperty
	public abstract double getSVG_FECOMPOSITE_OPERATOR_OVER();

	@JsProperty
	public abstract void setSVG_FECOMPOSITE_OPERATOR_OVER(final double value);

	@JsProperty
	public abstract double getSVG_FECOMPOSITE_OPERATOR_UNKNOWN();

	@JsProperty
	public abstract void setSVG_FECOMPOSITE_OPERATOR_UNKNOWN(final double value);

	@JsProperty
	public abstract double getSVG_FECOMPOSITE_OPERATOR_XOR();

	@JsProperty
	public abstract void setSVG_FECOMPOSITE_OPERATOR_XOR(final double value);

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
