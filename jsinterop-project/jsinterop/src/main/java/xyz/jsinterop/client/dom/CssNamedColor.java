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
 * CSS named colors.
 *
 * @see <a href=
 *      "https://developer.mozilla.org/en-US/docs/Web/CSS/color_value#Color_keywords">
 *      MDN / CSS / Color keywords</a>
 * @see <span>API documentation is based on
 *      <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/Reference">MDN
 *      / CSS</a> by Mozilla Contributors, licensed under CC-BY-SA 2.5</span>
 */
public enum CssNamedColor implements HasCssColorValue {
	BLACK("black", "#000000"), //
	SILVER("silver", "#c0c0c0"), //
	GRAY("gray", "#808080"), //
	WHITE("white", "#ffffff"), //
	MAROON("maroon", "#800000"), //
	RED("red", "#ff0000"), //
	PURPLE("purple", "#800080"), //
	FUCHSIA("fuchsia", "#ff00ff"), //
	GREEN("green", "#008000"), //
	LIME("lime", "#00ff00"), //
	OLIVE("olive", "#808000"), //
	YELLOW("yellow", "#ffff00"), //
	NAVY("navy", "#000080"), //
	BLUE("blue", "#0000ff"), //
	TEAL("teal", "#008080"), //
	AQUA("aqua", "#00ffff"), //
	ORANGE("orange", "#ffa500"), //
	ALICEBLUE("aliceblue", "#f0f8ff"), //
	ANTIQUEWHITE("antiquewhite", "#faebd7"), //
	AQUAMARINE("aquamarine", "#7fffd4"), //
	AZURE("azure", "#f0ffff"), //
	BEIGE("beige", "#f5f5dc"), //
	BISQUE("bisque", "#ffe4c4"), //
	BLANCHEDALMOND("blanchedalmond", "#ffe4c4"), //
	BLUEVIOLET("blueviolet", "#8a2be2"), //
	BROWN("brown", "#a52a2a"), //
	BURLYWOOD("burlywood", "#deb887"), //
	CADETBLUE("cadetblue", "#5f9ea0"), //
	CHARTREUSE("chartreuse", "#7fff00"), //
	CHOCOLATE("chocolate", "#d2691e"), //
	CORAL("coral", "#ff7f50"), //
	CORNFLOWERBLUE("cornflowerblue", "#6495ed"), //
	CORNSILK("cornsilk", "#fff8dc"), //
	CRIMSON("crimson", "#dc143c"), //
	DARKBLUE("darkblue", "#00008b"), //
	DARKCYAN("darkcyan", "#008b8b"), //
	DARKGOLDENROD("darkgoldenrod", "#b8860b"), //
	DARKGRAY("darkgray", "#a9a9a9"), //
	DARKGREEN("darkgreen", "#006400"), //
	DARKGREY("darkgrey", "#a9a9a9"), //
	DARKKHAKI("darkkhaki", "#bdb76b"), //
	DARKMAGENTA("darkmagenta", "#8b008b"), //
	DARKOLIVEGREEN("darkolivegreen", "#556b2f"), //
	DARKORANGE("darkorange", "#ff8c00"), //
	DARKORCHID("darkorchid", "#9932cc"), //
	DARKRED("darkred", "#8b0000"), //
	DARKSALMON("darksalmon", "#e9967a"), //
	DARKSEAGREEN("darkseagreen", "#8fbc8f"), //
	DARKSLATEBLUE("darkslateblue", "#483d8b"), //
	DARKSLATEGRAY("darkslategray", "#2f4f4f"), //
	DARKSLATEGREY("darkslategrey", "#2f4f4f"), //
	DARKTURQUOISE("darkturquoise", "#00ced1"), //
	DARKVIOLET("darkviolet", "#9400d3"), //
	DEEPPINK("deeppink", "#ff1493"), //
	DEEPSKYBLUE("deepskyblue", "#00bfff"), //
	DIMGRAY("dimgray", "#696969"), //
	DIMGREY("dimgrey", "#696969"), //
	DODGERBLUE("dodgerblue", "#1e90ff"), //
	FIREBRICK("firebrick", "#b22222"), //
	FLORALWHITE("floralwhite", "#fffaf0"), //
	FORESTGREEN("forestgreen", "#228b22"), //
	GAINSBORO("gainsboro", "#dcdcdc"), //
	GHOSTWHITE("ghostwhite", "#f8f8ff"), //
	GOLD("gold", "#ffd700"), //
	GOLDENROD("goldenrod", "#daa520"), //
	GREENYELLOW("greenyellow", "#adff2f"), //
	GREY("grey", "#808080"), //
	HONEYDEW("honeydew", "#f0fff0"), //
	HOTPINK("hotpink", "#ff69b4"), //
	INDIANRED("indianred", "#cd5c5c"), //
	INDIGO("indigo", "#4b0082"), //
	IVORY("ivory", "#fffff0"), //
	KHAKI("khaki", "#f0e68c"), //
	LAVENDER("lavender", "#e6e6fa"), //
	LAVENDERBLUSH("lavenderblush", "#fff0f5"), //
	LAWNGREEN("lawngreen", "#7cfc00"), //
	LEMONCHIFFON("lemonchiffon", "#fffacd"), //
	LIGHTBLUE("lightblue", "#add8e6"), //
	LIGHTCORAL("lightcoral", "#f08080"), //
	LIGHTCYAN("lightcyan", "#e0ffff"), //
	LIGHTGOLDENRODYELLOW("lightgoldenrodyellow", "#fafad2"), //
	LIGHTGRAY("lightgray", "#d3d3d3"), //
	LIGHTGREEN("lightgreen", "#90ee90"), //
	LIGHTGREY("lightgrey", "#d3d3d3"), //
	LIGHTPINK("lightpink", "#ffb6c1"), //
	LIGHTSALMON("lightsalmon", "#ffa07a"), //
	LIGHTSEAGREEN("lightseagreen", "#20b2aa"), //
	LIGHTSKYBLUE("lightskyblue", "#87cefa"), //
	LIGHTSLATEGRAY("lightslategray", "#778899"), //
	LIGHTSLATEGREY("lightslategrey", "#778899"), //
	LIGHTSTEELBLUE("lightsteelblue", "#b0c4de"), //
	LIGHTYELLOW("lightyellow", "#ffffe0"), //
	LIMEGREEN("limegreen", "#32cd32"), //
	LINEN("linen", "#faf0e6"), //
	MEDIUMAQUAMARINE("mediumaquamarine", "#66cdaa"), //
	MEDIUMBLUE("mediumblue", "#0000cd"), //
	MEDIUMORCHID("mediumorchid", "#ba55d3"), //
	MEDIUMPURPLE("mediumpurple", "#9370db"), //
	MEDIUMSEAGREEN("mediumseagreen", "#3cb371"), //
	MEDIUMSLATEBLUE("mediumslateblue", "#7b68ee"), //
	MEDIUMSPRINGGREEN("mediumspringgreen", "#00fa9a"), //
	MEDIUMTURQUOISE("mediumturquoise", "#48d1cc"), //
	MEDIUMVIOLETRED("mediumvioletred", "#c71585"), //
	MIDNIGHTBLUE("midnightblue", "#191970"), //
	MINTCREAM("mintcream", "#f5fffa"), //
	MISTYROSE("mistyrose", "#ffe4e1"), //
	MOCCASIN("moccasin", "#ffe4b5"), //
	NAVAJOWHITE("navajowhite", "#ffdead"), //
	OLDLACE("oldlace", "#fdf5e6"), //
	OLIVEDRAB("olivedrab", "#6b8e23"), //
	ORANGERED("orangered", "#ff4500"), //
	ORCHID("orchid", "#da70d6"), //
	PALEGOLDENROD("palegoldenrod", "#eee8aa"), //
	PALEGREEN("palegreen", "#98fb98"), //
	PALETURQUOISE("paleturquoise", "#afeeee"), //
	PALEVIOLETRED("palevioletred", "#db7093"), //
	PAPAYAWHIP("papayawhip", "#ffefd5"), //
	PEACHPUFF("peachpuff", "#ffdab9"), //
	PERU("peru", "#cd853f"), //
	PINK("pink", "#ffc0cb"), //
	PLUM("plum", "#dda0dd"), //
	POWDERBLUE("powderblue", "#b0e0e6"), //
	ROSYBROWN("rosybrown", "#bc8f8f"), //
	ROYALBLUE("royalblue", "#4169e1"), //
	SADDLEBROWN("saddlebrown", "#8b4513"), //
	SALMON("salmon", "#fa8072"), //
	SANDYBROWN("sandybrown", "#f4a460"), //
	SEAGREEN("seagreen", "#2e8b57"), //
	SEASHELL("seashell", "#fff5ee"), //
	SIENNA("sienna", "#a0522d"), //
	SKYBLUE("skyblue", "#87ceeb"), //
	SLATEBLUE("slateblue", "#6a5acd"), //
	SLATEGRAY("slategray", "#708090"), //
	SLATEGREY("slategrey", "#708090"), //
	SNOW("snow", "#fffafa"), //
	SPRINGGREEN("springgreen", "#00ff7f"), //
	STEELBLUE("steelblue", "#4682b4"), //
	TAN("tan", "#d2b48c"), //
	THISTLE("thistle", "#d8bfd8"), //
	TOMATO("tomato", "#ff6347"), //
	TURQUOISE("turquoise", "#40e0d0"), //
	VIOLET("violet", "#ee82ee"), //
	WHEAT("wheat", "#f5deb3"), //
	WHITESMOKE("whitesmoke", "#f5f5f5"), //
	YELLOWGREEN("yellowgreen", "#9acd32"), //
	REBECCAPURPLE("rebeccapurple", "#663399"); //

	private final String name;

	private final String rgbValue;

	CssNamedColor(String name, String rgbValue) {
		this.name = name;
		this.rgbValue = rgbValue;
	}

	public String getName() {
		return name;
	}

	public String getRgbValue() {
		return rgbValue;
	}

	@Override
	public String getCssColorValue() {
		return name;
	}
}
