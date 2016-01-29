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
public interface Attr extends Node {
	@JsProperty
	public abstract String getName();

	@JsProperty
	public abstract void setName(final String value);

	@JsProperty
	public abstract Element getOwnerElement();

	@JsProperty
	public abstract void setOwnerElement(final Element value);

	@JsProperty
	public abstract boolean isSpecified();

	@JsProperty
	public abstract void setSpecified(final boolean value);

	@JsProperty
	public abstract String getValue();

	@JsProperty
	public abstract void setValue(final String value);
}
