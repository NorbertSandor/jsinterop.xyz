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
public interface MSManipulationEvent extends UIEvent {
	@JsProperty
	public abstract double getCurrentState();

	@JsProperty
	public abstract void setCurrentState(final double value);

	@JsProperty
	public abstract double getInertiaDestinationX();

	@JsProperty
	public abstract void setInertiaDestinationX(final double value);

	@JsProperty
	public abstract double getInertiaDestinationY();

	@JsProperty
	public abstract void setInertiaDestinationY(final double value);

	@JsProperty
	public abstract double getLastState();

	@JsProperty
	public abstract void setLastState(final double value);

	@JsProperty
	public abstract double getMS_MANIPULATION_STATE_ACTIVE();

	@JsProperty
	public abstract void setMS_MANIPULATION_STATE_ACTIVE(final double value);

	@JsProperty
	public abstract double getMS_MANIPULATION_STATE_CANCELLED();

	@JsProperty
	public abstract void setMS_MANIPULATION_STATE_CANCELLED(final double value);

	@JsProperty
	public abstract double getMS_MANIPULATION_STATE_COMMITTED();

	@JsProperty
	public abstract void setMS_MANIPULATION_STATE_COMMITTED(final double value);

	@JsProperty
	public abstract double getMS_MANIPULATION_STATE_DRAGGING();

	@JsProperty
	public abstract void setMS_MANIPULATION_STATE_DRAGGING(final double value);

	@JsProperty
	public abstract double getMS_MANIPULATION_STATE_INERTIA();

	@JsProperty
	public abstract void setMS_MANIPULATION_STATE_INERTIA(final double value);

	@JsProperty
	public abstract double getMS_MANIPULATION_STATE_PRESELECT();

	@JsProperty
	public abstract void setMS_MANIPULATION_STATE_PRESELECT(final double value);

	@JsProperty
	public abstract double getMS_MANIPULATION_STATE_SELECTING();

	@JsProperty
	public abstract void setMS_MANIPULATION_STATE_SELECTING(final double value);

	@JsProperty
	public abstract double getMS_MANIPULATION_STATE_STOPPED();

	@JsProperty
	public abstract void setMS_MANIPULATION_STATE_STOPPED(final double value);

	@JsMethod
	public abstract void initMSManipulationEvent(final String typeArg, final boolean canBubbleArg,
			final boolean cancelableArg, final Window viewArg, final double detailArg, final double lastState,
			final double currentState);
}
