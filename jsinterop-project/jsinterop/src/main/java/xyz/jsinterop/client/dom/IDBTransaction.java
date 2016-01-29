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
public interface IDBTransaction extends EventTarget {
	@JsProperty
	public abstract IDBDatabase getDb();

	@JsProperty
	public abstract void setDb(final IDBDatabase value);

	@JsProperty
	public abstract DOMError getError();

	@JsProperty
	public abstract void setError(final DOMError value);

	@JsProperty
	public abstract String getMode();

	@JsProperty
	public abstract void setMode(final String value);

	@JsProperty
	public abstract EventListener<Event> getOnabort();

	@JsProperty
	public abstract void setOnabort(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOncomplete();

	@JsProperty
	public abstract void setOncomplete(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnerror();

	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	@JsProperty
	public abstract String getREAD_ONLY();

	@JsProperty
	public abstract void setREAD_ONLY(final String value);

	@JsProperty
	public abstract String getREAD_WRITE();

	@JsProperty
	public abstract void setREAD_WRITE(final String value);

	@JsProperty
	public abstract String getVERSION_CHANGE();

	@JsProperty
	public abstract void setVERSION_CHANGE(final String value);

	@JsMethod
	public abstract void abort();

	@JsMethod
	public abstract IDBObjectStore objectStore(final String name);

	@JsOverlay
	public default void addEventListenerAbort(final EventListener<Event> listener) {
		addEventListener("abort", listener);
	}

	@JsOverlay
	public default void addEventListenerAbort(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("abort", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerComplete(final EventListener<Event> listener) {
		addEventListener("complete", listener);
	}

	@JsOverlay
	public default void addEventListenerComplete(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("complete", listener, useCapture);
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
