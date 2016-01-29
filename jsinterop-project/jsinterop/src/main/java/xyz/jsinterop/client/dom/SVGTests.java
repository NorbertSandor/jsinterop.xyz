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
public interface SVGTests {
	@JsProperty
	public abstract SVGStringList getRequiredExtensions();

	@JsProperty
	public abstract void setRequiredExtensions(final SVGStringList value);

	@JsProperty
	public abstract SVGStringList getRequiredFeatures();

	@JsProperty
	public abstract void setRequiredFeatures(final SVGStringList value);

	@JsProperty
	public abstract SVGStringList getSystemLanguage();

	@JsProperty
	public abstract void setSystemLanguage(final SVGStringList value);

	@JsMethod
	public abstract boolean hasExtension(final String extension);
}
