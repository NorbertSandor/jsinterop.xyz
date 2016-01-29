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
public interface PerformanceEntry {
	@JsProperty
	public abstract double getDuration();

	@JsProperty
	public abstract void setDuration(final double value);

	@JsProperty
	public abstract String getEntryType();

	@JsProperty
	public abstract void setEntryType(final String value);

	@JsProperty
	public abstract String getName();

	@JsProperty
	public abstract void setName(final String value);

	@JsProperty
	public abstract double getStartTime();

	@JsProperty
	public abstract void setStartTime(final double value);
}
