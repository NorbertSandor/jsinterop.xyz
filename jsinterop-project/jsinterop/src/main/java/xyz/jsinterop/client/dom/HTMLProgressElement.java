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
public interface HTMLProgressElement extends HTMLElement {
	/**
	 * Retrieves a reference to the form that the object is embedded in.
	 */
	@JsProperty
	public abstract HTMLFormElement getForm();

	/**
	 * Retrieves a reference to the form that the object is embedded in.
	 */
	@JsProperty
	public abstract void setForm(final HTMLFormElement value);

	/**
	 * Defines the maximum, or "done" value for a progress element.
	 */
	@JsProperty
	public abstract double getMax();

	/**
	 * Defines the maximum, or "done" value for a progress element.
	 */
	@JsProperty
	public abstract void setMax(final double value);

	@JsProperty
	public abstract double getPosition();

	@JsProperty
	public abstract void setPosition(final double value);

	/**
	 * Sets or gets the current value of a progress element. The value must be a
	 * non-negative number between 0 and the max value.
	 */
	@JsProperty
	public abstract double getValue();

	/**
	 * Sets or gets the current value of a progress element. The value must be a
	 * non-negative number between 0 and the max value.
	 */
	@JsProperty
	public abstract void setValue(final double value);
}
