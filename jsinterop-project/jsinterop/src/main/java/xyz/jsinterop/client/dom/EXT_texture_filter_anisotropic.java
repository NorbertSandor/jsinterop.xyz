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
public interface EXT_texture_filter_anisotropic {
	@JsProperty
	public abstract double getMAX_TEXTURE_MAX_ANISOTROPY_EXT();

	@JsProperty
	public abstract void setMAX_TEXTURE_MAX_ANISOTROPY_EXT(final double value);

	@JsProperty
	public abstract double getTEXTURE_MAX_ANISOTROPY_EXT();

	@JsProperty
	public abstract void setTEXTURE_MAX_ANISOTROPY_EXT(final double value);
}
