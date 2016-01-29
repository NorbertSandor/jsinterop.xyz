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
public interface HTMLElement extends Element {
	@JsProperty
	public abstract String getAccessKey();

	@JsProperty
	public abstract void setAccessKey(final String value);

	@JsProperty
	public abstract HTMLCollection getChildren();

	@JsProperty
	public abstract void setChildren(final HTMLCollection value);

	@JsProperty
	public abstract String getContentEditable();

	@JsProperty
	public abstract void setContentEditable(final String value);

	@JsProperty
	public abstract DOMStringMap getDataset();

	@JsProperty
	public abstract void setDataset(final DOMStringMap value);

	@JsProperty
	public abstract String getDir();

	@JsProperty
	public abstract void setDir(final String value);

	@JsProperty
	public abstract boolean isDraggable();

	@JsProperty
	public abstract void setDraggable(final boolean value);

	@JsProperty
	public abstract boolean isHidden();

	@JsProperty
	public abstract void setHidden(final boolean value);

	@JsProperty
	public abstract boolean isHideFocus();

	@JsProperty
	public abstract void setHideFocus(final boolean value);

	@JsProperty
	public abstract String getInnerHTML();

	@JsProperty
	public abstract void setInnerHTML(final String value);

	@JsProperty
	public abstract String getInnerText();

	@JsProperty
	public abstract void setInnerText(final String value);

	@JsProperty
	public abstract boolean isIsContentEditable();

	@JsProperty
	public abstract void setIsContentEditable(final boolean value);

	@JsProperty
	public abstract String getLang();

	@JsProperty
	public abstract void setLang(final String value);

	@JsProperty
	public abstract double getOffsetHeight();

	@JsProperty
	public abstract void setOffsetHeight(final double value);

	@JsProperty
	public abstract double getOffsetLeft();

	@JsProperty
	public abstract void setOffsetLeft(final double value);

	@JsProperty
	public abstract Element getOffsetParent();

	@JsProperty
	public abstract void setOffsetParent(final Element value);

	@JsProperty
	public abstract double getOffsetTop();

	@JsProperty
	public abstract void setOffsetTop(final double value);

	@JsProperty
	public abstract double getOffsetWidth();

	@JsProperty
	public abstract void setOffsetWidth(final double value);

	@JsProperty
	public abstract EventListener<Event> getOnabort();

	@JsProperty
	public abstract void setOnabort(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOnactivate();

	@JsProperty
	public abstract void setOnactivate(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOnbeforeactivate();

	@JsProperty
	public abstract void setOnbeforeactivate(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOnbeforecopy();

	@JsProperty
	public abstract void setOnbeforecopy(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOnbeforecut();

	@JsProperty
	public abstract void setOnbeforecut(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOnbeforedeactivate();

	@JsProperty
	public abstract void setOnbeforedeactivate(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOnbeforepaste();

	@JsProperty
	public abstract void setOnbeforepaste(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<FocusEvent> getOnblur();

	@JsProperty
	public abstract void setOnblur(final EventListener<FocusEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOncanplay();

	@JsProperty
	public abstract void setOncanplay(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOncanplaythrough();

	@JsProperty
	public abstract void setOncanplaythrough(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnchange();

	@JsProperty
	public abstract void setOnchange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOnclick();

	@JsProperty
	public abstract void setOnclick(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract EventListener<PointerEvent> getOncontextmenu();

	@JsProperty
	public abstract void setOncontextmenu(final EventListener<PointerEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOncopy();

	@JsProperty
	public abstract void setOncopy(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOncuechange();

	@JsProperty
	public abstract void setOncuechange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOncut();

	@JsProperty
	public abstract void setOncut(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOndblclick();

	@JsProperty
	public abstract void setOndblclick(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOndeactivate();

	@JsProperty
	public abstract void setOndeactivate(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOndrag();

	@JsProperty
	public abstract void setOndrag(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOndragend();

	@JsProperty
	public abstract void setOndragend(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOndragenter();

	@JsProperty
	public abstract void setOndragenter(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOndragleave();

	@JsProperty
	public abstract void setOndragleave(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOndragover();

	@JsProperty
	public abstract void setOndragover(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOndragstart();

	@JsProperty
	public abstract void setOndragstart(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOndrop();

	@JsProperty
	public abstract void setOndrop(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOndurationchange();

	@JsProperty
	public abstract void setOndurationchange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnemptied();

	@JsProperty
	public abstract void setOnemptied(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnended();

	@JsProperty
	public abstract void setOnended(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnerror();

	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<FocusEvent> getOnfocus();

	@JsProperty
	public abstract void setOnfocus(final EventListener<FocusEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOninput();

	@JsProperty
	public abstract void setOninput(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<KeyboardEvent> getOnkeydown();

	@JsProperty
	public abstract void setOnkeydown(final EventListener<KeyboardEvent> value);

	@JsProperty
	public abstract EventListener<KeyboardEvent> getOnkeypress();

	@JsProperty
	public abstract void setOnkeypress(final EventListener<KeyboardEvent> value);

	@JsProperty
	public abstract EventListener<KeyboardEvent> getOnkeyup();

	@JsProperty
	public abstract void setOnkeyup(final EventListener<KeyboardEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnload();

	@JsProperty
	public abstract void setOnload(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnloadeddata();

	@JsProperty
	public abstract void setOnloadeddata(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnloadedmetadata();

	@JsProperty
	public abstract void setOnloadedmetadata(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnloadstart();

	@JsProperty
	public abstract void setOnloadstart(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOnmousedown();

	@JsProperty
	public abstract void setOnmousedown(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOnmouseenter();

	@JsProperty
	public abstract void setOnmouseenter(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOnmouseleave();

	@JsProperty
	public abstract void setOnmouseleave(final EventListener<MouseEvent> value);

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
	public abstract EventListener<MouseWheelEvent> getOnmousewheel();

	@JsProperty
	public abstract void setOnmousewheel(final EventListener<MouseWheelEvent> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOnmscontentzoom();

	@JsProperty
	public abstract void setOnmscontentzoom(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<MSManipulationEvent> getOnmsmanipulationstatechanged();

	@JsProperty
	public abstract void setOnmsmanipulationstatechanged(final EventListener<MSManipulationEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOnpaste();

	@JsProperty
	public abstract void setOnpaste(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnpause();

	@JsProperty
	public abstract void setOnpause(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnplay();

	@JsProperty
	public abstract void setOnplay(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnplaying();

	@JsProperty
	public abstract void setOnplaying(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<ProgressEvent> getOnprogress();

	@JsProperty
	public abstract void setOnprogress(final EventListener<ProgressEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnratechange();

	@JsProperty
	public abstract void setOnratechange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnreset();

	@JsProperty
	public abstract void setOnreset(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOnscroll();

	@JsProperty
	public abstract void setOnscroll(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnseeked();

	@JsProperty
	public abstract void setOnseeked(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnseeking();

	@JsProperty
	public abstract void setOnseeking(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOnselect();

	@JsProperty
	public abstract void setOnselect(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnselectstart();

	@JsProperty
	public abstract void setOnselectstart(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnstalled();

	@JsProperty
	public abstract void setOnstalled(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnsubmit();

	@JsProperty
	public abstract void setOnsubmit(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnsuspend();

	@JsProperty
	public abstract void setOnsuspend(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOntimeupdate();

	@JsProperty
	public abstract void setOntimeupdate(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnvolumechange();

	@JsProperty
	public abstract void setOnvolumechange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnwaiting();

	@JsProperty
	public abstract void setOnwaiting(final EventListener<Event> value);

	@JsProperty
	public abstract String getOuterHTML();

	@JsProperty
	public abstract void setOuterHTML(final String value);

	@JsProperty
	public abstract String getOuterText();

	@JsProperty
	public abstract void setOuterText(final String value);

	@JsProperty
	public abstract boolean isSpellcheck();

	@JsProperty
	public abstract void setSpellcheck(final boolean value);

	@JsProperty
	public abstract CSSStyleDeclaration getStyle();

	@JsProperty
	public abstract void setStyle(final CSSStyleDeclaration value);

	@JsProperty
	public abstract double getTabIndex();

	@JsProperty
	public abstract void setTabIndex(final double value);

	@JsProperty
	public abstract String getTitle();

	@JsProperty
	public abstract void setTitle(final String value);

	@JsMethod
	public abstract void blur();

	@JsMethod
	public abstract void click();

	@JsMethod
	public abstract boolean dragDrop();

	@JsMethod
	public abstract void focus();

	@JsMethod
	public abstract Element insertAdjacentElement(final String position, final Element insertedElement);

	@JsMethod
	public abstract void insertAdjacentHTML(final String where, final String html);

	@JsMethod
	public abstract void insertAdjacentText(final String where, final String text);

	@JsMethod
	public abstract MSInputMethodContext msGetInputContext();

	@JsMethod
	public abstract void scrollIntoView();

	@JsMethod
	public abstract void scrollIntoView(final boolean top);

	@JsMethod
	public abstract void setActive();

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
