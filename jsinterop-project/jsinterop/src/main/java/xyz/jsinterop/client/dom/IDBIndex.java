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
public interface IDBIndex {
	@JsProperty
	public abstract Object getKeyPath();

	@JsProperty
	public abstract void setKeyPath(final Object value);

	@JsProperty
	public abstract String getName();

	@JsProperty
	public abstract void setName(final String value);

	@JsProperty
	public abstract IDBObjectStore getObjectStore();

	@JsProperty
	public abstract void setObjectStore(final IDBObjectStore value);

	@JsProperty
	public abstract boolean isUnique();

	@JsProperty
	public abstract void setUnique(final boolean value);

	@JsProperty
	public abstract boolean isMultiEntry();

	@JsProperty
	public abstract void setMultiEntry(final boolean value);

	@JsMethod
	public abstract IDBRequest count();

	@JsMethod
	public abstract IDBRequest count(final Object key);

	@JsMethod
	public abstract IDBRequest get(final Object key);

	@JsMethod
	public abstract IDBRequest getKey(final Object key);

	@JsMethod
	public abstract IDBRequest openCursor();

	@JsMethod
	public abstract IDBRequest openCursor(final IDBKeyRange range);

	@JsMethod
	public abstract IDBRequest openCursor(final IDBKeyRange range, final String direction);

	@JsMethod
	public abstract IDBRequest openKeyCursor();

	@JsMethod
	public abstract IDBRequest openKeyCursor(final IDBKeyRange range);

	@JsMethod
	public abstract IDBRequest openKeyCursor(final IDBKeyRange range, final String direction);
}
