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
public interface XMLHttpRequestEventTarget {
	@JsProperty
	public abstract EventListener<Event> getOnabort();

	@JsProperty
	public abstract void setOnabort(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnerror();

	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnload();

	@JsProperty
	public abstract void setOnload(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<ProgressEvent> getOnloadend();

	@JsProperty
	public abstract void setOnloadend(final EventListener<ProgressEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnloadstart();

	@JsProperty
	public abstract void setOnloadstart(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<ProgressEvent> getOnprogress();

	@JsProperty
	public abstract void setOnprogress(final EventListener<ProgressEvent> value);

	@JsProperty
	public abstract EventListener<ProgressEvent> getOntimeout();

	@JsProperty
	public abstract void setOntimeout(final EventListener<ProgressEvent> value);

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

	@JsOverlay
	public default void addEventListenerLoad(final EventListener<Event> listener) {
		addEventListener("load", listener);
	}

	@JsOverlay
	public default void addEventListenerLoad(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("load", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoadend(final EventListener<ProgressEvent> listener) {
		addEventListener("loadend", listener);
	}

	@JsOverlay
	public default void addEventListenerLoadend(final EventListener<ProgressEvent> listener, final boolean useCapture) {
		addEventListener("loadend", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoadstart(final EventListener<Event> listener) {
		addEventListener("loadstart", listener);
	}

	@JsOverlay
	public default void addEventListenerLoadstart(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("loadstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerProgress(final EventListener<ProgressEvent> listener) {
		addEventListener("progress", listener);
	}

	@JsOverlay
	public default void addEventListenerProgress(final EventListener<ProgressEvent> listener, final boolean useCapture) {
		addEventListener("progress", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTimeout(final EventListener<ProgressEvent> listener) {
		addEventListener("timeout", listener);
	}

	@JsOverlay
	public default void addEventListenerTimeout(final EventListener<ProgressEvent> listener, final boolean useCapture) {
		addEventListener("timeout", listener, useCapture);
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
