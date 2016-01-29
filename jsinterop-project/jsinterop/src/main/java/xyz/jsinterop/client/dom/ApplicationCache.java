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
public interface ApplicationCache extends EventTarget {
	@JsProperty
	public abstract EventListener<Event> getOncached();

	@JsProperty
	public abstract void setOncached(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnchecking();

	@JsProperty
	public abstract void setOnchecking(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOndownloading();

	@JsProperty
	public abstract void setOndownloading(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnerror();

	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnnoupdate();

	@JsProperty
	public abstract void setOnnoupdate(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnobsolete();

	@JsProperty
	public abstract void setOnobsolete(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<ProgressEvent> getOnprogress();

	@JsProperty
	public abstract void setOnprogress(final EventListener<ProgressEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnupdateready();

	@JsProperty
	public abstract void setOnupdateready(final EventListener<Event> value);

	@JsProperty
	public abstract double getStatus();

	@JsProperty
	public abstract void setStatus(final double value);

	@JsProperty
	public abstract double getCHECKING();

	@JsProperty
	public abstract void setCHECKING(final double value);

	@JsProperty
	public abstract double getDOWNLOADING();

	@JsProperty
	public abstract void setDOWNLOADING(final double value);

	@JsProperty
	public abstract double getIDLE();

	@JsProperty
	public abstract void setIDLE(final double value);

	@JsProperty
	public abstract double getOBSOLETE();

	@JsProperty
	public abstract void setOBSOLETE(final double value);

	@JsProperty
	public abstract double getUNCACHED();

	@JsProperty
	public abstract void setUNCACHED(final double value);

	@JsProperty
	public abstract double getUPDATEREADY();

	@JsProperty
	public abstract void setUPDATEREADY(final double value);

	@JsMethod
	public abstract void abort();

	@JsMethod
	public abstract void swapCache();

	@JsMethod
	public abstract void update();

	@JsOverlay
	public default void addEventListenerCached(final EventListener<Event> listener) {
		addEventListener("cached", listener);
	}

	@JsOverlay
	public default void addEventListenerCached(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("cached", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerChecking(final EventListener<Event> listener) {
		addEventListener("checking", listener);
	}

	@JsOverlay
	public default void addEventListenerChecking(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("checking", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDownloading(final EventListener<Event> listener) {
		addEventListener("downloading", listener);
	}

	@JsOverlay
	public default void addEventListenerDownloading(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("downloading", listener, useCapture);
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
	public default void addEventListenerNoupdate(final EventListener<Event> listener) {
		addEventListener("noupdate", listener);
	}

	@JsOverlay
	public default void addEventListenerNoupdate(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("noupdate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerObsolete(final EventListener<Event> listener) {
		addEventListener("obsolete", listener);
	}

	@JsOverlay
	public default void addEventListenerObsolete(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("obsolete", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerProgress(final EventListener<ProgressEvent> listener) {
		addEventListener("progress", listener);
	}

	@JsOverlay
	public default void addEventListenerProgress(final EventListener<ProgressEvent> listener, final boolean useCapture) {
		addEventListener("progress", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerUpdateready(final EventListener<Event> listener) {
		addEventListener("updateready", listener);
	}

	@JsOverlay
	public default void addEventListenerUpdateready(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("updateready", listener, useCapture);
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
