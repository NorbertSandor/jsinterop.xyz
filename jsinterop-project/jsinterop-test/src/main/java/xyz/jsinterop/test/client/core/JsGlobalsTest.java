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
package xyz.jsinterop.test.client.core;

import static xyz.jsinterop.test.client.TestUtils.generatedCodeMarkerEnd;
import static xyz.jsinterop.test.client.TestUtils.generatedCodeMarkerStart;

import xyz.jsinterop.client.core.JsGlobals;
import xyz.jsinterop.client.dom.Document;
import xyz.jsinterop.client.dom.Window;
import static xyz.jsinterop.test.client.TestUtils.assertTrue;

public class JsGlobalsTest implements Runnable {
	@Override
	public void run() {
		accessGlobals();
	}

	private void accessGlobals() {
		generatedCodeMarkerStart("JsGlobals_access_window");
		// tag::JsGlobals_access_window[]
		Window window = JsGlobals.getWindow();
		// end::JsGlobals_access_window[]
		generatedCodeMarkerEnd("JsGlobals_access_window");
		
		generatedCodeMarkerStart("JsGlobals_access_document");
		// tag::JsGlobals_access_document[]
		Document document = JsGlobals.getDocument();
		Document document2 = window.getDocument();
		assertTrue(document == document2);
		// end::JsGlobals_access_document[]
		generatedCodeMarkerEnd("JsGlobals_access_document");

	}
}
