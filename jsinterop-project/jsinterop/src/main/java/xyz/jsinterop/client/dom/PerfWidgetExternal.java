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
import xyz.jsinterop.client.core.Function;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface PerfWidgetExternal {
	@JsProperty
	public abstract double getActiveNetworkRequestCount();

	@JsProperty
	public abstract void setActiveNetworkRequestCount(final double value);

	@JsProperty
	public abstract double getAverageFrameTime();

	@JsProperty
	public abstract void setAverageFrameTime(final double value);

	@JsProperty
	public abstract double getAveragePaintTime();

	@JsProperty
	public abstract void setAveragePaintTime(final double value);

	@JsProperty
	public abstract boolean isExtraInformationEnabled();

	@JsProperty
	public abstract void setExtraInformationEnabled(final boolean value);

	@JsProperty
	public abstract boolean isIndependentRenderingEnabled();

	@JsProperty
	public abstract void setIndependentRenderingEnabled(final boolean value);

	@JsProperty
	public abstract String getIrDisablingContentString();

	@JsProperty
	public abstract void setIrDisablingContentString(final String value);

	@JsProperty
	public abstract boolean isIrStatusAvailable();

	@JsProperty
	public abstract void setIrStatusAvailable(final boolean value);

	@JsProperty
	public abstract double getMaxCpuSpeed();

	@JsProperty
	public abstract void setMaxCpuSpeed(final double value);

	@JsProperty
	public abstract double getPaintRequestsPerSecond();

	@JsProperty
	public abstract void setPaintRequestsPerSecond(final double value);

	@JsProperty
	public abstract double getPerformanceCounter();

	@JsProperty
	public abstract void setPerformanceCounter(final double value);

	@JsProperty
	public abstract double getPerformanceCounterFrequency();

	@JsProperty
	public abstract void setPerformanceCounterFrequency(final double value);

	@JsMethod
	public abstract void addEventListener(final String eventType, final Function callback);

	@JsMethod
	public abstract double getMemoryUsage();

	@JsMethod
	public abstract double getProcessCpuUsage();

	@JsMethod
	public abstract Object getRecentCpuUsage(final double last);

	@JsMethod
	public abstract Object getRecentFrames(final double last);

	@JsMethod
	public abstract Object getRecentMemoryUsage(final double last);

	@JsMethod
	public abstract Object getRecentPaintRequests(final double last);

	@JsMethod
	public abstract void removeEventListener(final String eventType, final Function callback);

	@JsMethod
	public abstract void repositionWindow(final double x, final double y);

	@JsMethod
	public abstract void resizeWindow(final double width, final double height);
}
