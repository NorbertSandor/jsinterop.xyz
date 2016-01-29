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
public interface WheelEventInit extends MouseEventInit {
	@JsProperty
	public abstract double getDeltaX();

	@JsProperty
	public abstract void setDeltaX(final double value);

	@JsProperty
	public abstract double getDeltaY();

	@JsProperty
	public abstract void setDeltaY(final double value);

	@JsProperty
	public abstract double getDeltaZ();

	@JsProperty
	public abstract void setDeltaZ(final double value);

	@JsProperty
	public abstract double getDeltaMode();

	@JsProperty
	public abstract void setDeltaMode(final double value);
}
