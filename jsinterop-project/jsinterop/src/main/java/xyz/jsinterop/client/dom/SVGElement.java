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
public interface SVGElement extends Element {
	@JsProperty
	public abstract String getId();

	@JsProperty
	public abstract void setId(final String value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOnclick();

	@JsProperty
	public abstract void setOnclick(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOndblclick();

	@JsProperty
	public abstract void setOndblclick(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract EventListener<FocusEvent> getOnfocusin();

	@JsProperty
	public abstract void setOnfocusin(final EventListener<FocusEvent> value);

	@JsProperty
	public abstract EventListener<FocusEvent> getOnfocusout();

	@JsProperty
	public abstract void setOnfocusout(final EventListener<FocusEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnload();

	@JsProperty
	public abstract void setOnload(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOnmousedown();

	@JsProperty
	public abstract void setOnmousedown(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOnmousemove();

	@JsProperty
	public abstract void setOnmousemove(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOnmouseout();

	@JsProperty
	public abstract void setOnmouseout(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOnmouseover();

	@JsProperty
	public abstract void setOnmouseover(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOnmouseup();

	@JsProperty
	public abstract void setOnmouseup(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract SVGSVGElement getOwnerSVGElement();

	@JsProperty
	public abstract void setOwnerSVGElement(final SVGSVGElement value);

	@JsProperty
	public abstract SVGElement getViewportElement();

	@JsProperty
	public abstract void setViewportElement(final SVGElement value);

	@JsProperty
	public abstract String getXmlbase();

	@JsProperty
	public abstract void setXmlbase(final String value);

	@JsProperty
	public abstract String getClassName();

	@JsProperty
	public abstract void setClassName(final String value);

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
//
//	@JsOverlay
//	public default void addEventListenerAriarequest(final EventListener<AriaRequestEvent> listener) {
//		addEventListener("ariarequest", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerAriarequest(final EventListener<AriaRequestEvent> listener, final boolean useCapture) {
//		addEventListener("ariarequest", listener, useCapture);
//	}

	@JsOverlay
	public default void addEventListenerClick(final EventListener<MouseEvent> listener) {
		addEventListener("click", listener);
	}

	@JsOverlay
	public default void addEventListenerClick(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("click", listener, useCapture);
	}

// Inherited
//	@JsOverlay
//	public default void addEventListenerCommand(final EventListener<CommandEvent> listener) {
//		addEventListener("command", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerCommand(final EventListener<CommandEvent> listener, final boolean useCapture) {
//		addEventListener("command", listener, useCapture);
//	}

	@JsOverlay
	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener) {
		addEventListener("dblclick", listener);
	}

	@JsOverlay
	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("dblclick", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerFocusin(final EventListener<FocusEvent> listener) {
		addEventListener("focusin", listener);
	}

	@JsOverlay
	public default void addEventListenerFocusin(final EventListener<FocusEvent> listener, final boolean useCapture) {
		addEventListener("focusin", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerFocusout(final EventListener<FocusEvent> listener) {
		addEventListener("focusout", listener);
	}

	@JsOverlay
	public default void addEventListenerFocusout(final EventListener<FocusEvent> listener, final boolean useCapture) {
		addEventListener("focusout", listener, useCapture);
	}

// Inherited
//	@JsOverlay
//	public default void addEventListenerGotpointercapture(final EventListener<PointerEvent> listener) {
//		addEventListener("gotpointercapture", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerGotpointercapture(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("gotpointercapture", listener, useCapture);
//	}

	@JsOverlay
	public default void addEventListenerLoad(final EventListener<Event> listener) {
		addEventListener("load", listener);
	}

	@JsOverlay
	public default void addEventListenerLoad(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("load", listener, useCapture);
	}

// Inherited
//	@JsOverlay
//	public default void addEventListenerLostpointercapture(final EventListener<PointerEvent> listener) {
//		addEventListener("lostpointercapture", listener);
//	}
//
//	@JsOverlay
//	public default void addEventListenerLostpointercapture(final EventListener<PointerEvent> listener, final boolean useCapture) {
//		addEventListener("lostpointercapture", listener, useCapture);
//	}

	@JsOverlay
	public default void addEventListenerMousedown(final EventListener<MouseEvent> listener) {
		addEventListener("mousedown", listener);
	}

	@JsOverlay
	public default void addEventListenerMousedown(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mousedown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMousemove(final EventListener<MouseEvent> listener) {
		addEventListener("mousemove", listener);
	}

	@JsOverlay
	public default void addEventListenerMousemove(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mousemove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseout(final EventListener<MouseEvent> listener) {
		addEventListener("mouseout", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseout(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseout", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseover(final EventListener<MouseEvent> listener) {
		addEventListener("mouseover", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseover(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseover", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseup(final EventListener<MouseEvent> listener) {
		addEventListener("mouseup", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseup(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseup", listener, useCapture);
	}

// Inherited
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
//
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

// Inherited
//	@JsMethod
//	public abstract void addEventListener(final String type, final EventListener<?> listener);
//
//	@JsMethod
//	public abstract void addEventListener(final String type, final EventListenerObject listener);
//
//	@JsMethod
//	public abstract void addEventListener(final String type, final EventListener<?> listener, final boolean useCapture);
//
//	@JsMethod
//	public abstract void addEventListener(final String type, final EventListenerObject listener,
//			final boolean useCapture);
}
