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
public interface TextEvent extends UIEvent {
	@JsProperty
	public abstract String getData();

	@JsProperty
	public abstract void setData(final String value);

	@JsProperty
	public abstract double getInputMethod();

	@JsProperty
	public abstract void setInputMethod(final double value);

	@JsProperty
	public abstract String getLocale();

	@JsProperty
	public abstract void setLocale(final String value);

	@JsProperty
	public abstract double getDOM_INPUT_METHOD_DROP();

	@JsProperty
	public abstract void setDOM_INPUT_METHOD_DROP(final double value);

	@JsProperty
	public abstract double getDOM_INPUT_METHOD_HANDWRITING();

	@JsProperty
	public abstract void setDOM_INPUT_METHOD_HANDWRITING(final double value);

	@JsProperty
	public abstract double getDOM_INPUT_METHOD_IME();

	@JsProperty
	public abstract void setDOM_INPUT_METHOD_IME(final double value);

	@JsProperty
	public abstract double getDOM_INPUT_METHOD_KEYBOARD();

	@JsProperty
	public abstract void setDOM_INPUT_METHOD_KEYBOARD(final double value);

	@JsProperty
	public abstract double getDOM_INPUT_METHOD_MULTIMODAL();

	@JsProperty
	public abstract void setDOM_INPUT_METHOD_MULTIMODAL(final double value);

	@JsProperty
	public abstract double getDOM_INPUT_METHOD_OPTION();

	@JsProperty
	public abstract void setDOM_INPUT_METHOD_OPTION(final double value);

	@JsProperty
	public abstract double getDOM_INPUT_METHOD_PASTE();

	@JsProperty
	public abstract void setDOM_INPUT_METHOD_PASTE(final double value);

	@JsProperty
	public abstract double getDOM_INPUT_METHOD_SCRIPT();

	@JsProperty
	public abstract void setDOM_INPUT_METHOD_SCRIPT(final double value);

	@JsProperty
	public abstract double getDOM_INPUT_METHOD_UNKNOWN();

	@JsProperty
	public abstract void setDOM_INPUT_METHOD_UNKNOWN(final double value);

	@JsProperty
	public abstract double getDOM_INPUT_METHOD_VOICE();

	@JsProperty
	public abstract void setDOM_INPUT_METHOD_VOICE(final double value);

	@JsMethod
	public abstract void initTextEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg,
			final Window viewArg, final String dataArg, final double inputMethod, final String locale);
}
