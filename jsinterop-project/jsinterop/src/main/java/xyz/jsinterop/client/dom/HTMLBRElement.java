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
public interface HTMLBRElement extends HTMLElement {
	/**
	 * Sets or retrieves the side on which floating objects are not to be
	 * positioned when any IHTMLBlockElement is inserted into the document.
	 */
	@JsProperty
	public abstract String getClear();

	/**
	 * Sets or retrieves the side on which floating objects are not to be
	 * positioned when any IHTMLBlockElement is inserted into the document.
	 */
	@JsProperty
	public abstract void setClear(final String value);
}
