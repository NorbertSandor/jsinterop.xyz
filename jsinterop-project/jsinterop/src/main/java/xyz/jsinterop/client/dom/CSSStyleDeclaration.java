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

import com.google.common.base.Preconditions;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Represents a collection of CSS property-value pairs.
 * 
 * @see <a href=
 *      "https://developer.mozilla.org/en/docs/Web/API/CSSStyleDeclaration">MDN
 *      / CSSStyleDeclaration</a>
 * @see <span>API documentation is based on
 *      <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/Reference">MDN
 *      / CSS</a> by Mozilla Contributors, licensed under CC-BY-SA 2.5</span>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface CSSStyleDeclaration {
	/**
	 * @see #setAlignContent(String)
	 */
	@JsProperty
	public abstract String getAlignContent();

	/**
	 * @see #setAlignContent(String)
	 */
	@JsProperty
	public abstract void setAlignContent(final String value);

	/**
	 * Values for {@link CSSStyleDeclaration#setAlignContent(AlignContent)}.
	 */
	enum AlignContent {
		/**
		 * Lines are packed starting from the cross-start. Cross-start edge of
		 * the first line and cross-start edge of the flex container are flushed
		 * together. Each following line is flush with the preceding.
		 */
		FLEX_START {
			@Override
			public String getCssPropertyValue() {
				return "flex-start";
			}
		},
		/**
		 * Lines are packed starting from the cross-end. Cross-end of the last
		 * line and cross-end of the flex container are flushed together. Each
		 * preceding line is flushed with the following line.
		 */
		FLEX_END {
			@Override
			public String getCssPropertyValue() {
				return "flex-end";
			}
		},
		/**
		 * Lines are packed toward the center of the flex container. The lines
		 * are flushed with each other and aligned in the center of the flex
		 * container. Space between the cross-start edge of the flex container
		 * and first line and between cross-end of the flex container and the
		 * last line is the same.
		 */
		CENTER {
			@Override
			public String getCssPropertyValue() {
				return "center";
			}
		},
		/**
		 * Lines are evenly distributed in the flex container. The spacing is
		 * done such as the space between two adjacent items is the same.
		 * Cross-start edge and cross-end edge of the flex container are flushed
		 * with respectively first and last line edges.
		 */
		SPACE_BETWEEN {
			@Override
			public String getCssPropertyValue() {
				return "space-between";
			}
		},
		/**
		 * Lines are evenly distributed so that the space between two adjacent
		 * lines is the same. The empty space before the first and after the
		 * last lines equals half of the space between two adjacent lines.
		 */
		SPACE_AROUND {
			@Override
			public String getCssPropertyValue() {
				return "space-around";
			}
		},
		/**
		 * Lines stretch to use the remaining space. The free-space is split
		 * equally between all the lines.
		 */
		STRETCH {
			@Override
			public String getCssPropertyValue() {
				return "stretch";
			}
		};

		public abstract String getCssPropertyValue();
	}

	/**
	 * Aligns a flex container's lines within the flex container when there is
	 * extra space on the cross-axis.<br>
	 * This property has no effect on single line flexible boxes.
	 *
	 * @see <a href="https://developer.mozilla.org/docs/Web/CSS/align-content">
	 *      MDN / CSS / align-content</a>
	 */
	@JsOverlay
	public default void setAlignContent(final AlignContent value) {
		setAlignContent(value.getCssPropertyValue());
	}

	/**
	 * @see #setAlignContent(String)
	 */
	@JsOverlay
	public default void setAlignContent(final CssGlobalStyle value) {
		setAlignContent(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getAlignItems();

	@JsProperty
	public abstract void setAlignItems(final String value);

	@JsProperty
	public abstract String getAlignSelf();

	@JsProperty
	public abstract void setAlignSelf(final String value);

	@JsProperty
	public abstract String getAlignmentBaseline();

	@JsProperty
	public abstract void setAlignmentBaseline(final String value);

	@JsProperty
	public abstract String getAnimation();

	@JsProperty
	public abstract void setAnimation(final String value);

	@JsProperty
	public abstract String getAnimationDelay();

	@JsProperty
	public abstract void setAnimationDelay(final String value);

	@JsProperty
	public abstract String getAnimationDirection();

	@JsProperty
	public abstract void setAnimationDirection(final String value);

	@JsProperty
	public abstract String getAnimationDuration();

	@JsProperty
	public abstract void setAnimationDuration(final String value);

	@JsProperty
	public abstract String getAnimationFillMode();

	@JsProperty
	public abstract void setAnimationFillMode(final String value);

	@JsProperty
	public abstract String getAnimationIterationCount();

	@JsProperty
	public abstract void setAnimationIterationCount(final String value);

	@JsProperty
	public abstract String getAnimationName();

	@JsProperty
	public abstract void setAnimationName(final String value);

	@JsProperty
	public abstract String getAnimationPlayState();

	@JsProperty
	public abstract void setAnimationPlayState(final String value);

	@JsProperty
	public abstract String getAnimationTimingFunction();

	@JsProperty
	public abstract void setAnimationTimingFunction(final String value);

	@JsProperty
	public abstract String getBackfaceVisibility();

	@JsProperty
	public abstract void setBackfaceVisibility(final String value);

	@JsProperty
	public abstract String getBackground();

	@JsProperty
	public abstract void setBackground(final String value);

	@JsProperty
	public abstract String getBackgroundAttachment();

	@JsProperty
	public abstract void setBackgroundAttachment(final String value);

	/**
	 * @see #setBackgroundClip(BackgroundClip)
	 */
	@JsProperty
	public abstract String getBackgroundClip();

	/**
	 * @see #setBackgroundClip(BackgroundClip)
	 */
	@JsProperty
	public abstract void setBackgroundClip(final String value);

	/**
	 * Values for {@link CSSStyleDeclaration#setBackgroundClip(BackgroundClip)}.
	 */
	enum BackgroundClip {
		/**
		 * The background extends to the outside edge of the border (but
		 * underneath the border in z-ordering).
		 */
		BORDER_BOX {
			@Override
			public String getCssPropertyValue() {
				return "border-box";
			}
		},
		/**
		 * No background is drawn below the border (background extends to the
		 * outside edge of the padding).
		 */
		PADDING_BOX {
			@Override
			public String getCssPropertyValue() {
				return "padding-box";
			}
		},
		/**
		 * The background is painted within (clipped to) the content box.
		 */
		CONTENT_BOX {
			@Override
			public String getCssPropertyValue() {
				return "content-box";
			}
		};

		public abstract String getCssPropertyValue();
	}

	/**
	 * @see #setBackgroundClip(BackgroundClip)
	 */
	@JsOverlay
	public default void setBackgroundClip(final BackgroundClip value) {
		setBackgroundClip(value.getCssPropertyValue());
	}

	/**
	 * @see #setBackgroundClip(BackgroundClip)
	 */
	@JsOverlay
	public default void setBackgroundClip(final CssGlobalStyle value) {
		setBackgroundClip(value.getCssPropertyValue());
	}

	/**
	 * @see #setBackgroundColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract String getBackgroundColor();

	/**
	 * @see #setBackgroundColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract void setBackgroundColor(final String value);

	/**
	 * Sets the background color of an element.
	 *
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/background-color">
	 *      MDN / CSS / background-color</a>
	 */
	@JsOverlay
	public default void setBackgroundColor(final HasCssColorValue value) {
		setBackgroundColor(value.getCssColorValue());
	}

	/**
	 * @see #setBackgroundColor(HasCssColorValue)
	 */
	@JsOverlay
	public default void setBackgroundColor(final CssGlobalStyle value) {
		setBackgroundColor(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getBackgroundImage();

	@JsProperty
	public abstract void setBackgroundImage(final String value);

	@JsProperty
	public abstract String getBackgroundOrigin();

	@JsProperty
	public abstract void setBackgroundOrigin(final String value);

	@JsProperty
	public abstract String getBackgroundPosition();

	@JsProperty
	public abstract void setBackgroundPosition(final String value);

	@JsProperty
	public abstract String getBackgroundPositionX();

	@JsProperty
	public abstract void setBackgroundPositionX(final String value);

	@JsProperty
	public abstract String getBackgroundPositionY();

	@JsProperty
	public abstract void setBackgroundPositionY(final String value);

	/**
	 * @see #setBackgroundRepeat(BackgroundRepeat, BackgroundRepeat)
	 */
	@JsProperty
	public abstract String getBackgroundRepeat();

	/**
	 * @see #setBackgroundRepeat(BackgroundRepeat, BackgroundRepeat)
	 */
	@JsProperty
	public abstract void setBackgroundRepeat(final String value);

	/**
	 * Values for
	 * {@link CSSStyleDeclaration#setBackgroundRepeat(BackgroundRepeatShortcut)}
	 * .
	 */
	enum BackgroundRepeatShortcut {
		/**
		 * Equivalent to {@code repeat no-repeat}.
		 */
		REPEAT_X {
			@Override
			public String getCssPropertyValue() {
				return "repeat-x";
			}
		},
		/**
		 * Equivalent to {@code no-repeat repeat}.
		 */
		REPEAT_Y {
			@Override
			public String getCssPropertyValue() {
				return "repeat-y";
			}
		},
		/**
		 * Equivalent to {@code repeat repeat}.
		 */
		REPEAT {
			@Override
			public String getCssPropertyValue() {
				return "repeat";
			}
		},
		/**
		 * Equivalent to {@code space space}.
		 */
		SPACE {
			@Override
			public String getCssPropertyValue() {
				return "space";
			}
		},
		/**
		 * Equivalent to {@code round round}.
		 */
		ROUND {
			@Override
			public String getCssPropertyValue() {
				return "round";
			}
		},
		/**
		 * Equivalent to {@code no-repeat no-repeat}.
		 */
		NO_REPEAT {
			@Override
			public String getCssPropertyValue() {
				return "no-repeat";
			}
		};

		public abstract String getCssPropertyValue();
	}

	/**
	 * Sets {@code background-repeat} for both directions.
	 * 
	 * @see #setBackgroundRepeat(BackgroundRepeat, BackgroundRepeat)
	 */
	@JsOverlay
	public default void setBackgroundRepeat(final BackgroundRepeatShortcut value) {
		setBackgroundRepeat(value.getCssPropertyValue());
	}

	/**
	 * Sets {@code background-repeat} for both directions.
	 * 
	 * @see #setBackgroundRepeat(BackgroundRepeat, BackgroundRepeat)
	 */
	@JsOverlay
	public default void setBackgroundRepeat(final CssGlobalStyle value) {
		setBackgroundRepeat(value.getCssPropertyValue());
	}

	/**
	 * Values for
	 * {@link CSSStyleDeclaration#setBackgroundRepeat(BackgroundRepeat, BackgroundRepeat)}
	 * .
	 */
	enum BackgroundRepeat {
		/**
		 * The image is repeated as much as needed to cover the whole background
		 * image painting area. The last image will be clipped if it doesn't
		 * fit.
		 */
		REPEAT {
			@Override
			public String getCssPropertyValue() {
				return "repeat";
			}
		},
		/**
		 * The image is repeated as much as possible without clipping. The first
		 * and last images are pinned to either side of the element, and
		 * whitespace is distributed evenly between the images. The
		 * {@code background-position} property is ignored unless only one image
		 * can be displayed without clipping. The only case where clipping
		 * happens using space is when there isn't enough room to display one
		 * image.
		 */
		SPACE {
			@Override
			public String getCssPropertyValue() {
				return "space";
			}
		},
		/**
		 * As the allowed space increases in size, the repeated images will
		 * stretch (leaving no gaps) until there is room for another one to be
		 * added. When the next image is added, all of the current ones compress
		 * to allow room. Example: An image with an original width of 260px,
		 * repeated three times, might stretch until each repetition is 300px
		 * wide, and then another image will be added. They will then compress
		 * to 225px.
		 */
		ROUND {
			@Override
			public String getCssPropertyValue() {
				return "round";
			}
		},
		/**
		 * The image is not repeated (and hence the background image painting
		 * area will not necessarily be entirely covered). The position of the
		 * non-repeated background image is defined by the
		 * {@code background-position} CSS property.
		 */
		NO_REPEAT {
			@Override
			public String getCssPropertyValue() {
				return "no-repeat";
			}
		};

		public abstract String getCssPropertyValue();
	}

	/**
	 * Defines how background images are repeated. A background image can be
	 * repeated along the horizontal axis, the vertical axis, both axes, or not
	 * repeated at all.<br>
	 * By default, the repeated images are clipped to the size of the element,
	 * but they can be scaled to fit (using round) or evenly distributed from
	 * end to end (using space).
	 * 
	 * @see #setBackgroundRepeat(BackgroundRepeatShortcut)
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat">
	 *      MDN / CSS / background-repeat</a>
	 */
	@JsOverlay
	public default void setBackgroundRepeat(final BackgroundRepeat horizontal, final BackgroundRepeat vertical) {
		Preconditions.checkNotNull(horizontal, "'horizontal' should not be null.");
		Preconditions.checkNotNull(vertical, "'vertical' should not be null.");

		setBackgroundRepeat(horizontal.getCssPropertyValue() + " " + vertical.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getBackgroundSize();

	@JsProperty
	public abstract void setBackgroundSize(final String value);

	@JsProperty
	public abstract String getBaselineShift();

	@JsProperty
	public abstract void setBaselineShift(final String value);

	@JsProperty
	public abstract String getBorder();

	@JsProperty
	public abstract void setBorder(final String value);

	@JsProperty
	public abstract String getBorderBottom();

	@JsProperty
	public abstract void setBorderBottom(final String value);

	/**
	 * @see #setBorderBottomColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract String getBorderBottomColor();

	/**
	 * @see #setBorderBottomColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract void setBorderBottomColor(final String value);

	/**
	 * Sets the color of the bottom border of an element.
	 *
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color">
	 *      MDN / CSS / border-bottom-color</a>
	 */
	@JsOverlay
	public default void setBorderBottomColor(final HasCssColorValue value) {
		setBorderBottomColor(value.getCssColorValue());
	}

	/**
	 * @see #setBorderBottomColor(HasCssColorValue)
	 */
	@JsOverlay
	public default void setBorderBottomColor(final CssGlobalStyle value) {
		setBorderBottomColor(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getBorderBottomLeftRadius();

	@JsProperty
	public abstract void setBorderBottomLeftRadius(final String value);

	@JsProperty
	public abstract String getBorderBottomRightRadius();

	@JsProperty
	public abstract void setBorderBottomRightRadius(final String value);

	@JsProperty
	public abstract String getBorderBottomStyle();

	@JsProperty
	public abstract void setBorderBottomStyle(final String value);

	@JsProperty
	public abstract String getBorderBottomWidth();

	@JsProperty
	public abstract void setBorderBottomWidth(final String value);

	@JsProperty
	public abstract String getBorderCollapse();

	@JsProperty
	public abstract void setBorderCollapse(final String value);

	/**
	 * @see #setBorderColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract String getBorderColor();

	/**
	 * @see #setBorderColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract void setBorderColor(final String value);

	/**
	 * A shorthand for setting the color of the four sides of an element's
	 * border.
	 *
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/border-color"> MDN
	 *      / CSS / border-color</a>
	 */
	@JsOverlay
	public default void setBorderColor(final HasCssColorValue value) {
		setBorderColor(value.getCssColorValue());
	}

	/**
	 * @see #setBorderColor(HasCssColorValue)
	 */
	@JsOverlay
	public default void setBorderColor(final CssGlobalStyle value) {
		setBorderColor(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getBorderImage();

	@JsProperty
	public abstract void setBorderImage(final String value);

	@JsProperty
	public abstract String getBorderImageOutset();

	@JsProperty
	public abstract void setBorderImageOutset(final String value);

	@JsProperty
	public abstract String getBorderImageRepeat();

	@JsProperty
	public abstract void setBorderImageRepeat(final String value);

	@JsProperty
	public abstract String getBorderImageSlice();

	@JsProperty
	public abstract void setBorderImageSlice(final String value);

	@JsProperty
	public abstract String getBorderImageSource();

	@JsProperty
	public abstract void setBorderImageSource(final String value);

	@JsProperty
	public abstract String getBorderImageWidth();

	@JsProperty
	public abstract void setBorderImageWidth(final String value);

	@JsProperty
	public abstract String getBorderLeft();

	@JsProperty
	public abstract void setBorderLeft(final String value);

	/**
	 * @see #setBorderLeftColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract String getBorderLeftColor();

	/**
	 * @see #setBorderLeftColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract void setBorderLeftColor(final String value);

	/**
	 * Sets the color of the left border of an element.
	 *
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color">
	 *      MDN / CSS / border-left-color</a>
	 */
	@JsOverlay
	public default void setBorderLeftColor(final HasCssColorValue value) {
		setBorderLeftColor(value.getCssColorValue());
	}

	/**
	 * @see #setBorderLeftColor(HasCssColorValue)
	 */
	@JsOverlay
	public default void setBorderLeftColor(final CssGlobalStyle value) {
		setBorderLeftColor(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getBorderLeftStyle();

	@JsProperty
	public abstract void setBorderLeftStyle(final String value);

	@JsProperty
	public abstract String getBorderLeftWidth();

	@JsProperty
	public abstract void setBorderLeftWidth(final String value);

	@JsProperty
	public abstract String getBorderRadius();

	@JsProperty
	public abstract void setBorderRadius(final String value);

	@JsProperty
	public abstract String getBorderRight();

	@JsProperty
	public abstract void setBorderRight(final String value);

	/**
	 * @see #setBorderRightColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract String getBorderRightColor();

	/**
	 * @see #setBorderRightColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract void setBorderRightColor(final String value);

	/**
	 * Sets the color of the right border of an element.
	 *
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color">
	 *      MDN / CSS / border-right-color</a>
	 */
	@JsOverlay
	public default void setBorderRightColor(final HasCssColorValue value) {
		setBorderRightColor(value.getCssColorValue());
	}

	/**
	 * @see #setBorderRightColor(HasCssColorValue)
	 */
	@JsOverlay
	public default void setBorderRightColor(final CssGlobalStyle value) {
		setBorderRightColor(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getBorderRightStyle();

	@JsProperty
	public abstract void setBorderRightStyle(final String value);

	@JsProperty
	public abstract String getBorderRightWidth();

	@JsProperty
	public abstract void setBorderRightWidth(final String value);

	@JsProperty
	public abstract String getBorderSpacing();

	@JsProperty
	public abstract void setBorderSpacing(final String value);

	@JsProperty
	public abstract String getBorderStyle();

	@JsProperty
	public abstract void setBorderStyle(final String value);

	@JsProperty
	public abstract String getBorderTop();

	@JsProperty
	public abstract void setBorderTop(final String value);

	/**
	 * @see #setBorderTopColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract String getBorderTopColor();

	/**
	 * @see #setBorderTopColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract void setBorderTopColor(final String value);

	/**
	 * Sets the color of the top border of an element.
	 *
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color">
	 *      MDN / CSS / border-top-color</a>
	 */
	@JsOverlay
	public default void setBorderTopColor(final HasCssColorValue value) {
		setBorderTopColor(value.getCssColorValue());
	}

	/**
	 * @see #setBorderTopColor(HasCssColorValue)
	 */
	@JsOverlay
	public default void setBorderTopColor(final CssGlobalStyle value) {
		setBorderTopColor(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getBorderTopLeftRadius();

	@JsProperty
	public abstract void setBorderTopLeftRadius(final String value);

	@JsProperty
	public abstract String getBorderTopRightRadius();

	@JsProperty
	public abstract void setBorderTopRightRadius(final String value);

	@JsProperty
	public abstract String getBorderTopStyle();

	@JsProperty
	public abstract void setBorderTopStyle(final String value);

	@JsProperty
	public abstract String getBorderTopWidth();

	@JsProperty
	public abstract void setBorderTopWidth(final String value);

	@JsProperty
	public abstract String getBorderWidth();

	@JsProperty
	public abstract void setBorderWidth(final String value);

	@JsProperty
	public abstract String getBottom();

	@JsProperty
	public abstract void setBottom(final String value);

	@JsProperty
	public abstract String getBoxShadow();

	@JsProperty
	public abstract void setBoxShadow(final String value);

	@JsProperty
	public abstract String getBoxSizing();

	@JsProperty
	public abstract void setBoxSizing(final String value);

	@JsProperty
	public abstract String getBreakAfter();

	@JsProperty
	public abstract void setBreakAfter(final String value);

	@JsProperty
	public abstract String getBreakBefore();

	@JsProperty
	public abstract void setBreakBefore(final String value);

	@JsProperty
	public abstract String getBreakInside();

	@JsProperty
	public abstract void setBreakInside(final String value);

	@JsProperty
	public abstract String getCaptionSide();

	@JsProperty
	public abstract void setCaptionSide(final String value);

	/**
	 * @see #setClear(Clear)
	 */
	@JsProperty
	public abstract String getClear();

	/**
	 * @see #setClear(Clear)
	 */
	@JsProperty
	public abstract void setClear(final String value);

	/**
	 * Values for {@link CSSStyleDeclaration#setClear(Clear)} .
	 */
	enum Clear {
		/**
		 * Is a keyword indicating that the element is not moved down to clear
		 * past floating elements.
		 */
		NONE {
			@Override
			public String getCssPropertyValue() {
				return "none";
			}
		},
		/**
		 * Is a keyword indicating that the element is moved down to clear past
		 * left floats.
		 */
		LEFT {
			@Override
			public String getCssPropertyValue() {
				return "left";
			}
		},
		/**
		 * Is a keyword indicating that the element is moved down to clear past
		 * right floats.
		 */
		RIGHT {
			@Override
			public String getCssPropertyValue() {
				return "right";
			}
		},
		/**
		 * Is a keyword indicating that the element is moved down to clear past
		 * both left and right floats.
		 */
		BOTH {
			@Override
			public String getCssPropertyValue() {
				return "both";
			}
		},
		/**
		 * Is a keyword indicating that the element is moved down to clear
		 * floats on start side of its containing block, that is the left floats
		 * on ltr scripts and the right floats on rtl scripts.
		 */
		INLINE_START {
			@Override
			public String getCssPropertyValue() {
				return "inline-start";
			}
		},
		/**
		 * Is a keyword indicating that the element is moved down to clear
		 * floats on end side of its containing block, that is the right floats
		 * on ltr scripts and the left floats on rtl scripts.
		 */
		INLINE_END {
			@Override
			public String getCssPropertyValue() {
				return "inline-end";
			}
		};
		public abstract String getCssPropertyValue();
	}

	/**
	 * Specifies whether an element can be next to floating elements that
	 * precede it or must be moved down (cleared) below them. The clear property
	 * applies to both floating and non-floating elements.
	 *
	 * @see <a href= "https://developer.mozilla.org/en-US/docs/Web/CSS/clear">
	 *      MDN / CSS / clear</a>
	 */
	@JsOverlay
	public default void setClear(final Clear value) {
		setClear(value.getCssPropertyValue());
	}

	/**
	 * @see #setClear(Clear)
	 */
	@JsOverlay
	public default void setClear(final CssGlobalStyle value) {
		setClear(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getClip();

	@JsProperty
	public abstract void setClip(final String value);

	@JsProperty
	public abstract String getClipPath();

	@JsProperty
	public abstract void setClipPath(final String value);

	@JsProperty
	public abstract String getClipRule();

	@JsProperty
	public abstract void setClipRule(final String value);

	/**
	 * @see #setColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract String getColor();

	/**
	 * @see #setColor(HasCssColorValue)
	 */
	@JsProperty
	public abstract void setColor(final String value);

	/**
	 * Sets the foreground color of an element's text content, and its
	 * decorations.<br>
	 * It doesn't affect any other characteristic of the element.
	 *
	 * @see <a href= "https://developer.mozilla.org/en-US/docs/Web/CSS/color">
	 *      MDN / CSS / color</a>
	 */
	@JsOverlay
	public default void setColor(final HasCssColorValue value) {
		setColor(value.getCssColorValue());
	}

	/**
	 * @see #setColor(HasCssColorValue)
	 */
	@JsOverlay
	public default void setColor(final CssGlobalStyle value) {
		setColor(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getColorInterpolationFilters();

	@JsProperty
	public abstract void setColorInterpolationFilters(final String value);

	@JsProperty
	public abstract Object getColumnCount();

	@JsProperty
	public abstract void setColumnCount(final Object value);

	@JsProperty
	public abstract String getColumnFill();

	@JsProperty
	public abstract void setColumnFill(final String value);

	@JsProperty
	public abstract Object getColumnGap();

	@JsProperty
	public abstract void setColumnGap(final Object value);

	@JsProperty
	public abstract String getColumnRule();

	@JsProperty
	public abstract void setColumnRule(final String value);

	@JsProperty
	public abstract Object getColumnRuleColor();

	@JsProperty
	public abstract void setColumnRuleColor(final Object value);

	@JsProperty
	public abstract String getColumnRuleStyle();

	@JsProperty
	public abstract void setColumnRuleStyle(final String value);

	@JsProperty
	public abstract Object getColumnRuleWidth();

	@JsProperty
	public abstract void setColumnRuleWidth(final Object value);

	@JsProperty
	public abstract String getColumnSpan();

	@JsProperty
	public abstract void setColumnSpan(final String value);

	@JsProperty
	public abstract Object getColumnWidth();

	@JsProperty
	public abstract void setColumnWidth(final Object value);

	@JsProperty
	public abstract String getColumns();

	@JsProperty
	public abstract void setColumns(final String value);

	@JsProperty
	public abstract String getContent();

	@JsProperty
	public abstract void setContent(final String value);

	@JsProperty
	public abstract String getCounterIncrement();

	@JsProperty
	public abstract void setCounterIncrement(final String value);

	@JsProperty
	public abstract String getCounterReset();

	@JsProperty
	public abstract void setCounterReset(final String value);

	@JsProperty
	public abstract String getCssFloat();

	@JsProperty
	public abstract void setCssFloat(final String value);

	@JsProperty
	public abstract String getCssText();

	@JsProperty
	public abstract void setCssText(final String value);

	@JsProperty
	public abstract String getCursor();

	@JsProperty
	public abstract void setCursor(final String value);

	@JsProperty
	public abstract String getDirection();

	@JsProperty
	public abstract void setDirection(final String value);

	/**
	 * @see #setDisplay(Display)
	 */
	@JsProperty
	public abstract String getDisplay();

	/**
	 * @see #setDisplay(Display)
	 */
	@JsProperty
	public abstract void setDisplay(final String value);

	/**
	 * Values for {@link CSSStyleDeclaration#setDisplay(Display) display}.
	 */
	enum Display {
		/**
		 * Turns off the display of an element (it has no effect on layout); all
		 * descendant elements also have their display turned off. The document
		 * is rendered as though the element did not exist.
		 */
		NONE {
			@Override
			public String getCssPropertyValue() {
				return "none";
			}
		},
		/**
		 * The element generates one or more inline element boxes.
		 */
		INLINE {
			@Override
			public String getCssPropertyValue() {
				return "inline";
			}
		},
		/**
		 * The element generates a block element box.
		 */
		BLOCK {
			@Override
			public String getCssPropertyValue() {
				return "block";
			}
		},
		/**
		 * The element generates a block element box that will be flowed with
		 * surrounding content as if it were a single inline box (behaving much
		 * like a replaced element would).
		 */
		INLINE_BLOCK {
			@Override
			public String getCssPropertyValue() {
				return "inline-block";
			}
		},
		/**
		 * These elements don't produce a specific box by themselves. They are
		 * replaced by their pseudo-box and their child boxes.
		 */
		CONTENTS {
			@Override
			public String getCssPropertyValue() {
				return "contents";
			}
		},
		/**
		 * The element generates a block box for the content and a separate
		 * list-item inline box.
		 */
		LIST_ITEM {
			@Override
			public String getCssPropertyValue() {
				return "list-item";
			}
		},
		/**
		 * The inline-list-item display value makes the element a list item,
		 * with the effects described above. Additionally, the outside value of
		 * list-style-position computes to inside on this element. Otherwise,
		 * this display value is treated identically to inline.
		 */
		INLINE_LIST_ITEM {
			@Override
			public String getCssPropertyValue() {
				return "inline-list-item";
			}
		},
		/**
		 * These elements behave like {@code 
		 * 
		<table>
		 * } HTML elements. It defines a block-level box.
		 */
		TABLE {
			@Override
			public String getCssPropertyValue() {
				return "table";
			}
		},
		/**
		 * The inline-table value does not have a direct mapping in HTML. It
		 * behaves like a {@code 
		 * 
		<table>
		 * } HTML element, but as an inline box, rather than a block-level box.
		 * Inside the table box is a block-level context.
		 */
		INLINE_TABLE {
			@Override
			public String getCssPropertyValue() {
				return "inline-table";
			}
		},
		/**
		 * These elements behave like {@code 
		 * 
		<td>} HTML elements.
		 */
		TABLE_CELL {
			@Override
			public String getCssPropertyValue() {
				return "table-cell";
			}
		},
		/**
		 * These elements behave like {@code <col>} HTML elements.
		 */
		TABLE_COLUMN {
			@Override
			public String getCssPropertyValue() {
				return "table-column";
			}
		},
		/**
		 * These elements behave like {@code <colgroup>} HTML elements.
		 */
		TABLE_COLUMN_GROUP {
			@Override
			public String getCssPropertyValue() {
				return "table-column-group";
			}
		},
		/**
		 * These elements behave like {@code <tfoot>} HTML elements.
		 */
		TABLE_FOOTER_GROUP {
			@Override
			public String getCssPropertyValue() {
				return "table-footer-group";
			}
		},
		/**
		 * These elements behave like {@code <thead>} HTML elements.
		 */
		TABLE_HEADER_GROUP {
			@Override
			public String getCssPropertyValue() {
				return "table-header-group";
			}
		},
		/**
		 * These elements behave like {@code 
		 * 
		<tr>
		 * } HTML elements.
		 */
		TABLE_ROW {
			@Override
			public String getCssPropertyValue() {
				return "table-row";
			}
		},
		/**
		 * These elements behave like {@code <tbody>} HTML elements.
		 */
		TABLE_ROW_GROUP {
			@Override
			public String getCssPropertyValue() {
				return "table-row-group";
			}
		},
		/**
		 * These elements behave like {@code <caption>} HTML elements.
		 */
		TABLE_CAPTION {
			@Override
			public String getCssPropertyValue() {
				return "table-caption";
			}
		},
		/**
		 * The element behaves like a block element and lays out its content
		 * according to the flexbox model.
		 */
		FLEX {
			@Override
			public String getCssPropertyValue() {
				return "flex";
			}
		},
		/**
		 * The element behaves like an inline element and lays out its content
		 * according to the flexbox model.
		 */
		INLINE_FLEX {
			@Override
			public String getCssPropertyValue() {
				return "inline-flex";
			}
		},
		/**
		 * The element behaves like a block element and lays out its content
		 * according to the grid model.
		 */
		GRID {
			@Override
			public String getCssPropertyValue() {
				return "grid";
			}
		},
		/**
		 * The element behaves like an inline element and lays out its content
		 * according to the grid model.
		 */
		INLINE_GRID {
			@Override
			public String getCssPropertyValue() {
				return "inline-grid";
			}
		},
		/**
		 * The element behaves like an inline element and lays out its content
		 * according to the ruby formatting model. It behaves like the
		 * corresponding {@code <ruby>} HTML elements.
		 */
		RUBY {
			@Override
			public String getCssPropertyValue() {
				return "ruby";
			}
		},
		/**
		 * These elements behave like {@code <rb>} elements.
		 */
		RUBY_BASE {
			@Override
			public String getCssPropertyValue() {
				return "ruby-base";
			}
		},
		/**
		 * These elements behave like {@code <rt>} elements.
		 */
		RUBY_TEXT {
			@Override
			public String getCssPropertyValue() {
				return "ruby-text";
			}
		},
		/**
		 * These elements behave like {@code <rbc>} elements generated as
		 * anonymous boxes.
		 */
		RUBY_BASE_CONTAINER {
			@Override
			public String getCssPropertyValue() {
				return "ruby-base-container";
			}
		},
		/**
		 * These elements behave like {@code <rtc>} elements.
		 */
		RUBY_TEXT_CONTAINER {
			@Override
			public String getCssPropertyValue() {
				return "ruby-text-container";
			}
		},
		/**
		 * <ul>
		 * <li>If the run-in box contains a block box, same as block.</li>
		 * <li>If a block box follows the run-in box, the run-in box becomes the
		 * first inline box of the block box.</li>
		 * <li>If an inline box follows, the run-in box becomes a block box.
		 * </li>
		 * </ul>
		 */
		RUN_IN {
			@Override
			public String getCssPropertyValue() {
				return "run-in";
			}
		};

		public abstract String getCssPropertyValue();
	}

	/**
	 * Specifies the type of rendering box used for an element. In HTML, default
	 * {@code display} property values are taken from behaviors described in the
	 * HTML specifications or from the browser/user default stylesheet. The
	 * default value in XML is inline.<br>
	 * In addition to the many different display box types, the value
	 * {@code none} lets you turn off the display of an element; when you use
	 * {@code none}, all descendant elements also have their display turned off.
	 * The document is rendered as though the element doesn't exist in the
	 * document tree.
	 *
	 * @see <a href= "https://developer.mozilla.org/en-US/docs/Web/CSS/display">
	 *      MDN / CSS / display</a>
	 */
	@JsOverlay
	public default void setDisplay(final Display value) {
		setDisplay(value.getCssPropertyValue());
	}

	/**
	 * @see #setDisplay(Display)
	 */
	@JsOverlay
	public default void setDisplay(final CssGlobalStyle value) {
		setDisplay(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getDominantBaseline();

	@JsProperty
	public abstract void setDominantBaseline(final String value);

	@JsProperty
	public abstract String getEmptyCells();

	@JsProperty
	public abstract void setEmptyCells(final String value);

	@JsProperty
	public abstract String getEnableBackground();

	@JsProperty
	public abstract void setEnableBackground(final String value);

	@JsProperty
	public abstract String getFill();

	@JsProperty
	public abstract void setFill(final String value);

	@JsProperty
	public abstract String getFillOpacity();

	@JsProperty
	public abstract void setFillOpacity(final String value);

	@JsProperty
	public abstract String getFillRule();

	@JsProperty
	public abstract void setFillRule(final String value);

	@JsProperty
	public abstract String getFilter();

	@JsProperty
	public abstract void setFilter(final String value);

	@JsProperty
	public abstract String getFlex();

	@JsProperty
	public abstract void setFlex(final String value);

	@JsProperty
	public abstract String getFlexBasis();

	@JsProperty
	public abstract void setFlexBasis(final String value);

	@JsProperty
	public abstract String getFlexDirection();

	@JsProperty
	public abstract void setFlexDirection(final String value);

	@JsProperty
	public abstract String getFlexFlow();

	@JsProperty
	public abstract void setFlexFlow(final String value);

	@JsProperty
	public abstract String getFlexGrow();

	@JsProperty
	public abstract void setFlexGrow(final String value);

	@JsProperty
	public abstract String getFlexShrink();

	@JsProperty
	public abstract void setFlexShrink(final String value);

	@JsProperty
	public abstract String getFlexWrap();

	@JsProperty
	public abstract void setFlexWrap(final String value);

	@JsProperty
	public abstract String getFloodColor();

	@JsProperty
	public abstract void setFloodColor(final String value);

	@JsProperty
	public abstract String getFloodOpacity();

	@JsProperty
	public abstract void setFloodOpacity(final String value);

	@JsProperty
	public abstract String getFont();

	@JsProperty
	public abstract void setFont(final String value);

	@JsProperty
	public abstract String getFontFamily();

	@JsProperty
	public abstract void setFontFamily(final String value);

	@JsProperty
	public abstract String getFontFeatureSettings();

	@JsProperty
	public abstract void setFontFeatureSettings(final String value);

	@JsProperty
	public abstract String getFontSize();

	@JsProperty
	public abstract void setFontSize(final String value);

	@JsProperty
	public abstract String getFontSizeAdjust();

	@JsProperty
	public abstract void setFontSizeAdjust(final String value);

	@JsProperty
	public abstract String getFontStretch();

	@JsProperty
	public abstract void setFontStretch(final String value);

	@JsProperty
	public abstract String getFontStyle();

	@JsProperty
	public abstract void setFontStyle(final String value);

	@JsProperty
	public abstract String getFontVariant();

	@JsProperty
	public abstract void setFontVariant(final String value);

	@JsProperty
	public abstract String getFontWeight();

	@JsProperty
	public abstract void setFontWeight(final String value);

	@JsProperty
	public abstract String getGlyphOrientationHorizontal();

	@JsProperty
	public abstract void setGlyphOrientationHorizontal(final String value);

	@JsProperty
	public abstract String getGlyphOrientationVertical();

	@JsProperty
	public abstract void setGlyphOrientationVertical(final String value);

	@JsProperty
	public abstract String getHeight();

	@JsProperty
	public abstract void setHeight(final String value);

	@JsProperty
	public abstract String getImeMode();

	@JsProperty
	public abstract void setImeMode(final String value);

	@JsProperty
	public abstract String getJustifyContent();

	@JsProperty
	public abstract void setJustifyContent(final String value);

	@JsProperty
	public abstract String getKerning();

	@JsProperty
	public abstract void setKerning(final String value);

	@JsProperty
	public abstract String getLeft();

	@JsProperty
	public abstract void setLeft(final String value);

	@JsProperty
	public abstract double getLength();

	@JsProperty
	public abstract void setLength(final double value);

	@JsProperty
	public abstract String getLetterSpacing();

	@JsProperty
	public abstract void setLetterSpacing(final String value);

	@JsProperty
	public abstract String getLightingColor();

	@JsProperty
	public abstract void setLightingColor(final String value);

	@JsProperty
	public abstract String getLineHeight();

	@JsProperty
	public abstract void setLineHeight(final String value);

	@JsProperty
	public abstract String getListStyle();

	@JsProperty
	public abstract void setListStyle(final String value);

	@JsProperty
	public abstract String getListStyleImage();

	@JsProperty
	public abstract void setListStyleImage(final String value);

	@JsProperty
	public abstract String getListStylePosition();

	@JsProperty
	public abstract void setListStylePosition(final String value);

	@JsProperty
	public abstract String getListStyleType();

	@JsProperty
	public abstract void setListStyleType(final String value);

	/**
	 * @see #setMargin(double, CssUnit)
	 */
	@JsProperty
	public abstract String getMargin();

	/**
	 * @see #setMargin(double, CssUnit)
	 */
	@JsProperty
	public abstract void setMargin(final String value);

	/**
	 * Sets the margin for all four sides. It is a shorthand to avoid setting
	 * each side separately with the other margin properties.
	 * 
	 * @see <a href= "https://developer.mozilla.org/en-US/docs/Web/CSS/margin">
	 *      MDN / CSS / margin</a>
	 */
	@JsOverlay
	public default void setMargin(final double value, CssUnit unit) {
		setMargin(value + unit.getCssValue());
	}

	/**
	 * @see #setMargin(double, CssUnit)
	 */
	@JsOverlay
	public default void setMargin(final int value, CssUnit unit) {
		setMargin(value + unit.getCssValue());
	}

	/**
	 * @see #setMargin(double, CssUnit)
	 */
	@JsOverlay
	public default void setMargin(CssGlobalStyle value) {
		setMargin(value.getCssPropertyValue());
	}

	/**
	 * @see #setMarginBottom(double, CssUnit)
	 */
	@JsProperty
	public abstract String getMarginBottom();

	/**
	 * @see #setMarginBottom(double, CssUnit)
	 */
	@JsProperty
	public abstract void setMarginBottom(final String value);

	/**
	 * Sets the margin space required on the bottom of an element. A negative
	 * value is also allowed.<br>
	 * This property has no effect on non-replaced inline elements, like {@code 
	 * <tt>} or {@code <span>}.
	 * 
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/margin-bottom">
	 *      MDN / CSS / margin-bottom</a>
	 */
	@JsOverlay
	public default void setMarginBottom(final double value, CssUnit unit) {
		setMarginBottom(value + unit.getCssValue());
	}

	/**
	 * @see #setMarginBottom(double, CssUnit)
	 */
	@JsOverlay
	public default void setMarginBottom(final int value, CssUnit unit) {
		setMarginBottom(value + unit.getCssValue());
	}

	/**
	 * @see #setMarginBottom(double, CssUnit)
	 */
	@JsOverlay
	public default void setMarginBottom(CssGlobalStyle value) {
		setMarginBottom(value.getCssPropertyValue());
	}

	/**
	 * @see #setMarginLeft(double, CssUnit)
	 */
	@JsProperty
	public abstract String getMarginLeft();

	/**
	 * @see #setMarginLeft(double, CssUnit)
	 */
	@JsProperty
	public abstract void setMarginLeft(final String value);

	/**
	 * Sets the margin space required on the left side of a box associated with
	 * an element. A negative value is also allowed.
	 * 
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/margin-left"> MDN
	 *      / CSS / margin-left</a>
	 */
	@JsOverlay
	public default void setMarginLeft(final double value, CssUnit unit) {
		setMarginLeft(value + unit.getCssValue());
	}

	/**
	 * @see #setMarginLeft(double, CssUnit)
	 */
	@JsOverlay
	public default void setMarginLeft(final int value, CssUnit unit) {
		setMarginLeft(value + unit.getCssValue());
	}

	/**
	 * @see #setMarginLeft(double, CssUnit)
	 */
	@JsOverlay
	public default void setMarginLeft(CssGlobalStyle value) {
		setMarginLeft(value.getCssPropertyValue());
	}

	/**
	 * @see #setMarginRight(double, CssUnit)
	 */
	@JsProperty
	public abstract String getMarginRight();

	/**
	 * @see #setMarginRight(double, CssUnit)
	 */
	@JsProperty
	public abstract void setMarginRight(final String value);

	/**
	 * Sets the margin space required on the right side of an element. A
	 * negative value is also allowed.
	 * 
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/margin-right"> MDN
	 *      / CSS / margin-right</a>
	 */
	@JsOverlay
	public default void setMarginRight(final double value, CssUnit unit) {
		setMarginRight(value + unit.getCssValue());
	}

	/**
	 * @see #setMarginRight(double, CssUnit)
	 */
	@JsOverlay
	public default void setMarginRight(final int value, CssUnit unit) {
		setMarginRight(value + unit.getCssValue());
	}

	/**
	 * @see #setMarginRight(double, CssUnit)
	 */
	@JsOverlay
	public default void setMarginRight(CssGlobalStyle value) {
		setMarginRight(value.getCssPropertyValue());
	}

	/**
	 * @see #setMarginTop(double, CssUnit)
	 */
	@JsProperty
	public abstract String getMarginTop();

	/**
	 * @see #setMarginTop(double, CssUnit)
	 */
	@JsProperty
	public abstract void setMarginTop(final String value);

	/**
	 * Sets the margin space required on the top of an element. A negative value
	 * is also allowed.<br>
	 * This property has no effect on non-replaced inline elements, like {@code 
	 * <tt>} or {@code <span>}.
	 * 
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/margin-top"> MDN /
	 *      CSS / margin-top</a>
	 */
	@JsOverlay
	public default void setMarginTop(final double value, CssUnit unit) {
		setMarginTop(value + unit.getCssValue());
	}

	/**
	 * @see #setMarginTop(double, CssUnit)
	 */
	@JsOverlay
	public default void setMarginTop(final int value, CssUnit unit) {
		setMarginTop(value + unit.getCssValue());
	}

	/**
	 * @see #setMarginTop(double, CssUnit)
	 */
	@JsOverlay
	public default void setMarginTop(CssGlobalStyle value) {
		setMarginTop(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getMarker();

	@JsProperty
	public abstract void setMarker(final String value);

	@JsProperty
	public abstract String getMarkerEnd();

	@JsProperty
	public abstract void setMarkerEnd(final String value);

	@JsProperty
	public abstract String getMarkerMid();

	@JsProperty
	public abstract void setMarkerMid(final String value);

	@JsProperty
	public abstract String getMarkerStart();

	@JsProperty
	public abstract void setMarkerStart(final String value);

	@JsProperty
	public abstract String getMask();

	@JsProperty
	public abstract void setMask(final String value);

	@JsProperty
	public abstract String getMaxHeight();

	@JsProperty
	public abstract void setMaxHeight(final String value);

	@JsProperty
	public abstract String getMaxWidth();

	@JsProperty
	public abstract void setMaxWidth(final String value);

	@JsProperty
	public abstract String getMinHeight();

	@JsProperty
	public abstract void setMinHeight(final String value);

	@JsProperty
	public abstract String getMinWidth();

	@JsProperty
	public abstract void setMinWidth(final String value);

	@JsProperty
	public abstract String getMsContentZoomChaining();

	@JsProperty
	public abstract void setMsContentZoomChaining(final String value);

	@JsProperty
	public abstract String getMsContentZoomLimit();

	@JsProperty
	public abstract void setMsContentZoomLimit(final String value);

	@JsProperty
	public abstract Object getMsContentZoomLimitMax();

	@JsProperty
	public abstract void setMsContentZoomLimitMax(final Object value);

	@JsProperty
	public abstract Object getMsContentZoomLimitMin();

	@JsProperty
	public abstract void setMsContentZoomLimitMin(final Object value);

	@JsProperty
	public abstract String getMsContentZoomSnap();

	@JsProperty
	public abstract void setMsContentZoomSnap(final String value);

	@JsProperty
	public abstract String getMsContentZoomSnapPoints();

	@JsProperty
	public abstract void setMsContentZoomSnapPoints(final String value);

	@JsProperty
	public abstract String getMsContentZoomSnapType();

	@JsProperty
	public abstract void setMsContentZoomSnapType(final String value);

	@JsProperty
	public abstract String getMsContentZooming();

	@JsProperty
	public abstract void setMsContentZooming(final String value);

	@JsProperty
	public abstract String getMsFlowFrom();

	@JsProperty
	public abstract void setMsFlowFrom(final String value);

	@JsProperty
	public abstract String getMsFlowInto();

	@JsProperty
	public abstract void setMsFlowInto(final String value);

	@JsProperty
	public abstract String getMsFontFeatureSettings();

	@JsProperty
	public abstract void setMsFontFeatureSettings(final String value);

	@JsProperty
	public abstract Object getMsGridColumn();

	@JsProperty
	public abstract void setMsGridColumn(final Object value);

	@JsProperty
	public abstract String getMsGridColumnAlign();

	@JsProperty
	public abstract void setMsGridColumnAlign(final String value);

	@JsProperty
	public abstract Object getMsGridColumnSpan();

	@JsProperty
	public abstract void setMsGridColumnSpan(final Object value);

	@JsProperty
	public abstract String getMsGridColumns();

	@JsProperty
	public abstract void setMsGridColumns(final String value);

	@JsProperty
	public abstract Object getMsGridRow();

	@JsProperty
	public abstract void setMsGridRow(final Object value);

	@JsProperty
	public abstract String getMsGridRowAlign();

	@JsProperty
	public abstract void setMsGridRowAlign(final String value);

	@JsProperty
	public abstract Object getMsGridRowSpan();

	@JsProperty
	public abstract void setMsGridRowSpan(final Object value);

	@JsProperty
	public abstract String getMsGridRows();

	@JsProperty
	public abstract void setMsGridRows(final String value);

	@JsProperty
	public abstract String getMsHighContrastAdjust();

	@JsProperty
	public abstract void setMsHighContrastAdjust(final String value);

	@JsProperty
	public abstract String getMsHyphenateLimitChars();

	@JsProperty
	public abstract void setMsHyphenateLimitChars(final String value);

	@JsProperty
	public abstract Object getMsHyphenateLimitLines();

	@JsProperty
	public abstract void setMsHyphenateLimitLines(final Object value);

	@JsProperty
	public abstract Object getMsHyphenateLimitZone();

	@JsProperty
	public abstract void setMsHyphenateLimitZone(final Object value);

	@JsProperty
	public abstract String getMsHyphens();

	@JsProperty
	public abstract void setMsHyphens(final String value);

	@JsProperty
	public abstract String getMsImeAlign();

	@JsProperty
	public abstract void setMsImeAlign(final String value);

	@JsProperty
	public abstract String getMsOverflowStyle();

	@JsProperty
	public abstract void setMsOverflowStyle(final String value);

	@JsProperty
	public abstract String getMsScrollChaining();

	@JsProperty
	public abstract void setMsScrollChaining(final String value);

	@JsProperty
	public abstract String getMsScrollLimit();

	@JsProperty
	public abstract void setMsScrollLimit(final String value);

	@JsProperty
	public abstract Object getMsScrollLimitXMax();

	@JsProperty
	public abstract void setMsScrollLimitXMax(final Object value);

	@JsProperty
	public abstract Object getMsScrollLimitXMin();

	@JsProperty
	public abstract void setMsScrollLimitXMin(final Object value);

	@JsProperty
	public abstract Object getMsScrollLimitYMax();

	@JsProperty
	public abstract void setMsScrollLimitYMax(final Object value);

	@JsProperty
	public abstract Object getMsScrollLimitYMin();

	@JsProperty
	public abstract void setMsScrollLimitYMin(final Object value);

	@JsProperty
	public abstract String getMsScrollRails();

	@JsProperty
	public abstract void setMsScrollRails(final String value);

	@JsProperty
	public abstract String getMsScrollSnapPointsX();

	@JsProperty
	public abstract void setMsScrollSnapPointsX(final String value);

	@JsProperty
	public abstract String getMsScrollSnapPointsY();

	@JsProperty
	public abstract void setMsScrollSnapPointsY(final String value);

	@JsProperty
	public abstract String getMsScrollSnapType();

	@JsProperty
	public abstract void setMsScrollSnapType(final String value);

	@JsProperty
	public abstract String getMsScrollSnapX();

	@JsProperty
	public abstract void setMsScrollSnapX(final String value);

	@JsProperty
	public abstract String getMsScrollSnapY();

	@JsProperty
	public abstract void setMsScrollSnapY(final String value);

	@JsProperty
	public abstract String getMsScrollTranslation();

	@JsProperty
	public abstract void setMsScrollTranslation(final String value);

	@JsProperty
	public abstract String getMsTextCombineHorizontal();

	@JsProperty
	public abstract void setMsTextCombineHorizontal(final String value);

	@JsProperty
	public abstract Object getMsTextSizeAdjust();

	@JsProperty
	public abstract void setMsTextSizeAdjust(final Object value);

	@JsProperty
	public abstract String getMsTouchAction();

	@JsProperty
	public abstract void setMsTouchAction(final String value);

	@JsProperty
	public abstract String getMsTouchSelect();

	@JsProperty
	public abstract void setMsTouchSelect(final String value);

	@JsProperty
	public abstract String getMsUserSelect();

	@JsProperty
	public abstract void setMsUserSelect(final String value);

	@JsProperty
	public abstract String getMsWrapFlow();

	@JsProperty
	public abstract void setMsWrapFlow(final String value);

	@JsProperty
	public abstract Object getMsWrapMargin();

	@JsProperty
	public abstract void setMsWrapMargin(final Object value);

	@JsProperty
	public abstract String getMsWrapThrough();

	@JsProperty
	public abstract void setMsWrapThrough(final String value);

	@JsProperty
	public abstract String getOpacity();

	@JsProperty
	public abstract void setOpacity(final String value);

	@JsProperty
	public abstract String getOrder();

	@JsProperty
	public abstract void setOrder(final String value);

	@JsProperty
	public abstract String getOrphans();

	@JsProperty
	public abstract void setOrphans(final String value);

	@JsProperty
	public abstract String getOutline();

	@JsProperty
	public abstract void setOutline(final String value);

	@JsProperty
	public abstract String getOutlineColor();

	@JsProperty
	public abstract void setOutlineColor(final String value);

	@JsProperty
	public abstract String getOutlineStyle();

	@JsProperty
	public abstract void setOutlineStyle(final String value);

	@JsProperty
	public abstract String getOutlineWidth();

	@JsProperty
	public abstract void setOutlineWidth(final String value);

	/**
	 * @see #setOverflow(Overflow)
	 */
	@JsProperty
	public abstract String getOverflow();

	/**
	 * @see #setOverflow(Overflow)
	 */
	@JsProperty
	public abstract void setOverflow(final String value);

	/**
	 * Values for {@link CSSStyleDeclaration#setOverflow(Overflow) overflow}.
	 */
	enum Overflow {
		/**
		 * Default value. Content is not clipped, it may be rendered outside the
		 * content box.
		 */
		VISIBLE {
			@Override
			public String getCssPropertyValue() {
				return "visible";
			}
		},
		/**
		 * The content is clipped and no scrollbars are provided.
		 */
		HIDDEN {
			@Override
			public String getCssPropertyValue() {
				return "hidden";
			}
		},
		/**
		 * The content is clipped and desktop browsers use scrollbars, whether
		 * or not any content is clipped. This avoids any problem with
		 * scrollbars appearing and disappearing in a dynamic environment.
		 * Printers may print overflowing content.
		 */
		SCROLL {
			@Override
			public String getCssPropertyValue() {
				return "scroll";
			}
		},
		/**
		 * Depends on the user agent. Desktop browsers like Firefox provide
		 * scrollbars if content overflows.
		 */
		AUTO {
			@Override
			public String getCssPropertyValue() {
				return "auto";
			}
		};

		public abstract String getCssPropertyValue();
	}

	/**
	 * Specifies whether to clip content, render scrollbars or just display
	 * content when it overflows its block level container.
	 *
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/overflow"> MDN /
	 *      CSS / overflow</a>
	 */
	@JsOverlay
	public default void setOverflow(final Overflow value) {
		setOverflow(value.getCssPropertyValue());
	}

	/**
	 * @see #setOverflow(Overflow)
	 */
	@JsOverlay
	public default void setOverflow(final CssGlobalStyle value) {
		setOverflow(value.getCssPropertyValue());
	}

	/**
	 * @see #setOverflowX(Overflow)
	 */
	@JsProperty
	public abstract String getOverflowX();

	/**
	 * @see #setOverflowX(Overflow)
	 */
	@JsProperty
	public abstract void setOverflowX(final String value);

	/**
	 * Specifies whether to clip content, render a scroll bar, or display
	 * overflow content of a block-level element, when it overflows at the left
	 * and right edges.
	 *
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x"> MDN /
	 *      CSS / overflow-x</a>
	 */
	@JsOverlay
	public default void setOverflowX(final Overflow value) {
		setOverflowX(value.getCssPropertyValue());
	}

	/**
	 * @see #setOverflowX(Overflow)
	 */
	@JsOverlay
	public default void setOverflowX(final CssGlobalStyle value) {
		setOverflowX(value.getCssPropertyValue());
	}

	/**
	 * @see #setOverflowY(Overflow)
	 */
	@JsProperty
	public abstract String getOverflowY();

	/**
	 * @see #setOverflowY(Overflow)
	 */
	@JsProperty
	public abstract void setOverflowY(final String value);

	/**
	 * Specifies whether to clip content, render a scroll bar, or display
	 * overflow content of a block-level element, when it overflows at the top
	 * and bottom edges.
	 *
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y"> MDN /
	 *      CSS / overflow-y</a>
	 */
	@JsOverlay
	public default void setOverflowY(final Overflow value) {
		setOverflowY(value.getCssPropertyValue());
	}

	/**
	 * @see #setOverflowY(Overflow)
	 */
	@JsOverlay
	public default void setOverflowY(final CssGlobalStyle value) {
		setOverflowY(value.getCssPropertyValue());
	}

	/**
	 * @see #setPadding(double, CssUnit)
	 */
	@JsProperty
	public abstract String getPadding();

	/**
	 * @see #setPadding(double, CssUnit)
	 */
	@JsProperty
	public abstract void setPadding(final String value);

	/**
	 * Sets the padding space on all sides of an element. The padding area is
	 * the space between the content of the element and its border. Negative
	 * values are not allowed.<br>
	 * The padding property is a shorthand to avoid setting each side
	 * separately.
	 * 
	 * @see <a href= "https://developer.mozilla.org/en-US/docs/Web/CSS/padding">
	 *      MDN / CSS / padding</a>
	 */
	@JsOverlay
	public default void setPadding(final double value, CssUnit unit) {
		setPadding(value + unit.getCssValue());
	}

	/**
	 * @see #setPadding(double, CssUnit)
	 */
	@JsOverlay
	public default void setPadding(final int value, CssUnit unit) {
		setPadding(value + unit.getCssValue());
	}

	/**
	 * @see #setPadding(double, CssUnit)
	 */
	@JsOverlay
	public default void setPadding(CssGlobalStyle value) {
		setPadding(value.getCssPropertyValue());
	}

	/**
	 * @see #setPaddingBottom(double, CssUnit)
	 */
	@JsProperty
	public abstract String getPaddingBottom();

	/**
	 * @see #setPaddingBottom(double, CssUnit)
	 */
	@JsProperty
	public abstract void setPaddingBottom(final String value);

	/**
	 * Sets the height of the padding area at the bottom of an element. The
	 * padding area is the space between the content of the element and it's
	 * border. Contrary to margin-bottom values, negative values of
	 * padding-bottom are invalid.
	 * 
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/padding-bottom">
	 *      MDN / CSS / padding-bottom</a>
	 */
	@JsOverlay
	public default void setPaddingBottom(final double value, CssUnit unit) {
		setPaddingBottom(value + unit.getCssValue());
	}

	/**
	 * @see #setPaddingBottom(double, CssUnit)
	 */
	@JsOverlay
	public default void setPaddingBottom(final int value, CssUnit unit) {
		setPaddingBottom(value + unit.getCssValue());
	}

	/**
	 * @see #setPaddingBottom(double, CssUnit)
	 */
	@JsOverlay
	public default void setPaddingBottom(CssGlobalStyle value) {
		setPaddingBottom(value.getCssPropertyValue());
	}

	/**
	 * @see #setPaddingLeft(double, CssUnit)
	 */
	@JsProperty
	public abstract String getPaddingLeft();

	/**
	 * @see #setPaddingLeft(double, CssUnit)
	 */
	@JsProperty
	public abstract void setPaddingLeft(final String value);

	/**
	 * Sets the padding space required on the left side of an element. The
	 * padding area is the space between the content of the element and it's
	 * border. A negative value is not allowed.
	 * 
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/padding-left"> MDN
	 *      / CSS / padding-left</a>
	 */
	@JsOverlay
	public default void setPaddingLeft(final double value, CssUnit unit) {
		setPaddingLeft(value + unit.getCssValue());
	}

	/**
	 * @see #setPaddingLeft(double, CssUnit)
	 */
	@JsOverlay
	public default void setPaddingLeft(final int value, CssUnit unit) {
		setPaddingLeft(value + unit.getCssValue());
	}

	/**
	 * @see #setPaddingLeft(double, CssUnit)
	 */
	@JsOverlay
	public default void setPaddingLeft(CssGlobalStyle value) {
		setPaddingLeft(value.getCssPropertyValue());
	}

	/**
	 * @see #setPaddingRight(double, CssUnit)
	 */
	@JsProperty
	public abstract String getPaddingRight();

	/**
	 * @see #setPaddingRight(double, CssUnit)
	 */
	@JsProperty
	public abstract void setPaddingRight(final String value);

	/**
	 * Sets the padding space required on the right side of an element. The
	 * padding area is the space between the content of the element and its
	 * border. Negative values are not allowed.
	 * 
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/padding-right">
	 *      MDN / CSS / padding-right</a>
	 */
	@JsOverlay
	public default void setPaddingRight(final double value, CssUnit unit) {
		setPaddingRight(value + unit.getCssValue());
	}

	/**
	 * @see #setPaddingRight(double, CssUnit)
	 */
	@JsOverlay
	public default void setPaddingRight(final int value, CssUnit unit) {
		setPaddingRight(value + unit.getCssValue());
	}

	/**
	 * @see #setPaddingRight(double, CssUnit)
	 */
	@JsOverlay
	public default void setPaddingRight(CssGlobalStyle value) {
		setPaddingRight(value.getCssPropertyValue());
	}

	/**
	 * @see #setPaddingTop(double, CssUnit)
	 */
	@JsProperty
	public abstract String getPaddingTop();

	/**
	 * @see #setPaddingTop(double, CssUnit)
	 */
	@JsProperty
	public abstract void setPaddingTop(final String value);

	/**
	 * Sets the padding space required on the top of an element. The padding
	 * area is the space between the content of the element and its border.
	 * Contrary to margin-top values, negative values of padding-top are
	 * invalid.
	 * 
	 * @see <a href=
	 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/padding-top"> MDN
	 *      / CSS / padding-top</a>
	 */
	@JsOverlay
	public default void setPaddingTop(final double value, CssUnit unit) {
		setPaddingTop(value + unit.getCssValue());
	}

	/**
	 * @see #setPaddingTop(double, CssUnit)
	 */
	@JsOverlay
	public default void setPaddingTop(final int value, CssUnit unit) {
		setPaddingTop(value + unit.getCssValue());
	}

	/**
	 * @see #setPaddingTop(double, CssUnit)
	 */
	@JsOverlay
	public default void setPaddingTop(CssGlobalStyle value) {
		setPaddingTop(value.getCssPropertyValue());
	}

	@JsProperty
	public abstract String getPageBreakAfter();

	@JsProperty
	public abstract void setPageBreakAfter(final String value);

	@JsProperty
	public abstract String getPageBreakBefore();

	@JsProperty
	public abstract void setPageBreakBefore(final String value);

	@JsProperty
	public abstract String getPageBreakInside();

	@JsProperty
	public abstract void setPageBreakInside(final String value);

	@JsProperty
	public abstract CSSRule getParentRule();

	@JsProperty
	public abstract void setParentRule(final CSSRule value);

	@JsProperty
	public abstract String getPerspective();

	@JsProperty
	public abstract void setPerspective(final String value);

	@JsProperty
	public abstract String getPerspectiveOrigin();

	@JsProperty
	public abstract void setPerspectiveOrigin(final String value);

	@JsProperty
	public abstract String getPointerEvents();

	@JsProperty
	public abstract void setPointerEvents(final String value);

	@JsProperty
	public abstract String getPosition();

	@JsProperty
	public abstract void setPosition(final String value);

	@JsProperty
	public abstract String getQuotes();

	@JsProperty
	public abstract void setQuotes(final String value);

	@JsProperty
	public abstract String getRight();

	@JsProperty
	public abstract void setRight(final String value);

	@JsProperty
	public abstract String getRubyAlign();

	@JsProperty
	public abstract void setRubyAlign(final String value);

	@JsProperty
	public abstract String getRubyOverhang();

	@JsProperty
	public abstract void setRubyOverhang(final String value);

	@JsProperty
	public abstract String getRubyPosition();

	@JsProperty
	public abstract void setRubyPosition(final String value);

	@JsProperty
	public abstract String getStopColor();

	@JsProperty
	public abstract void setStopColor(final String value);

	@JsProperty
	public abstract String getStopOpacity();

	@JsProperty
	public abstract void setStopOpacity(final String value);

	@JsProperty
	public abstract String getStroke();

	@JsProperty
	public abstract void setStroke(final String value);

	@JsProperty
	public abstract String getStrokeDasharray();

	@JsProperty
	public abstract void setStrokeDasharray(final String value);

	@JsProperty
	public abstract String getStrokeDashoffset();

	@JsProperty
	public abstract void setStrokeDashoffset(final String value);

	@JsProperty
	public abstract String getStrokeLinecap();

	@JsProperty
	public abstract void setStrokeLinecap(final String value);

	@JsProperty
	public abstract String getStrokeLinejoin();

	@JsProperty
	public abstract void setStrokeLinejoin(final String value);

	@JsProperty
	public abstract String getStrokeMiterlimit();

	@JsProperty
	public abstract void setStrokeMiterlimit(final String value);

	@JsProperty
	public abstract String getStrokeOpacity();

	@JsProperty
	public abstract void setStrokeOpacity(final String value);

	@JsProperty
	public abstract String getStrokeWidth();

	@JsProperty
	public abstract void setStrokeWidth(final String value);

	@JsProperty
	public abstract String getTableLayout();

	@JsProperty
	public abstract void setTableLayout(final String value);

	@JsProperty
	public abstract String getTextAlign();

	@JsProperty
	public abstract void setTextAlign(final String value);

	@JsProperty
	public abstract String getTextAlignLast();

	@JsProperty
	public abstract void setTextAlignLast(final String value);

	@JsProperty
	public abstract String getTextAnchor();

	@JsProperty
	public abstract void setTextAnchor(final String value);

	@JsProperty
	public abstract String getTextDecoration();

	@JsProperty
	public abstract void setTextDecoration(final String value);

	@JsProperty
	public abstract String getTextFillColor();

	@JsProperty
	public abstract void setTextFillColor(final String value);

	@JsProperty
	public abstract String getTextIndent();

	@JsProperty
	public abstract void setTextIndent(final String value);

	@JsProperty
	public abstract String getTextJustify();

	@JsProperty
	public abstract void setTextJustify(final String value);

	@JsProperty
	public abstract String getTextKashida();

	@JsProperty
	public abstract void setTextKashida(final String value);

	@JsProperty
	public abstract String getTextKashidaSpace();

	@JsProperty
	public abstract void setTextKashidaSpace(final String value);

	@JsProperty
	public abstract String getTextOverflow();

	@JsProperty
	public abstract void setTextOverflow(final String value);

	@JsProperty
	public abstract String getTextShadow();

	@JsProperty
	public abstract void setTextShadow(final String value);

	@JsProperty
	public abstract String getTextTransform();

	@JsProperty
	public abstract void setTextTransform(final String value);

	@JsProperty
	public abstract String getTextUnderlinePosition();

	@JsProperty
	public abstract void setTextUnderlinePosition(final String value);

	@JsProperty
	public abstract String getTop();

	@JsProperty
	public abstract void setTop(final String value);

	@JsProperty
	public abstract String getTouchAction();

	@JsProperty
	public abstract void setTouchAction(final String value);

	@JsProperty
	public abstract String getTransform();

	@JsProperty
	public abstract void setTransform(final String value);

	@JsProperty
	public abstract String getTransformOrigin();

	@JsProperty
	public abstract void setTransformOrigin(final String value);

	@JsProperty
	public abstract String getTransformStyle();

	@JsProperty
	public abstract void setTransformStyle(final String value);

	@JsProperty
	public abstract String getTransition();

	@JsProperty
	public abstract void setTransition(final String value);

	@JsProperty
	public abstract String getTransitionDelay();

	@JsProperty
	public abstract void setTransitionDelay(final String value);

	@JsProperty
	public abstract String getTransitionDuration();

	@JsProperty
	public abstract void setTransitionDuration(final String value);

	@JsProperty
	public abstract String getTransitionProperty();

	@JsProperty
	public abstract void setTransitionProperty(final String value);

	@JsProperty
	public abstract String getTransitionTimingFunction();

	@JsProperty
	public abstract void setTransitionTimingFunction(final String value);

	@JsProperty
	public abstract String getUnicodeBidi();

	@JsProperty
	public abstract void setUnicodeBidi(final String value);

	@JsProperty
	public abstract String getVerticalAlign();

	@JsProperty
	public abstract void setVerticalAlign(final String value);

	@JsProperty
	public abstract String getVisibility();

	@JsProperty
	public abstract void setVisibility(final String value);

	@JsProperty
	public abstract String getWebkitAlignContent();

	@JsProperty
	public abstract void setWebkitAlignContent(final String value);

	@JsProperty
	public abstract String getWebkitAlignItems();

	@JsProperty
	public abstract void setWebkitAlignItems(final String value);

	@JsProperty
	public abstract String getWebkitAlignSelf();

	@JsProperty
	public abstract void setWebkitAlignSelf(final String value);

	@JsProperty
	public abstract String getWebkitAnimation();

	@JsProperty
	public abstract void setWebkitAnimation(final String value);

	@JsProperty
	public abstract String getWebkitAnimationDelay();

	@JsProperty
	public abstract void setWebkitAnimationDelay(final String value);

	@JsProperty
	public abstract String getWebkitAnimationDirection();

	@JsProperty
	public abstract void setWebkitAnimationDirection(final String value);

	@JsProperty
	public abstract String getWebkitAnimationDuration();

	@JsProperty
	public abstract void setWebkitAnimationDuration(final String value);

	@JsProperty
	public abstract String getWebkitAnimationFillMode();

	@JsProperty
	public abstract void setWebkitAnimationFillMode(final String value);

	@JsProperty
	public abstract String getWebkitAnimationIterationCount();

	@JsProperty
	public abstract void setWebkitAnimationIterationCount(final String value);

	@JsProperty
	public abstract String getWebkitAnimationName();

	@JsProperty
	public abstract void setWebkitAnimationName(final String value);

	@JsProperty
	public abstract String getWebkitAnimationPlayState();

	@JsProperty
	public abstract void setWebkitAnimationPlayState(final String value);

	@JsProperty
	public abstract String getWebkitAnimationTimingFunction();

	@JsProperty
	public abstract void setWebkitAnimationTimingFunction(final String value);

	@JsProperty
	public abstract String getWebkitAppearance();

	@JsProperty
	public abstract void setWebkitAppearance(final String value);

	@JsProperty
	public abstract String getWebkitBackfaceVisibility();

	@JsProperty
	public abstract void setWebkitBackfaceVisibility(final String value);

	@JsProperty
	public abstract String getWebkitBackground();

	@JsProperty
	public abstract void setWebkitBackground(final String value);

	@JsProperty
	public abstract String getWebkitBackgroundAttachment();

	@JsProperty
	public abstract void setWebkitBackgroundAttachment(final String value);

	@JsProperty
	public abstract String getWebkitBackgroundClip();

	@JsProperty
	public abstract void setWebkitBackgroundClip(final String value);

	@JsProperty
	public abstract String getWebkitBackgroundColor();

	@JsProperty
	public abstract void setWebkitBackgroundColor(final String value);

	@JsProperty
	public abstract String getWebkitBackgroundImage();

	@JsProperty
	public abstract void setWebkitBackgroundImage(final String value);

	@JsProperty
	public abstract String getWebkitBackgroundOrigin();

	@JsProperty
	public abstract void setWebkitBackgroundOrigin(final String value);

	@JsProperty
	public abstract String getWebkitBackgroundPosition();

	@JsProperty
	public abstract void setWebkitBackgroundPosition(final String value);

	@JsProperty
	public abstract String getWebkitBackgroundPositionX();

	@JsProperty
	public abstract void setWebkitBackgroundPositionX(final String value);

	@JsProperty
	public abstract String getWebkitBackgroundPositionY();

	@JsProperty
	public abstract void setWebkitBackgroundPositionY(final String value);

	@JsProperty
	public abstract String getWebkitBackgroundRepeat();

	@JsProperty
	public abstract void setWebkitBackgroundRepeat(final String value);

	@JsProperty
	public abstract String getWebkitBackgroundSize();

	@JsProperty
	public abstract void setWebkitBackgroundSize(final String value);

	@JsProperty
	public abstract String getWebkitBorderBottomLeftRadius();

	@JsProperty
	public abstract void setWebkitBorderBottomLeftRadius(final String value);

	@JsProperty
	public abstract String getWebkitBorderBottomRightRadius();

	@JsProperty
	public abstract void setWebkitBorderBottomRightRadius(final String value);

	@JsProperty
	public abstract String getWebkitBorderImage();

	@JsProperty
	public abstract void setWebkitBorderImage(final String value);

	@JsProperty
	public abstract String getWebkitBorderImageOutset();

	@JsProperty
	public abstract void setWebkitBorderImageOutset(final String value);

	@JsProperty
	public abstract String getWebkitBorderImageRepeat();

	@JsProperty
	public abstract void setWebkitBorderImageRepeat(final String value);

	@JsProperty
	public abstract String getWebkitBorderImageSlice();

	@JsProperty
	public abstract void setWebkitBorderImageSlice(final String value);

	@JsProperty
	public abstract String getWebkitBorderImageSource();

	@JsProperty
	public abstract void setWebkitBorderImageSource(final String value);

	@JsProperty
	public abstract String getWebkitBorderImageWidth();

	@JsProperty
	public abstract void setWebkitBorderImageWidth(final String value);

	@JsProperty
	public abstract String getWebkitBorderRadius();

	@JsProperty
	public abstract void setWebkitBorderRadius(final String value);

	@JsProperty
	public abstract String getWebkitBorderTopLeftRadius();

	@JsProperty
	public abstract void setWebkitBorderTopLeftRadius(final String value);

	@JsProperty
	public abstract String getWebkitBorderTopRightRadius();

	@JsProperty
	public abstract void setWebkitBorderTopRightRadius(final String value);

	@JsProperty
	public abstract String getWebkitBoxAlign();

	@JsProperty
	public abstract void setWebkitBoxAlign(final String value);

	@JsProperty
	public abstract String getWebkitBoxDirection();

	@JsProperty
	public abstract void setWebkitBoxDirection(final String value);

	@JsProperty
	public abstract String getWebkitBoxFlex();

	@JsProperty
	public abstract void setWebkitBoxFlex(final String value);

	@JsProperty
	public abstract String getWebkitBoxOrdinalGroup();

	@JsProperty
	public abstract void setWebkitBoxOrdinalGroup(final String value);

	@JsProperty
	public abstract String getWebkitBoxOrient();

	@JsProperty
	public abstract void setWebkitBoxOrient(final String value);

	@JsProperty
	public abstract String getWebkitBoxPack();

	@JsProperty
	public abstract void setWebkitBoxPack(final String value);

	@JsProperty
	public abstract String getWebkitBoxSizing();

	@JsProperty
	public abstract void setWebkitBoxSizing(final String value);

	@JsProperty
	public abstract String getWebkitColumnBreakAfter();

	@JsProperty
	public abstract void setWebkitColumnBreakAfter(final String value);

	@JsProperty
	public abstract String getWebkitColumnBreakBefore();

	@JsProperty
	public abstract void setWebkitColumnBreakBefore(final String value);

	@JsProperty
	public abstract String getWebkitColumnBreakInside();

	@JsProperty
	public abstract void setWebkitColumnBreakInside(final String value);

	@JsProperty
	public abstract Object getWebkitColumnCount();

	@JsProperty
	public abstract void setWebkitColumnCount(final Object value);

	@JsProperty
	public abstract Object getWebkitColumnGap();

	@JsProperty
	public abstract void setWebkitColumnGap(final Object value);

	@JsProperty
	public abstract String getWebkitColumnRule();

	@JsProperty
	public abstract void setWebkitColumnRule(final String value);

	@JsProperty
	public abstract Object getWebkitColumnRuleColor();

	@JsProperty
	public abstract void setWebkitColumnRuleColor(final Object value);

	@JsProperty
	public abstract String getWebkitColumnRuleStyle();

	@JsProperty
	public abstract void setWebkitColumnRuleStyle(final String value);

	@JsProperty
	public abstract Object getWebkitColumnRuleWidth();

	@JsProperty
	public abstract void setWebkitColumnRuleWidth(final Object value);

	@JsProperty
	public abstract String getWebkitColumnSpan();

	@JsProperty
	public abstract void setWebkitColumnSpan(final String value);

	@JsProperty
	public abstract Object getWebkitColumnWidth();

	@JsProperty
	public abstract void setWebkitColumnWidth(final Object value);

	@JsProperty
	public abstract String getWebkitColumns();

	@JsProperty
	public abstract void setWebkitColumns(final String value);

	@JsProperty
	public abstract String getWebkitFilter();

	@JsProperty
	public abstract void setWebkitFilter(final String value);

	@JsProperty
	public abstract String getWebkitFlex();

	@JsProperty
	public abstract void setWebkitFlex(final String value);

	@JsProperty
	public abstract String getWebkitFlexBasis();

	@JsProperty
	public abstract void setWebkitFlexBasis(final String value);

	@JsProperty
	public abstract String getWebkitFlexDirection();

	@JsProperty
	public abstract void setWebkitFlexDirection(final String value);

	@JsProperty
	public abstract String getWebkitFlexFlow();

	@JsProperty
	public abstract void setWebkitFlexFlow(final String value);

	@JsProperty
	public abstract String getWebkitFlexGrow();

	@JsProperty
	public abstract void setWebkitFlexGrow(final String value);

	@JsProperty
	public abstract String getWebkitFlexShrink();

	@JsProperty
	public abstract void setWebkitFlexShrink(final String value);

	@JsProperty
	public abstract String getWebkitFlexWrap();

	@JsProperty
	public abstract void setWebkitFlexWrap(final String value);

	@JsProperty
	public abstract String getWebkitJustifyContent();

	@JsProperty
	public abstract void setWebkitJustifyContent(final String value);

	@JsProperty
	public abstract String getWebkitOrder();

	@JsProperty
	public abstract void setWebkitOrder(final String value);

	@JsProperty
	public abstract String getWebkitPerspective();

	@JsProperty
	public abstract void setWebkitPerspective(final String value);

	@JsProperty
	public abstract String getWebkitPerspectiveOrigin();

	@JsProperty
	public abstract void setWebkitPerspectiveOrigin(final String value);

	@JsProperty
	public abstract String getWebkitTapHighlightColor();

	@JsProperty
	public abstract void setWebkitTapHighlightColor(final String value);

	@JsProperty
	public abstract String getWebkitTextFillColor();

	@JsProperty
	public abstract void setWebkitTextFillColor(final String value);

	@JsProperty
	public abstract Object getWebkitTextSizeAdjust();

	@JsProperty
	public abstract void setWebkitTextSizeAdjust(final Object value);

	@JsProperty
	public abstract String getWebkitTransform();

	@JsProperty
	public abstract void setWebkitTransform(final String value);

	@JsProperty
	public abstract String getWebkitTransformOrigin();

	@JsProperty
	public abstract void setWebkitTransformOrigin(final String value);

	@JsProperty
	public abstract String getWebkitTransformStyle();

	@JsProperty
	public abstract void setWebkitTransformStyle(final String value);

	@JsProperty
	public abstract String getWebkitTransition();

	@JsProperty
	public abstract void setWebkitTransition(final String value);

	@JsProperty
	public abstract String getWebkitTransitionDelay();

	@JsProperty
	public abstract void setWebkitTransitionDelay(final String value);

	@JsProperty
	public abstract String getWebkitTransitionDuration();

	@JsProperty
	public abstract void setWebkitTransitionDuration(final String value);

	@JsProperty
	public abstract String getWebkitTransitionProperty();

	@JsProperty
	public abstract void setWebkitTransitionProperty(final String value);

	@JsProperty
	public abstract String getWebkitTransitionTimingFunction();

	@JsProperty
	public abstract void setWebkitTransitionTimingFunction(final String value);

	@JsProperty
	public abstract String getWebkitUserSelect();

	@JsProperty
	public abstract void setWebkitUserSelect(final String value);

	@JsProperty
	public abstract String getWebkitWritingMode();

	@JsProperty
	public abstract void setWebkitWritingMode(final String value);

	@JsProperty
	public abstract String getWhiteSpace();

	@JsProperty
	public abstract void setWhiteSpace(final String value);

	@JsProperty
	public abstract String getWidows();

	@JsProperty
	public abstract void setWidows(final String value);

	@JsProperty
	public abstract String getWidth();

	@JsProperty
	public abstract void setWidth(final String value);

	@JsProperty
	public abstract String getWordBreak();

	@JsProperty
	public abstract void setWordBreak(final String value);

	@JsProperty
	public abstract String getWordSpacing();

	@JsProperty
	public abstract void setWordSpacing(final String value);

	@JsProperty
	public abstract String getWordWrap();

	@JsProperty
	public abstract void setWordWrap(final String value);

	@JsProperty
	public abstract String getWritingMode();

	@JsProperty
	public abstract void setWritingMode(final String value);

	@JsProperty
	public abstract String getZIndex();

	@JsProperty
	public abstract void setZIndex(final String value);

	@JsProperty
	public abstract String getZoom();

	@JsProperty
	public abstract void setZoom(final String value);

	@JsOverlay
	public default String get(final int index) {
		return (String) xyz.jsinterop.client.core.JsArrays.getArrayItem(this, index);
	}

	@JsOverlay
	public default void set(final int index, final String value) {
		xyz.jsinterop.client.core.JsArrays.setArrayItem(this, index, value);
	}

	@JsMethod
	public abstract String getPropertyPriority(final String propertyName);

	@JsMethod
	public abstract String getPropertyValue(final String propertyName);

	@JsMethod
	public abstract String item(final double index);

	@JsMethod
	public abstract String removeProperty(final String propertyName);

	@JsMethod
	public abstract void setProperty(final String propertyName, final String value);

	@JsMethod
	public abstract void setProperty(final String propertyName, final String value, final String priority);
}
