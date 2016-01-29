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
public interface MessageEventInit extends EventInit {
	@JsProperty
	public abstract Object getData();

	@JsProperty
	public abstract void setData(final Object value);

	@JsProperty
	public abstract String getOrigin();

	@JsProperty
	public abstract void setOrigin(final String value);

	@JsProperty
	public abstract String getLastEventId();

	@JsProperty
	public abstract void setLastEventId(final String value);

	@JsProperty
	public abstract String getChannel();

	@JsProperty
	public abstract void setChannel(final String value);

	@JsProperty
	public abstract Object getSource();

	@JsProperty
	public abstract void setSource(final Object value);

	@JsProperty
	public abstract Object getPorts();

	@JsProperty
	public abstract void setPorts(final Object value);
}
