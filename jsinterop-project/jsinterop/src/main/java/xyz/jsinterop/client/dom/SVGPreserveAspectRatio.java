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
public interface SVGPreserveAspectRatio {
	@JsProperty
	public abstract double getAlign();

	@JsProperty
	public abstract void setAlign(final double value);

	@JsProperty
	public abstract double getMeetOrSlice();

	@JsProperty
	public abstract void setMeetOrSlice(final double value);

	@JsProperty
	public abstract double getSVG_MEETORSLICE_MEET();

	@JsProperty
	public abstract void setSVG_MEETORSLICE_MEET(final double value);

	@JsProperty
	public abstract double getSVG_MEETORSLICE_SLICE();

	@JsProperty
	public abstract void setSVG_MEETORSLICE_SLICE(final double value);

	@JsProperty
	public abstract double getSVG_MEETORSLICE_UNKNOWN();

	@JsProperty
	public abstract void setSVG_MEETORSLICE_UNKNOWN(final double value);

	@JsProperty
	public abstract double getSVG_PRESERVEASPECTRATIO_NONE();

	@JsProperty
	public abstract void setSVG_PRESERVEASPECTRATIO_NONE(final double value);

	@JsProperty
	public abstract double getSVG_PRESERVEASPECTRATIO_UNKNOWN();

	@JsProperty
	public abstract void setSVG_PRESERVEASPECTRATIO_UNKNOWN(final double value);

	@JsProperty
	public abstract double getSVG_PRESERVEASPECTRATIO_XMAXYMAX();

	@JsProperty
	public abstract void setSVG_PRESERVEASPECTRATIO_XMAXYMAX(final double value);

	@JsProperty
	public abstract double getSVG_PRESERVEASPECTRATIO_XMAXYMID();

	@JsProperty
	public abstract void setSVG_PRESERVEASPECTRATIO_XMAXYMID(final double value);

	@JsProperty
	public abstract double getSVG_PRESERVEASPECTRATIO_XMAXYMIN();

	@JsProperty
	public abstract void setSVG_PRESERVEASPECTRATIO_XMAXYMIN(final double value);

	@JsProperty
	public abstract double getSVG_PRESERVEASPECTRATIO_XMIDYMAX();

	@JsProperty
	public abstract void setSVG_PRESERVEASPECTRATIO_XMIDYMAX(final double value);

	@JsProperty
	public abstract double getSVG_PRESERVEASPECTRATIO_XMIDYMID();

	@JsProperty
	public abstract void setSVG_PRESERVEASPECTRATIO_XMIDYMID(final double value);

	@JsProperty
	public abstract double getSVG_PRESERVEASPECTRATIO_XMIDYMIN();

	@JsProperty
	public abstract void setSVG_PRESERVEASPECTRATIO_XMIDYMIN(final double value);

	@JsProperty
	public abstract double getSVG_PRESERVEASPECTRATIO_XMINYMAX();

	@JsProperty
	public abstract void setSVG_PRESERVEASPECTRATIO_XMINYMAX(final double value);

	@JsProperty
	public abstract double getSVG_PRESERVEASPECTRATIO_XMINYMID();

	@JsProperty
	public abstract void setSVG_PRESERVEASPECTRATIO_XMINYMID(final double value);

	@JsProperty
	public abstract double getSVG_PRESERVEASPECTRATIO_XMINYMIN();

	@JsProperty
	public abstract void setSVG_PRESERVEASPECTRATIO_XMINYMIN(final double value);
}
