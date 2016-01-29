package xyz.jsinterop.client.dom;

import jsinterop.annotations.JsPackage;

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

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface DynamicsCompressorNode extends AudioNode {
	@JsProperty
	public abstract AudioParam getAttack();

	@JsProperty
	public abstract void setAttack(final AudioParam value);

	@JsProperty
	public abstract AudioParam getKnee();

	@JsProperty
	public abstract void setKnee(final AudioParam value);

	@JsProperty
	public abstract AudioParam getRatio();

	@JsProperty
	public abstract void setRatio(final AudioParam value);

	@JsProperty
	public abstract AudioParam getReduction();

	@JsProperty
	public abstract void setReduction(final AudioParam value);

	@JsProperty
	public abstract AudioParam getRelease();

	@JsProperty
	public abstract void setRelease(final AudioParam value);

	@JsProperty
	public abstract AudioParam getThreshold();

	@JsProperty
	public abstract void setThreshold(final AudioParam value);
}
