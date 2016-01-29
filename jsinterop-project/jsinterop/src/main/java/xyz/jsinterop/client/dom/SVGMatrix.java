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
public interface SVGMatrix {
	@JsProperty
	public abstract double getA();

	@JsProperty
	public abstract void setA(final double value);

	@JsProperty
	public abstract double getB();

	@JsProperty
	public abstract void setB(final double value);

	@JsProperty
	public abstract double getC();

	@JsProperty
	public abstract void setC(final double value);

	@JsProperty
	public abstract double getD();

	@JsProperty
	public abstract void setD(final double value);

	@JsProperty
	public abstract double getE();

	@JsProperty
	public abstract void setE(final double value);

	@JsProperty
	public abstract double getF();

	@JsProperty
	public abstract void setF(final double value);

	@JsMethod
	public abstract SVGMatrix flipX();

	@JsMethod
	public abstract SVGMatrix flipY();

	@JsMethod
	public abstract SVGMatrix inverse();

	@JsMethod
	public abstract SVGMatrix multiply(final SVGMatrix secondMatrix);

	@JsMethod
	public abstract SVGMatrix rotate(final double angle);

	@JsMethod
	public abstract SVGMatrix rotateFromVector(final double x, final double y);

	@JsMethod
	public abstract SVGMatrix scale(final double scaleFactor);

	@JsMethod
	public abstract SVGMatrix scaleNonUniform(final double scaleFactorX, final double scaleFactorY);

	@JsMethod
	public abstract SVGMatrix skewX(final double angle);

	@JsMethod
	public abstract SVGMatrix skewY(final double angle);

	@JsMethod
	public abstract SVGMatrix translate(final double x, final double y);
}
