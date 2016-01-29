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
public interface XMLHttpRequest extends EventTarget, XMLHttpRequestEventTarget {
	@JsProperty
	public abstract String getMsCaching();

	@JsProperty
	public abstract void setMsCaching(final String value);

	@JsProperty
	public abstract EventListener<ProgressEvent> getOnreadystatechange();

	@JsProperty
	public abstract void setOnreadystatechange(final EventListener<ProgressEvent> value);

	@JsProperty
	public abstract double getReadyState();

	@JsProperty
	public abstract void setReadyState(final double value);

	@JsProperty
	public abstract Object getResponse();

	@JsProperty
	public abstract void setResponse(final Object value);

	@JsProperty
	public abstract Object getResponseBody();

	@JsProperty
	public abstract void setResponseBody(final Object value);

	@JsProperty
	public abstract String getResponseText();

	@JsProperty
	public abstract void setResponseText(final String value);

	@JsProperty
	public abstract String getResponseType();

	@JsProperty
	public abstract void setResponseType(final String value);

	@JsProperty
	public abstract Object getResponseXML();

	@JsProperty
	public abstract void setResponseXML(final Object value);

	@JsProperty
	public abstract double getStatus();

	@JsProperty
	public abstract void setStatus(final double value);

	@JsProperty
	public abstract String getStatusText();

	@JsProperty
	public abstract void setStatusText(final String value);

	@JsProperty
	public abstract double getTimeout();

	@JsProperty
	public abstract void setTimeout(final double value);

	@JsProperty
	public abstract XMLHttpRequestUpload getUpload();

	@JsProperty
	public abstract void setUpload(final XMLHttpRequestUpload value);

	@JsProperty
	public abstract boolean isWithCredentials();

	@JsProperty
	public abstract void setWithCredentials(final boolean value);

	@JsProperty
	public abstract double getDONE();

	@JsProperty
	public abstract void setDONE(final double value);

	@JsProperty
	public abstract double getHEADERS_RECEIVED();

	@JsProperty
	public abstract void setHEADERS_RECEIVED(final double value);

	@JsProperty
	public abstract double getLOADING();

	@JsProperty
	public abstract void setLOADING(final double value);

	@JsProperty
	public abstract double getOPENED();

	@JsProperty
	public abstract void setOPENED(final double value);

	@JsProperty
	public abstract double getUNSENT();

	@JsProperty
	public abstract void setUNSENT(final double value);

	@JsMethod
	public abstract void abort();

	@JsMethod
	public abstract String getAllResponseHeaders();

	@JsMethod
	public abstract String getResponseHeader(final String header);

	@JsMethod
	public abstract boolean msCachingEnabled();

	@JsMethod
	public abstract void open(final String method, final String url);

	@JsMethod
	public abstract void open(final String method, final String url, final boolean async);

	@JsMethod
	public abstract void open(final String method, final String url, final boolean async, final String user);

	@JsMethod
	public abstract void open(final String method, final String url, final boolean async, final String user,
			final String password);

	@JsMethod
	public abstract void overrideMimeType(final String mime);

	@JsMethod
	public abstract void send();

	@JsMethod
	public abstract void send(final Document data);

	@JsMethod
	public abstract void send(final String data);

	@JsMethod
	public abstract void send(final Object data);

	@JsMethod
	public abstract void setRequestHeader(final String header, final String value);

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
	public default void addEventListenerReadystatechange(final EventListener<ProgressEvent> listener) {
		addEventListener("readystatechange", listener);
	}

	@JsOverlay
	public default void addEventListenerReadystatechange(final EventListener<ProgressEvent> listener, final boolean useCapture) {
		addEventListener("readystatechange", listener, useCapture);
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
