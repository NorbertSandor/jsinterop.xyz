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

import static xyz.jsinterop.test.client.TestUtils.assertEquals;
import static xyz.jsinterop.test.client.TestUtils.assertTrue;
import static xyz.jsinterop.test.client.TestUtils.generatedCodeMarkerEnd;
import static xyz.jsinterop.test.client.TestUtils.generatedCodeMarkerStart;

import java.util.Arrays;

import xyz.jsinterop.client.core.JsArrayInt;
import xyz.jsinterop.client.core.JsArrays;
import xyz.jsinterop.client.core.JsUtils;

public class GwtInternalsTest implements Runnable {
	public void run() {
		primitiveSemantics();
		arraySemantics();
	}

	private void arraySemantics() {
		{
			generatedCodeMarkerStart("GwtInternalsTest_arraySemantics_stringArray");
			// tag::GwtInternalsTest_arraySemantics_stringArray[]
			String[] stringArray = { "a", "b", "c" };
			assertTrue(JsArrays.isArray(stringArray));
			assertEquals("b", stringArray[1]);
			// end::GwtInternalsTest_arraySemantics_stringArray[]
			generatedCodeMarkerEnd("GwtInternalsTest_arraySemantics_stringArray");
		}

		{
			generatedCodeMarkerStart("GwtInternalsTest_arraySemantics_intArray");
			// tag::GwtInternalsTest_arraySemantics_intArray[]
			int[] intArray = new int[5];
			assertTrue(JsArrays.isArray(intArray));
			assertEquals(0, intArray[0]);
			// end::GwtInternalsTest_arraySemantics_intArray[]
			generatedCodeMarkerEnd("GwtInternalsTest_arraySemantics_intArray");
		}

		{
			generatedCodeMarkerStart("GwtInternalsTest_arraySemantics_break");
			// tag::GwtInternalsTest_arraySemantics_break[]
			int[] javaArray = { 1, 2, 3 };
			assertEquals(3, javaArray.length);

			JsArrayInt jsArray = JsUtils.cast(javaArray);
			jsArray.push(4);
			
			assertEquals(4, javaArray.length);
			assertTrue(Arrays.equals(new int[] { 1, 2, 3, 4 }, javaArray));
			// end::GwtInternalsTest_arraySemantics_break[]
			generatedCodeMarkerEnd("GwtInternalsTest_arraySemantics_break");
		}
	}

	@SuppressWarnings("unused")
	private void primitiveSemantics() {
		generatedCodeMarkerStart("GwtInternalsTest_primitiveSemantics_boolean");
		// tag::GwtInternalsTest_primitiveSemantics_boolean[]
		boolean b1 = true;
		boolean b2 = false;
		// end::GwtInternalsTest_primitiveSemantics_boolean[]
		generatedCodeMarkerEnd("GwtInternalsTest_primitiveSemantics_boolean");

		generatedCodeMarkerStart("GwtInternalsTest_primitiveSemantics_others");
		// tag::GwtInternalsTest_primitiveSemantics_others[]
		byte by0 = (byte) 0;
		byte by1 = (byte) 1000; // Narrowing conversion

		char c1 = 'A';
		char c2 = '☺';

		int i1 = 256;
		int i2 = Integer.MAX_VALUE + 1; // No overflow in GWT
		assertTrue((long) Integer.MAX_VALUE + 1L == (long) i2); // Fails in
																// Java,
																// succeeds in
																// GWT
		// end::GwtInternalsTest_primitiveSemantics_others[]
		generatedCodeMarkerEnd("GwtInternalsTest_primitiveSemantics_others");

		generatedCodeMarkerStart("GwtInternalsTest_primitiveSemantics_double");
		// tag::GwtInternalsTest_primitiveSemantics_double[]
		double d1 = 2.2; // Literal compiles to 2.2
		double d2 = Double.MAX_VALUE;
		assertTrue(Double.MAX_VALUE == d2);
		// end::GwtInternalsTest_primitiveSemantics_double[]
		generatedCodeMarkerEnd("GwtInternalsTest_primitiveSemantics_double");

		generatedCodeMarkerStart("GwtInternalsTest_primitiveSemantics_float");
		// tag::GwtInternalsTest_primitiveSemantics_float[]
		float f1 = 2.2F; // Literal compiles to 2.200000047683716
		float f2 = (float) Double.MAX_VALUE; // No narrowing conversion in GWT
		assertTrue(d2 == f2); // Fails in Java, succeeds in GWT
		assertTrue(Double.MAX_VALUE == (double) f2); // Fails in Java, succeeds
														// in GWT
		// end::GwtInternalsTest_primitiveSemantics_float[]
		generatedCodeMarkerEnd("GwtInternalsTest_primitiveSemantics_float");

		generatedCodeMarkerStart("GwtInternalsTest_primitiveSemantics_long");
		// tag::GwtInternalsTest_primitiveSemantics_long[]
		long lo1 = 1; // Small long value
		long lo2 = 1L; // Small long value
		long lo3 = 1000000000000000000L; // Big long literal
		long lo4 = (long) Integer.MAX_VALUE + 1; // Big long value from
													// expression
		long lo5 = Integer.MAX_VALUE + 1; // int operations do not overflow in
											// GWT
		assertTrue(lo4 == lo5); // Fails in Java, succeeds in GWT
		// end::GwtInternalsTest_primitiveSemantics_long[]
		generatedCodeMarkerEnd("GwtInternalsTest_primitiveSemantics_long");
	}
}
