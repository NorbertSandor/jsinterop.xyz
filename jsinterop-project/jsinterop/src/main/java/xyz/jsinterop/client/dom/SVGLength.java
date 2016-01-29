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
public interface SVGLength {
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
	public abstract double getSVG_LENGTHTYPE_CM();

	@JsProperty
	public abstract void setSVG_LENGTHTYPE_CM(final double value);

	@JsProperty
	public abstract double getSVG_LENGTHTYPE_EMS();

	@JsProperty
	public abstract void setSVG_LENGTHTYPE_EMS(final double value);

	@JsProperty
	public abstract double getSVG_LENGTHTYPE_EXS();

	@JsProperty
	public abstract void setSVG_LENGTHTYPE_EXS(final double value);

	@JsProperty
	public abstract double getSVG_LENGTHTYPE_IN();

	@JsProperty
	public abstract void setSVG_LENGTHTYPE_IN(final double value);

	@JsProperty
	public abstract double getSVG_LENGTHTYPE_MM();

	@JsProperty
	public abstract void setSVG_LENGTHTYPE_MM(final double value);

	@JsProperty
	public abstract double getSVG_LENGTHTYPE_NUMBER();

	@JsProperty
	public abstract void setSVG_LENGTHTYPE_NUMBER(final double value);

	@JsProperty
	public abstract double getSVG_LENGTHTYPE_PC();

	@JsProperty
	public abstract void setSVG_LENGTHTYPE_PC(final double value);

	@JsProperty
	public abstract double getSVG_LENGTHTYPE_PERCENTAGE();

	@JsProperty
	public abstract void setSVG_LENGTHTYPE_PERCENTAGE(final double value);

	@JsProperty
	public abstract double getSVG_LENGTHTYPE_PT();

	@JsProperty
	public abstract void setSVG_LENGTHTYPE_PT(final double value);

	@JsProperty
	public abstract double getSVG_LENGTHTYPE_PX();

	@JsProperty
	public abstract void setSVG_LENGTHTYPE_PX(final double value);

	@JsProperty
	public abstract double getSVG_LENGTHTYPE_UNKNOWN();

	@JsProperty
	public abstract void setSVG_LENGTHTYPE_UNKNOWN(final double value);

	@JsMethod
	public abstract void convertToSpecifiedUnits(final double unitType);

	@JsMethod
	public abstract void newValueSpecifiedUnits(final double unitType, final double valueInSpecifiedUnits);
}
