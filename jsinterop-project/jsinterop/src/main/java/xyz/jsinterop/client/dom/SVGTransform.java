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
public interface SVGTransform {
	@JsProperty
	public abstract double getAngle();

	@JsProperty
	public abstract void setAngle(final double value);

	@JsProperty
	public abstract SVGMatrix getMatrix();

	@JsProperty
	public abstract void setMatrix(final SVGMatrix value);

	@JsProperty
	public abstract double getType();

	@JsProperty
	public abstract void setType(final double value);

	@JsProperty
	public abstract double getSVG_TRANSFORM_MATRIX();

	@JsProperty
	public abstract void setSVG_TRANSFORM_MATRIX(final double value);

	@JsProperty
	public abstract double getSVG_TRANSFORM_ROTATE();

	@JsProperty
	public abstract void setSVG_TRANSFORM_ROTATE(final double value);

	@JsProperty
	public abstract double getSVG_TRANSFORM_SCALE();

	@JsProperty
	public abstract void setSVG_TRANSFORM_SCALE(final double value);

	@JsProperty
	public abstract double getSVG_TRANSFORM_SKEWX();

	@JsProperty
	public abstract void setSVG_TRANSFORM_SKEWX(final double value);

	@JsProperty
	public abstract double getSVG_TRANSFORM_SKEWY();

	@JsProperty
	public abstract void setSVG_TRANSFORM_SKEWY(final double value);

	@JsProperty
	public abstract double getSVG_TRANSFORM_TRANSLATE();

	@JsProperty
	public abstract void setSVG_TRANSFORM_TRANSLATE(final double value);

	@JsProperty
	public abstract double getSVG_TRANSFORM_UNKNOWN();

	@JsProperty
	public abstract void setSVG_TRANSFORM_UNKNOWN(final double value);

	@JsMethod(name = "setMatrix")
	public abstract void setMatrixMethod(final SVGMatrix matrix);

	@JsMethod
	public abstract void setRotate(final double angle, final double cx, final double cy);

	@JsMethod
	public abstract void setScale(final double sx, final double sy);

	@JsMethod
	public abstract void setSkewX(final double angle);

	@JsMethod
	public abstract void setSkewY(final double angle);

	@JsMethod
	public abstract void setTranslate(final double tx, final double ty);
}
