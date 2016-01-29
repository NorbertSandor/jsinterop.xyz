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

import com.google.common.base.Objects;

public class TestUtils {
	public static void generatedCodeMarkerStart(String id) {
	}

	public static void generatedCodeMarkerEnd(String id) {
	}

	public static void assertTrue(boolean condition) {
		assertTrue(condition, null);
	}

	public static void assertTrue(boolean condition, String message) {
		if (!condition) {
			fail(message);
		}
	}

	public static void assertFalse(boolean condition) {
		assertFalse(condition, null);
	}

	public static void assertFalse(boolean condition, String message) {
		if (condition) {
			fail(message);
		}
	}

	public static void fail(String message) {
		throw new AssertionError(message);
	}

	public static void assertEquals(boolean expected, boolean actual) {
		assertEquals((Object) expected, (Object) actual);
	}

	public static void assertEquals(char expected, char actual) {
		assertEquals((Object) expected, (Object) actual);
	}

	public static void assertEquals(double expected, double actual) {
		assertEquals((Object) expected, (Object) actual);
	}

	public static void assertEquals(float expected, float actual) {
		assertEquals((Object) expected, (Object) actual);
	}

	public static void assertEquals(int expected, int actual) {
		assertEquals((Object) expected, (Object) actual);
	}

	public static void assertEquals(long expected, long actual) {
		assertEquals((Object) expected, (Object) actual);
	}

	public static void assertEquals(Object expected, Object actual) {
		assertTrue(Objects.equal(expected, actual), "Expected " + expected + " but got " + actual);
	}
}
