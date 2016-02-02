/*
 * #%L
 * JsInterop.xyz
 * %%
 * Copyright (C) 2015 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */
package xyz.jsinterop.client.dom;

/**
 * Special CSS color values.
 * 
 * @see <span>API documentation is based on
 *      <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/Reference">MDN
 *      / CSS</a> by Mozilla Contributors, licensed under CC-BY-SA 2.5</span>
 */
public enum CssSpecialColor implements HasCssColorValue {
	/**
	 * #see <a href=
	 * "https://developer.mozilla.org/en-US/docs/Web/CSS/color_value#transparent_keyword">
	 * MDN / CSS / transparent</a>
	 */
	TRANSPARENT {
		@Override
		public String getCssColorValue() {
			return "transparent";
		}
	},
	/**
	 * #see <a href=
	 * "https://developer.mozilla.org/en-US/docs/Web/CSS/color_value#currentColor_keyword">
	 * MDN / CSS / currentColor</a>
	 */
	CURRENT_COLOR {
		@Override
		public String getCssColorValue() {
			return "currentColor";
		}
	}
}
