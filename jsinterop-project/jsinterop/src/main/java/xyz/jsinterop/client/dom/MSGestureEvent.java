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
public interface MSGestureEvent extends UIEvent {
	@JsProperty
	public abstract double getClientX();

	@JsProperty
	public abstract void setClientX(final double value);

	@JsProperty
	public abstract double getClientY();

	@JsProperty
	public abstract void setClientY(final double value);

	@JsProperty
	public abstract double getExpansion();

	@JsProperty
	public abstract void setExpansion(final double value);

	@JsProperty
	public abstract Object getGestureObject();

	@JsProperty
	public abstract void setGestureObject(final Object value);

	@JsProperty
	public abstract double getHwTimestamp();

	@JsProperty
	public abstract void setHwTimestamp(final double value);

	@JsProperty
	public abstract double getOffsetX();

	@JsProperty
	public abstract void setOffsetX(final double value);

	@JsProperty
	public abstract double getOffsetY();

	@JsProperty
	public abstract void setOffsetY(final double value);

	@JsProperty
	public abstract double getRotation();

	@JsProperty
	public abstract void setRotation(final double value);

	@JsProperty
	public abstract double getScale();

	@JsProperty
	public abstract void setScale(final double value);

	@JsProperty
	public abstract double getScreenX();

	@JsProperty
	public abstract void setScreenX(final double value);

	@JsProperty
	public abstract double getScreenY();

	@JsProperty
	public abstract void setScreenY(final double value);

	@JsProperty
	public abstract double getTranslationX();

	@JsProperty
	public abstract void setTranslationX(final double value);

	@JsProperty
	public abstract double getTranslationY();

	@JsProperty
	public abstract void setTranslationY(final double value);

	@JsProperty
	public abstract double getVelocityAngular();

	@JsProperty
	public abstract void setVelocityAngular(final double value);

	@JsProperty
	public abstract double getVelocityExpansion();

	@JsProperty
	public abstract void setVelocityExpansion(final double value);

	@JsProperty
	public abstract double getVelocityX();

	@JsProperty
	public abstract void setVelocityX(final double value);

	@JsProperty
	public abstract double getVelocityY();

	@JsProperty
	public abstract void setVelocityY(final double value);

	@JsProperty
	public abstract double getMSGESTURE_FLAG_BEGIN();

	@JsProperty
	public abstract void setMSGESTURE_FLAG_BEGIN(final double value);

	@JsProperty
	public abstract double getMSGESTURE_FLAG_CANCEL();

	@JsProperty
	public abstract void setMSGESTURE_FLAG_CANCEL(final double value);

	@JsProperty
	public abstract double getMSGESTURE_FLAG_END();

	@JsProperty
	public abstract void setMSGESTURE_FLAG_END(final double value);

	@JsProperty
	public abstract double getMSGESTURE_FLAG_INERTIA();

	@JsProperty
	public abstract void setMSGESTURE_FLAG_INERTIA(final double value);

	@JsProperty
	public abstract double getMSGESTURE_FLAG_NONE();

	@JsProperty
	public abstract void setMSGESTURE_FLAG_NONE(final double value);

	@JsMethod
	public abstract void initGestureEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg,
			final Window viewArg, final double detailArg, final double screenXArg, final double screenYArg,
			final double clientXArg, final double clientYArg, final double offsetXArg, final double offsetYArg,
			final double translationXArg, final double translationYArg, final double scaleArg,
			final double expansionArg, final double rotationArg, final double velocityXArg, final double velocityYArg,
			final double velocityExpansionArg, final double velocityAngularArg, final double hwTimestampArg);
}
