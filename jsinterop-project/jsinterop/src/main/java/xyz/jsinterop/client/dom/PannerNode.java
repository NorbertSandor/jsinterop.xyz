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
public interface PannerNode extends AudioNode {
	@JsProperty
	public abstract double getConeInnerAngle();

	@JsProperty
	public abstract void setConeInnerAngle(final double value);

	@JsProperty
	public abstract double getConeOuterAngle();

	@JsProperty
	public abstract void setConeOuterAngle(final double value);

	@JsProperty
	public abstract double getConeOuterGain();

	@JsProperty
	public abstract void setConeOuterGain(final double value);

	@JsProperty
	public abstract String getDistanceModel();

	@JsProperty
	public abstract void setDistanceModel(final String value);

	@JsProperty
	public abstract double getMaxDistance();

	@JsProperty
	public abstract void setMaxDistance(final double value);

	@JsProperty
	public abstract String getPanningModel();

	@JsProperty
	public abstract void setPanningModel(final String value);

	@JsProperty
	public abstract double getRefDistance();

	@JsProperty
	public abstract void setRefDistance(final double value);

	@JsProperty
	public abstract double getRolloffFactor();

	@JsProperty
	public abstract void setRolloffFactor(final double value);

	@JsMethod
	public abstract void setOrientation(final double x, final double y, final double z);

	@JsMethod
	public abstract void setPosition(final double x, final double y, final double z);

	@JsMethod
	public abstract void setVelocity(final double x, final double y, final double z);
}
