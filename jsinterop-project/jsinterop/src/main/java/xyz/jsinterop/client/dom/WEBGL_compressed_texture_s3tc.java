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
public interface WEBGL_compressed_texture_s3tc {
	@JsProperty
	public abstract double getCOMPRESSED_RGBA_S3TC_DXT1_EXT();

	@JsProperty
	public abstract void setCOMPRESSED_RGBA_S3TC_DXT1_EXT(final double value);

	@JsProperty
	public abstract double getCOMPRESSED_RGBA_S3TC_DXT3_EXT();

	@JsProperty
	public abstract void setCOMPRESSED_RGBA_S3TC_DXT3_EXT(final double value);

	@JsProperty
	public abstract double getCOMPRESSED_RGBA_S3TC_DXT5_EXT();

	@JsProperty
	public abstract void setCOMPRESSED_RGBA_S3TC_DXT5_EXT(final double value);

	@JsProperty
	public abstract double getCOMPRESSED_RGB_S3TC_DXT1_EXT();

	@JsProperty
	public abstract void setCOMPRESSED_RGB_S3TC_DXT1_EXT(final double value);
}
