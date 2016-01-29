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

public class ArrayTest implements Runnable {
	@Override
	public void run() {
		testInstantiation();
	}

	public void testInstantiation() {
		int[] intArray = { 0, 1, 2 };
	}
}
