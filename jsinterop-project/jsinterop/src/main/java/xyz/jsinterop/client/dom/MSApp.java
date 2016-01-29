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
public interface MSApp {
	@JsProperty
	public abstract String getCURRENT();

	@JsProperty
	public abstract void setCURRENT(final String value);

	@JsProperty
	public abstract String getHIGH();

	@JsProperty
	public abstract void setHIGH(final String value);

	@JsProperty
	public abstract String getIDLE();

	@JsProperty
	public abstract void setIDLE(final String value);

	@JsProperty
	public abstract String getNORMAL();

	@JsProperty
	public abstract void setNORMAL(final String value);

	@JsMethod
	public abstract MSAppAsyncOperation clearTemporaryWebDataAsync();

	@JsMethod
	public abstract Blob createBlobFromRandomAccessStream(final String type, final Object seeker);

	@JsMethod
	public abstract Object createDataPackage(final Object object);

	@JsMethod
	public abstract Object createDataPackageFromSelection();

	@JsMethod
	public abstract File createFileFromStorageFile(final Object storageFile);

	@JsMethod
	public abstract MSStream createStreamFromInputStream(final String type, final Object inputStream);

	@JsMethod
	public abstract void execAsyncAtPriority(final MSExecAtPriorityFunctionCallback asynchronousCallback,
			final String priority);

	@JsMethod
	public abstract void execAsyncAtPriority(final MSExecAtPriorityFunctionCallback asynchronousCallback,
			final String priority, final Object args);

	@JsMethod
	public abstract Object execAtPriority(final MSExecAtPriorityFunctionCallback synchronousCallback,
			final String priority);

	@JsMethod
	public abstract Object execAtPriority(final MSExecAtPriorityFunctionCallback synchronousCallback,
			final String priority, final Object args);

	@JsMethod
	public abstract String getCurrentPriority();

	@JsMethod
	public abstract Object getHtmlPrintDocumentSourceAsync(final Object htmlDoc);

	@JsMethod
	public abstract Object getViewId(final Object view);

	@JsMethod
	public abstract boolean isTaskScheduledAtPriorityOrHigher(final String priority);

	@JsMethod
	public abstract void pageHandlesAllApplicationActivations(final boolean enabled);

	@JsMethod
	public abstract void suppressSubdownloadCredentialPrompts(final boolean suppress);

	@JsMethod
	public abstract void terminateApp(final Object exceptionObject);
}
