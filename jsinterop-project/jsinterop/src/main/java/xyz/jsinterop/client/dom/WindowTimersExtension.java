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
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface WindowTimersExtension {
	@JsMethod
	public abstract void clearImmediate(final double handle);

	@JsMethod
	public abstract void msClearImmediate(final double handle);

	@JsMethod
	public abstract double msSetImmediate(final Object expression);

	@JsMethod
	public abstract double msSetImmediate(final Object expression, final Object args);

	@JsMethod
	public abstract double setImmediate(final Object expression);

	@JsMethod
	public abstract double setImmediate(final Object expression, final Object args);
}
