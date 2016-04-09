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
	public default void addEventListenerMessage(final EventListener<MessageEvent> listener) {
		addEventListener("message", listener);
	}

	@JsOverlay
	public default void addEventListenerMessage(final EventListener<MessageEvent> listener, final boolean useCapture) {
		addEventListener("message", listener, useCapture);
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
	public default void addEventListenerResize(final EventListener<UIEvent> listener) {
		addEventListener("resize", listener);
	}

	@JsOverlay
	public default void addEventListenerResize(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("resize", listener, useCapture);
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
	public default void addEventListenerUnload(final EventListener<Event> listener) {
		addEventListener("unload", listener);
	}

	@JsOverlay
	public default void addEventListenerUnload(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("unload", listener, useCapture);
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
