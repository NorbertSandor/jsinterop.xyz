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
public interface HTMLTableAlignment {
	/**
	 * Sets or retrieves a value that you can use to implement your own ch
	 * functionality for the object.
	 */
	@JsProperty
	public abstract String getCh();

	/**
	 * Sets or retrieves a value that you can use to implement your own ch
	 * functionality for the object.
	 */
	@JsProperty
	public abstract void setCh(final String value);

	/**
	 * Sets or retrieves a value that you can use to implement your own chOff
	 * functionality for the object.
	 */
	@JsProperty
	public abstract String getChOff();

	/**
	 * Sets or retrieves a value that you can use to implement your own chOff
	 * functionality for the object.
	 */
	@JsProperty
	public abstract void setChOff(final String value);

	/**
	 * Sets or retrieves how text and other content are vertically aligned
	 * within the object that contains them.
	 */
	@JsProperty
	public abstract String getVAlign();

	/**
	 * Sets or retrieves how text and other content are vertically aligned
	 * within the object that contains them.
	 */
	@JsProperty
	public abstract void setVAlign(final String value);
}
