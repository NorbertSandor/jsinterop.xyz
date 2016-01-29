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
public interface IDBObjectStore {
	@JsProperty
	public abstract DOMStringList getIndexNames();

	@JsProperty
	public abstract void setIndexNames(final DOMStringList value);

	@JsProperty
	public abstract String getKeyPath();

	@JsProperty
	public abstract void setKeyPath(final String value);

	@JsProperty
	public abstract String getName();

	@JsProperty
	public abstract void setName(final String value);

	@JsProperty
	public abstract IDBTransaction getTransaction();

	@JsProperty
	public abstract void setTransaction(final IDBTransaction value);

	@JsMethod
	public abstract IDBRequest add(final Object value);

	@JsMethod
	public abstract IDBRequest add(final Object value, final Object key);

	@JsMethod
	public abstract IDBRequest clear();

	@JsMethod
	public abstract IDBRequest count();

	@JsMethod
	public abstract IDBRequest count(final Object key);

	@JsMethod
	public abstract IDBIndex createIndex(final String name, final Object keyPath);

	@JsMethod
	public abstract IDBIndex createIndex(final String name, final Object keyPath,
			final IDBIndexParameters optionalParameters);

	@JsMethod
	public abstract IDBRequest delete(final Object key);

	@JsMethod
	public abstract void deleteIndex(final String indexName);

	@JsMethod
	public abstract IDBRequest get(final Object key);

	@JsMethod
	public abstract IDBIndex index(final String name);

	@JsMethod
	public abstract IDBRequest openCursor();

	@JsMethod
	public abstract IDBRequest openCursor(final Object range);

	@JsMethod
	public abstract IDBRequest openCursor(final Object range, final String direction);

	@JsMethod
	public abstract IDBRequest put(final Object value);

	@JsMethod
	public abstract IDBRequest put(final Object value, final Object key);
}
