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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface IDBDatabase extends EventTarget {
	@JsProperty
	public abstract String getName();

	@JsProperty
	public abstract void setName(final String value);

	@JsProperty
	public abstract DOMStringList getObjectStoreNames();

	@JsProperty
	public abstract void setObjectStoreNames(final DOMStringList value);

	@JsProperty
	public abstract EventListener<Event> getOnabort();

	@JsProperty
	public abstract void setOnabort(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnerror();

	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	@JsProperty
	public abstract String getVersion();

	@JsProperty
	public abstract void setVersion(final String value);

	@JsMethod
	public abstract void close();

	@JsMethod
	public abstract IDBObjectStore createObjectStore(final String name);

	@JsMethod
	public abstract IDBObjectStore createObjectStore(final String name,
			final IDBObjectStoreParameters optionalParameters);

	@JsMethod
	public abstract void deleteObjectStore(final String name);

	@JsMethod
	public abstract IDBTransaction transaction(final Object storeNames);

	@JsMethod
	public abstract IDBTransaction transaction(final Object storeNames, final String mode);

	@JsOverlay
	public default void addEventListenerAbort(final EventListener<Event> listener) {
		addEventListener("abort", listener);
	}

	@JsOverlay
	public default void addEventListenerAbort(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("abort", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerError(final EventListener<ErrorEvent> listener) {
		addEventListener("error", listener);
	}

	@JsOverlay
	public default void addEventListenerError(final EventListener<ErrorEvent> listener, final boolean useCapture) {
		addEventListener("error", listener, useCapture);
	}

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener, final boolean useCapture);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener,
			final boolean useCapture);
}
