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
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface MSNavigatorDoNotTrack {
	@JsMethod
	public abstract boolean confirmSiteSpecificTrackingException(final ConfirmSiteSpecificExceptionsInformation args);

	@JsMethod
	public abstract boolean confirmWebWideTrackingException(final ExceptionInformation args);

	@JsMethod
	public abstract void removeSiteSpecificTrackingException(final ExceptionInformation args);

	@JsMethod
	public abstract void removeWebWideTrackingException(final ExceptionInformation args);

	@JsMethod
	public abstract void storeSiteSpecificTrackingException(final StoreSiteSpecificExceptionsInformation args);

	@JsMethod
	public abstract void storeWebWideTrackingException(final StoreExceptionsInformation args);
}
