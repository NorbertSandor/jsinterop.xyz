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
public interface Window extends EventTarget, WindowTimers, WindowSessionStorage, WindowLocalStorage, WindowConsole,
		GlobalEventHandlers, IDBEnvironment, WindowBase64 {
	@JsProperty
	public abstract double getAnimationStartTime();

	@JsProperty
	public abstract void setAnimationStartTime(final double value);

	@JsProperty
	public abstract ApplicationCache getApplicationCache();

	@JsProperty
	public abstract void setApplicationCache(final ApplicationCache value);

	@JsProperty
	public abstract Navigator getClientInformation();

	@JsProperty
	public abstract void setClientInformation(final Navigator value);

	@JsProperty
	public abstract boolean isClosed();

	@JsProperty
	public abstract void setClosed(final boolean value);

	@JsProperty
	public abstract Crypto getCrypto();

	@JsProperty
	public abstract void setCrypto(final Crypto value);

	@JsProperty
	public abstract String getDefaultStatus();

	@JsProperty
	public abstract void setDefaultStatus(final String value);

	@JsProperty
	public abstract double getDevicePixelRatio();

	@JsProperty
	public abstract void setDevicePixelRatio(final double value);

	@JsProperty
	public abstract String getDoNotTrack();

	@JsProperty
	public abstract void setDoNotTrack(final String value);

	@JsProperty
	public abstract Document getDocument();

	@JsProperty
	public abstract void setDocument(final Document value);

	@JsProperty
	public abstract Event getEvent();

	@JsProperty
	public abstract void setEvent(final Event value);

	@JsProperty
	public abstract External getExternal();

	@JsProperty
	public abstract void setExternal(final External value);

	@JsProperty
	public abstract Element getFrameElement();

	@JsProperty
	public abstract void setFrameElement(final Element value);

	@JsProperty
	public abstract Window getFrames();

	@JsProperty
	public abstract void setFrames(final Window value);

	@JsProperty
	public abstract History getHistory();

	@JsProperty
	public abstract void setHistory(final History value);

	@JsProperty
	public abstract double getInnerHeight();

	@JsProperty
	public abstract void setInnerHeight(final double value);

	@JsProperty
	public abstract double getInnerWidth();

	@JsProperty
	public abstract void setInnerWidth(final double value);

	@JsProperty
	public abstract double getLength();

	@JsProperty
	public abstract void setLength(final double value);

	@JsProperty
	public abstract Location getLocation();

	@JsProperty
	public abstract void setLocation(final Location value);

	@JsProperty
	public abstract BarProp getLocationbar();

	@JsProperty
	public abstract void setLocationbar(final BarProp value);

	@JsProperty
	public abstract BarProp getMenubar();

	@JsProperty
	public abstract void setMenubar(final BarProp value);

	@JsProperty
	public abstract double getMsAnimationStartTime();

	@JsProperty
	public abstract void setMsAnimationStartTime(final double value);

	@JsProperty
	public abstract String getName();

	@JsProperty
	public abstract void setName(final String value);

	@JsProperty
	public abstract Navigator getNavigator();

	@JsProperty
	public abstract void setNavigator(final Navigator value);

	@JsProperty
	public abstract Object getOffscreenBuffering();

	@JsProperty
	public abstract void setOffscreenBuffering(final Object value);

	@JsProperty
	public abstract EventListener<Event> getOnabort();

	@JsProperty
	public abstract void setOnabort(final EventListener<Event> value);

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
	public abstract EventListener<Event> getOncompassneedscalibration();

	@JsProperty
	public abstract void setOncompassneedscalibration(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<PointerEvent> getOncontextmenu();

	@JsProperty
	public abstract void setOncontextmenu(final EventListener<PointerEvent> value);

	@JsProperty
	public abstract EventListener<MouseEvent> getOndblclick();

	@JsProperty
	public abstract void setOndblclick(final EventListener<MouseEvent> value);

	@JsProperty
	public abstract EventListener<DeviceMotionEvent> getOndevicemotion();

	@JsProperty
	public abstract void setOndevicemotion(final EventListener<DeviceMotionEvent> value);

	@JsProperty
	public abstract EventListener<DeviceOrientationEvent> getOndeviceorientation();

	@JsProperty
	public abstract void setOndeviceorientation(final EventListener<DeviceOrientationEvent> value);

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
	public abstract ErrorEventHandler getOnerror();

	@JsProperty
	public abstract void setOnerror(final ErrorEventHandler value);

	@JsProperty
	public abstract EventListener<FocusEvent> getOnfocus();

	@JsProperty
	public abstract void setOnfocus(final EventListener<FocusEvent> value);

	@JsProperty
	public abstract EventListener<HashChangeEvent> getOnhashchange();

	@JsProperty
	public abstract void setOnhashchange(final EventListener<HashChangeEvent> value);

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
	public abstract EventListener<MessageEvent> getOnmessage();

	@JsProperty
	public abstract void setOnmessage(final EventListener<MessageEvent> value);

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
	public abstract EventListener<MSGestureEvent> getOnmsgesturechange();

	@JsProperty
	public abstract void setOnmsgesturechange(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturedoubletap();

	@JsProperty
	public abstract void setOnmsgesturedoubletap(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgestureend();

	@JsProperty
	public abstract void setOnmsgestureend(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturehold();

	@JsProperty
	public abstract void setOnmsgesturehold(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturestart();

	@JsProperty
	public abstract void setOnmsgesturestart(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturetap();

	@JsProperty
	public abstract void setOnmsgesturetap(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsinertiastart();

	@JsProperty
	public abstract void setOnmsinertiastart(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointercancel();

	@JsProperty
	public abstract void setOnmspointercancel(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerdown();

	@JsProperty
	public abstract void setOnmspointerdown(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerenter();

	@JsProperty
	public abstract void setOnmspointerenter(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerleave();

	@JsProperty
	public abstract void setOnmspointerleave(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointermove();

	@JsProperty
	public abstract void setOnmspointermove(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerout();

	@JsProperty
	public abstract void setOnmspointerout(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerover();

	@JsProperty
	public abstract void setOnmspointerover(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerup();

	@JsProperty
	public abstract void setOnmspointerup(final EventListener<MSPointerEvent> value);

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
	public abstract EventListener<PopStateEvent> getOnpopstate();

	@JsProperty
	public abstract void setOnpopstate(final EventListener<PopStateEvent> value);

	@JsProperty
	public abstract EventListener<ProgressEvent> getOnprogress();

	@JsProperty
	public abstract void setOnprogress(final EventListener<ProgressEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnratechange();

	@JsProperty
	public abstract void setOnratechange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<ProgressEvent> getOnreadystatechange();

	@JsProperty
	public abstract void setOnreadystatechange(final EventListener<ProgressEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnreset();

	@JsProperty
	public abstract void setOnreset(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOnresize();

	@JsProperty
	public abstract void setOnresize(final EventListener<UIEvent> value);

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
	public abstract EventListener<Event> getOnstalled();

	@JsProperty
	public abstract void setOnstalled(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<StorageEvent> getOnstorage();

	@JsProperty
	public abstract void setOnstorage(final EventListener<StorageEvent> value);

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
	public abstract Object getOntouchcancel();

	@JsProperty
	public abstract void setOntouchcancel(final Object value);

	@JsProperty
	public abstract Object getOntouchend();

	@JsProperty
	public abstract void setOntouchend(final Object value);

	@JsProperty
	public abstract Object getOntouchmove();

	@JsProperty
	public abstract void setOntouchmove(final Object value);

	@JsProperty
	public abstract Object getOntouchstart();

	@JsProperty
	public abstract void setOntouchstart(final Object value);

	@JsProperty
	public abstract EventListener<Event> getOnunload();

	@JsProperty
	public abstract void setOnunload(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnvolumechange();

	@JsProperty
	public abstract void setOnvolumechange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnwaiting();

	@JsProperty
	public abstract void setOnwaiting(final EventListener<Event> value);

	@JsProperty
	public abstract Window getOpener();

	@JsProperty
	public abstract void setOpener(final Window value);

	@JsProperty
	public abstract Object getOrientation();

	@JsProperty
	public abstract void setOrientation(final Object value);

	@JsProperty
	public abstract double getOuterHeight();

	@JsProperty
	public abstract void setOuterHeight(final double value);

	@JsProperty
	public abstract double getOuterWidth();

	@JsProperty
	public abstract void setOuterWidth(final double value);

	@JsProperty
	public abstract double getPageXOffset();

	@JsProperty
	public abstract void setPageXOffset(final double value);

	@JsProperty
	public abstract double getPageYOffset();

	@JsProperty
	public abstract void setPageYOffset(final double value);

	@JsProperty
	public abstract Window getParent();

	@JsProperty
	public abstract void setParent(final Window value);

	@JsProperty
	public abstract Performance getPerformance();

	@JsProperty
	public abstract void setPerformance(final Performance value);

	@JsProperty
	public abstract BarProp getPersonalbar();

	@JsProperty
	public abstract void setPersonalbar(final BarProp value);

	@JsProperty
	public abstract Screen getScreen();

	@JsProperty
	public abstract void setScreen(final Screen value);

	@JsProperty
	public abstract double getScreenLeft();

	@JsProperty
	public abstract void setScreenLeft(final double value);

	@JsProperty
	public abstract double getScreenTop();

	@JsProperty
	public abstract void setScreenTop(final double value);

	@JsProperty
	public abstract double getScreenX();

	@JsProperty
	public abstract void setScreenX(final double value);

	@JsProperty
	public abstract double getScreenY();

	@JsProperty
	public abstract void setScreenY(final double value);

	@JsProperty
	public abstract double getScrollX();

	@JsProperty
	public abstract void setScrollX(final double value);

	@JsProperty
	public abstract double getScrollY();

	@JsProperty
	public abstract void setScrollY(final double value);

	@JsProperty
	public abstract BarProp getScrollbars();

	@JsProperty
	public abstract void setScrollbars(final BarProp value);

	@JsProperty
	public abstract Window getSelf();

	@JsProperty
	public abstract void setSelf(final Window value);

	@JsProperty
	public abstract String getStatus();

	@JsProperty
	public abstract void setStatus(final String value);

	@JsProperty
	public abstract BarProp getStatusbar();

	@JsProperty
	public abstract void setStatusbar(final BarProp value);

	@JsProperty
	public abstract StyleMedia getStyleMedia();

	@JsProperty
	public abstract void setStyleMedia(final StyleMedia value);

	@JsProperty
	public abstract BarProp getToolbar();

	@JsProperty
	public abstract void setToolbar(final BarProp value);

	@JsProperty
	public abstract Window getTop();

	@JsProperty
	public abstract void setTop(final Window value);

	@JsProperty
	public abstract Window getWindow();

	@JsProperty
	public abstract void setWindow(final Window value);

	@JsProperty
	public abstract URL getURL();

	@JsProperty
	public abstract void setURL(final URL value);

	@JsOverlay
	public default Window get(final int index) {
		return (Window) xyz.jsinterop.client.core.JsArrays.getArrayItem(this, index);
	}

	@JsOverlay
	public default void set(final int index, final Window value) {
		xyz.jsinterop.client.core.JsArrays.setArrayItem(this, index, value);
	}

	@JsMethod
	public abstract void alert();

	@JsMethod
	public abstract void alert(final Object message);

	@JsMethod
	public abstract void blur();

	@JsMethod
	public abstract void cancelAnimationFrame(final double handle);

	@JsMethod
	public abstract void captureEvents();

	@JsMethod
	public abstract void close();

	@JsMethod
	public abstract boolean confirm();

	@JsMethod
	public abstract boolean confirm(final String message);

	@JsMethod
	public abstract void focus();

	@JsMethod
	public abstract CSSStyleDeclaration getComputedStyle(final Element elt);

	@JsMethod
	public abstract CSSStyleDeclaration getComputedStyle(final Element elt, final String pseudoElt);

	@JsMethod
	public abstract CSSRuleList getMatchedCSSRules(final Element elt);

	@JsMethod
	public abstract CSSRuleList getMatchedCSSRules(final Element elt, final String pseudoElt);

	@JsMethod
	public abstract Selection getSelection();

	@JsMethod
	public abstract MediaQueryList matchMedia(final String mediaQuery);

	@JsMethod
	public abstract void moveBy();

	@JsMethod
	public abstract void moveBy(final double x);

	@JsMethod
	public abstract void moveBy(final double x, final double y);

	@JsMethod
	public abstract void moveTo();

	@JsMethod
	public abstract void moveTo(final double x);

	@JsMethod
	public abstract void moveTo(final double x, final double y);

	@JsMethod
	public abstract void msCancelRequestAnimationFrame(final double handle);

	@JsMethod
	public abstract MediaQueryList msMatchMedia(final String mediaQuery);

	@JsMethod
	public abstract double msRequestAnimationFrame(final FrameRequestCallback callback);

	@JsMethod
	public abstract void msWriteProfilerMark(final String profilerMarkName);

	@JsMethod
	public abstract Window open();

	@JsMethod
	public abstract Window open(final String url);

	@JsMethod
	public abstract Window open(final String url, final String target);

	@JsMethod
	public abstract Window open(final String url, final String target, final String features);

	@JsMethod
	public abstract Window open(final String url, final String target, final String features, final boolean replace);

	@JsMethod
	public abstract void postMessage(final Object message, final String targetOrigin);

	@JsMethod
	public abstract void postMessage(final Object message, final String targetOrigin, final Object ports);

	@JsMethod
	public abstract void print();

	@JsMethod
	public abstract String prompt();

	@JsMethod
	public abstract String prompt(final String message);

	@JsMethod
	public abstract String prompt(final String message, final String _default);

	@JsMethod
	public abstract void releaseEvents();

	@JsMethod
	public abstract double requestAnimationFrame(final FrameRequestCallback callback);

	@JsMethod
	public abstract void resizeBy();

	@JsMethod
	public abstract void resizeBy(final double x);

	@JsMethod
	public abstract void resizeBy(final double x, final double y);

	@JsMethod
	public abstract void resizeTo();

	@JsMethod
	public abstract void resizeTo(final double x);

	@JsMethod
	public abstract void resizeTo(final double x, final double y);

	@JsMethod
	public abstract void scroll();

	@JsMethod
	public abstract void scroll(final double x);

	@JsMethod
	public abstract void scroll(final double x, final double y);

	@JsMethod
	public abstract void scrollBy();

	@JsMethod
	public abstract void scrollBy(final double x);

	@JsMethod
	public abstract void scrollBy(final double x, final double y);

	@JsMethod
	public abstract void scrollTo();

	@JsMethod
	public abstract void scrollTo(final double x);

	@JsMethod
	public abstract void scrollTo(final double x, final double y);

	@JsMethod
	public abstract WebKitPoint webkitConvertPointFromNodeToPage(final Node node, final WebKitPoint pt);

	@JsMethod
	public abstract WebKitPoint webkitConvertPointFromPageToNode(final Node node, final WebKitPoint pt);

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
	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSInertiaStart", listener);
	}

	@JsOverlay
	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSInertiaStart", listener, useCapture);
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
	public default void addEventListenerAfterprint(final EventListener<Event> listener) {
		addEventListener("afterprint", listener);
	}

	@JsOverlay
	public default void addEventListenerAfterprint(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("afterprint", listener, useCapture);
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
	public default void addEventListenerCompassneedscalibration(final EventListener<Event> listener) {
		addEventListener("compassneedscalibration", listener);
	}

	@JsOverlay
	public default void addEventListenerCompassneedscalibration(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("compassneedscalibration", listener, useCapture);
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
	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener) {
		addEventListener("dblclick", listener);
	}

	@JsOverlay
	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("dblclick", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDevicemotion(final EventListener<DeviceMotionEvent> listener) {
		addEventListener("devicemotion", listener);
	}

	@JsOverlay
	public default void addEventListenerDevicemotion(final EventListener<DeviceMotionEvent> listener, final boolean useCapture) {
		addEventListener("devicemotion", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDeviceorientation(final EventListener<DeviceOrientationEvent> listener) {
		addEventListener("deviceorientation", listener);
	}

	@JsOverlay
	public default void addEventListenerDeviceorientation(final EventListener<DeviceOrientationEvent> listener, final boolean useCapture) {
		addEventListener("deviceorientation", listener, useCapture);
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
	public default void addEventListenerFocus(final EventListener<FocusEvent> listener) {
		addEventListener("focus", listener);
	}

	@JsOverlay
	public default void addEventListenerFocus(final EventListener<FocusEvent> listener, final boolean useCapture) {
		addEventListener("focus", listener, useCapture);
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
	public default void addEventListenerReadystatechange(final EventListener<ProgressEvent> listener) {
		addEventListener("readystatechange", listener);
	}

	@JsOverlay
	public default void addEventListenerReadystatechange(final EventListener<ProgressEvent> listener, final boolean useCapture) {
		addEventListener("readystatechange", listener, useCapture);
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
