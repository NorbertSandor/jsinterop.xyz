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
public interface Selection {
	@JsProperty
	public abstract Node getAnchorNode();

	@JsProperty
	public abstract void setAnchorNode(final Node value);

	@JsProperty
	public abstract double getAnchorOffset();

	@JsProperty
	public abstract void setAnchorOffset(final double value);

	@JsProperty
	public abstract Node getFocusNode();

	@JsProperty
	public abstract void setFocusNode(final Node value);

	@JsProperty
	public abstract double getFocusOffset();

	@JsProperty
	public abstract void setFocusOffset(final double value);

	@JsProperty
	public abstract boolean isIsCollapsed();

	@JsProperty
	public abstract void setIsCollapsed(final boolean value);

	@JsProperty
	public abstract double getRangeCount();

	@JsProperty
	public abstract void setRangeCount(final double value);

	@JsProperty
	public abstract String getType();

	@JsProperty
	public abstract void setType(final String value);

	@JsMethod
	public abstract void addRange(final Range range);

	@JsMethod
	public abstract void collapse(final Node parentNode, final double offset);

	@JsMethod
	public abstract void collapseToEnd();

	@JsMethod
	public abstract void collapseToStart();

	@JsMethod
	public abstract boolean containsNode(final Node node, final boolean partlyContained);

	@JsMethod
	public abstract void deleteFromDocument();

	@JsMethod
	public abstract void empty();

	@JsMethod
	public abstract void extend(final Node newNode, final double offset);

	@JsMethod
	public abstract Range getRangeAt(final double index);

	@JsMethod
	public abstract void removeAllRanges();

	@JsMethod
	public abstract void removeRange(final Range range);

	@JsMethod
	public abstract void selectAllChildren(final Node parentNode);

	@JsMethod
	public abstract void setBaseAndExtent(final Node baseNode, final double baseOffset, final Node extentNode,
			final double extentOffset);

	@JsMethod
	public abstract String toString();
}
