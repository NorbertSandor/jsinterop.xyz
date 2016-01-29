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
public interface TextTrack extends EventTarget {
	@JsProperty
	public abstract TextTrackCueList getActiveCues();

	@JsProperty
	public abstract void setActiveCues(final TextTrackCueList value);

	@JsProperty
	public abstract TextTrackCueList getCues();

	@JsProperty
	public abstract void setCues(final TextTrackCueList value);

	@JsProperty
	public abstract String getInBandMetadataTrackDispatchType();

	@JsProperty
	public abstract void setInBandMetadataTrackDispatchType(final String value);

	@JsProperty
	public abstract String getKind();

	@JsProperty
	public abstract void setKind(final String value);

	@JsProperty
	public abstract String getLabel();

	@JsProperty
	public abstract void setLabel(final String value);

	@JsProperty
	public abstract String getLanguage();

	@JsProperty
	public abstract void setLanguage(final String value);

	@JsProperty
	public abstract Object getMode();

	@JsProperty
	public abstract void setMode(final Object value);

	@JsProperty
	public abstract EventListener<Event> getOncuechange();

	@JsProperty
	public abstract void setOncuechange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnerror();

	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnload();

	@JsProperty
	public abstract void setOnload(final EventListener<Event> value);

	@JsProperty
	public abstract double getReadyState();

	@JsProperty
	public abstract void setReadyState(final double value);

	@JsProperty
	public abstract double getDISABLED();

	@JsProperty
	public abstract void setDISABLED(final double value);

	@JsProperty
	public abstract double getERROR();

	@JsProperty
	public abstract void setERROR(final double value);

	@JsProperty
	public abstract double getHIDDEN();

	@JsProperty
	public abstract void setHIDDEN(final double value);

	@JsProperty
	public abstract double getLOADED();

	@JsProperty
	public abstract void setLOADED(final double value);

	@JsProperty
	public abstract double getLOADING();

	@JsProperty
	public abstract void setLOADING(final double value);

	@JsProperty
	public abstract double getNONE();

	@JsProperty
	public abstract void setNONE(final double value);

	@JsProperty
	public abstract double getSHOWING();

	@JsProperty
	public abstract void setSHOWING(final double value);

	@JsMethod
	public abstract void addCue(final TextTrackCue cue);

	@JsMethod
	public abstract void removeCue(final TextTrackCue cue);

	@JsOverlay
	public default void addEventListenerCuechange(final EventListener<Event> listener) {
		addEventListener("cuechange", listener);
	}

	@JsOverlay
	public default void addEventListenerCuechange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("cuechange", listener, useCapture);
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
