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
public interface DataTransfer {
	@JsProperty
	public abstract String getDropEffect();

	@JsProperty
	public abstract void setDropEffect(final String value);

	@JsProperty
	public abstract String getEffectAllowed();

	@JsProperty
	public abstract void setEffectAllowed(final String value);

	@JsProperty
	public abstract FileList getFiles();

	@JsProperty
	public abstract void setFiles(final FileList value);

	@JsProperty
	public abstract DataTransferItemList getItems();

	@JsProperty
	public abstract void setItems(final DataTransferItemList value);

	@JsProperty
	public abstract DOMStringList getTypes();

	@JsProperty
	public abstract void setTypes(final DOMStringList value);

	@JsMethod
	public abstract boolean clearData();

	@JsMethod
	public abstract boolean clearData(final String format);

	@JsMethod
	public abstract String getData(final String format);

	@JsMethod
	public abstract boolean setData(final String format, final String data);
}
