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
public interface MSInputMethodContext extends EventTarget {
	@JsProperty
	public abstract double getCompositionEndOffset();

	@JsProperty
	public abstract void setCompositionEndOffset(final double value);

	@JsProperty
	public abstract double getCompositionStartOffset();

	@JsProperty
	public abstract void setCompositionStartOffset(final double value);

	@JsProperty
	public abstract EventListener<Event> getOncandidatewindowhide();

	@JsProperty
	public abstract void setOncandidatewindowhide(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOncandidatewindowshow();

	@JsProperty
	public abstract void setOncandidatewindowshow(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOncandidatewindowupdate();

	@JsProperty
	public abstract void setOncandidatewindowupdate(final EventListener<Event> value);

	@JsProperty
	public abstract HTMLElement getTarget();

	@JsProperty
	public abstract void setTarget(final HTMLElement value);

	@JsMethod
	public abstract ClientRect getCandidateWindowClientRect();

	@JsMethod
	public abstract Object getCompositionAlternatives();

	@JsMethod
	public abstract boolean hasComposition();

	@JsMethod
	public abstract boolean isCandidateWindowVisible();

	@JsOverlay
	public default void addEventListenerMSCandidateWindowHide(final EventListener<Event> listener) {
		addEventListener("MSCandidateWindowHide", listener);
	}

	@JsOverlay
	public default void addEventListenerMSCandidateWindowHide(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("MSCandidateWindowHide", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSCandidateWindowShow(final EventListener<Event> listener) {
		addEventListener("MSCandidateWindowShow", listener);
	}

	@JsOverlay
	public default void addEventListenerMSCandidateWindowShow(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("MSCandidateWindowShow", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSCandidateWindowUpdate(final EventListener<Event> listener) {
		addEventListener("MSCandidateWindowUpdate", listener);
	}

	@JsOverlay
	public default void addEventListenerMSCandidateWindowUpdate(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("MSCandidateWindowUpdate", listener, useCapture);
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
