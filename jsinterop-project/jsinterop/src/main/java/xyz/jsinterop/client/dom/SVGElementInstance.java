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
public interface SVGElementInstance extends EventTarget {
	@JsProperty
	public abstract SVGElementInstanceList getChildNodes();

	@JsProperty
	public abstract void setChildNodes(final SVGElementInstanceList value);

	@JsProperty
	public abstract SVGElement getCorrespondingElement();

	@JsProperty
	public abstract void setCorrespondingElement(final SVGElement value);

	@JsProperty
	public abstract SVGUseElement getCorrespondingUseElement();

	@JsProperty
	public abstract void setCorrespondingUseElement(final SVGUseElement value);

	@JsProperty
	public abstract SVGElementInstance getFirstChild();

	@JsProperty
	public abstract void setFirstChild(final SVGElementInstance value);

	@JsProperty
	public abstract SVGElementInstance getLastChild();

	@JsProperty
	public abstract void setLastChild(final SVGElementInstance value);

	@JsProperty
	public abstract SVGElementInstance getNextSibling();

	@JsProperty
	public abstract void setNextSibling(final SVGElementInstance value);

	@JsProperty
	public abstract SVGElementInstance getParentNode();

	@JsProperty
	public abstract void setParentNode(final SVGElementInstance value);

	@JsProperty
	public abstract SVGElementInstance getPreviousSibling();

	@JsProperty
	public abstract void setPreviousSibling(final SVGElementInstance value);
}
