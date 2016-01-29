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
public interface History {
	@JsProperty
	public abstract double getLength();

	@JsProperty
	public abstract void setLength(final double value);

	@JsProperty
	public abstract Object getState();

	@JsProperty
	public abstract void setState(final Object value);

	@JsMethod
	public abstract void back();

	@JsMethod
	public abstract void back(final Object distance);

	@JsMethod
	public abstract void forward();

	@JsMethod
	public abstract void forward(final Object distance);

	@JsMethod
	public abstract void go();

	@JsMethod
	public abstract void go(final Object delta);

	@JsMethod
	public abstract void pushState(final Object statedata);

	@JsMethod
	public abstract void pushState(final Object statedata, final String title);

	@JsMethod
	public abstract void pushState(final Object statedata, final String title, final String url);

	@JsMethod
	public abstract void replaceState(final Object statedata);

	@JsMethod
	public abstract void replaceState(final Object statedata, final String title);

	@JsMethod
	public abstract void replaceState(final Object statedata, final String title, final String url);
}
