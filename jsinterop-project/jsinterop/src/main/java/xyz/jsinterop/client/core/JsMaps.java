/*
 * #%L
 * JsInterop.xyz
 * %%
 * Copyright (C) 2015 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */
package xyz.jsinterop.client.core;

/**
 * Javascript map related functions.
 */
public final class JsMaps {
	public static native <T> T getItem(Object object, String key)
	/*-{
		return object[key];
	}-*/;

	public static native <T> void setItem(Object object, String key, T value)
	/*-{
		object[key] = value;
	}-*/;

	private JsMaps() {
	}
}
