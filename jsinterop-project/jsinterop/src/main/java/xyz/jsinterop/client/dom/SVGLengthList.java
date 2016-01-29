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
public interface SVGLengthList {
	@JsProperty
	public abstract double getNumberOfItems();

	@JsProperty
	public abstract void setNumberOfItems(final double value);

	@JsMethod
	public abstract SVGLength appendItem(final SVGLength newItem);

	@JsMethod
	public abstract void clear();

	@JsMethod
	public abstract SVGLength getItem(final double index);

	@JsMethod
	public abstract SVGLength initialize(final SVGLength newItem);

	@JsMethod
	public abstract SVGLength insertItemBefore(final SVGLength newItem, final double index);

	@JsMethod
	public abstract SVGLength removeItem(final double index);

	@JsMethod
	public abstract SVGLength replaceItem(final SVGLength newItem, final double index);
}
