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
public interface Event {
	@JsProperty
	public abstract boolean isBubbles();

	@JsProperty
	public abstract void setBubbles(final boolean value);

	@JsProperty
	public abstract boolean isCancelBubble();

	@JsProperty
	public abstract void setCancelBubble(final boolean value);

	@JsProperty
	public abstract boolean isCancelable();

	@JsProperty
	public abstract void setCancelable(final boolean value);

	@JsProperty
	public abstract EventTarget getCurrentTarget();

	@JsProperty
	public abstract void setCurrentTarget(final EventTarget value);

	@JsProperty
	public abstract boolean isDefaultPrevented();

	@JsProperty
	public abstract void setDefaultPrevented(final boolean value);

	@JsProperty
	public abstract double getEventPhase();

	@JsProperty
	public abstract void setEventPhase(final double value);

	@JsProperty
	public abstract boolean isIsTrusted();

	@JsProperty
	public abstract void setIsTrusted(final boolean value);

	@JsProperty
	public abstract boolean isReturnValue();

	@JsProperty
	public abstract void setReturnValue(final boolean value);

	@JsProperty
	public abstract Element getSrcElement();

	@JsProperty
	public abstract void setSrcElement(final Element value);

	@JsProperty
	public abstract EventTarget getTarget();

	@JsProperty
	public abstract void setTarget(final EventTarget value);

	@JsProperty
	public abstract double getTimeStamp();

	@JsProperty
	public abstract void setTimeStamp(final double value);

	@JsProperty
	public abstract String getType();

	@JsProperty
	public abstract void setType(final String value);

	@JsProperty
	public abstract double getAT_TARGET();

	@JsProperty
	public abstract void setAT_TARGET(final double value);

	@JsProperty
	public abstract double getBUBBLING_PHASE();

	@JsProperty
	public abstract void setBUBBLING_PHASE(final double value);

	@JsProperty
	public abstract double getCAPTURING_PHASE();

	@JsProperty
	public abstract void setCAPTURING_PHASE(final double value);

	@JsMethod
	public abstract void initEvent(final String eventTypeArg, final boolean canBubbleArg, final boolean cancelableArg);

	@JsMethod
	public abstract void preventDefault();

	@JsMethod
	public abstract void stopImmediatePropagation();

	@JsMethod
	public abstract void stopPropagation();
}
