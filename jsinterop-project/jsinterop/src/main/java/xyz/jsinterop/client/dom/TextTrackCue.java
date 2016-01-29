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
public interface TextTrackCue extends EventTarget {
	@JsProperty
	public abstract double getEndTime();

	@JsProperty
	public abstract void setEndTime(final double value);

	@JsProperty
	public abstract String getId();

	@JsProperty
	public abstract void setId(final String value);

	@JsProperty
	public abstract EventListener<Event> getOnenter();

	@JsProperty
	public abstract void setOnenter(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnexit();

	@JsProperty
	public abstract void setOnexit(final EventListener<Event> value);

	@JsProperty
	public abstract boolean isPauseOnExit();

	@JsProperty
	public abstract void setPauseOnExit(final boolean value);

	@JsProperty
	public abstract double getStartTime();

	@JsProperty
	public abstract void setStartTime(final double value);

	@JsProperty
	public abstract String getText();

	@JsProperty
	public abstract void setText(final String value);

	@JsProperty
	public abstract TextTrack getTrack();

	@JsProperty
	public abstract void setTrack(final TextTrack value);

	@JsMethod
	public abstract DocumentFragment getCueAsHTML();

	@JsOverlay
	public default void addEventListenerEnter(final EventListener<Event> listener) {
		addEventListener("enter", listener);
	}

	@JsOverlay
	public default void addEventListenerEnter(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("enter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerExit(final EventListener<Event> listener) {
		addEventListener("exit", listener);
	}

	@JsOverlay
	public default void addEventListenerExit(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("exit", listener, useCapture);
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
