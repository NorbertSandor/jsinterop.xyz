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
public interface Performance {
	@JsProperty
	public abstract PerformanceNavigation getNavigation();

	@JsProperty
	public abstract void setNavigation(final PerformanceNavigation value);

	@JsProperty
	public abstract PerformanceTiming getTiming();

	@JsProperty
	public abstract void setTiming(final PerformanceTiming value);

	@JsMethod
	public abstract void clearMarks();

	@JsMethod
	public abstract void clearMarks(final String markName);

	@JsMethod
	public abstract void clearMeasures();

	@JsMethod
	public abstract void clearMeasures(final String measureName);

	@JsMethod
	public abstract void clearResourceTimings();

	@JsMethod
	public abstract Object getEntries();

	@JsMethod
	public abstract Object getEntriesByName(final String name);

	@JsMethod
	public abstract Object getEntriesByName(final String name, final String entryType);

	@JsMethod
	public abstract Object getEntriesByType(final String entryType);

	@JsMethod
	public abstract Object getMarks();

	@JsMethod
	public abstract Object getMarks(final String markName);

	@JsMethod
	public abstract Object getMeasures();

	@JsMethod
	public abstract Object getMeasures(final String measureName);

	@JsMethod
	public abstract void mark(final String markName);

	@JsMethod
	public abstract void measure(final String measureName);

	@JsMethod
	public abstract void measure(final String measureName, final String startMarkName);

	@JsMethod
	public abstract void measure(final String measureName, final String startMarkName, final String endMarkName);

	@JsMethod
	public abstract double now();

	@JsMethod
	public abstract void setResourceTimingBufferSize(final double maxSize);

	@JsMethod
	public abstract Object toJSON();
}
