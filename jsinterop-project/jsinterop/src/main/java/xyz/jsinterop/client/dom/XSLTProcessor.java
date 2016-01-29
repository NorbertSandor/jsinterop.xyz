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
public interface XSLTProcessor {
	@JsMethod
	public abstract void clearParameters();

	@JsMethod
	public abstract Object getParameter(final String namespaceURI, final String localName);

	@JsMethod
	public abstract void importStylesheet(final Node style);

	@JsMethod
	public abstract void removeParameter(final String namespaceURI, final String localName);

	@JsMethod
	public abstract void reset();

	@JsMethod
	public abstract void setParameter(final String namespaceURI, final String localName, final Object value);

	@JsMethod
	public abstract Document transformToDocument(final Node source);

	@JsMethod
	public abstract DocumentFragment transformToFragment(final Node source, final Document document);
}
