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
package xyz.jsinterop.test.client;

import com.google.gwt.core.client.EntryPoint;

import xyz.jsinterop.test.client.core.JsArrayIntTest;
import xyz.jsinterop.test.client.core.JsGlobalsTest;
import xyz.jsinterop.test.client.docs.CoreTest;
import xyz.jsinterop.test.client.docs.Primitives;

public class JsInteropTestEntryPoint implements EntryPoint {
	@Override
	public void onModuleLoad() {
		// TODO
		// Document document = JsGlobals.getDocument();
		//
		// HTMLDivElement div = document.createElementDiv();
		// div.setInnerText("Text in div");
		//
		// document.getBody().appendChild(div);
		//
		// div.addEventListenerClick(event -> JsGlobals.getWindow().alert("Alert
		// from div! " + event.isCtrlKey()));
		//
		// div.addEventListener("click", new A1234());
		// div.addEventListener("click", new B1234());

		new JsGlobalsTest().run();
		new CoreTest().run();
		new Primitives().run();
		new JsArrayIntTest().run();
	}
}
