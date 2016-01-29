package xyz.jsinterop.client.dom;

import jsinterop.annotations.JsPackage;

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

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface SVGPathSeg {
	@JsProperty
	public abstract double getPathSegType();

	@JsProperty
	public abstract void setPathSegType(final double value);

	@JsProperty
	public abstract String getPathSegTypeAsLetter();

	@JsProperty
	public abstract void setPathSegTypeAsLetter(final String value);

	@JsProperty
	public abstract double getPATHSEG_ARC_ABS();

	@JsProperty
	public abstract void setPATHSEG_ARC_ABS(final double value);

	@JsProperty
	public abstract double getPATHSEG_ARC_REL();

	@JsProperty
	public abstract void setPATHSEG_ARC_REL(final double value);

	@JsProperty
	public abstract double getPATHSEG_CLOSEPATH();

	@JsProperty
	public abstract void setPATHSEG_CLOSEPATH(final double value);

	@JsProperty
	public abstract double getPATHSEG_CURVETO_CUBIC_ABS();

	@JsProperty
	public abstract void setPATHSEG_CURVETO_CUBIC_ABS(final double value);

	@JsProperty
	public abstract double getPATHSEG_CURVETO_CUBIC_REL();

	@JsProperty
	public abstract void setPATHSEG_CURVETO_CUBIC_REL(final double value);

	@JsProperty
	public abstract double getPATHSEG_CURVETO_CUBIC_SMOOTH_ABS();

	@JsProperty
	public abstract void setPATHSEG_CURVETO_CUBIC_SMOOTH_ABS(final double value);

	@JsProperty
	public abstract double getPATHSEG_CURVETO_CUBIC_SMOOTH_REL();

	@JsProperty
	public abstract void setPATHSEG_CURVETO_CUBIC_SMOOTH_REL(final double value);

	@JsProperty
	public abstract double getPATHSEG_CURVETO_QUADRATIC_ABS();

	@JsProperty
	public abstract void setPATHSEG_CURVETO_QUADRATIC_ABS(final double value);

	@JsProperty
	public abstract double getPATHSEG_CURVETO_QUADRATIC_REL();

	@JsProperty
	public abstract void setPATHSEG_CURVETO_QUADRATIC_REL(final double value);

	@JsProperty
	public abstract double getPATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS();

	@JsProperty
	public abstract void setPATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS(final double value);

	@JsProperty
	public abstract double getPATHSEG_CURVETO_QUADRATIC_SMOOTH_REL();

	@JsProperty
	public abstract void setPATHSEG_CURVETO_QUADRATIC_SMOOTH_REL(final double value);

	@JsProperty
	public abstract double getPATHSEG_LINETO_ABS();

	@JsProperty
	public abstract void setPATHSEG_LINETO_ABS(final double value);

	@JsProperty
	public abstract double getPATHSEG_LINETO_HORIZONTAL_ABS();

	@JsProperty
	public abstract void setPATHSEG_LINETO_HORIZONTAL_ABS(final double value);

	@JsProperty
	public abstract double getPATHSEG_LINETO_HORIZONTAL_REL();

	@JsProperty
	public abstract void setPATHSEG_LINETO_HORIZONTAL_REL(final double value);

	@JsProperty
	public abstract double getPATHSEG_LINETO_REL();

	@JsProperty
	public abstract void setPATHSEG_LINETO_REL(final double value);

	@JsProperty
	public abstract double getPATHSEG_LINETO_VERTICAL_ABS();

	@JsProperty
	public abstract void setPATHSEG_LINETO_VERTICAL_ABS(final double value);

	@JsProperty
	public abstract double getPATHSEG_LINETO_VERTICAL_REL();

	@JsProperty
	public abstract void setPATHSEG_LINETO_VERTICAL_REL(final double value);

	@JsProperty
	public abstract double getPATHSEG_MOVETO_ABS();

	@JsProperty
	public abstract void setPATHSEG_MOVETO_ABS(final double value);

	@JsProperty
	public abstract double getPATHSEG_MOVETO_REL();

	@JsProperty
	public abstract void setPATHSEG_MOVETO_REL(final double value);

	@JsProperty
	public abstract double getPATHSEG_UNKNOWN();

	@JsProperty
	public abstract void setPATHSEG_UNKNOWN(final double value);
}
