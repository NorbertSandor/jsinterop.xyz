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
package xyz.jsinterop.test.client.core

import xyz.jsinterop.client.core.JsGlobals

import static xyz.jsinterop.test.client.TestUtils.assertTrue

class JsGlobalsXtendTest implements Runnable {
	override run() {
		accessGlobals();
	}

	def private void accessGlobals() {
		// tag::JsGlobals_access_window[]
		val window = JsGlobals.window
		// end::JsGlobals_access_window[]
		// tag::JsGlobals_access_document[]
		val document = JsGlobals.document
		val document2 = window.document
		assertTrue(document == document2);
		// end::JsGlobals_access_document[]
	}
}
