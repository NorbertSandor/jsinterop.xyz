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
public interface ElementTraversal {
	@JsProperty
	public abstract double getChildElementCount();

	@JsProperty
	public abstract void setChildElementCount(final double value);

	@JsProperty
	public abstract Element getFirstElementChild();

	@JsProperty
	public abstract void setFirstElementChild(final Element value);

	@JsProperty
	public abstract Element getLastElementChild();

	@JsProperty
	public abstract void setLastElementChild(final Element value);

	@JsProperty
	public abstract Element getNextElementSibling();

	@JsProperty
	public abstract void setNextElementSibling(final Element value);

	@JsProperty
	public abstract Element getPreviousElementSibling();

	@JsProperty
	public abstract void setPreviousElementSibling(final Element value);
}
