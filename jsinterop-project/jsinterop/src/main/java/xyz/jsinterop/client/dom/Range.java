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
public interface Range {
	@JsProperty
	public abstract boolean isCollapsed();

	@JsProperty
	public abstract void setCollapsed(final boolean value);

	@JsProperty
	public abstract Node getCommonAncestorContainer();

	@JsProperty
	public abstract void setCommonAncestorContainer(final Node value);

	@JsProperty
	public abstract Node getEndContainer();

	@JsProperty
	public abstract void setEndContainer(final Node value);

	@JsProperty
	public abstract double getEndOffset();

	@JsProperty
	public abstract void setEndOffset(final double value);

	@JsProperty
	public abstract Node getStartContainer();

	@JsProperty
	public abstract void setStartContainer(final Node value);

	@JsProperty
	public abstract double getStartOffset();

	@JsProperty
	public abstract void setStartOffset(final double value);

	@JsProperty
	public abstract double getEND_TO_END();

	@JsProperty
	public abstract void setEND_TO_END(final double value);

	@JsProperty
	public abstract double getEND_TO_START();

	@JsProperty
	public abstract void setEND_TO_START(final double value);

	@JsProperty
	public abstract double getSTART_TO_END();

	@JsProperty
	public abstract void setSTART_TO_END(final double value);

	@JsProperty
	public abstract double getSTART_TO_START();

	@JsProperty
	public abstract void setSTART_TO_START(final double value);

	@JsMethod
	public abstract DocumentFragment cloneContents();

	@JsMethod
	public abstract Range cloneRange();

	@JsMethod
	public abstract void collapse(final boolean toStart);

	@JsMethod
	public abstract double compareBoundaryPoints(final double how, final Range sourceRange);

	@JsMethod
	public abstract DocumentFragment createContextualFragment(final String fragment);

	@JsMethod
	public abstract void deleteContents();

	@JsMethod
	public abstract void detach();

	@JsMethod
	public abstract boolean expand(final String Unit);

	@JsMethod
	public abstract DocumentFragment extractContents();

	@JsMethod
	public abstract ClientRect getBoundingClientRect();

	@JsMethod
	public abstract ClientRectList getClientRects();

	@JsMethod
	public abstract void insertNode(final Node newNode);

	@JsMethod
	public abstract void selectNode(final Node refNode);

	@JsMethod
	public abstract void selectNodeContents(final Node refNode);

	@JsMethod
	public abstract void setEnd(final Node refNode, final double offset);

	@JsMethod
	public abstract void setEndAfter(final Node refNode);

	@JsMethod
	public abstract void setEndBefore(final Node refNode);

	@JsMethod
	public abstract void setStart(final Node refNode, final double offset);

	@JsMethod
	public abstract void setStartAfter(final Node refNode);

	@JsMethod
	public abstract void setStartBefore(final Node refNode);

	@JsMethod
	public abstract void surroundContents(final Node newParent);

	@JsMethod
	public abstract String toString();
}
