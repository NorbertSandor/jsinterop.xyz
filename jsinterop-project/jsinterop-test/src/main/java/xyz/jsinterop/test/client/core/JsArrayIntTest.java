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

import xyz.jsinterop.client.core.JsArrayOfInt;

public class JsArrayIntTest implements Runnable {
	@Override
	public void run() {
		testSort();
	}

	public void testSort() {
		JsArrayOfInt intArray = JsArrayOfInt.of(3, 2, 1);
		assertEquals(3, intArray.get(0));
		// TODO intArray.sort();
		assertEquals(1, intArray.get(0));
		// TODO assertTrue(JsArrayInt.Util.create(1, 2, 3).equals(intArray));
	}
}
