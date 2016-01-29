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
public interface NavigatorID {
	@JsProperty
	public abstract String getAppName();

	@JsProperty
	public abstract void setAppName(final String value);

	@JsProperty
	public abstract String getAppVersion();

	@JsProperty
	public abstract void setAppVersion(final String value);

	@JsProperty
	public abstract String getPlatform();

	@JsProperty
	public abstract void setPlatform(final String value);

	@JsProperty
	public abstract String getProduct();

	@JsProperty
	public abstract void setProduct(final String value);

	@JsProperty
	public abstract String getProductSub();

	@JsProperty
	public abstract void setProductSub(final String value);

	@JsProperty
	public abstract String getUserAgent();

	@JsProperty
	public abstract void setUserAgent(final String value);

	@JsProperty
	public abstract String getVendor();

	@JsProperty
	public abstract void setVendor(final String value);

	@JsProperty
	public abstract String getVendorSub();

	@JsProperty
	public abstract void setVendorSub(final String value);
}
