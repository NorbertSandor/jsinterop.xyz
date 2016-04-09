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
public interface HTMLVideoElement extends HTMLMediaElement {
	/**
	 * Gets or sets the height of the video element.
	 */
	@JsProperty
	public abstract double getHeight();

	/**
	 * Gets or sets the height of the video element.
	 */
	@JsProperty
	public abstract void setHeight(final double value);

	@JsProperty
	public abstract boolean isMsHorizontalMirror();

	@JsProperty
	public abstract void setMsHorizontalMirror(final boolean value);

	@JsProperty
	public abstract boolean isMsIsLayoutOptimalForPlayback();

	@JsProperty
	public abstract void setMsIsLayoutOptimalForPlayback(final boolean value);

	@JsProperty
	public abstract boolean isMsIsStereo3D();

	@JsProperty
	public abstract void setMsIsStereo3D(final boolean value);

	@JsProperty
	public abstract String getMsStereo3DPackingMode();

	@JsProperty
	public abstract void setMsStereo3DPackingMode(final String value);

	@JsProperty
	public abstract String getMsStereo3DRenderMode();

	@JsProperty
	public abstract void setMsStereo3DRenderMode(final String value);

	@JsProperty
	public abstract boolean isMsZoom();

	@JsProperty
	public abstract void setMsZoom(final boolean value);

	@JsProperty
	public abstract EventListener<Event> getOnMSVideoFormatChanged();

	@JsProperty
	public abstract void setOnMSVideoFormatChanged(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnMSVideoFrameStepCompleted();

	@JsProperty
	public abstract void setOnMSVideoFrameStepCompleted(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnMSVideoOptimalLayoutChanged();

	@JsProperty
	public abstract void setOnMSVideoOptimalLayoutChanged(final EventListener<Event> value);

	/**
	 * Gets or sets a URL of an image to display, for example, like a movie
	 * poster. This can be a still frame from the video, or another image if no
	 * video data is available.
	 */
	@JsProperty
	public abstract String getPoster();

	/**
	 * Gets or sets a URL of an image to display, for example, like a movie
	 * poster. This can be a still frame from the video, or another image if no
	 * video data is available.
	 */
	@JsProperty
	public abstract void setPoster(final String value);

	/**
	 * Gets the intrinsic height of a video in CSS pixels, or zero if the
	 * dimensions are not known.
	 */
	@JsProperty
	public abstract double getVideoHeight();

	/**
	 * Gets the intrinsic height of a video in CSS pixels, or zero if the
	 * dimensions are not known.
	 */
	@JsProperty
	public abstract void setVideoHeight(final double value);

	/**
	 * Gets the intrinsic width of a video in CSS pixels, or zero if the
	 * dimensions are not known.
	 */
	@JsProperty
	public abstract double getVideoWidth();

	/**
	 * Gets the intrinsic width of a video in CSS pixels, or zero if the
	 * dimensions are not known.
	 */
	@JsProperty
	public abstract void setVideoWidth(final double value);

	@JsProperty
	public abstract boolean isWebkitDisplayingFullscreen();

	@JsProperty
	public abstract void setWebkitDisplayingFullscreen(final boolean value);

	@JsProperty
	public abstract boolean isWebkitSupportsFullscreen();

	@JsProperty
	public abstract void setWebkitSupportsFullscreen(final boolean value);

	/**
	 * Gets or sets the width of the video element.
	 */
	@JsProperty
	public abstract double getWidth();

	/**
	 * Gets or sets the width of the video element.
	 */
	@JsProperty
	public abstract void setWidth(final double value);

	@JsMethod
	public abstract VideoPlaybackQuality getVideoPlaybackQuality();

	@JsMethod
	public abstract void msFrameStep(final boolean forward);

	@JsMethod
	public abstract void msInsertVideoEffect(final String activatableClassId, final boolean effectRequired);

	@JsMethod
	public abstract void msInsertVideoEffect(final String activatableClassId, final boolean effectRequired,
			final Object config);

	@JsMethod
	public abstract void msSetVideoRectangle(final double left, final double top, final double right,
			final double bottom);

	@JsMethod
	public abstract void webkitEnterFullScreen();

	@JsMethod
	public abstract void webkitEnterFullscreen();

	@JsMethod
	public abstract void webkitExitFullScreen();

	@JsMethod
	public abstract void webkitExitFullscreen();

	@JsOverlay
	public default void addEventListenerMSVideoFormatChanged(final EventListener<Event> listener) {
		addEventListener("MSVideoFormatChanged", listener);
	}

	@JsOverlay
	public default void addEventListenerMSVideoFormatChanged(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("MSVideoFormatChanged", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSVideoFrameStepCompleted(final EventListener<Event> listener) {
		addEventListener("MSVideoFrameStepCompleted", listener);
	}

	@JsOverlay
	public default void addEventListenerMSVideoFrameStepCompleted(final EventListener<Event> listener,
			final boolean useCapture) {
		addEventListener("MSVideoFrameStepCompleted", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSVideoOptimalLayoutChanged(final EventListener<Event> listener) {
		addEventListener("MSVideoOptimalLayoutChanged", listener);
	}

	@JsOverlay
	public default void addEventListenerMSVideoOptimalLayoutChanged(final EventListener<Event> listener,
			final boolean useCapture) {
		addEventListener("MSVideoOptimalLayoutChanged", listener, useCapture);
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
