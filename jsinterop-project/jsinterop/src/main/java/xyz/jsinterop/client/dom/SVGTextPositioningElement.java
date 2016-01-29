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
public interface SVGTextPositioningElement extends SVGTextContentElement {
	@JsProperty
	public abstract SVGAnimatedLengthList getDx();

	@JsProperty
	public abstract void setDx(final SVGAnimatedLengthList value);

	@JsProperty
	public abstract SVGAnimatedLengthList getDy();

	@JsProperty
	public abstract void setDy(final SVGAnimatedLengthList value);

	@JsProperty
	public abstract SVGAnimatedNumberList getRotate();

	@JsProperty
	public abstract void setRotate(final SVGAnimatedNumberList value);

	@JsProperty
	public abstract SVGAnimatedLengthList getX();

	@JsProperty
	public abstract void setX(final SVGAnimatedLengthList value);

	@JsProperty
	public abstract SVGAnimatedLengthList getY();

	@JsProperty
	public abstract void setY(final SVGAnimatedLengthList value);
}
