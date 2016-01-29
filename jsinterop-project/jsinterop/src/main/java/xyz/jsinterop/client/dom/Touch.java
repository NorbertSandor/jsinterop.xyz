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
public interface Touch {
	@JsProperty
	public abstract double getClientX();

	@JsProperty
	public abstract void setClientX(final double value);

	@JsProperty
	public abstract double getClientY();

	@JsProperty
	public abstract void setClientY(final double value);

	@JsProperty
	public abstract double getIdentifier();

	@JsProperty
	public abstract void setIdentifier(final double value);

	@JsProperty
	public abstract double getPageX();

	@JsProperty
	public abstract void setPageX(final double value);

	@JsProperty
	public abstract double getPageY();

	@JsProperty
	public abstract void setPageY(final double value);

	@JsProperty
	public abstract double getScreenX();

	@JsProperty
	public abstract void setScreenX(final double value);

	@JsProperty
	public abstract double getScreenY();

	@JsProperty
	public abstract void setScreenY(final double value);

	@JsProperty
	public abstract EventTarget getTarget();

	@JsProperty
	public abstract void setTarget(final EventTarget value);
}
