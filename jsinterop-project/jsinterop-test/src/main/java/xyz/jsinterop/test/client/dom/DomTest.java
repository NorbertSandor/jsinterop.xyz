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
import xyz.jsinterop.client.dom.Document;
import xyz.jsinterop.client.dom.Event;
import xyz.jsinterop.client.dom.EventListener;
import xyz.jsinterop.client.dom.EventListenerObject;
import xyz.jsinterop.client.dom.HTMLButtonElement;
import xyz.jsinterop.client.dom.HTMLDivElement;
import xyz.jsinterop.client.dom.HTMLInputElement;
import xyz.jsinterop.client.dom.Text;
import xyz.jsinterop.client.dom.Window;

public class DomTest implements Runnable {
	@Override
	public void run() {
		createElement();
		createTextNode();
		eventHandlers();
	}

	private void eventHandlers() {
		Document document = JsGlobals.getDocument();

		generatedCodeMarkerStart("Dom_eventHandlers");
		// tag::Dom_eventHandlers[]
		HTMLInputElement input = document.createElementInput();
		input.addEventListenerFocus(event -> input.getStyle().setBackgroundColor("yellow"));
		input.addEventListener("blur", event -> input.getStyle().setBackgroundColor("white"));
		// end::Dom_eventHandlers[]
		generatedCodeMarkerEnd("Dom_eventHandlers");

		document.getBody().appendChild(input);
	}

	private void createTextNode() {
		Document document = JsGlobals.getDocument();

		generatedCodeMarkerStart("Dom_createTextNode");
		// tag::Dom_createTextNode[]
		HTMLDivElement divElement = document.createElementDiv();
		Text textNode = document.createTextNode("DIV contents...");
		divElement.appendChild(textNode);
		// end::Dom_createTextNode[]
		generatedCodeMarkerEnd("Dom_createTextNode");
	}

	private void createElement() {
		Document document = JsGlobals.getDocument();

		generatedCodeMarkerStart("Dom_createElement");
		// tag::Dom_createElement[]
		HTMLInputElement inputElement1 = (HTMLInputElement) document.createElement("input");
		inputElement1.setValue("some text...");

		HTMLInputElement inputElement2 = document.createElementInput();
		inputElement2.setReadOnly(true);
		inputElement2.setValue(inputElement1.getValue());
		// end::Dom_createElement[]
		generatedCodeMarkerEnd("Dom_createElement");
	}
}
