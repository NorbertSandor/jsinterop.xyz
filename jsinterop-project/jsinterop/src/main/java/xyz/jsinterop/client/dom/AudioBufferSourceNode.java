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
public interface AudioBufferSourceNode extends AudioNode {
	@JsProperty
	public abstract AudioBuffer getBuffer();

	@JsProperty
	public abstract void setBuffer(final AudioBuffer value);

	@JsProperty
	public abstract boolean isLoop();

	@JsProperty
	public abstract void setLoop(final boolean value);

	@JsProperty
	public abstract double getLoopEnd();

	@JsProperty
	public abstract void setLoopEnd(final double value);

	@JsProperty
	public abstract double getLoopStart();

	@JsProperty
	public abstract void setLoopStart(final double value);

	@JsProperty
	public abstract EventListener<Event> getOnended();

	@JsProperty
	public abstract void setOnended(final EventListener<Event> value);

	@JsProperty
	public abstract AudioParam getPlaybackRate();

	@JsProperty
	public abstract void setPlaybackRate(final AudioParam value);

	@JsMethod
	public abstract void start();

	@JsMethod
	public abstract void start(final double when);

	@JsMethod
	public abstract void start(final double when, final double offset);

	@JsMethod
	public abstract void start(final double when, final double offset, final double duration);

	@JsMethod
	public abstract void stop();

	@JsMethod
	public abstract void stop(final double when);

	@JsOverlay
	public default void addEventListenerEnded(final EventListener<Event> listener) {
		addEventListener("ended", listener);
	}

	@JsOverlay
	public default void addEventListenerEnded(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("ended", listener, useCapture);
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
