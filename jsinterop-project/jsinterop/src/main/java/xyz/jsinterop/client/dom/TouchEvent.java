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
public interface TouchEvent extends UIEvent {
	@JsProperty
	public abstract boolean isAltKey();

	@JsProperty
	public abstract void setAltKey(final boolean value);

	@JsProperty
	public abstract TouchList getChangedTouches();

	@JsProperty
	public abstract void setChangedTouches(final TouchList value);

	@JsProperty
	public abstract boolean isCtrlKey();

	@JsProperty
	public abstract void setCtrlKey(final boolean value);

	@JsProperty
	public abstract boolean isMetaKey();

	@JsProperty
	public abstract void setMetaKey(final boolean value);

	@JsProperty
	public abstract boolean isShiftKey();

	@JsProperty
	public abstract void setShiftKey(final boolean value);

	@JsProperty
	public abstract TouchList getTargetTouches();

	@JsProperty
	public abstract void setTargetTouches(final TouchList value);

	@JsProperty
	public abstract TouchList getTouches();

	@JsProperty
	public abstract void setTouches(final TouchList value);
}
