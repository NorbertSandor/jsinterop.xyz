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
public interface HTMLTableRowElement extends HTMLElement, HTMLTableAlignment {
	/**
	 * Sets or retrieves how the object is aligned with adjacent text.
	 */
	@JsProperty
	public abstract String getAlign();

	/**
	 * Sets or retrieves how the object is aligned with adjacent text.
	 */
	@JsProperty
	public abstract void setAlign(final String value);

	@JsProperty
	public abstract Object getBgColor();

	@JsProperty
	public abstract void setBgColor(final Object value);

	/**
	 * Retrieves a collection of all cells in the table row.
	 */
	@JsProperty
	public abstract HTMLCollection getCells();

	/**
	 * Retrieves a collection of all cells in the table row.
	 */
	@JsProperty
	public abstract void setCells(final HTMLCollection value);

	/**
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract Object getHeight();

	/**
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract void setHeight(final Object value);

	/**
	 * Retrieves the position of the object in the rows collection for the
	 * table.
	 */
	@JsProperty
	public abstract double getRowIndex();

	/**
	 * Retrieves the position of the object in the rows collection for the
	 * table.
	 */
	@JsProperty
	public abstract void setRowIndex(final double value);

	/**
	 * Retrieves the position of the object in the collection.
	 */
	@JsProperty
	public abstract double getSectionRowIndex();

	/**
	 * Retrieves the position of the object in the collection.
	 */
	@JsProperty
	public abstract void setSectionRowIndex(final double value);

	/**
	 * Removes the specified cell from the table row, as well as from the cells
	 * collection.
	 * 
	 * @param index
	 *            Number that specifies the zero-based position of the cell to
	 *            remove from the table row. If no value is provided, the last
	 *            cell in the cells collection is deleted.
	 */
	@JsMethod
	public abstract void deleteCell();

	/**
	 * Removes the specified cell from the table row, as well as from the cells
	 * collection.
	 * 
	 * @param index
	 *            Number that specifies the zero-based position of the cell to
	 *            remove from the table row. If no value is provided, the last
	 *            cell in the cells collection is deleted.
	 */
	@JsMethod
	public abstract void deleteCell(final double index);

	/**
	 * Creates a new cell in the table row, and adds the cell to the cells
	 * collection.
	 * 
	 * @param index
	 *            Number that specifies where to insert the cell in the tr. The
	 *            default value is -1, which appends the new cell to the end of
	 *            the cells collection.
	 */
	@JsMethod
	public abstract HTMLTableCellElement insertCell();

	/**
	 * Creates a new cell in the table row, and adds the cell to the cells
	 * collection.
	 * 
	 * @param index
	 *            Number that specifies where to insert the cell in the tr. The
	 *            default value is -1, which appends the new cell to the end of
	 *            the cells collection.
	 */
	@JsMethod
	public abstract HTMLTableCellElement insertCell(final double index);

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
