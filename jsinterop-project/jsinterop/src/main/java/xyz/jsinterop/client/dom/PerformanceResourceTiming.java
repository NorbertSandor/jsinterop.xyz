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
public interface PerformanceResourceTiming extends PerformanceEntry {
	@JsProperty
	public abstract double getConnectEnd();

	@JsProperty
	public abstract void setConnectEnd(final double value);

	@JsProperty
	public abstract double getConnectStart();

	@JsProperty
	public abstract void setConnectStart(final double value);

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
	public abstract String getInitiatorType();

	@JsProperty
	public abstract void setInitiatorType(final String value);

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
}
