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
public interface NodeIterator {
	@JsProperty
	public abstract boolean isExpandEntityReferences();

	@JsProperty
	public abstract void setExpandEntityReferences(final boolean value);

	@JsProperty
	public abstract NodeFilter getFilter();

	@JsProperty
	public abstract void setFilter(final NodeFilter value);

	@JsProperty
	public abstract Node getRoot();

	@JsProperty
	public abstract void setRoot(final Node value);

	@JsProperty
	public abstract double getWhatToShow();

	@JsProperty
	public abstract void setWhatToShow(final double value);

	@JsMethod
	public abstract void detach();

	@JsMethod
	public abstract Node nextNode();

	@JsMethod
	public abstract Node previousNode();
}
