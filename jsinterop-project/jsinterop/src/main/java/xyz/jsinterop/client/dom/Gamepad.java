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
public interface Gamepad {
	@JsProperty
	public abstract Object getAxes();

	@JsProperty
	public abstract void setAxes(final Object value);

	@JsProperty
	public abstract Object getButtons();

	@JsProperty
	public abstract void setButtons(final Object value);

	@JsProperty
	public abstract boolean isConnected();

	@JsProperty
	public abstract void setConnected(final boolean value);

	@JsProperty
	public abstract String getId();

	@JsProperty
	public abstract void setId(final String value);

	@JsProperty
	public abstract double getIndex();

	@JsProperty
	public abstract void setIndex(final double value);

	@JsProperty
	public abstract String getMapping();

	@JsProperty
	public abstract void setMapping(final String value);

	@JsProperty
	public abstract double getTimestamp();

	@JsProperty
	public abstract void setTimestamp(final double value);
}
