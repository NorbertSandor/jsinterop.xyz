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
public interface PerformanceNavigationTiming extends PerformanceEntry {
	@JsProperty
	public abstract double getConnectEnd();

	@JsProperty
	public abstract void setConnectEnd(final double value);

	@JsProperty
	public abstract double getConnectStart();

	@JsProperty
	public abstract void setConnectStart(final double value);

	@JsProperty
	public abstract double getDomComplete();

	@JsProperty
	public abstract void setDomComplete(final double value);

	@JsProperty
	public abstract double getDomContentLoadedEventEnd();

	@JsProperty
	public abstract void setDomContentLoadedEventEnd(final double value);

	@JsProperty
	public abstract double getDomContentLoadedEventStart();

	@JsProperty
	public abstract void setDomContentLoadedEventStart(final double value);

	@JsProperty
	public abstract double getDomInteractive();

	@JsProperty
	public abstract void setDomInteractive(final double value);

	@JsProperty
	public abstract double getDomLoading();

	@JsProperty
	public abstract void setDomLoading(final double value);

	@JsProperty
	public abstract double getDomainLookupEnd();

	@JsProperty
	public abstract void setDomainLookupEnd(final double value);

	@JsProperty
	public abstract double getDomainLookupStart();

	@JsProperty
	public abstract void setDomainLookupStart(final double value);

	@JsProperty
	public abstract double getFetchStart();

	@JsProperty
	public abstract void setFetchStart(final double value);

	@JsProperty
	public abstract double getLoadEventEnd();

	@JsProperty
	public abstract void setLoadEventEnd(final double value);

	@JsProperty
	public abstract double getLoadEventStart();

	@JsProperty
	public abstract void setLoadEventStart(final double value);

	@JsProperty
	public abstract double getNavigationStart();

	@JsProperty
	public abstract void setNavigationStart(final double value);

	@JsProperty
	public abstract double getRedirectCount();

	@JsProperty
	public abstract void setRedirectCount(final double value);

	@JsProperty
	public abstract double getRedirectEnd();

	@JsProperty
	public abstract void setRedirectEnd(final double value);

	@JsProperty
	public abstract double getRedirectStart();

	@JsProperty
	public abstract void setRedirectStart(final double value);

	@JsProperty
	public abstract double getRequestStart();

	@JsProperty
	public abstract void setRequestStart(final double value);

	@JsProperty
	public abstract double getResponseEnd();

	@JsProperty
	public abstract void setResponseEnd(final double value);

	@JsProperty
	public abstract double getResponseStart();

	@JsProperty
	public abstract void setResponseStart(final double value);

	@JsProperty
	public abstract String getType();

	@JsProperty
	public abstract void setType(final String value);

	@JsProperty
	public abstract double getUnloadEventEnd();

	@JsProperty
	public abstract void setUnloadEventEnd(final double value);

	@JsProperty
	public abstract double getUnloadEventStart();

	@JsProperty
	public abstract void setUnloadEventStart(final double value);
}
