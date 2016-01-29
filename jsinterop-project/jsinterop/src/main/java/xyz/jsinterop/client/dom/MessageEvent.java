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
public interface MessageEvent extends Event {
	@JsProperty
	public abstract Object getData();

	@JsProperty
	public abstract void setData(final Object value);

	@JsProperty
	public abstract String getOrigin();

	@JsProperty
	public abstract void setOrigin(final String value);

	@JsProperty
	public abstract Object getPorts();

	@JsProperty
	public abstract void setPorts(final Object value);

	@JsProperty
	public abstract Window getSource();

	@JsProperty
	public abstract void setSource(final Window value);

	@JsMethod
	public abstract void initMessageEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg,
			final Object dataArg, final String originArg, final String lastEventIdArg, final Window sourceArg);
}
