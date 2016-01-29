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
public interface MSHTMLWebViewElement extends HTMLElement {
	@JsProperty
	public abstract boolean isCanGoBack();

	@JsProperty
	public abstract void setCanGoBack(final boolean value);

	@JsProperty
	public abstract boolean isCanGoForward();

	@JsProperty
	public abstract void setCanGoForward(final boolean value);

	@JsProperty
	public abstract boolean isContainsFullScreenElement();

	@JsProperty
	public abstract void setContainsFullScreenElement(final boolean value);

	@JsProperty
	public abstract String getDocumentTitle();

	@JsProperty
	public abstract void setDocumentTitle(final String value);

	@JsProperty
	public abstract double getHeight();

	@JsProperty
	public abstract void setHeight(final double value);

	@JsProperty
	public abstract MSWebViewSettings getSettings();

	@JsProperty
	public abstract void setSettings(final MSWebViewSettings value);

	@JsProperty
	public abstract String getSrc();

	@JsProperty
	public abstract void setSrc(final String value);

	@JsProperty
	public abstract double getWidth();

	@JsProperty
	public abstract void setWidth(final double value);

	@JsMethod
	public abstract void addWebAllowedObject(final String name, final Object applicationObject);

	@JsMethod
	public abstract String buildLocalStreamUri(final String contentIdentifier, final String relativePath);

	@JsMethod
	public abstract MSWebViewAsyncOperation capturePreviewToBlobAsync();

	@JsMethod
	public abstract MSWebViewAsyncOperation captureSelectedContentToDataPackageAsync();

	@JsMethod
	public abstract DeferredPermissionRequest getDeferredPermissionRequestById(final double id);

	@JsMethod
	public abstract Object getDeferredPermissionRequests();

	@JsMethod
	public abstract void goBack();

	@JsMethod
	public abstract void goForward();

	@JsMethod
	public abstract MSWebViewAsyncOperation invokeScriptAsync(final String scriptName);

	@JsMethod
	public abstract MSWebViewAsyncOperation invokeScriptAsync(final String scriptName, final Object args);

	@JsMethod
	public abstract void navigate(final String uri);

	@JsMethod
	public abstract void navigateToLocalStreamUri(final String source, final Object streamResolver);

	@JsMethod
	public abstract void navigateToString(final String contents);

	@JsMethod
	public abstract void navigateWithHttpRequestMessage(final Object requestMessage);

	@JsMethod
	public abstract void refresh();

	@JsMethod
	public abstract void stop();
}
