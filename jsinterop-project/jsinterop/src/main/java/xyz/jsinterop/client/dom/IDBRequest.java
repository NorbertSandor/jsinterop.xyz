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
public interface IDBRequest extends EventTarget {
	@JsProperty
	public abstract DOMError getError();

	@JsProperty
	public abstract void setError(final DOMError value);

	@JsProperty
	public abstract EventListener<Event> getOnerror();

	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnsuccess();

	@JsProperty
	public abstract void setOnsuccess(final EventListener<Event> value);

	@JsProperty
	public abstract String getReadyState();

	@JsProperty
	public abstract void setReadyState(final String value);

	@JsProperty
	public abstract Object getResult();

	@JsProperty
	public abstract void setResult(final Object value);

	@JsProperty
	public abstract Object getSource();

	@JsProperty
	public abstract void setSource(final Object value);

	@JsProperty
	public abstract IDBTransaction getTransaction();

	@JsProperty
	public abstract void setTransaction(final IDBTransaction value);

	@JsOverlay
	public default void addEventListenerError(final EventListener<ErrorEvent> listener) {
		addEventListener("error", listener);
	}

	@JsOverlay
	public default void addEventListenerError(final EventListener<ErrorEvent> listener, final boolean useCapture) {
		addEventListener("error", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSuccess(final EventListener<Event> listener) {
		addEventListener("success", listener);
	}

	@JsOverlay
	public default void addEventListenerSuccess(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("success", listener, useCapture);
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
