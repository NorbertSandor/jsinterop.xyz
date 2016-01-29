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
public interface WheelEvent extends MouseEvent {
	@JsProperty
	public abstract double getDeltaMode();

	@JsProperty
	public abstract void setDeltaMode(final double value);

	@JsProperty
	public abstract double getDeltaX();

	@JsProperty
	public abstract void setDeltaX(final double value);

	@JsProperty
	public abstract double getDeltaY();

	@JsProperty
	public abstract void setDeltaY(final double value);

	@JsProperty
	public abstract double getDeltaZ();

	@JsProperty
	public abstract void setDeltaZ(final double value);

	@JsProperty
	public abstract double getDOM_DELTA_LINE();

	@JsProperty
	public abstract void setDOM_DELTA_LINE(final double value);

	@JsProperty
	public abstract double getDOM_DELTA_PAGE();

	@JsProperty
	public abstract void setDOM_DELTA_PAGE(final double value);

	@JsProperty
	public abstract double getDOM_DELTA_PIXEL();

	@JsProperty
	public abstract void setDOM_DELTA_PIXEL(final double value);

	@JsMethod
	public abstract void getCurrentPoint(final Element element);

	@JsMethod
	public abstract void initWheelEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg,
			final Window viewArg, final double detailArg, final double screenXArg, final double screenYArg,
			final double clientXArg, final double clientYArg, final double buttonArg,
			final EventTarget relatedTargetArg, final String modifiersListArg, final double deltaXArg,
			final double deltaYArg, final double deltaZArg, final double deltaMode);
}
