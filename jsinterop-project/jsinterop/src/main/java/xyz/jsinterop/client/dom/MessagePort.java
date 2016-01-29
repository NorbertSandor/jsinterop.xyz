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
public interface MessagePort extends EventTarget {
	@JsProperty
	public abstract EventListener<MessageEvent> getOnmessage();

	@JsProperty
	public abstract void setOnmessage(final EventListener<MessageEvent> value);

	@JsMethod
	public abstract void close();

	@JsMethod
	public abstract void postMessage();

	@JsMethod
	public abstract void postMessage(final Object message);

	@JsMethod
	public abstract void postMessage(final Object message, final Object ports);

	@JsMethod
	public abstract void start();

	@JsOverlay
	public default void addEventListenerMessage(final EventListener<MessageEvent> listener) {
		addEventListener("message", listener);
	}

	@JsOverlay
	public default void addEventListenerMessage(final EventListener<MessageEvent> listener, final boolean useCapture) {
		addEventListener("message", listener, useCapture);
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
