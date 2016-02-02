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
package xyz.jsinterop.test.client.dom;

import static xyz.jsinterop.test.client.TestUtils.generatedCodeMarkerEnd;
import static xyz.jsinterop.test.client.TestUtils.generatedCodeMarkerStart;

import xyz.jsinterop.client.core.JsGlobals;
import xyz.jsinterop.client.dom.CssNamedColor;
import xyz.jsinterop.client.dom.CssUnit;
import xyz.jsinterop.client.dom.Document;
import xyz.jsinterop.client.dom.HTMLDivElement;
import xyz.jsinterop.client.dom.HTMLInputElement;
import xyz.jsinterop.client.dom.Text;

public class DomTest implements Runnable {
	@Override
	public void run() {
		createElement();
		createTextNode();
		eventHandlers();
		settingCssStyle();
	}

	private void settingCssStyle() {
		Document document = JsGlobals.getDocument();

		generatedCodeMarkerStart("Dom_settingCssStyle");
		// tag::Dom_settingCssStyle[]
		HTMLDivElement div = document.createElementDiv();
		div.getStyle().setBackgroundColor(CssNamedColor.LIGHTGRAY);
		div.getStyle().setMargin(10, CssUnit.PX);
		div.getStyle().setPadding(0.5, CssUnit.EM);
		// end::Dom_settingCssStyle[]
		generatedCodeMarkerEnd("Dom_settingCssStyle");

		div.setInnerText("some text...");
		document.getBody().appendChild(div);
	}

	private void eventHandlers() {
		Document document = JsGlobals.getDocument();

		generatedCodeMarkerStart("Dom_eventHandlers");
		// tag::Dom_eventHandlers[]
		HTMLInputElement input = document.createElementInput();
		input.addEventListenerFocus(event -> input.getStyle().setBackgroundColor(CssNamedColor.LIGHTYELLOW));
		input.addEventListener("blur", event -> input.getStyle().setBackgroundColor(""));
		// end::Dom_eventHandlers[]
		generatedCodeMarkerEnd("Dom_eventHandlers");

		document.getBody().appendChild(input);
	}

	private void createTextNode() {
		Document document = JsGlobals.getDocument();

		generatedCodeMarkerStart("Dom_createTextNode");
		// tag::Dom_createTextNode[]
		HTMLDivElement div = document.createElementDiv();
		Text textNode = document.createTextNode("DIV contents...");
		div.appendChild(textNode);
		// end::Dom_createTextNode[]
		generatedCodeMarkerEnd("Dom_createTextNode");
	}

	private void createElement() {
		Document document = JsGlobals.getDocument();

		generatedCodeMarkerStart("Dom_createElement");
		// tag::Dom_createElement[]
		HTMLInputElement input1 = (HTMLInputElement) document.createElement("input");
		input1.setValue("some text...");

		HTMLInputElement input2 = document.createElementInput();
		input2.setReadOnly(true);
		input2.setValue(input1.getValue());
		// end::Dom_createElement[]
		generatedCodeMarkerEnd("Dom_createElement");
	}
}
