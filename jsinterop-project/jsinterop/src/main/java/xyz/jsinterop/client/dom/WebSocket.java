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
public interface WebSocket extends EventTarget {
	@JsProperty
	public abstract String getBinaryType();

	@JsProperty
	public abstract void setBinaryType(final String value);

	@JsProperty
	public abstract double getBufferedAmount();

	@JsProperty
	public abstract void setBufferedAmount(final double value);

	@JsProperty
	public abstract String getExtensions();

	@JsProperty
	public abstract void setExtensions(final String value);

	@JsProperty
	public abstract EventListener<CloseEvent> getOnclose();

	@JsProperty
	public abstract void setOnclose(final EventListener<CloseEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnerror();

	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<MessageEvent> getOnmessage();

	@JsProperty
	public abstract void setOnmessage(final EventListener<MessageEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnopen();

	@JsProperty
	public abstract void setOnopen(final EventListener<Event> value);

	@JsProperty
	public abstract String getProtocol();

	@JsProperty
	public abstract void setProtocol(final String value);

	@JsProperty
	public abstract double getReadyState();

	@JsProperty
	public abstract void setReadyState(final double value);

	@JsProperty
	public abstract String getUrl();

	@JsProperty
	public abstract void setUrl(final String value);

	@JsProperty
	public abstract double getCLOSED();

	@JsProperty
	public abstract void setCLOSED(final double value);

	@JsProperty
	public abstract double getCLOSING();

	@JsProperty
	public abstract void setCLOSING(final double value);

	@JsProperty
	public abstract double getCONNECTING();

	@JsProperty
	public abstract void setCONNECTING(final double value);

	@JsProperty
	public abstract double getOPEN();

	@JsProperty
	public abstract void setOPEN(final double value);

	@JsMethod
	public abstract void close();

	@JsMethod
	public abstract void close(final double code);

	@JsMethod
	public abstract void close(final double code, final String reason);

	@JsMethod
	public abstract void send(final Object data);

	@JsOverlay
	public default void addEventListenerClose(final EventListener<CloseEvent> listener) {
		addEventListener("close", listener);
	}

	@JsOverlay
	public default void addEventListenerClose(final EventListener<CloseEvent> listener, final boolean useCapture) {
		addEventListener("close", listener, useCapture);
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
	public default void addEventListenerMessage(final EventListener<MessageEvent> listener) {
		addEventListener("message", listener);
	}

	@JsOverlay
	public default void addEventListenerMessage(final EventListener<MessageEvent> listener, final boolean useCapture) {
		addEventListener("message", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerOpen(final EventListener<Event> listener) {
		addEventListener("open", listener);
	}

	@JsOverlay
	public default void addEventListenerOpen(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("open", listener, useCapture);
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
