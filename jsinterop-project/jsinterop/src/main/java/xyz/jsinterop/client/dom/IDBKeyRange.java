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
public interface IDBKeyRange {
	@JsProperty
	public abstract Object getLower();

	@JsProperty
	public abstract void setLower(final Object value);

	@JsProperty
	public abstract boolean isLowerOpen();

	@JsProperty
	public abstract void setLowerOpen(final boolean value);

	@JsProperty
	public abstract Object getUpper();

	@JsProperty
	public abstract void setUpper(final Object value);

	@JsProperty
	public abstract boolean isUpperOpen();

	@JsProperty
	public abstract void setUpperOpen(final boolean value);
}
