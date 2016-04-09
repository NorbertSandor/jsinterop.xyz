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
public interface HTMLMarqueeElement extends HTMLElement {
	@JsProperty
	public abstract String getBehavior();

	@JsProperty
	public abstract void setBehavior(final String value);

	@JsProperty
	public abstract Object getBgColor();

	@JsProperty
	public abstract void setBgColor(final Object value);

	@JsProperty
	public abstract String getDirection();

	@JsProperty
	public abstract void setDirection(final String value);

	@JsProperty
	public abstract String getHeight();

	@JsProperty
	public abstract void setHeight(final String value);

	@JsProperty
	public abstract double getHspace();

	@JsProperty
	public abstract void setHspace(final double value);

	@JsProperty
	public abstract double getLoop();

	@JsProperty
	public abstract void setLoop(final double value);

	@JsProperty
	public abstract EventListener<Event> getOnbounce();

	@JsProperty
	public abstract void setOnbounce(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnfinish();

	@JsProperty
	public abstract void setOnfinish(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnstart();

	@JsProperty
	public abstract void setOnstart(final EventListener<Event> value);

	@JsProperty
	public abstract double getScrollAmount();

	@JsProperty
	public abstract void setScrollAmount(final double value);

	@JsProperty
	public abstract double getScrollDelay();

	@JsProperty
	public abstract void setScrollDelay(final double value);

	@JsProperty
	public abstract boolean isTrueSpeed();

	@JsProperty
	public abstract void setTrueSpeed(final boolean value);

	@JsProperty
	public abstract double getVspace();

	@JsProperty
	public abstract void setVspace(final double value);

	@JsProperty
	public abstract String getWidth();

	@JsProperty
	public abstract void setWidth(final String value);

	@JsMethod
	public abstract void start();

	@JsMethod
	public abstract void stop();

	@JsOverlay
	public default void addEventListenerFinish(final EventListener<Event> listener) {
		addEventListener("finish", listener);
	}

	@JsOverlay
	public default void addEventListenerFinish(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("finish", listener, useCapture);
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
