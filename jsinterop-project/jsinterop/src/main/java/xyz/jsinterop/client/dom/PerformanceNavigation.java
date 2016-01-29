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
public interface PerformanceNavigation {
	@JsProperty
	public abstract double getRedirectCount();

	@JsProperty
	public abstract void setRedirectCount(final double value);

	@JsProperty
	public abstract double getType();

	@JsProperty
	public abstract void setType(final double value);

	@JsProperty
	public abstract double getTYPE_BACK_FORWARD();

	@JsProperty
	public abstract void setTYPE_BACK_FORWARD(final double value);

	@JsProperty
	public abstract double getTYPE_NAVIGATE();

	@JsProperty
	public abstract void setTYPE_NAVIGATE(final double value);

	@JsProperty
	public abstract double getTYPE_RELOAD();

	@JsProperty
	public abstract void setTYPE_RELOAD(final double value);

	@JsProperty
	public abstract double getTYPE_RESERVED();

	@JsProperty
	public abstract void setTYPE_RESERVED(final double value);

	@JsMethod
	public abstract Object toJSON();
}
