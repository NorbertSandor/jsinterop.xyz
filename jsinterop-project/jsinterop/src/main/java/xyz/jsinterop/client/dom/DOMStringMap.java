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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface DOMStringMap {
	@JsOverlay
	public default String get(final String name) {
		return (String) xyz.jsinterop.client.core.JsMaps.getItem(this, name);
	}

	@JsOverlay
	public default void set(final String name, final String value) {
		xyz.jsinterop.client.core.JsMaps.setItem(this, name, value);
	}
}
