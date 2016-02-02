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
 * Global CSS styles.
 * 
 * @see <span>API documentation is based on
 *      <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/Reference">MDN
 *      / CSS</a> by Mozilla Contributors, licensed under CC-BY-SA 2.5</span>
 */
public enum CssGlobalStyle {
	/**
	 * The {@code inherit} CSS-value causes the element for which it is
	 * specified to take the computed value of the property from its parent
	 * element. It is allowed on every CSS property.
	 * 
	 * @see <a href="https://developer.mozilla.org/en/docs/Web/CSS/inherit"> MDN
	 *      / CSS / inherit</a>
	 */
	INHERIT {
		@Override
		public String getCssPropertyValue() {
			return "inherit";
		}
	},
	/**
	 * The {@code initial} CSS keyword applies the initial value of a property
	 * to an element. It is allowed on every CSS property and causes the element
	 * for which it is specified to use the initial value of the property.
	 * 
	 * @see <a href= "https://developer.mozilla.org/en-US/docs/Web/CSS/initial">
	 *      MDN / CSS / initial</a>
	 */
	INITIAL {
		@Override
		public String getCssPropertyValue() {
			return "initial";
		}
	},
	/**
	 * The {@code unset} CSS keyword is the combination of the {@code initial}
	 * and {@code inherit} keywords. Like these two other CSS-wide keywords, it
	 * can be applied to any CSS property, including the CSS shorthand
	 * {@code all}. This keyword resets the property to its inherited value if
	 * it inherits from its parent or to its initial value if not. In other
	 * words, it behaves like the inherit keyword in the first case and like the
	 * initial keyword in the second case.
	 * 
	 * @see <a href= "https://developer.mozilla.org/en/docs/Web/CSS/unset"> MDN
	 *      / CSS / unset</a>
	 */
	UNSET {
		@Override
		public String getCssPropertyValue() {
			return "unset";
		}
	};

	public abstract String getCssPropertyValue();
}