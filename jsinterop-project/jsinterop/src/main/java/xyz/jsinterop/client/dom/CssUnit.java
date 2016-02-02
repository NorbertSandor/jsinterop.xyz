/*
 * #%L
 * JsInterop.xyz
 * %%
 * Copyright (C) 2016 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */
package xyz.jsinterop.client.dom;

/**
 * CSS length units.
 * 
 * @see <a href="https://developer.mozilla.org/en/docs/Web/CSS/length#Units">MDN
 *      / CSS / length units</a>
 * @see <span>API documentation is based on
 *      <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/Reference">MDN
 *      / CSS</a> by Mozilla Contributors, licensed under CC-BY-SA 2.5</span>
 */
public enum CssUnit {
	/**
	 * This unit represents the calculated {@code font-size} of the element. If
	 * used on the {@code font-size} property itself, it represents the
	 * inherited {@code font-size} of the element.
	 */
	EM {
		@Override
		public String getCssValue() {
			return "em";
		}
	},
	/**
	 * This unit represents the x-height of the element's font. On fonts with
	 * the 'x' letter, this is generally the height of lowercase letters in the
	 * font; 1ex ≈ 0.5em in many fonts.
	 */
	EX {
		@Override
		public String getCssValue() {
			return "ex";
		}
	},
	/**
	 * This unit represents the width, or more precisely the advance measure, of
	 * the glyph '0' (zero, the Unicode character U+0030) in the element's font.
	 */
	CH {
		@Override
		public String getCssValue() {
			return "ch";
		}
	},
	/**
	 * This unit represents the {@code font-size} of the root element (e.g. the
	 * {@code font-size} of the {@code <html>} element). When used on the
	 * {@code font-size} on this root element, it represents its initial value.
	 */
	REM {
		@Override
		public String getCssValue() {
			return "rem";
		}
	},
	/**
	 * 1/100th of the height of the viewport.
	 */
	VH {
		@Override
		public String getCssValue() {
			return "vh";
		}
	},
	/**
	 * 1/100th of the width of the viewport.
	 */
	VW {
		@Override
		public String getCssValue() {
			return "vh";
		}
	},
	/**
	 * 1/100th of the minimum value between the height and the width of the
	 * viewport.
	 */
	VMIN {
		@Override
		public String getCssValue() {
			return "vmin";
		}
	},
	/**
	 * 1/100th of the maximum value between the height and the width of the
	 * viewport.
	 */
	VMAX {
		@Override
		public String getCssValue() {
			return "vmax";
		}
	},
	/**
	 * Relative to the viewing device.<br>
	 * For screen display, typically one device pixel (dot) of the display.<br>
	 * For printers and very high resolution screens one CSS pixel implies
	 * multiple device pixels, so that the number of pixel per inch stays around
	 * 96.
	 */
	PX {
		@Override
		public String getCssValue() {
			return "px";
		}
	},
	/**
	 * One millimeter.
	 */
	MM {
		@Override
		public String getCssValue() {
			return "mm";
		}
	},
	/**
	 * One centimeter (10 millimeters).
	 */
	CM {
		@Override
		public String getCssValue() {
			return "cm";
		}
	},
	/**
	 * One inch (2.54 centimeters).
	 */
	IN {
		@Override
		public String getCssValue() {
			return "in";
		}
	},
	/**
	 * One point (which is 1/72 of an inch).
	 */
	PT {
		@Override
		public String getCssValue() {
			return "pt";
		}
	},
	/**
	 * One pica (which is 12 points).
	 */
	PC {
		@Override
		public String getCssValue() {
			return "pc";
		}
	},
	/**
	 * An experimental unit which attempts to render at exactly one millimeter
	 * regardless of the size or resolution of the display. This is rarely
	 * actually what you want, but may be useful in particular for mobile
	 * devices.
	 */
	MOZMM {
		@Override
		public String getCssValue() {
			return "mozmm";
		}
	},
	PCT {
		@Override
		public String getCssValue() {
			return "%";
		}
	};

	public abstract String getCssValue();
}
