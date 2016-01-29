package xyz.jsinterop.client.dom;

/*
 * #%L
 * jsinterop
 * %%
 * Copyright (C) 2016 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface XPathEvaluator {
	@JsMethod
	public abstract XPathExpression createExpression(final String expression, final XPathNSResolver resolver);

	@JsMethod
	public abstract XPathNSResolver createNSResolver();

	@JsMethod
	public abstract XPathNSResolver createNSResolver(final Node nodeResolver);

	@JsMethod
	public abstract XPathResult evaluate(final String expression, final Node contextNode,
			final XPathNSResolver resolver, final double type, final XPathResult result);
}
