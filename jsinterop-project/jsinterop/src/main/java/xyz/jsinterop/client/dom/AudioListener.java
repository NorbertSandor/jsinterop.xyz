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
public interface AudioListener {
	@JsProperty
	public abstract double getDopplerFactor();

	@JsProperty
	public abstract void setDopplerFactor(final double value);

	@JsProperty
	public abstract double getSpeedOfSound();

	@JsProperty
	public abstract void setSpeedOfSound(final double value);

	@JsMethod
	public abstract void setOrientation(final double x, final double y, final double z, final double xUp,
			final double yUp, final double zUp);

	@JsMethod
	public abstract void setPosition(final double x, final double y, final double z);

	@JsMethod
	public abstract void setVelocity(final double x, final double y, final double z);
}
