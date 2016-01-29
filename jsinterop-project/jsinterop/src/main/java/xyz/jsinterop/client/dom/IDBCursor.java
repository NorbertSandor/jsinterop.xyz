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
public interface IDBCursor {
	@JsProperty
	public abstract String getDirection();

	@JsProperty
	public abstract void setDirection(final String value);

	@JsProperty
	public abstract Object getKey();

	@JsProperty
	public abstract void setKey(final Object value);

	@JsProperty
	public abstract Object getPrimaryKey();

	@JsProperty
	public abstract void setPrimaryKey(final Object value);

	@JsProperty
	public abstract Object getSource();

	@JsProperty
	public abstract void setSource(final Object value);

	@JsProperty
	public abstract String getNEXT();

	@JsProperty
	public abstract void setNEXT(final String value);

	@JsProperty
	public abstract String getNEXT_NO_DUPLICATE();

	@JsProperty
	public abstract void setNEXT_NO_DUPLICATE(final String value);

	@JsProperty
	public abstract String getPREV();

	@JsProperty
	public abstract void setPREV(final String value);

	@JsProperty
	public abstract String getPREV_NO_DUPLICATE();

	@JsProperty
	public abstract void setPREV_NO_DUPLICATE(final String value);

	@JsMethod
	public abstract void advance(final double count);

	@JsMethod
	public abstract void continue_();

	@JsMethod
	public abstract void continue_(final Object key);

	@JsMethod
	public abstract IDBRequest delete();

	@JsMethod
	public abstract IDBRequest update(final Object value);
}
