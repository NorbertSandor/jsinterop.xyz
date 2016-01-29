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
public interface SVGPathSegArcRel extends SVGPathSeg {
	@JsProperty
	public abstract double getAngle();

	@JsProperty
	public abstract void setAngle(final double value);

	@JsProperty
	public abstract boolean isLargeArcFlag();

	@JsProperty
	public abstract void setLargeArcFlag(final boolean value);

	@JsProperty
	public abstract double getR1();

	@JsProperty
	public abstract void setR1(final double value);

	@JsProperty
	public abstract double getR2();

	@JsProperty
	public abstract void setR2(final double value);

	@JsProperty
	public abstract boolean isSweepFlag();

	@JsProperty
	public abstract void setSweepFlag(final boolean value);

	@JsProperty
	public abstract double getX();

	@JsProperty
	public abstract void setX(final double value);

	@JsProperty
	public abstract double getY();

	@JsProperty
	public abstract void setY(final double value);
}
