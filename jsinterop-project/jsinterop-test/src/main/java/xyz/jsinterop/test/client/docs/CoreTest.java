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
package xyz.jsinterop.test.client.docs;

import xyz.jsinterop.client.core.JsGlobals;
import xyz.jsinterop.client.dom.Document;
import xyz.jsinterop.client.dom.HTMLDivElement;

public class CoreTest implements Runnable {
	public void run() {
		accessingDocument();
	}

	private void accessingDocument() {
		Document document = JsGlobals.getDocument();

		HTMLDivElement div = document.createElementDiv();
		div.setInnerText("Text in div...");

		div.addEventListenerClick(event -> JsGlobals.getWindow().alert("Alert from div!"));
	}
}
