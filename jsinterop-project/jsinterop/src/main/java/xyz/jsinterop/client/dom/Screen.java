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
public interface Screen extends EventTarget {
	@JsProperty
	public abstract double getAvailHeight();

	@JsProperty
	public abstract void setAvailHeight(final double value);

	@JsProperty
	public abstract double getAvailWidth();

	@JsProperty
	public abstract void setAvailWidth(final double value);

	@JsProperty
	public abstract double getBufferDepth();

	@JsProperty
	public abstract void setBufferDepth(final double value);

	@JsProperty
	public abstract double getColorDepth();

	@JsProperty
	public abstract void setColorDepth(final double value);

	@JsProperty
	public abstract double getDeviceXDPI();

	@JsProperty
	public abstract void setDeviceXDPI(final double value);

	@JsProperty
	public abstract double getDeviceYDPI();

	@JsProperty
	public abstract void setDeviceYDPI(final double value);

	@JsProperty
	public abstract boolean isFontSmoothingEnabled();

	@JsProperty
	public abstract void setFontSmoothingEnabled(final boolean value);

	@JsProperty
	public abstract double getHeight();

	@JsProperty
	public abstract void setHeight(final double value);

	@JsProperty
	public abstract double getLogicalXDPI();

	@JsProperty
	public abstract void setLogicalXDPI(final double value);

	@JsProperty
	public abstract double getLogicalYDPI();

	@JsProperty
	public abstract void setLogicalYDPI(final double value);

	@JsProperty
	public abstract String getMsOrientation();

	@JsProperty
	public abstract void setMsOrientation(final String value);

	@JsProperty
	public abstract EventListener<Event> getOnmsorientationchange();

	@JsProperty
	public abstract void setOnmsorientationchange(final EventListener<Event> value);

	@JsProperty
	public abstract double getPixelDepth();

	@JsProperty
	public abstract void setPixelDepth(final double value);

	@JsProperty
	public abstract double getSystemXDPI();

	@JsProperty
	public abstract void setSystemXDPI(final double value);

	@JsProperty
	public abstract double getSystemYDPI();

	@JsProperty
	public abstract void setSystemYDPI(final double value);

	@JsProperty
	public abstract double getWidth();

	@JsProperty
	public abstract void setWidth(final double value);

	@JsMethod
	public abstract boolean msLockOrientation(final Object orientations);

	@JsMethod
	public abstract void msUnlockOrientation();

	@JsOverlay
	public default void addEventListenerMSOrientationChange(final EventListener<Event> listener) {
		addEventListener("MSOrientationChange", listener);
	}

	@JsOverlay
	public default void addEventListenerMSOrientationChange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("MSOrientationChange", listener, useCapture);
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
