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
public interface TransitionEvent extends Event {
	@JsProperty
	public abstract double getElapsedTime();

	@JsProperty
	public abstract void setElapsedTime(final double value);

	@JsProperty
	public abstract String getPropertyName();

	@JsProperty
	public abstract void setPropertyName(final String value);

	@JsMethod
	public abstract void initTransitionEvent(final String typeArg, final boolean canBubbleArg,
			final boolean cancelableArg, final String propertyNameArg, final double elapsedTimeArg);
}
