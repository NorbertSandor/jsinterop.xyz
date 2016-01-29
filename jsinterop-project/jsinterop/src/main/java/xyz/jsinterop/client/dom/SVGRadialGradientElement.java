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
public interface SVGRadialGradientElement extends SVGGradientElement {
	@JsProperty
	public abstract SVGAnimatedLength getCx();

	@JsProperty
	public abstract void setCx(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getCy();

	@JsProperty
	public abstract void setCy(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getFx();

	@JsProperty
	public abstract void setFx(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getFy();

	@JsProperty
	public abstract void setFy(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getR();

	@JsProperty
	public abstract void setR(final SVGAnimatedLength value);
}
