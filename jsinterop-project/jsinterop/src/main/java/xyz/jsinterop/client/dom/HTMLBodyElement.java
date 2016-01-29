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
public interface HTMLBodyElement extends HTMLElement {
	@JsProperty
	public abstract Object getALink();

	@JsProperty
	public abstract void setALink(final Object value);

	@JsProperty
	public abstract String getBackground();

	@JsProperty
	public abstract void setBackground(final String value);

	@JsProperty
	public abstract Object getBgColor();

	@JsProperty
	public abstract void setBgColor(final Object value);

	@JsProperty
	public abstract String getBgProperties();

	@JsProperty
	public abstract void setBgProperties(final String value);

	@JsProperty
	public abstract Object getLink();

	@JsProperty
	public abstract void setLink(final Object value);

	@JsProperty
	public abstract boolean isNoWrap();

	@JsProperty
	public abstract void setNoWrap(final boolean value);

	@JsProperty
	public abstract EventListener<Event> getOnafterprint();

	@JsProperty
	public abstract void setOnafterprint(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnbeforeprint();

	@JsProperty
	public abstract void setOnbeforeprint(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<BeforeUnloadEvent> getOnbeforeunload();

	@JsProperty
	public abstract void setOnbeforeunload(final EventListener<BeforeUnloadEvent> value);

	@JsProperty
	public abstract EventListener<FocusEvent> getOnblur();

	@JsProperty
	public abstract void setOnblur(final EventListener<FocusEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnerror();

	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<FocusEvent> getOnfocus();

	@JsProperty
	public abstract void setOnfocus(final EventListener<FocusEvent> value);

	@JsProperty
	public abstract EventListener<HashChangeEvent> getOnhashchange();

	@JsProperty
	public abstract void setOnhashchange(final EventListener<HashChangeEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnload();

	@JsProperty
	public abstract void setOnload(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<MessageEvent> getOnmessage();

	@JsProperty
	public abstract void setOnmessage(final EventListener<MessageEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnoffline();

	@JsProperty
	public abstract void setOnoffline(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnonline();

	@JsProperty
	public abstract void setOnonline(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnorientationchange();

	@JsProperty
	public abstract void setOnorientationchange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<PageTransitionEvent> getOnpagehide();

	@JsProperty
	public abstract void setOnpagehide(final EventListener<PageTransitionEvent> value);

	@JsProperty
	public abstract EventListener<PageTransitionEvent> getOnpageshow();

	@JsProperty
	public abstract void setOnpageshow(final EventListener<PageTransitionEvent> value);

	@JsProperty
	public abstract EventListener<PopStateEvent> getOnpopstate();

	@JsProperty
	public abstract void setOnpopstate(final EventListener<PopStateEvent> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOnresize();

	@JsProperty
	public abstract void setOnresize(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<StorageEvent> getOnstorage();

	@JsProperty
	public abstract void setOnstorage(final EventListener<StorageEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnunload();

	@JsProperty
	public abstract void setOnunload(final EventListener<Event> value);

	@JsProperty
	public abstract Object getText();

	@JsProperty
	public abstract void setText(final Object value);

	@JsProperty
	public abstract Object getVLink();

	@JsProperty
	public abstract void setVLink(final Object value);

	@JsMethod
	public abstract TextRange createTextRange();

	@JsOverlay
	public default void addEventListenerMSContentZoom(final EventListener<UIEvent> listener) {
		addEventListener("MSContentZoom", listener);
	}

	@JsOverlay
	public default void addEventListenerMSContentZoom(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("MSContentZoom", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureChange(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureChange", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureChange(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureChange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureDoubleTap(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureDoubleTap", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureDoubleTap(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureDoubleTap", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureEnd(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureEnd", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureEnd(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureEnd", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureHold(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureHold", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureHold(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureHold", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureStart(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureStart", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureStart(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureStart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureTap(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureTap", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureTap(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureTap", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGotPointerCapture(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSGotPointerCapture", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGotPointerCapture(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSGotPointerCapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSInertiaStart", listener);
	}

	@JsOverlay
	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSInertiaStart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSLostPointerCapture(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSLostPointerCapture", listener);
	}

	@JsOverlay
	public default void addEventListenerMSLostPointerCapture(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSLostPointerCapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSManipulationStateChanged(final EventListener<MSManipulationEvent> listener) {
		addEventListener("MSManipulationStateChanged", listener);
	}

	@JsOverlay
	public default void addEventListenerMSManipulationStateChanged(final EventListener<MSManipulationEvent> listener,
			final boolean useCapture) {
		addEventListener("MSManipulationStateChanged", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerCancel(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerCancel", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerCancel(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerCancel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerDown(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerDown", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerDown(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerDown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerEnter(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerEnter", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerEnter(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerEnter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerLeave(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerLeave", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerLeave(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerLeave", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerMove(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerMove", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerMove(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerMove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOut(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerOut", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOut(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerOut", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOver(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerOver", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOver(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerOver", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerUp(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerUp", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerUp(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerUp", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerAbort(final EventListener<UIEvent> listener) {
		addEventListener("abort", listener);
	}

	@JsOverlay
	public default void addEventListenerAbort(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("abort", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerActivate(final EventListener<UIEvent> listener) {
		addEventListener("activate", listener);
	}

	@JsOverlay
	public default void addEventListenerActivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("activate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerAfterprint(final EventListener<Event> listener) {
		addEventListener("afterprint", listener);
	}

	@JsOverlay
	public default void addEventListenerAfterprint(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("afterprint", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerAriarequest(final EventListener<AriaRequestEvent> listener) {
		addEventListener("ariarequest", listener);
	}

	@JsOverlay
	public default void addEventListenerAriarequest(final EventListener<AriaRequestEvent> listener, final boolean useCapture) {
		addEventListener("ariarequest", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforeactivate(final EventListener<UIEvent> listener) {
		addEventListener("beforeactivate", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforeactivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("beforeactivate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforecopy(final EventListener<DragEvent> listener) {
		addEventListener("beforecopy", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforecopy(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("beforecopy", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforecut(final EventListener<DragEvent> listener) {
		addEventListener("beforecut", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforecut(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("beforecut", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforedeactivate(final EventListener<UIEvent> listener) {
		addEventListener("beforedeactivate", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforedeactivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("beforedeactivate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforepaste(final EventListener<DragEvent> listener) {
		addEventListener("beforepaste", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforepaste(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("beforepaste", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforeprint(final EventListener<Event> listener) {
		addEventListener("beforeprint", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforeprint(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("beforeprint", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforeunload(final EventListener<BeforeUnloadEvent> listener) {
		addEventListener("beforeunload", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforeunload(final EventListener<BeforeUnloadEvent> listener, final boolean useCapture) {
		addEventListener("beforeunload", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBlur(final EventListener<FocusEvent> listener) {
		addEventListener("blur", listener);
	}

	@JsOverlay
	public default void addEventListenerBlur(final EventListener<FocusEvent> listener, final boolean useCapture) {
		addEventListener("blur", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCanplay(final EventListener<Event> listener) {
		addEventListener("canplay", listener);
	}

	@JsOverlay
	public default void addEventListenerCanplay(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("canplay", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCanplaythrough(final EventListener<Event> listener) {
		addEventListener("canplaythrough", listener);
	}

	@JsOverlay
	public default void addEventListenerCanplaythrough(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("canplaythrough", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerChange(final EventListener<Event> listener) {
		addEventListener("change", listener);
	}

	@JsOverlay
	public default void addEventListenerChange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("change", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerClick(final EventListener<MouseEvent> listener) {
		addEventListener("click", listener);
	}

	@JsOverlay
	public default void addEventListenerClick(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("click", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCommand(final EventListener<CommandEvent> listener) {
		addEventListener("command", listener);
	}

	@JsOverlay
	public default void addEventListenerCommand(final EventListener<CommandEvent> listener, final boolean useCapture) {
		addEventListener("command", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerContextmenu(final EventListener<PointerEvent> listener) {
		addEventListener("contextmenu", listener);
	}

	@JsOverlay
	public default void addEventListenerContextmenu(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("contextmenu", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCopy(final EventListener<DragEvent> listener) {
		addEventListener("copy", listener);
	}

	@JsOverlay
	public default void addEventListenerCopy(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("copy", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCuechange(final EventListener<Event> listener) {
		addEventListener("cuechange", listener);
	}

	@JsOverlay
	public default void addEventListenerCuechange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("cuechange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCut(final EventListener<DragEvent> listener) {
		addEventListener("cut", listener);
	}

	@JsOverlay
	public default void addEventListenerCut(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("cut", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener) {
		addEventListener("dblclick", listener);
	}

	@JsOverlay
	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("dblclick", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDeactivate(final EventListener<UIEvent> listener) {
		addEventListener("deactivate", listener);
	}

	@JsOverlay
	public default void addEventListenerDeactivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("deactivate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDrag(final EventListener<DragEvent> listener) {
		addEventListener("drag", listener);
	}

	@JsOverlay
	public default void addEventListenerDrag(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("drag", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragend(final EventListener<DragEvent> listener) {
		addEventListener("dragend", listener);
	}

	@JsOverlay
	public default void addEventListenerDragend(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragend", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragenter(final EventListener<DragEvent> listener) {
		addEventListener("dragenter", listener);
	}

	@JsOverlay
	public default void addEventListenerDragenter(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragenter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragleave(final EventListener<DragEvent> listener) {
		addEventListener("dragleave", listener);
	}

	@JsOverlay
	public default void addEventListenerDragleave(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragleave", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragover(final EventListener<DragEvent> listener) {
		addEventListener("dragover", listener);
	}

	@JsOverlay
	public default void addEventListenerDragover(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragover", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragstart(final EventListener<DragEvent> listener) {
		addEventListener("dragstart", listener);
	}

	@JsOverlay
	public default void addEventListenerDragstart(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDrop(final EventListener<DragEvent> listener) {
		addEventListener("drop", listener);
	}

	@JsOverlay
	public default void addEventListenerDrop(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("drop", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDurationchange(final EventListener<Event> listener) {
		addEventListener("durationchange", listener);
	}

	@JsOverlay
	public default void addEventListenerDurationchange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("durationchange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerEmptied(final EventListener<Event> listener) {
		addEventListener("emptied", listener);
	}

	@JsOverlay
	public default void addEventListenerEmptied(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("emptied", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerEnded(final EventListener<Event> listener) {
		addEventListener("ended", listener);
	}

	@JsOverlay
	public default void addEventListenerEnded(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("ended", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerError(final EventListener<ErrorEvent> listener) {
		addEventListener("error", listener);
	}

	@JsOverlay
	public default void addEventListenerError(final EventListener<ErrorEvent> listener, final boolean useCapture) {
		addEventListener("error", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerFocus(final EventListener<FocusEvent> listener) {
		addEventListener("focus", listener);
	}

	@JsOverlay
	public default void addEventListenerFocus(final EventListener<FocusEvent> listener, final boolean useCapture) {
		addEventListener("focus", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerGotpointercapture(final EventListener<PointerEvent> listener) {
		addEventListener("gotpointercapture", listener);
	}

	@JsOverlay
	public default void addEventListenerGotpointercapture(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("gotpointercapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerHashchange(final EventListener<HashChangeEvent> listener) {
		addEventListener("hashchange", listener);
	}

	@JsOverlay
	public default void addEventListenerHashchange(final EventListener<HashChangeEvent> listener, final boolean useCapture) {
		addEventListener("hashchange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerInput(final EventListener<Event> listener) {
		addEventListener("input", listener);
	}

	@JsOverlay
	public default void addEventListenerInput(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("input", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerKeydown(final EventListener<KeyboardEvent> listener) {
		addEventListener("keydown", listener);
	}

	@JsOverlay
	public default void addEventListenerKeydown(final EventListener<KeyboardEvent> listener, final boolean useCapture) {
		addEventListener("keydown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerKeypress(final EventListener<KeyboardEvent> listener) {
		addEventListener("keypress", listener);
	}

	@JsOverlay
	public default void addEventListenerKeypress(final EventListener<KeyboardEvent> listener, final boolean useCapture) {
		addEventListener("keypress", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerKeyup(final EventListener<KeyboardEvent> listener) {
		addEventListener("keyup", listener);
	}

	@JsOverlay
	public default void addEventListenerKeyup(final EventListener<KeyboardEvent> listener, final boolean useCapture) {
		addEventListener("keyup", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoad(final EventListener<Event> listener) {
		addEventListener("load", listener);
	}

	@JsOverlay
	public default void addEventListenerLoad(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("load", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoadeddata(final EventListener<Event> listener) {
		addEventListener("loadeddata", listener);
	}

	@JsOverlay
	public default void addEventListenerLoadeddata(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("loadeddata", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoadedmetadata(final EventListener<Event> listener) {
		addEventListener("loadedmetadata", listener);
	}

	@JsOverlay
	public default void addEventListenerLoadedmetadata(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("loadedmetadata", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoadstart(final EventListener<Event> listener) {
		addEventListener("loadstart", listener);
	}

	@JsOverlay
	public default void addEventListenerLoadstart(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("loadstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLostpointercapture(final EventListener<PointerEvent> listener) {
		addEventListener("lostpointercapture", listener);
	}

	@JsOverlay
	public default void addEventListenerLostpointercapture(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("lostpointercapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMessage(final EventListener<MessageEvent> listener) {
		addEventListener("message", listener);
	}

	@JsOverlay
	public default void addEventListenerMessage(final EventListener<MessageEvent> listener, final boolean useCapture) {
		addEventListener("message", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMousedown(final EventListener<MouseEvent> listener) {
		addEventListener("mousedown", listener);
	}

	@JsOverlay
	public default void addEventListenerMousedown(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mousedown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseenter(final EventListener<MouseEvent> listener) {
		addEventListener("mouseenter", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseenter(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseenter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseleave(final EventListener<MouseEvent> listener) {
		addEventListener("mouseleave", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseleave(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseleave", listener, useCapture);
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

	@JsOverlay
	public default void addEventListenerMousewheel(final EventListener<MouseWheelEvent> listener) {
		addEventListener("mousewheel", listener);
	}

	@JsOverlay
	public default void addEventListenerMousewheel(final EventListener<MouseWheelEvent> listener, final boolean useCapture) {
		addEventListener("mousewheel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerOffline(final EventListener<Event> listener) {
		addEventListener("offline", listener);
	}

	@JsOverlay
	public default void addEventListenerOffline(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("offline", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerOnline(final EventListener<Event> listener) {
		addEventListener("online", listener);
	}

	@JsOverlay
	public default void addEventListenerOnline(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("online", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerOrientationchange(final EventListener<Event> listener) {
		addEventListener("orientationchange", listener);
	}

	@JsOverlay
	public default void addEventListenerOrientationchange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("orientationchange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPagehide(final EventListener<PageTransitionEvent> listener) {
		addEventListener("pagehide", listener);
	}

	@JsOverlay
	public default void addEventListenerPagehide(final EventListener<PageTransitionEvent> listener, final boolean useCapture) {
		addEventListener("pagehide", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPageshow(final EventListener<PageTransitionEvent> listener) {
		addEventListener("pageshow", listener);
	}

	@JsOverlay
	public default void addEventListenerPageshow(final EventListener<PageTransitionEvent> listener, final boolean useCapture) {
		addEventListener("pageshow", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPaste(final EventListener<DragEvent> listener) {
		addEventListener("paste", listener);
	}

	@JsOverlay
	public default void addEventListenerPaste(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("paste", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPause(final EventListener<Event> listener) {
		addEventListener("pause", listener);
	}

	@JsOverlay
	public default void addEventListenerPause(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("pause", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPlay(final EventListener<Event> listener) {
		addEventListener("play", listener);
	}

	@JsOverlay
	public default void addEventListenerPlay(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("play", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPlaying(final EventListener<Event> listener) {
		addEventListener("playing", listener);
	}

	@JsOverlay
	public default void addEventListenerPlaying(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("playing", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointercancel(final EventListener<PointerEvent> listener) {
		addEventListener("pointercancel", listener);
	}

	@JsOverlay
	public default void addEventListenerPointercancel(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointercancel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerdown(final EventListener<PointerEvent> listener) {
		addEventListener("pointerdown", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerdown(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerdown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerenter(final EventListener<PointerEvent> listener) {
		addEventListener("pointerenter", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerenter(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerenter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerleave(final EventListener<PointerEvent> listener) {
		addEventListener("pointerleave", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerleave(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerleave", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointermove(final EventListener<PointerEvent> listener) {
		addEventListener("pointermove", listener);
	}

	@JsOverlay
	public default void addEventListenerPointermove(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointermove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerout(final EventListener<PointerEvent> listener) {
		addEventListener("pointerout", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerout(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerout", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerover(final EventListener<PointerEvent> listener) {
		addEventListener("pointerover", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerover(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerover", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerup(final EventListener<PointerEvent> listener) {
		addEventListener("pointerup", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerup(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerup", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPopstate(final EventListener<PopStateEvent> listener) {
		addEventListener("popstate", listener);
	}

	@JsOverlay
	public default void addEventListenerPopstate(final EventListener<PopStateEvent> listener, final boolean useCapture) {
		addEventListener("popstate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerProgress(final EventListener<ProgressEvent> listener) {
		addEventListener("progress", listener);
	}

	@JsOverlay
	public default void addEventListenerProgress(final EventListener<ProgressEvent> listener, final boolean useCapture) {
		addEventListener("progress", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerRatechange(final EventListener<Event> listener) {
		addEventListener("ratechange", listener);
	}

	@JsOverlay
	public default void addEventListenerRatechange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("ratechange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerReset(final EventListener<Event> listener) {
		addEventListener("reset", listener);
	}

	@JsOverlay
	public default void addEventListenerReset(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("reset", listener, useCapture);
	}

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

	@JsOverlay
	public default void addEventListenerSeeked(final EventListener<Event> listener) {
		addEventListener("seeked", listener);
	}

	@JsOverlay
	public default void addEventListenerSeeked(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("seeked", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSeeking(final EventListener<Event> listener) {
		addEventListener("seeking", listener);
	}

	@JsOverlay
	public default void addEventListenerSeeking(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("seeking", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSelect(final EventListener<UIEvent> listener) {
		addEventListener("select", listener);
	}

	@JsOverlay
	public default void addEventListenerSelect(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("select", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSelectstart(final EventListener<Event> listener) {
		addEventListener("selectstart", listener);
	}

	@JsOverlay
	public default void addEventListenerSelectstart(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("selectstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerStalled(final EventListener<Event> listener) {
		addEventListener("stalled", listener);
	}

	@JsOverlay
	public default void addEventListenerStalled(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("stalled", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerStorage(final EventListener<StorageEvent> listener) {
		addEventListener("storage", listener);
	}

	@JsOverlay
	public default void addEventListenerStorage(final EventListener<StorageEvent> listener, final boolean useCapture) {
		addEventListener("storage", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSubmit(final EventListener<Event> listener) {
		addEventListener("submit", listener);
	}

	@JsOverlay
	public default void addEventListenerSubmit(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("submit", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSuspend(final EventListener<Event> listener) {
		addEventListener("suspend", listener);
	}

	@JsOverlay
	public default void addEventListenerSuspend(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("suspend", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTimeupdate(final EventListener<Event> listener) {
		addEventListener("timeupdate", listener);
	}

	@JsOverlay
	public default void addEventListenerTimeupdate(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("timeupdate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchcancel(final EventListener<TouchEvent> listener) {
		addEventListener("touchcancel", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchcancel(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchcancel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchend(final EventListener<TouchEvent> listener) {
		addEventListener("touchend", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchend(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchend", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchmove(final EventListener<TouchEvent> listener) {
		addEventListener("touchmove", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchmove(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchmove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchstart(final EventListener<TouchEvent> listener) {
		addEventListener("touchstart", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchstart(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerUnload(final EventListener<Event> listener) {
		addEventListener("unload", listener);
	}

	@JsOverlay
	public default void addEventListenerUnload(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("unload", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerVolumechange(final EventListener<Event> listener) {
		addEventListener("volumechange", listener);
	}

	@JsOverlay
	public default void addEventListenerVolumechange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("volumechange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWaiting(final EventListener<Event> listener) {
		addEventListener("waiting", listener);
	}

	@JsOverlay
	public default void addEventListenerWaiting(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("waiting", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenchange(final EventListener<Event> listener) {
		addEventListener("webkitfullscreenchange", listener);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenchange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("webkitfullscreenchange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenerror(final EventListener<Event> listener) {
		addEventListener("webkitfullscreenerror", listener);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenerror(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("webkitfullscreenerror", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWheel(final EventListener<WheelEvent> listener) {
		addEventListener("wheel", listener);
	}

	@JsOverlay
	public default void addEventListenerWheel(final EventListener<WheelEvent> listener, final boolean useCapture) {
		addEventListener("wheel", listener, useCapture);
	}

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
