package xyz.jsinterop.client.dom;

import jsinterop.annotations.JsPackage;

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

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface MutationRecord {
	@JsProperty
	public abstract NodeList getAddedNodes();

	@JsProperty
	public abstract void setAddedNodes(final NodeList value);

	@JsProperty
	public abstract String getAttributeName();

	@JsProperty
	public abstract void setAttributeName(final String value);

	@JsProperty
	public abstract String getAttributeNamespace();

	@JsProperty
	public abstract void setAttributeNamespace(final String value);

	@JsProperty
	public abstract Node getNextSibling();

	@JsProperty
	public abstract void setNextSibling(final Node value);

	@JsProperty
	public abstract String getOldValue();

	@JsProperty
	public abstract void setOldValue(final String value);

	@JsProperty
	public abstract Node getPreviousSibling();

	@JsProperty
	public abstract void setPreviousSibling(final Node value);

	@JsProperty
	public abstract NodeList getRemovedNodes();

	@JsProperty
	public abstract void setRemovedNodes(final NodeList value);

	@JsProperty
	public abstract Node getTarget();

	@JsProperty
	public abstract void setTarget(final Node value);

	@JsProperty
	public abstract String getType();

	@JsProperty
	public abstract void setType(final String value);
}
