package xyz.jsinterop.client.core;

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


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import xyz.jsinterop.client.dom.Document;
import xyz.jsinterop.client.dom.Window;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class JsGlobals {
	@JsProperty(namespace = JsPackage.GLOBAL)
	public static native Window getWindow();

	@JsProperty(namespace = JsPackage.GLOBAL)
	public static native Document getDocument();
}
