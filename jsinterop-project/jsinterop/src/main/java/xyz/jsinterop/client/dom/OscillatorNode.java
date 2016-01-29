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
public interface OscillatorNode extends AudioNode {
	@JsProperty
	public abstract AudioParam getDetune();

	@JsProperty
	public abstract void setDetune(final AudioParam value);

	@JsProperty
	public abstract AudioParam getFrequency();

	@JsProperty
	public abstract void setFrequency(final AudioParam value);

	@JsProperty
	public abstract EventListener<Event> getOnended();

	@JsProperty
	public abstract void setOnended(final EventListener<Event> value);

	@JsProperty
	public abstract String getType();

	@JsProperty
	public abstract void setType(final String value);

	@JsMethod
	public abstract void setPeriodicWave(final PeriodicWave periodicWave);

	@JsMethod
	public abstract void start();

	@JsMethod
	public abstract void start(final double when);

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
