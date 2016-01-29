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
public interface MsZoomToOptions {
	@JsProperty
	public abstract double getContentX();

	@JsProperty
	public abstract void setContentX(final double value);

	@JsProperty
	public abstract double getContentY();

	@JsProperty
	public abstract void setContentY(final double value);

	@JsProperty
	public abstract String getViewportX();

	@JsProperty
	public abstract void setViewportX(final String value);

	@JsProperty
	public abstract String getViewportY();

	@JsProperty
	public abstract void setViewportY(final String value);

	@JsProperty
	public abstract double getScaleFactor();

	@JsProperty
	public abstract void setScaleFactor(final double value);

	@JsProperty
	public abstract String getAnimate();

	@JsProperty
	public abstract void setAnimate(final String value);
}
