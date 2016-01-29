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
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface DocumentType extends Node, ChildNode {
	@JsProperty
	public abstract NamedNodeMap getEntities();

	@JsProperty
	public abstract void setEntities(final NamedNodeMap value);

	@JsProperty
	public abstract String getInternalSubset();

	@JsProperty
	public abstract void setInternalSubset(final String value);

	@JsProperty
	public abstract String getName();

	@JsProperty
	public abstract void setName(final String value);

	@JsProperty
	public abstract NamedNodeMap getNotations();

	@JsProperty
	public abstract void setNotations(final NamedNodeMap value);

	@JsProperty
	public abstract String getPublicId();

	@JsProperty
	public abstract void setPublicId(final String value);

	@JsProperty
	public abstract String getSystemId();

	@JsProperty
	public abstract void setSystemId(final String value);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener, final boolean useCapture);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener,
			final boolean useCapture);
}
