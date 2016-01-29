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
public interface MediaSource extends EventTarget {
	@JsProperty
	public abstract SourceBufferList getActiveSourceBuffers();

	@JsProperty
	public abstract void setActiveSourceBuffers(final SourceBufferList value);

	@JsProperty
	public abstract double getDuration();

	@JsProperty
	public abstract void setDuration(final double value);

	@JsProperty
	public abstract double getReadyState();

	@JsProperty
	public abstract void setReadyState(final double value);

	@JsProperty
	public abstract SourceBufferList getSourceBuffers();

	@JsProperty
	public abstract void setSourceBuffers(final SourceBufferList value);

	@JsMethod
	public abstract SourceBuffer addSourceBuffer(final String type);

	@JsMethod
	public abstract void endOfStream();

	@JsMethod
	public abstract void endOfStream(final double error);

	@JsMethod
	public abstract void removeSourceBuffer(final SourceBuffer sourceBuffer);
}
