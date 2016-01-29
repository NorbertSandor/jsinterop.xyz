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
public interface KeyboardEvent extends UIEvent {
	@JsProperty
	public abstract boolean isAltKey();

	@JsProperty
	public abstract void setAltKey(final boolean value);

	@JsProperty
	public abstract String getChar();

	@JsProperty
	public abstract void setChar(final String value);

	@JsProperty
	public abstract double getCharCode();

	@JsProperty
	public abstract void setCharCode(final double value);

	@JsProperty
	public abstract boolean isCtrlKey();

	@JsProperty
	public abstract void setCtrlKey(final boolean value);

	@JsProperty
	public abstract String getKey();

	@JsProperty
	public abstract void setKey(final String value);

	@JsProperty
	public abstract double getKeyCode();

	@JsProperty
	public abstract void setKeyCode(final double value);

	@JsProperty
	public abstract String getLocale();

	@JsProperty
	public abstract void setLocale(final String value);

	@JsProperty
	public abstract double getLocation();

	@JsProperty
	public abstract void setLocation(final double value);

	@JsProperty
	public abstract boolean isMetaKey();

	@JsProperty
	public abstract void setMetaKey(final boolean value);

	@JsProperty
	public abstract boolean isRepeat();

	@JsProperty
	public abstract void setRepeat(final boolean value);

	@JsProperty
	public abstract boolean isShiftKey();

	@JsProperty
	public abstract void setShiftKey(final boolean value);

	@JsProperty
	public abstract double getWhich();

	@JsProperty
	public abstract void setWhich(final double value);

	@JsProperty
	public abstract double getDOM_KEY_LOCATION_JOYSTICK();

	@JsProperty
	public abstract void setDOM_KEY_LOCATION_JOYSTICK(final double value);

	@JsProperty
	public abstract double getDOM_KEY_LOCATION_LEFT();

	@JsProperty
	public abstract void setDOM_KEY_LOCATION_LEFT(final double value);

	@JsProperty
	public abstract double getDOM_KEY_LOCATION_MOBILE();

	@JsProperty
	public abstract void setDOM_KEY_LOCATION_MOBILE(final double value);

	@JsProperty
	public abstract double getDOM_KEY_LOCATION_NUMPAD();

	@JsProperty
	public abstract void setDOM_KEY_LOCATION_NUMPAD(final double value);

	@JsProperty
	public abstract double getDOM_KEY_LOCATION_RIGHT();

	@JsProperty
	public abstract void setDOM_KEY_LOCATION_RIGHT(final double value);

	@JsProperty
	public abstract double getDOM_KEY_LOCATION_STANDARD();

	@JsProperty
	public abstract void setDOM_KEY_LOCATION_STANDARD(final double value);

	@JsMethod
	public abstract boolean getModifierState(final String keyArg);

	@JsMethod
	public abstract void initKeyboardEvent(final String typeArg, final boolean canBubbleArg,
			final boolean cancelableArg, final Window viewArg, final String keyArg, final double locationArg,
			final String modifiersListArg, final boolean repeat, final String locale);
}
