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
public interface SVGTextContentElement
		extends SVGElement, SVGStylable, SVGTests, SVGLangSpace, SVGExternalResourcesRequired {
	@JsProperty
	public abstract SVGAnimatedEnumeration getLengthAdjust();

	@JsProperty
	public abstract void setLengthAdjust(final SVGAnimatedEnumeration value);

	@JsProperty
	public abstract SVGAnimatedLength getTextLength();

	@JsProperty
	public abstract void setTextLength(final SVGAnimatedLength value);

	@JsProperty
	public abstract double getLENGTHADJUST_SPACING();

	@JsProperty
	public abstract void setLENGTHADJUST_SPACING(final double value);

	@JsProperty
	public abstract double getLENGTHADJUST_SPACINGANDGLYPHS();

	@JsProperty
	public abstract void setLENGTHADJUST_SPACINGANDGLYPHS(final double value);

	@JsProperty
	public abstract double getLENGTHADJUST_UNKNOWN();

	@JsProperty
	public abstract void setLENGTHADJUST_UNKNOWN(final double value);

	@JsMethod
	public abstract double getCharNumAtPosition(final SVGPoint point);

	@JsMethod
	public abstract double getComputedTextLength();

	@JsMethod
	public abstract SVGPoint getEndPositionOfChar(final double charnum);

	@JsMethod
	public abstract SVGRect getExtentOfChar(final double charnum);

	@JsMethod
	public abstract double getNumberOfChars();

	@JsMethod
	public abstract double getRotationOfChar(final double charnum);

	@JsMethod
	public abstract SVGPoint getStartPositionOfChar(final double charnum);

	@JsMethod
	public abstract double getSubStringLength(final double charnum, final double nchars);

	@JsMethod
	public abstract void selectSubString(final double charnum, final double nchars);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener, final boolean useCapture);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener,
			final boolean useCapture);
}
