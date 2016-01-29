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
import xyz.jsinterop.client.core.Uint8Array;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface MSMediaKeySession extends EventTarget {
	@JsProperty
	public abstract MSMediaKeyError getError();

	@JsProperty
	public abstract void setError(final MSMediaKeyError value);

	@JsProperty
	public abstract String getKeySystem();

	@JsProperty
	public abstract void setKeySystem(final String value);

	@JsProperty
	public abstract String getSessionId();

	@JsProperty
	public abstract void setSessionId(final String value);

	@JsMethod
	public abstract void close();

	@JsMethod
	public abstract void update(final Uint8Array key);
}
