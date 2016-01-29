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
public interface PointerEventInit extends MouseEventInit {
	@JsProperty
	public abstract double getPointerId();

	@JsProperty
	public abstract void setPointerId(final double value);

	@JsProperty
	public abstract double getWidth();

	@JsProperty
	public abstract void setWidth(final double value);

	@JsProperty
	public abstract double getHeight();

	@JsProperty
	public abstract void setHeight(final double value);

	@JsProperty
	public abstract double getPressure();

	@JsProperty
	public abstract void setPressure(final double value);

	@JsProperty
	public abstract double getTiltX();

	@JsProperty
	public abstract void setTiltX(final double value);

	@JsProperty
	public abstract double getTiltY();

	@JsProperty
	public abstract void setTiltY(final double value);

	@JsProperty
	public abstract String getPointerType();

	@JsProperty
	public abstract void setPointerType(final String value);

	@JsProperty
	public abstract boolean isIsPrimary();

	@JsProperty
	public abstract void setIsPrimary(final boolean value);
}
