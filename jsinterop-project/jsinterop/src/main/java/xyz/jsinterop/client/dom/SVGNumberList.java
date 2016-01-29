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
public interface SVGNumberList {
	@JsProperty
	public abstract double getNumberOfItems();

	@JsProperty
	public abstract void setNumberOfItems(final double value);

	@JsMethod
	public abstract SVGNumber appendItem(final SVGNumber newItem);

	@JsMethod
	public abstract void clear();

	@JsMethod
	public abstract SVGNumber getItem(final double index);

	@JsMethod
	public abstract SVGNumber initialize(final SVGNumber newItem);

	@JsMethod
	public abstract SVGNumber insertItemBefore(final SVGNumber newItem, final double index);

	@JsMethod
	public abstract SVGNumber removeItem(final double index);

	@JsMethod
	public abstract SVGNumber replaceItem(final SVGNumber newItem, final double index);
}
