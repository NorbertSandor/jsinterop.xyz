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
public interface SVGLocatable {
	@JsProperty
	public abstract SVGElement getFarthestViewportElement();

	@JsProperty
	public abstract void setFarthestViewportElement(final SVGElement value);

	@JsProperty
	public abstract SVGElement getNearestViewportElement();

	@JsProperty
	public abstract void setNearestViewportElement(final SVGElement value);

	@JsMethod
	public abstract SVGRect getBBox();

	@JsMethod
	public abstract SVGMatrix getCTM();

	@JsMethod
	public abstract SVGMatrix getScreenCTM();

	@JsMethod
	public abstract SVGMatrix getTransformToElement(final SVGElement element);
}
