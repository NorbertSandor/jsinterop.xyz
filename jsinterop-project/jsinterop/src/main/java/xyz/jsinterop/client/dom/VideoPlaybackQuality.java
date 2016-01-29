package xyz.jsinterop.client.dom;

import jsinterop.annotations.JsPackage;

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

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface VideoPlaybackQuality {
	@JsProperty
	public abstract double getCorruptedVideoFrames();

	@JsProperty
	public abstract void setCorruptedVideoFrames(final double value);

	@JsProperty
	public abstract double getCreationTime();

	@JsProperty
	public abstract void setCreationTime(final double value);

	@JsProperty
	public abstract double getDroppedVideoFrames();

	@JsProperty
	public abstract void setDroppedVideoFrames(final double value);

	@JsProperty
	public abstract double getTotalFrameDelay();

	@JsProperty
	public abstract void setTotalFrameDelay(final double value);

	@JsProperty
	public abstract double getTotalVideoFrames();

	@JsProperty
	public abstract void setTotalVideoFrames(final double value);
}
