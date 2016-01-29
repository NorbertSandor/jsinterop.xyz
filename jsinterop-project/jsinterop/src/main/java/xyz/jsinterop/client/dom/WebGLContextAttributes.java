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
public interface WebGLContextAttributes {
	@JsProperty
	public abstract boolean isAlpha();

	@JsProperty
	public abstract void setAlpha(final boolean value);

	@JsProperty
	public abstract boolean isDepth();

	@JsProperty
	public abstract void setDepth(final boolean value);

	@JsProperty
	public abstract boolean isStencil();

	@JsProperty
	public abstract void setStencil(final boolean value);

	@JsProperty
	public abstract boolean isAntialias();

	@JsProperty
	public abstract void setAntialias(final boolean value);

	@JsProperty
	public abstract boolean isPremultipliedAlpha();

	@JsProperty
	public abstract void setPremultipliedAlpha(final boolean value);

	@JsProperty
	public abstract boolean isPreserveDrawingBuffer();

	@JsProperty
	public abstract void setPreserveDrawingBuffer(final boolean value);
}
