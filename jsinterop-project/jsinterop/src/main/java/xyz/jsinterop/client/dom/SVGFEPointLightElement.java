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
public interface SVGFEPointLightElement extends SVGElement {
	@JsProperty
	public abstract SVGAnimatedNumber getX();

	@JsProperty
	public abstract void setX(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getY();

	@JsProperty
	public abstract void setY(final SVGAnimatedNumber value);

	@JsProperty
	public abstract SVGAnimatedNumber getZ();

	@JsProperty
	public abstract void setZ(final SVGAnimatedNumber value);
}
