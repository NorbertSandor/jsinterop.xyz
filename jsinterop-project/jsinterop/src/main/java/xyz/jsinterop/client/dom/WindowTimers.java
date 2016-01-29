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
public interface WindowTimers extends WindowTimersExtension {
	@JsMethod
	public abstract void clearInterval(final double handle);

	@JsMethod
	public abstract void clearTimeout(final double handle);

	@JsMethod
	public abstract double setInterval(final Object handler);

	@JsMethod
	public abstract double setInterval(final Object handler, final Object timeout);

	@JsMethod
	public abstract double setInterval(final Object handler, final Object timeout, final Object args);

	@JsMethod
	public abstract double setTimeout(final Object handler);

	@JsMethod
	public abstract double setTimeout(final Object handler, final Object timeout);

	@JsMethod
	public abstract double setTimeout(final Object handler, final Object timeout, final Object args);
}
