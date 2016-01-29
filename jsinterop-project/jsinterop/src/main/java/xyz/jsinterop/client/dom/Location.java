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
public interface Location {
	@JsProperty
	public abstract String getHash();

	@JsProperty
	public abstract void setHash(final String value);

	@JsProperty
	public abstract String getHost();

	@JsProperty
	public abstract void setHost(final String value);

	@JsProperty
	public abstract String getHostname();

	@JsProperty
	public abstract void setHostname(final String value);

	@JsProperty
	public abstract String getHref();

	@JsProperty
	public abstract void setHref(final String value);

	@JsProperty
	public abstract String getOrigin();

	@JsProperty
	public abstract void setOrigin(final String value);

	@JsProperty
	public abstract String getPathname();

	@JsProperty
	public abstract void setPathname(final String value);

	@JsProperty
	public abstract String getPort();

	@JsProperty
	public abstract void setPort(final String value);

	@JsProperty
	public abstract String getProtocol();

	@JsProperty
	public abstract void setProtocol(final String value);

	@JsProperty
	public abstract String getSearch();

	@JsProperty
	public abstract void setSearch(final String value);

	@JsMethod
	public abstract void assign(final String url);

	@JsMethod
	public abstract void reload();

	@JsMethod
	public abstract void reload(final boolean forcedReload);

	@JsMethod
	public abstract void replace(final String url);

	@JsMethod
	public abstract String toString();
}
