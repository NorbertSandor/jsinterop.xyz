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
public interface AudioTrackList extends EventTarget {
	@JsProperty
	public abstract double getLength();

	@JsProperty
	public abstract void setLength(final double value);

	@JsProperty
	public abstract EventListener<TrackEvent> getOnaddtrack();

	@JsProperty
	public abstract void setOnaddtrack(final EventListener<TrackEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnchange();

	@JsProperty
	public abstract void setOnchange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<TrackEvent> getOnremovetrack();

	@JsProperty
	public abstract void setOnremovetrack(final EventListener<TrackEvent> value);

	@JsOverlay
	public default AudioTrack get(final int index) {
		return (AudioTrack) xyz.jsinterop.client.core.JsArrays.getArrayItem(this, index);
	}

	@JsOverlay
	public default void set(final int index, final AudioTrack value) {
		xyz.jsinterop.client.core.JsArrays.setArrayItem(this, index, value);
	}

	@JsMethod
	public abstract AudioTrack getTrackById(final String id);

	@JsMethod
	public abstract AudioTrack item(final double index);

	@JsOverlay
	public default void addEventListenerAddtrack(final EventListener<TrackEvent> listener) {
		addEventListener("addtrack", listener);
	}

	@JsOverlay
	public default void addEventListenerAddtrack(final EventListener<TrackEvent> listener, final boolean useCapture) {
		addEventListener("addtrack", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerChange(final EventListener<Event> listener) {
		addEventListener("change", listener);
	}

	@JsOverlay
	public default void addEventListenerChange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("change", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerRemovetrack(final EventListener<TrackEvent> listener) {
		addEventListener("removetrack", listener);
	}

	@JsOverlay
	public default void addEventListenerRemovetrack(final EventListener<TrackEvent> listener, final boolean useCapture) {
		addEventListener("removetrack", listener, useCapture);
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
