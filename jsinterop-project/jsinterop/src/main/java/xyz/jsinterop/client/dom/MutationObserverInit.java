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
public interface MutationObserverInit {
	@JsProperty
	public abstract boolean isChildList();

	@JsProperty
	public abstract void setChildList(final boolean value);

	@JsProperty
	public abstract boolean isAttributes();

	@JsProperty
	public abstract void setAttributes(final boolean value);

	@JsProperty
	public abstract boolean isCharacterData();

	@JsProperty
	public abstract void setCharacterData(final boolean value);

	@JsProperty
	public abstract boolean isSubtree();

	@JsProperty
	public abstract void setSubtree(final boolean value);

	@JsProperty
	public abstract boolean isAttributeOldValue();

	@JsProperty
	public abstract void setAttributeOldValue(final boolean value);

	@JsProperty
	public abstract boolean isCharacterDataOldValue();

	@JsProperty
	public abstract void setCharacterDataOldValue(final boolean value);

	@JsProperty
	public abstract Object getAttributeFilter();

	@JsProperty
	public abstract void setAttributeFilter(final Object value);
}
