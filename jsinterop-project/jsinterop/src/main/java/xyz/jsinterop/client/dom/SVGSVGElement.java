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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface SVGSVGElement extends SVGElement, DocumentEvent, SVGLocatable, SVGTests, SVGStylable, SVGLangSpace,
		SVGExternalResourcesRequired, SVGFitToViewBox, SVGZoomAndPan {
	@JsProperty
	public abstract String getContentScriptType();

	@JsProperty
	public abstract void setContentScriptType(final String value);

	@JsProperty
	public abstract String getContentStyleType();

	@JsProperty
	public abstract void setContentStyleType(final String value);

	@JsProperty
	public abstract double getCurrentScale();

	@JsProperty
	public abstract void setCurrentScale(final double value);

	@JsProperty
	public abstract SVGPoint getCurrentTranslate();

	@JsProperty
	public abstract void setCurrentTranslate(final SVGPoint value);

	@JsProperty
	public abstract SVGAnimatedLength getHeight();

	@JsProperty
	public abstract void setHeight(final SVGAnimatedLength value);

	@JsProperty
	public abstract EventListener<Event> getOnabort();

	@JsProperty
	public abstract void setOnabort(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnerror();

	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOnresize();

	@JsProperty
	public abstract void setOnresize(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOnscroll();

	@JsProperty
	public abstract void setOnscroll(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnunload();

	@JsProperty
	public abstract void setOnunload(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<SVGZoomEvent> getOnzoom();

	@JsProperty
	public abstract void setOnzoom(final EventListener<SVGZoomEvent> value);

	@JsProperty
	public abstract double getPixelUnitToMillimeterX();

	@JsProperty
	public abstract void setPixelUnitToMillimeterX(final double value);

	@JsProperty
	public abstract double getPixelUnitToMillimeterY();

	@JsProperty
	public abstract void setPixelUnitToMillimeterY(final double value);

	@JsProperty
	public abstract double getScreenPixelToMillimeterX();

	@JsProperty
	public abstract void setScreenPixelToMillimeterX(final double value);

	@JsProperty
	public abstract double getScreenPixelToMillimeterY();

	@JsProperty
	public abstract void setScreenPixelToMillimeterY(final double value);

	@JsProperty
	public abstract SVGRect getViewport();

	@JsProperty
	public abstract void setViewport(final SVGRect value);

	@JsProperty
	public abstract SVGAnimatedLength getWidth();

	@JsProperty
	public abstract void setWidth(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getX();

	@JsProperty
	public abstract void setX(final SVGAnimatedLength value);

	@JsProperty
	public abstract SVGAnimatedLength getY();

	@JsProperty
	public abstract void setY(final SVGAnimatedLength value);

	@JsMethod
	public abstract boolean checkEnclosure(final SVGElement element, final SVGRect rect);

	@JsMethod
	public abstract boolean checkIntersection(final SVGElement element, final SVGRect rect);

	@JsMethod
	public abstract SVGAngle createSVGAngle();

	@JsMethod
	public abstract SVGLength createSVGLength();

	@JsMethod
	public abstract SVGMatrix createSVGMatrix();

	@JsMethod
	public abstract SVGNumber createSVGNumber();

	@JsMethod
	public abstract SVGPoint createSVGPoint();

	@JsMethod
	public abstract SVGRect createSVGRect();

	@JsMethod
	public abstract SVGTransform createSVGTransform();

	@JsMethod
	public abstract SVGTransform createSVGTransformFromMatrix(final SVGMatrix matrix);

	@JsMethod
	public abstract void deselectAll();

	@JsMethod
	public abstract void forceRedraw();

	@JsMethod
	public abstract CSSStyleDeclaration getComputedStyle(final Element elt);

	@JsMethod
	public abstract CSSStyleDeclaration getComputedStyle(final Element elt, final String pseudoElt);

	@JsMethod
	public abstract double getCurrentTime();

	@JsMethod
	public abstract Element getElementById(final String elementId);

	@JsMethod
	public abstract NodeList getEnclosureList(final SVGRect rect, final SVGElement referenceElement);

	@JsMethod
	public abstract NodeList getIntersectionList(final SVGRect rect, final SVGElement referenceElement);

	@JsMethod
	public abstract void pauseAnimations();

	@JsMethod
	public abstract void setCurrentTime(final double seconds);

	@JsMethod
	public abstract double suspendRedraw(final double maxWaitMilliseconds);

	@JsMethod
	public abstract void unpauseAnimations();

	@JsMethod
	public abstract void unsuspendRedraw(final double suspendHandleID);

	@JsMethod
	public abstract void unsuspendRedrawAll();

// Inherited
//	@JsOverlay
//	public default void addEventListenerMSGestureChange(final EventListener<MSGestureEvent> listener) {
//		addEventListener("MSGestureChange", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGestureChange(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
//		addEventListener("MSGestureChange", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGestureDoubleTap(final EventListener<MSGestureEvent> listener) {
//		addEventListener("MSGestureDoubleTap", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGestureDoubleTap(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
//		addEventListener("MSGestureDoubleTap", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGestureEnd(final EventListener<MSGestureEvent> listener) {
//		addEventListener("MSGestureEnd", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGestureEnd(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
//		addEventListener("MSGestureEnd", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGestureHold(final EventListener<MSGestureEvent> listener) {
//		addEventListener("MSGestureHold", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGestureHold(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
//		addEventListener("MSGestureHold", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGestureStart(final EventListener<MSGestureEvent> listener) {
//		addEventListener("MSGestureStart", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGestureStart(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
//		addEventListener("MSGestureStart", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGestureTap(final EventListener<MSGestureEvent> listener) {
//		addEventListener("MSGestureTap", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGestureTap(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
//		addEventListener("MSGestureTap", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGotPointerCapture(final EventListener<MSPointerEvent> listener) {
//		addEventListener("MSGotPointerCapture", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSGotPointerCapture(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
//		addEventListener("MSGotPointerCapture", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener) {
//		addEventListener("MSInertiaStart", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
//		addEventListener("MSInertiaStart", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSLostPointerCapture(final EventListener<MSPointerEvent> listener) {
//		addEventListener("MSLostPointerCapture", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSLostPointerCapture(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
//		addEventListener("MSLostPointerCapture", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerCancel(final EventListener<MSPointerEvent> listener) {
//		addEventListener("MSPointerCancel", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerCancel(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
//		addEventListener("MSPointerCancel", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerDown(final EventListener<MSPointerEvent> listener) {
//		addEventListener("MSPointerDown", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerDown(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
//		addEventListener("MSPointerDown", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerEnter(final EventListener<MSPointerEvent> listener) {
//		addEventListener("MSPointerEnter", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerEnter(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
//		addEventListener("MSPointerEnter", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerLeave(final EventListener<MSPointerEvent> listener) {
//		addEventListener("MSPointerLeave", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerLeave(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
//		addEventListener("MSPointerLeave", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerMove(final EventListener<MSPointerEvent> listener) {
//		addEventListener("MSPointerMove", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerMove(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
//		addEventListener("MSPointerMove", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerOut(final EventListener<MSPointerEvent> listener) {
//		addEventListener("MSPointerOut", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerOut(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
//		addEventListener("MSPointerOut", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerOver(final EventListener<MSPointerEvent> listener) {
//		addEventListener("MSPointerOver", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerOver(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
//		addEventListener("MSPointerOver", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerUp(final EventListener<MSPointerEvent> listener) {
//		addEventListener("MSPointerUp", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMSPointerUp(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
//		addEventListener("MSPointerUp", listener, useCapture);
//	}

	@JsOverlay
	public default void addEventListenerSVGAbort(final EventListener<Event> listener) {
		addEventListener("SVGAbort", listener);
	}

	@JsOverlay
	public default void addEventListenerSVGAbort(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("SVGAbort", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSVGError(final EventListener<Event> listener) {
		addEventListener("SVGError", listener);
	}

	@JsOverlay
	public default void addEventListenerSVGError(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("SVGError", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSVGUnload(final EventListener<Event> listener) {
		addEventListener("SVGUnload", listener);
	}

	@JsOverlay
	public default void addEventListenerSVGUnload(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("SVGUnload", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSVGZoom(final EventListener<SVGZoomEvent> listener) {
		addEventListener("SVGZoom", listener);
	}

	@JsOverlay
	public default void addEventListenerSVGZoom(final EventListener<SVGZoomEvent> listener, final boolean useCapture) {
		addEventListener("SVGZoom", listener, useCapture);
	}

// Inherited
//	@JsOverlay
//	public default void addEventListenerAriarequest(final EventListener<AriaRequestEvent> listener) {
//		addEventListener("ariarequest", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerAriarequest(final EventListener<AriaRequestEvent> listener, final boolean useCapture) {
//		addEventListener("ariarequest", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerClick(final EventListener<MouseEvent> listener) {
//		addEventListener("click", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerClick(final EventListener<MouseEvent> listener, final boolean useCapture) {
//		addEventListener("click", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerCommand(final EventListener<CommandEvent> listener) {
//		addEventListener("command", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerCommand(final EventListener<CommandEvent> listener, final boolean useCapture) {
//		addEventListener("command", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener) {
//		addEventListener("dblclick", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener, final boolean useCapture) {
//		addEventListener("dblclick", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerFocusin(final EventListener<FocusEvent> listener) {
//		addEventListener("focusin", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerFocusin(final EventListener<FocusEvent> listener, final boolean useCapture) {
//		addEventListener("focusin", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerFocusout(final EventListener<FocusEvent> listener) {
//		addEventListener("focusout", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerFocusout(final EventListener<FocusEvent> listener, final boolean useCapture) {
//		addEventListener("focusout", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerGotpointercapture(final EventListener<PointerEvent> listener) {
//		addEventListener("gotpointercapture", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerGotpointercapture(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("gotpointercapture", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerLoad(final EventListener<Event> listener) {
//		addEventListener("load", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerLoad(final EventListener<Event> listener, final boolean useCapture) {
//		addEventListener("load", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerLostpointercapture(final EventListener<PointerEvent> listener) {
//		addEventListener("lostpointercapture", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerLostpointercapture(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("lostpointercapture", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMousedown(final EventListener<MouseEvent> listener) {
//		addEventListener("mousedown", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMousedown(final EventListener<MouseEvent> listener, final boolean useCapture) {
//		addEventListener("mousedown", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMousemove(final EventListener<MouseEvent> listener) {
//		addEventListener("mousemove", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMousemove(final EventListener<MouseEvent> listener, final boolean useCapture) {
//		addEventListener("mousemove", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMouseout(final EventListener<MouseEvent> listener) {
//		addEventListener("mouseout", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMouseout(final EventListener<MouseEvent> listener, final boolean useCapture) {
//		addEventListener("mouseout", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMouseover(final EventListener<MouseEvent> listener) {
//		addEventListener("mouseover", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMouseover(final EventListener<MouseEvent> listener, final boolean useCapture) {
//		addEventListener("mouseover", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMouseup(final EventListener<MouseEvent> listener) {
//		addEventListener("mouseup", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerMouseup(final EventListener<MouseEvent> listener, final boolean useCapture) {
//		addEventListener("mouseup", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointercancel(final EventListener<PointerEvent> listener) {
//		addEventListener("pointercancel", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointercancel(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("pointercancel", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerdown(final EventListener<PointerEvent> listener) {
//		addEventListener("pointerdown", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerdown(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("pointerdown", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerenter(final EventListener<PointerEvent> listener) {
//		addEventListener("pointerenter", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerenter(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("pointerenter", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerleave(final EventListener<PointerEvent> listener) {
//		addEventListener("pointerleave", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerleave(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("pointerleave", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointermove(final EventListener<PointerEvent> listener) {
//		addEventListener("pointermove", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointermove(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("pointermove", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerout(final EventListener<PointerEvent> listener) {
//		addEventListener("pointerout", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerout(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("pointerout", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerover(final EventListener<PointerEvent> listener) {
//		addEventListener("pointerover", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerover(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("pointerover", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerup(final EventListener<PointerEvent> listener) {
//		addEventListener("pointerup", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerPointerup(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("pointerup", listener, useCapture);
//	}

	@JsOverlay
	public default void addEventListenerResize(final EventListener<UIEvent> listener) {
		addEventListener("resize", listener);
	}

	@JsOverlay
	public default void addEventListenerResize(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("resize", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerScroll(final EventListener<UIEvent> listener) {
		addEventListener("scroll", listener);
	}

	@JsOverlay
	public default void addEventListenerScroll(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("scroll", listener, useCapture);
	}

// Inherited
//	@JsOverlay
//	public default void addEventListenerTouchcancel(final EventListener<TouchEvent> listener) {
//		addEventListener("touchcancel", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerTouchcancel(final EventListener<TouchEvent> listener, final boolean useCapture) {
//		addEventListener("touchcancel", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerTouchend(final EventListener<TouchEvent> listener) {
//		addEventListener("touchend", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerTouchend(final EventListener<TouchEvent> listener, final boolean useCapture) {
//		addEventListener("touchend", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerTouchmove(final EventListener<TouchEvent> listener) {
//		addEventListener("touchmove", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerTouchmove(final EventListener<TouchEvent> listener, final boolean useCapture) {
//		addEventListener("touchmove", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerTouchstart(final EventListener<TouchEvent> listener) {
//		addEventListener("touchstart", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerTouchstart(final EventListener<TouchEvent> listener, final boolean useCapture) {
//		addEventListener("touchstart", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerWebkitfullscreenchange(final EventListener<Event> listener) {
//		addEventListener("webkitfullscreenchange", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerWebkitfullscreenchange(final EventListener<Event> listener, final boolean useCapture) {
//		addEventListener("webkitfullscreenchange", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerWebkitfullscreenerror(final EventListener<Event> listener) {
//		addEventListener("webkitfullscreenerror", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerWebkitfullscreenerror(final EventListener<Event> listener, final boolean useCapture) {
//		addEventListener("webkitfullscreenerror", listener, useCapture);
//	}
//
//	@JsOverlay
//	public default void addEventListenerWheel(final EventListener<WheelEvent> listener) {
//		addEventListener("wheel", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerWheel(final EventListener<WheelEvent> listener, final boolean useCapture) {
//		addEventListener("wheel", listener, useCapture);
//	}

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
