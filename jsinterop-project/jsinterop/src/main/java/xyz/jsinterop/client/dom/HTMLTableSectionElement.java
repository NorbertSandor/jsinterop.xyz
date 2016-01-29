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
public interface HTMLTableSectionElement extends HTMLElement, HTMLTableAlignment {
	/**
	 * Sets or retrieves a value that indicates the table alignment.
	 */
	@JsProperty
	public abstract String getAlign();

	/**
	 * Sets or retrieves a value that indicates the table alignment.
	 */
	@JsProperty
	public abstract void setAlign(final String value);

	/**
	 * Sets or retrieves the number of horizontal rows contained in the object.
	 */
	@JsProperty
	public abstract HTMLCollection getRows();

	/**
	 * Sets or retrieves the number of horizontal rows contained in the object.
	 */
	@JsProperty
	public abstract void setRows(final HTMLCollection value);

	/**
	 * Removes the specified row (tr) from the element and from the rows
	 * collection.
	 * 
	 * @param index
	 *            Number that specifies the zero-based position in the rows
	 *            collection of the row to remove.
	 */
	@JsMethod
	public abstract void deleteRow();

	/**
	 * Removes the specified row (tr) from the element and from the rows
	 * collection.
	 * 
	 * @param index
	 *            Number that specifies the zero-based position in the rows
	 *            collection of the row to remove.
	 */
	@JsMethod
	public abstract void deleteRow(final double index);

	/**
	 * Creates a new row (tr) in the table, and adds the row to the rows
	 * collection.
	 * 
	 * @param index
	 *            Number that specifies where to insert the row in the rows
	 *            collection. The default value is -1, which appends the new row
	 *            to the end of the rows collection.
	 */
	@JsMethod
	public abstract HTMLTableRowElement insertRow();

	/**
	 * Creates a new row (tr) in the table, and adds the row to the rows
	 * collection.
	 * 
	 * @param index
	 *            Number that specifies where to insert the row in the rows
	 *            collection. The default value is -1, which appends the new row
	 *            to the end of the rows collection.
	 */
	@JsMethod
	public abstract HTMLTableRowElement insertRow(final double index);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener, final boolean useCapture);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener,
			final boolean useCapture);
}
