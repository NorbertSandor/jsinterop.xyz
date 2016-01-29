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
public interface MediaQueryList {
	@JsProperty
	public abstract boolean isMatches();

	@JsProperty
	public abstract void setMatches(final boolean value);

	@JsProperty
	public abstract String getMedia();

	@JsProperty
	public abstract void setMedia(final String value);

	@JsMethod
	public abstract void addListener(final MediaQueryListListener listener);

	@JsMethod
	public abstract void removeListener(final MediaQueryListListener listener);
}
