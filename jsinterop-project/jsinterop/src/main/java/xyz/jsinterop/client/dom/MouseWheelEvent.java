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
public interface MouseWheelEvent extends MouseEvent {
	@JsProperty
	public abstract double getWheelDelta();

	@JsProperty
	public abstract void setWheelDelta(final double value);

	@JsProperty
	public abstract double getWheelDeltaX();

	@JsProperty
	public abstract void setWheelDeltaX(final double value);

	@JsProperty
	public abstract double getWheelDeltaY();

	@JsProperty
	public abstract void setWheelDeltaY(final double value);

	@JsMethod
	public abstract void initMouseWheelEvent(final String typeArg, final boolean canBubbleArg,
			final boolean cancelableArg, final Window viewArg, final double detailArg, final double screenXArg,
			final double screenYArg, final double clientXArg, final double clientYArg, final double buttonArg,
			final EventTarget relatedTargetArg, final String modifiersListArg, final double wheelDeltaArg);
}
