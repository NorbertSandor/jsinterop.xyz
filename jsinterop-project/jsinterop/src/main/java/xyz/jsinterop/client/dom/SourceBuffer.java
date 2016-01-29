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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface SourceBuffer extends EventTarget {
	@JsProperty
	public abstract double getAppendWindowEnd();

	@JsProperty
	public abstract void setAppendWindowEnd(final double value);

	@JsProperty
	public abstract double getAppendWindowStart();

	@JsProperty
	public abstract void setAppendWindowStart(final double value);

	@JsProperty
	public abstract AudioTrackList getAudioTracks();

	@JsProperty
	public abstract void setAudioTracks(final AudioTrackList value);

	@JsProperty
	public abstract TimeRanges getBuffered();

	@JsProperty
	public abstract void setBuffered(final TimeRanges value);

	@JsProperty
	public abstract String getMode();

	@JsProperty
	public abstract void setMode(final String value);

	@JsProperty
	public abstract double getTimestampOffset();

	@JsProperty
	public abstract void setTimestampOffset(final double value);

	@JsProperty
	public abstract boolean isUpdating();

	@JsProperty
	public abstract void setUpdating(final boolean value);

	@JsProperty
	public abstract VideoTrackList getVideoTracks();

	@JsProperty
	public abstract void setVideoTracks(final VideoTrackList value);

	@JsMethod
	public abstract void abort();

	@JsMethod
	public abstract void appendBuffer(final Object data);

	@JsMethod
	public abstract void appendStream(final MSStream stream);

	@JsMethod
	public abstract void appendStream(final MSStream stream, final double maxSize);

	@JsMethod
	public abstract void remove(final double start, final double end);
}
