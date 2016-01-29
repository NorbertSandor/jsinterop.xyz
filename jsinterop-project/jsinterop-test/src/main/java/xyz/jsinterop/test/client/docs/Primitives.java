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

import static xyz.jsinterop.test.client.TestUtils.assertTrue;
import static xyz.jsinterop.test.client.TestUtils.generatedCodeMarkerEnd;
import static xyz.jsinterop.test.client.TestUtils.generatedCodeMarkerStart;

public class Primitives implements Runnable {
	public void run() {
		primitiveSemantics();
	}

	@SuppressWarnings("unused")
	private void primitiveSemantics() {
		generatedCodeMarkerStart("primitiveSemantics_boolean");
		// tag::primitiveSemantics_boolean[]
		boolean b1 = true;
		boolean b2 = false;
		// end::primitiveSemantics_boolean[]
		generatedCodeMarkerEnd("primitiveSemantics_boolean");

		generatedCodeMarkerStart("primitiveSemantics_others");
		// tag::primitiveSemantics_others[]
		byte by0 = (byte) 0;
		byte by1 = (byte) 1000; // Narrowing conversion

		char c1 = 'A';
		char c2 = '☺';

		int i1 = 256;
		int i2 = Integer.MAX_VALUE + 1; // No overflow in GWT
		assertTrue((long) Integer.MAX_VALUE + 1L == (long) i2); // Fails in Java, succeeds in GWT
		// end::primitiveSemantics_others[]
		generatedCodeMarkerEnd("primitiveSemantics_others");
		
		generatedCodeMarkerStart("primitiveSemantics_double");
		// tag::primitiveSemantics_double[]
		double d1 = 2.2; // Literal compiles to 2.2
		double d2 = Double.MAX_VALUE;
		assertTrue(Double.MAX_VALUE == d2);
		// end::primitiveSemantics_double[]
		generatedCodeMarkerEnd("primitiveSemantics_double");

		generatedCodeMarkerStart("primitiveSemantics_float");
		// tag::primitiveSemantics_float[]
		float f1 = 2.2F; // Literal compiles to 2.200000047683716
		float f2 = (float) Double.MAX_VALUE; // No narrowing conversion in GWT
		assertTrue(d2 == f2); // Fails in Java, succeeds in GWT
		assertTrue(Double.MAX_VALUE == (double) f2); // Fails in Java, succeeds in GWT
		// end::primitiveSemantics_float[]
		generatedCodeMarkerEnd("primitiveSemantics_float");

		generatedCodeMarkerStart("primitiveSemantics_long");
		// tag::primitiveSemantics_long[]
		long lo1 = 1; // Small long value
		long lo2 = 1L; // Small long value
		long lo3 = 1000000000000000000L; // Big long literal
		long lo4 = (long) Integer.MAX_VALUE + 1; // Big long value from expression
		long lo5 = Integer.MAX_VALUE + 1; // int operations do not overflow in GWT
		assertTrue(lo4 == lo5); // Fails in Java, succeeds in GWT
		// end::primitiveSemantics_long[]
		generatedCodeMarkerEnd("primitiveSemantics_long");
	}
}
