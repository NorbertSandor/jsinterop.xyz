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
public interface MSCSSMatrix {
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

	@JsProperty
	public abstract double getM11();

	@JsProperty
	public abstract void setM11(final double value);

	@JsProperty
	public abstract double getM12();

	@JsProperty
	public abstract void setM12(final double value);

	@JsProperty
	public abstract double getM13();

	@JsProperty
	public abstract void setM13(final double value);

	@JsProperty
	public abstract double getM14();

	@JsProperty
	public abstract void setM14(final double value);

	@JsProperty
	public abstract double getM21();

	@JsProperty
	public abstract void setM21(final double value);

	@JsProperty
	public abstract double getM22();

	@JsProperty
	public abstract void setM22(final double value);

	@JsProperty
	public abstract double getM23();

	@JsProperty
	public abstract void setM23(final double value);

	@JsProperty
	public abstract double getM24();

	@JsProperty
	public abstract void setM24(final double value);

	@JsProperty
	public abstract double getM31();

	@JsProperty
	public abstract void setM31(final double value);

	@JsProperty
	public abstract double getM32();

	@JsProperty
	public abstract void setM32(final double value);

	@JsProperty
	public abstract double getM33();

	@JsProperty
	public abstract void setM33(final double value);

	@JsProperty
	public abstract double getM34();

	@JsProperty
	public abstract void setM34(final double value);

	@JsProperty
	public abstract double getM41();

	@JsProperty
	public abstract void setM41(final double value);

	@JsProperty
	public abstract double getM42();

	@JsProperty
	public abstract void setM42(final double value);

	@JsProperty
	public abstract double getM43();

	@JsProperty
	public abstract void setM43(final double value);

	@JsProperty
	public abstract double getM44();

	@JsProperty
	public abstract void setM44(final double value);

	@JsMethod
	public abstract MSCSSMatrix inverse();

	@JsMethod
	public abstract MSCSSMatrix multiply(final MSCSSMatrix secondMatrix);

	@JsMethod
	public abstract MSCSSMatrix rotate(final double angleX);

	@JsMethod
	public abstract MSCSSMatrix rotate(final double angleX, final double angleY);

	@JsMethod
	public abstract MSCSSMatrix rotate(final double angleX, final double angleY, final double angleZ);

	@JsMethod
	public abstract MSCSSMatrix rotateAxisAngle(final double x, final double y, final double z, final double angle);

	@JsMethod
	public abstract MSCSSMatrix scale(final double scaleX);

	@JsMethod
	public abstract MSCSSMatrix scale(final double scaleX, final double scaleY);

	@JsMethod
	public abstract MSCSSMatrix scale(final double scaleX, final double scaleY, final double scaleZ);

	@JsMethod
	public abstract void setMatrixValue(final String value);

	@JsMethod
	public abstract MSCSSMatrix skewX(final double angle);

	@JsMethod
	public abstract MSCSSMatrix skewY(final double angle);

	@JsMethod
	public abstract String toString();

	@JsMethod
	public abstract MSCSSMatrix translate(final double x, final double y);

	@JsMethod
	public abstract MSCSSMatrix translate(final double x, final double y, final double z);
}
