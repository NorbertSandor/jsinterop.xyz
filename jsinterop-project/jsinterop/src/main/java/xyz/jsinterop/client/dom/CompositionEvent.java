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
public interface CompositionEvent extends UIEvent {
	@JsProperty
	public abstract String getData();

	@JsProperty
	public abstract void setData(final String value);

	@JsProperty
	public abstract String getLocale();

	@JsProperty
	public abstract void setLocale(final String value);

	@JsMethod
	public abstract void initCompositionEvent(final String typeArg, final boolean canBubbleArg,
			final boolean cancelableArg, final Window viewArg, final String dataArg, final String locale);
}
