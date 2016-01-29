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
public interface SVGAngle {
	@JsProperty
	public abstract double getUnitType();

	@JsProperty
	public abstract void setUnitType(final double value);

	@JsProperty
	public abstract double getValue();

	@JsProperty
	public abstract void setValue(final double value);

	@JsProperty
	public abstract String getValueAsString();

	@JsProperty
	public abstract void setValueAsString(final String value);

	@JsProperty
	public abstract double getValueInSpecifiedUnits();

	@JsProperty
	public abstract void setValueInSpecifiedUnits(final double value);

	@JsProperty
	public abstract double getSVG_ANGLETYPE_DEG();

	@JsProperty
	public abstract void setSVG_ANGLETYPE_DEG(final double value);

	@JsProperty
	public abstract double getSVG_ANGLETYPE_GRAD();

	@JsProperty
	public abstract void setSVG_ANGLETYPE_GRAD(final double value);

	@JsProperty
	public abstract double getSVG_ANGLETYPE_RAD();

	@JsProperty
	public abstract void setSVG_ANGLETYPE_RAD(final double value);

	@JsProperty
	public abstract double getSVG_ANGLETYPE_UNKNOWN();

	@JsProperty
	public abstract void setSVG_ANGLETYPE_UNKNOWN(final double value);

	@JsProperty
	public abstract double getSVG_ANGLETYPE_UNSPECIFIED();

	@JsProperty
	public abstract void setSVG_ANGLETYPE_UNSPECIFIED(final double value);

	@JsMethod
	public abstract void convertToSpecifiedUnits(final double unitType);

	@JsMethod
	public abstract void newValueSpecifiedUnits(final double unitType, final double valueInSpecifiedUnits);
}
