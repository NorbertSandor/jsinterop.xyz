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
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface SVGPathElement extends SVGElement, SVGStylable, SVGTransformable, SVGTests, SVGLangSpace,
		SVGExternalResourcesRequired, SVGAnimatedPathData {
	@JsMethod
	public abstract SVGPathSegArcAbs createSVGPathSegArcAbs(final double x, final double y, final double r1,
			final double r2, final double angle, final boolean largeArcFlag, final boolean sweepFlag);

	@JsMethod
	public abstract SVGPathSegArcRel createSVGPathSegArcRel(final double x, final double y, final double r1,
			final double r2, final double angle, final boolean largeArcFlag, final boolean sweepFlag);

	@JsMethod
	public abstract SVGPathSegClosePath createSVGPathSegClosePath();

	@JsMethod
	public abstract SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(final double x, final double y,
			final double x1, final double y1, final double x2, final double y2);

	@JsMethod
	public abstract SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(final double x, final double y,
			final double x1, final double y1, final double x2, final double y2);

	@JsMethod
	public abstract SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(final double x,
			final double y, final double x2, final double y2);

	@JsMethod
	public abstract SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(final double x,
			final double y, final double x2, final double y2);

	@JsMethod
	public abstract SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(final double x, final double y,
			final double x1, final double y1);

	@JsMethod
	public abstract SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(final double x, final double y,
			final double x1, final double y1);

	@JsMethod
	public abstract SVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(final double x,
			final double y);

	@JsMethod
	public abstract SVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(final double x,
			final double y);

	@JsMethod
	public abstract SVGPathSegLinetoAbs createSVGPathSegLinetoAbs(final double x, final double y);

	@JsMethod
	public abstract SVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(final double x);

	@JsMethod
	public abstract SVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(final double x);

	@JsMethod
	public abstract SVGPathSegLinetoRel createSVGPathSegLinetoRel(final double x, final double y);

	@JsMethod
	public abstract SVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(final double y);

	@JsMethod
	public abstract SVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(final double y);

	@JsMethod
	public abstract SVGPathSegMovetoAbs createSVGPathSegMovetoAbs(final double x, final double y);

	@JsMethod
	public abstract SVGPathSegMovetoRel createSVGPathSegMovetoRel(final double x, final double y);

	@JsMethod
	public abstract double getPathSegAtLength(final double distance);

	@JsMethod
	public abstract SVGPoint getPointAtLength(final double distance);

	@JsMethod
	public abstract double getTotalLength();

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
