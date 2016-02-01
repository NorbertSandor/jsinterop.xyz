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
package xyz.jsinterop.client.dom;

import jsinterop.annotations.JsProperty;

public interface StorageEventInit extends EventInit {
	@JsProperty
	public abstract String getKey();

	@JsProperty
	public abstract void setKey(final String value);

	@JsProperty
	public abstract String getOldValue();

	@JsProperty
	public abstract void setOldValue(final String value);

	@JsProperty
	public abstract String getNewValue();

	@JsProperty
	public abstract void setNewValue(final String value);

	@JsProperty
	public abstract String getUrl();

	@JsProperty
	public abstract void setUrl(final String value);

	@JsProperty
	public abstract Storage getStorageArea();

	@JsProperty
	public abstract void setStorageArea(final Storage value);
}
