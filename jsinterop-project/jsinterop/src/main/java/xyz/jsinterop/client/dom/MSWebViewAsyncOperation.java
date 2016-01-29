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
public interface MSWebViewAsyncOperation extends EventTarget {
	@JsProperty
	public abstract DOMError getError();

	@JsProperty
	public abstract void setError(final DOMError value);

	@JsProperty
	public abstract EventListener<Event> getOncomplete();

	@JsProperty
	public abstract void setOncomplete(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnerror();

	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	@JsProperty
	public abstract double getReadyState();

	@JsProperty
	public abstract void setReadyState(final double value);

	@JsProperty
	public abstract Object getResult();

	@JsProperty
	public abstract void setResult(final Object value);

	@JsProperty
	public abstract MSHTMLWebViewElement getTarget();

	@JsProperty
	public abstract void setTarget(final MSHTMLWebViewElement value);

	@JsProperty
	public abstract double getType();

	@JsProperty
	public abstract void setType(final double value);

	@JsProperty
	public abstract double getCOMPLETED();

	@JsProperty
	public abstract void setCOMPLETED(final double value);

	@JsProperty
	public abstract double getERROR();

	@JsProperty
	public abstract void setERROR(final double value);

	@JsProperty
	public abstract double getSTARTED();

	@JsProperty
	public abstract void setSTARTED(final double value);

	@JsProperty
	public abstract double getTYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM();

	@JsProperty
	public abstract void setTYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM(final double value);

	@JsProperty
	public abstract double getTYPE_CREATE_DATA_PACKAGE_FROM_SELECTION();

	@JsProperty
	public abstract void setTYPE_CREATE_DATA_PACKAGE_FROM_SELECTION(final double value);

	@JsProperty
	public abstract double getTYPE_INVOKE_SCRIPT();

	@JsProperty
	public abstract void setTYPE_INVOKE_SCRIPT(final double value);

	@JsMethod
	public abstract void start();

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
