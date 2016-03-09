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

import static xyz.jsinterop.test.client.TestUtils.assertEquals;
import static xyz.jsinterop.test.client.TestUtils.assertTrue;

import xyz.jsinterop.client.core.JsArrayInt;
import xyz.jsinterop.client.core.JsArrayString;
import xyz.jsinterop.shared.core.util.ListOfInt;
import xyz.jsinterop.shared.core.util.ListOfString;

public class JsArrayIntTest implements Runnable {
	@Override
	public void run() {
		testSort();
	}

	public void testSort() {
		JsArrayInt intArray = JsArrayInt.of(3, 2, 1);
		
		assertEquals(3, intArray.get(0));
		
		// FIXME intArray.sort();
		// assertEquals(1, intArray.get(0));
		
		// TODO assertTrue(JsArrayInt.Util.create(1, 2, 3).equals(intArray));
		assertTrue(intArray instanceof JsArrayInt);
		assertTrue(intArray instanceof ListOfInt);
		assertTrue(((JsArrayString)((Object)intArray)) instanceof JsArrayString);
		assertTrue(((ListOfString)((Object)intArray)) instanceof ListOfString);
	}
}
