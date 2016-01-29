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
public interface PointerEvent extends MouseEvent {
	@JsProperty
	public abstract Object getCurrentPoint();

	@JsProperty
	public abstract void setCurrentPoint(final Object value);

	@JsProperty
	public abstract double getHeight();

	@JsProperty
	public abstract void setHeight(final double value);

	@JsProperty
	public abstract double getHwTimestamp();

	@JsProperty
	public abstract void setHwTimestamp(final double value);

	@JsProperty
	public abstract Object getIntermediatePoints();

	@JsProperty
	public abstract void setIntermediatePoints(final Object value);

	@JsProperty
	public abstract boolean isIsPrimary();

	@JsProperty
	public abstract void setIsPrimary(final boolean value);

	@JsProperty
	public abstract double getPointerId();

	@JsProperty
	public abstract void setPointerId(final double value);

	@JsProperty
	public abstract Object getPointerType();

	@JsProperty
	public abstract void setPointerType(final Object value);

	@JsProperty
	public abstract double getPressure();

	@JsProperty
	public abstract void setPressure(final double value);

	@JsProperty
	public abstract double getRotation();

	@JsProperty
	public abstract void setRotation(final double value);

	@JsProperty
	public abstract double getTiltX();

	@JsProperty
	public abstract void setTiltX(final double value);

	@JsProperty
	public abstract double getTiltY();

	@JsProperty
	public abstract void setTiltY(final double value);

	@JsProperty
	public abstract double getWidth();

	@JsProperty
	public abstract void setWidth(final double value);

	@JsMethod
	public abstract void getCurrentPoint(final Element element);

	@JsMethod
	public abstract void getIntermediatePoints(final Element element);

	@JsMethod
	public abstract void initPointerEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg,
			final Window viewArg, final double detailArg, final double screenXArg, final double screenYArg,
			final double clientXArg, final double clientYArg, final boolean ctrlKeyArg, final boolean altKeyArg,
			final boolean shiftKeyArg, final boolean metaKeyArg, final double buttonArg,
			final EventTarget relatedTargetArg, final double offsetXArg, final double offsetYArg, final double widthArg,
			final double heightArg, final double pressure, final double rotation, final double tiltX,
			final double tiltY, final double pointerIdArg, final Object pointerType, final double hwTimestampArg,
			final boolean isPrimary);
}
