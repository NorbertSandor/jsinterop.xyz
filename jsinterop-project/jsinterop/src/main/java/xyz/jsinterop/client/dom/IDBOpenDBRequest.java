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
public interface IDBOpenDBRequest extends IDBRequest {
	@JsProperty
	public abstract EventListener<Event> getOnblocked();

	@JsProperty
	public abstract void setOnblocked(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<IDBVersionChangeEvent> getOnupgradeneeded();

	@JsProperty
	public abstract void setOnupgradeneeded(final EventListener<IDBVersionChangeEvent> value);

	@JsOverlay
	public default void addEventListenerBlocked(final EventListener<Event> listener) {
		addEventListener("blocked", listener);
	}

	@JsOverlay
	public default void addEventListenerBlocked(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("blocked", listener, useCapture);
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
	public default void addEventListenerSuccess(final EventListener<Event> listener) {
		addEventListener("success", listener);
	}

	@JsOverlay
	public default void addEventListenerSuccess(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("success", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerUpgradeneeded(final EventListener<IDBVersionChangeEvent> listener) {
		addEventListener("upgradeneeded", listener);
	}

	@JsOverlay
	public default void addEventListenerUpgradeneeded(final EventListener<IDBVersionChangeEvent> listener, final boolean useCapture) {
		addEventListener("upgradeneeded", listener, useCapture);
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
