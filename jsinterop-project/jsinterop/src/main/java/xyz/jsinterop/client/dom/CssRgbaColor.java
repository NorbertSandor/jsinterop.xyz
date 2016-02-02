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

import com.google.common.base.Preconditions;

/**
 * Represents a CSS RGB or RGBA color value.
 * 
 * @see <a href="https://developer.mozilla.org/en/docs/Web/CSS/color#rgb%28%29">
 *      MDN / CSS / rgb()</a>
 * @see <a href=
 *      "https://developer.mozilla.org/en/docs/Web/CSS/color#rgba%28%29">MDN /
 *      CSS / rgba()</a>
 * @see <span>API documentation is based on
 *      <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/Reference">MDN
 *      / CSS</a> by Mozilla Contributors, licensed under CC-BY-SA 2.5</span>
 */
public class CssRgbaColor implements HasCssColorValue {
	private final int r;

	private final int g;

	private final int b;

	private final double a;

	private final String cssColorValue;

	public CssRgbaColor(final int r, final int g, final int b) {
		this(r, g, b, 1.0);
	}

	public CssRgbaColor(final int r, final int g, final int b, final double a) {
		Preconditions.checkArgument(0 <= r && r <= 255, "Parameter 'r' should be 0 <= r <= 255");
		Preconditions.checkArgument(0 <= g && g <= 255, "Parameter 'g' should be 0 <= g <= 255");
		Preconditions.checkArgument(0 <= b && b <= 255, "Parameter 'b' should be 0 <= b <= 255");
		Preconditions.checkArgument(0.0 <= a && a <= 1.0, "Parameter 'a' should be 0.0 <= a <= 1.0");

		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;

		this.cssColorValue = (a == 1.0) ? "#" + toHexComponent(r) + ", " + toHexComponent(g) + ", " + toHexComponent(b)
				: "rgba(" + r + ", " + g + ", " + b + ", " + a + ")";
	}

	private String toHexComponent(int value) {
		String hexValue = Integer.toHexString(value);
		return hexValue.length() < 2 ? "0" + hexValue : hexValue;
	}

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

	public double getA() {
		return a;
	}

	@Override
	public String getCssColorValue() {
		return cssColorValue;
	}

	@Override
	public String toString() {
		return getCssColorValue();
	}
}
