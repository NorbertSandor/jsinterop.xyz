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
public interface ScriptProcessorNode extends AudioNode {
	@JsProperty
	public abstract double getBufferSize();

	@JsProperty
	public abstract void setBufferSize(final double value);

	@JsProperty
	public abstract EventListener<AudioProcessingEvent> getOnaudioprocess();

	@JsProperty
	public abstract void setOnaudioprocess(final EventListener<AudioProcessingEvent> value);

	@JsOverlay
	public default void addEventListenerAudioprocess(final EventListener<AudioProcessingEvent> listener) {
		addEventListener("audioprocess", listener);
	}

	@JsOverlay
	public default void addEventListenerAudioprocess(final EventListener<AudioProcessingEvent> listener, final boolean useCapture) {
		addEventListener("audioprocess", listener, useCapture);
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
