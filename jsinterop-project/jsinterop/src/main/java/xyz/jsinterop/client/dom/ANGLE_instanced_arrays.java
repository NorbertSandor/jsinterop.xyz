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
public interface ANGLE_instanced_arrays {
	@JsProperty
	public abstract double getVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE();

	@JsProperty
	public abstract void setVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE(final double value);

	@JsMethod
	public abstract void drawArraysInstancedANGLE(final double mode, final double first, final double count,
			final double primcount);

	@JsMethod
	public abstract void drawElementsInstancedANGLE(final double mode, final double count, final double type,
			final double offset, final double primcount);

	@JsMethod
	public abstract void vertexAttribDivisorANGLE(final double index, final double divisor);
}
