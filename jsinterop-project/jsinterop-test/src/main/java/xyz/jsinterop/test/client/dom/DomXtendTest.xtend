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
package xyz.jsinterop.test.client.dom

import xyz.jsinterop.client.core.JsGlobals
import xyz.jsinterop.client.dom.HTMLInputElement

import static xyz.jsinterop.test.client.TestUtils.generatedCodeMarkerEnd
import static xyz.jsinterop.test.client.TestUtils.generatedCodeMarkerStart

class DomXtendTest implements Runnable {
	override void run() {
		createElement
		createTextNode
		eventHandlers
	}

	def private void eventHandlers() {
		val document = JsGlobals.getDocument();

		generatedCodeMarkerStart("Dom_eventHandlers");
		// tag::Dom_eventHandlers[]
		val input = document.createElementInput
		input.addEventListenerFocus[input.style.backgroundColor = "yellow"]
		input.addEventListener("blur")[input.style.backgroundColor = "white"]
		// end::Dom_eventHandlers[]
		generatedCodeMarkerEnd("Dom_eventHandlers");

		document.body.appendChild(input)
	}

	def private void createTextNode() {
		val document = JsGlobals.getDocument

		generatedCodeMarkerStart("Dom_createTextNode");
		// tag::Dom_createTextNode[]
		val div = document.createElementDiv
		val textNode = document.createTextNode("DIV contents...")
		div.appendChild(textNode)
		// end::Dom_createTextNode[]
		generatedCodeMarkerEnd("Dom_createTextNode");
	}

	def private void createElement() {
		val document = JsGlobals.document

		generatedCodeMarkerStart("Dom_createElement");
		// tag::Dom_createElement[]
		val input1 = document.createElement("input") as HTMLInputElement
		input1.value = "some text..."

		val input2 = document.createElementInput
		input2.readOnly = true
		input2.value = input1.value
		// end::Dom_createElement[]
		generatedCodeMarkerEnd("Dom_createElement");
	}
}
