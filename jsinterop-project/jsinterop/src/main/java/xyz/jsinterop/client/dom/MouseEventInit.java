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
public interface MouseEventInit extends SharedKeyboardAndMouseEventInit {
	@JsProperty
	public abstract double getScreenX();

	@JsProperty
	public abstract void setScreenX(final double value);

	@JsProperty
	public abstract double getScreenY();

	@JsProperty
	public abstract void setScreenY(final double value);

	@JsProperty
	public abstract double getClientX();

	@JsProperty
	public abstract void setClientX(final double value);

	@JsProperty
	public abstract double getClientY();

	@JsProperty
	public abstract void setClientY(final double value);

	@JsProperty
	public abstract double getButton();

	@JsProperty
	public abstract void setButton(final double value);

	@JsProperty
	public abstract double getButtons();

	@JsProperty
	public abstract void setButtons(final double value);

	@JsProperty
	public abstract EventTarget getRelatedTarget();

	@JsProperty
	public abstract void setRelatedTarget(final EventTarget value);
}
