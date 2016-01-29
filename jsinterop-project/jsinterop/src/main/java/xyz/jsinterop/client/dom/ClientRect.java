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
public interface ClientRect {
	@JsProperty
	public abstract double getBottom();

	@JsProperty
	public abstract void setBottom(final double value);

	@JsProperty
	public abstract double getHeight();

	@JsProperty
	public abstract void setHeight(final double value);

	@JsProperty
	public abstract double getLeft();

	@JsProperty
	public abstract void setLeft(final double value);

	@JsProperty
	public abstract double getRight();

	@JsProperty
	public abstract void setRight(final double value);

	@JsProperty
	public abstract double getTop();

	@JsProperty
	public abstract void setTop(final double value);

	@JsProperty
	public abstract double getWidth();

	@JsProperty
	public abstract void setWidth(final double value);
}
