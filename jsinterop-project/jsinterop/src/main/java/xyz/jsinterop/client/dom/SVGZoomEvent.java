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
public interface SVGZoomEvent extends UIEvent {
	@JsProperty
	public abstract double getNewScale();

	@JsProperty
	public abstract void setNewScale(final double value);

	@JsProperty
	public abstract SVGPoint getNewTranslate();

	@JsProperty
	public abstract void setNewTranslate(final SVGPoint value);

	@JsProperty
	public abstract double getPreviousScale();

	@JsProperty
	public abstract void setPreviousScale(final double value);

	@JsProperty
	public abstract SVGPoint getPreviousTranslate();

	@JsProperty
	public abstract void setPreviousTranslate(final SVGPoint value);

	@JsProperty
	public abstract SVGRect getZoomRectScreen();

	@JsProperty
	public abstract void setZoomRectScreen(final SVGRect value);
}
