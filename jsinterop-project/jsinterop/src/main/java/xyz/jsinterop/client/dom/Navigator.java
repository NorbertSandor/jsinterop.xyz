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
public interface Navigator extends NavigatorID, NavigatorOnLine, NavigatorContentUtils, NavigatorStorageUtils,
		NavigatorGeolocation, MSNavigatorDoNotTrack, MSFileSaver {
	@JsProperty
	public abstract String getAppCodeName();

	@JsProperty
	public abstract void setAppCodeName(final String value);

	@JsProperty
	public abstract String getAppMinorVersion();

	@JsProperty
	public abstract void setAppMinorVersion(final String value);

	@JsProperty
	public abstract String getBrowserLanguage();

	@JsProperty
	public abstract void setBrowserLanguage(final String value);

	@JsProperty
	public abstract double getConnectionSpeed();

	@JsProperty
	public abstract void setConnectionSpeed(final double value);

	@JsProperty
	public abstract boolean isCookieEnabled();

	@JsProperty
	public abstract void setCookieEnabled(final boolean value);

	@JsProperty
	public abstract String getCpuClass();

	@JsProperty
	public abstract void setCpuClass(final String value);

	@JsProperty
	public abstract String getLanguage();

	@JsProperty
	public abstract void setLanguage(final String value);

	@JsProperty
	public abstract double getMaxTouchPoints();

	@JsProperty
	public abstract void setMaxTouchPoints(final double value);

	@JsProperty
	public abstract MSMimeTypesCollection getMimeTypes();

	@JsProperty
	public abstract void setMimeTypes(final MSMimeTypesCollection value);

	@JsProperty
	public abstract boolean isMsManipulationViewsEnabled();

	@JsProperty
	public abstract void setMsManipulationViewsEnabled(final boolean value);

	@JsProperty
	public abstract double getMsMaxTouchPoints();

	@JsProperty
	public abstract void setMsMaxTouchPoints(final double value);

	@JsProperty
	public abstract boolean isMsPointerEnabled();

	@JsProperty
	public abstract void setMsPointerEnabled(final boolean value);

	@JsProperty
	public abstract MSPluginsCollection getPlugins();

	@JsProperty
	public abstract void setPlugins(final MSPluginsCollection value);

	@JsProperty
	public abstract boolean isPointerEnabled();

	@JsProperty
	public abstract void setPointerEnabled(final boolean value);

	@JsProperty
	public abstract String getSystemLanguage();

	@JsProperty
	public abstract void setSystemLanguage(final String value);

	@JsProperty
	public abstract String getUserLanguage();

	@JsProperty
	public abstract void setUserLanguage(final String value);

	@JsProperty
	public abstract boolean isWebdriver();

	@JsProperty
	public abstract void setWebdriver(final boolean value);

	@JsMethod
	public abstract Object getGamepads();

	@JsMethod
	public abstract boolean javaEnabled();

	@JsMethod
	public abstract void msLaunchUri(final String uri);

	@JsMethod
	public abstract void msLaunchUri(final String uri, final MSLaunchUriCallback successCallback);

	@JsMethod
	public abstract void msLaunchUri(final String uri, final MSLaunchUriCallback successCallback,
			final MSLaunchUriCallback noHandlerCallback);

	@JsMethod
	public abstract boolean vibrate(final Object pattern);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener, final boolean useCapture);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener,
			final boolean useCapture);
}
