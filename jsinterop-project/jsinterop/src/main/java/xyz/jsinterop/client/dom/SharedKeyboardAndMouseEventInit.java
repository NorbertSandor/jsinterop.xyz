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
public interface SharedKeyboardAndMouseEventInit extends UIEventInit {
	@JsProperty
	public abstract boolean isCtrlKey();

	@JsProperty
	public abstract void setCtrlKey(final boolean value);

	@JsProperty
	public abstract boolean isShiftKey();

	@JsProperty
	public abstract void setShiftKey(final boolean value);

	@JsProperty
	public abstract boolean isAltKey();

	@JsProperty
	public abstract void setAltKey(final boolean value);

	@JsProperty
	public abstract boolean isMetaKey();

	@JsProperty
	public abstract void setMetaKey(final boolean value);

	@JsProperty
	public abstract boolean isKeyModifierStateAltGraph();

	@JsProperty
	public abstract void setKeyModifierStateAltGraph(final boolean value);

	@JsProperty
	public abstract boolean isKeyModifierStateCapsLock();

	@JsProperty
	public abstract void setKeyModifierStateCapsLock(final boolean value);

	@JsProperty
	public abstract boolean isKeyModifierStateFn();

	@JsProperty
	public abstract void setKeyModifierStateFn(final boolean value);

	@JsProperty
	public abstract boolean isKeyModifierStateFnLock();

	@JsProperty
	public abstract void setKeyModifierStateFnLock(final boolean value);

	@JsProperty
	public abstract boolean isKeyModifierStateHyper();

	@JsProperty
	public abstract void setKeyModifierStateHyper(final boolean value);

	@JsProperty
	public abstract boolean isKeyModifierStateNumLock();

	@JsProperty
	public abstract void setKeyModifierStateNumLock(final boolean value);

	@JsProperty
	public abstract boolean isKeyModifierStateOS();

	@JsProperty
	public abstract void setKeyModifierStateOS(final boolean value);

	@JsProperty
	public abstract boolean isKeyModifierStateScrollLock();

	@JsProperty
	public abstract void setKeyModifierStateScrollLock(final boolean value);

	@JsProperty
	public abstract boolean isKeyModifierStateSuper();

	@JsProperty
	public abstract void setKeyModifierStateSuper(final boolean value);

	@JsProperty
	public abstract boolean isKeyModifierStateSymbol();

	@JsProperty
	public abstract void setKeyModifierStateSymbol(final boolean value);

	@JsProperty
	public abstract boolean isKeyModifierStateSymbolLock();

	@JsProperty
	public abstract void setKeyModifierStateSymbolLock(final boolean value);
}
