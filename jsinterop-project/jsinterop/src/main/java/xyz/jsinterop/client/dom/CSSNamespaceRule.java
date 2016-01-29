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
public interface CSSNamespaceRule extends CSSRule {
	@JsProperty
	public abstract String getNamespaceURI();

	@JsProperty
	public abstract void setNamespaceURI(final String value);

	@JsProperty
	public abstract String getPrefix();

	@JsProperty
	public abstract void setPrefix(final String value);
}
