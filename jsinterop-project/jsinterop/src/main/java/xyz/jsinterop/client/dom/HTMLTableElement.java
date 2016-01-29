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
public interface HTMLTableElement extends HTMLElement {
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

	@JsProperty
	public abstract Object getBgColor();

	@JsProperty
	public abstract void setBgColor(final Object value);

	/**
	 * Sets or retrieves the width of the border to draw around the object.
	 */
	@JsProperty
	public abstract String getBorder();

	/**
	 * Sets or retrieves the width of the border to draw around the object.
	 */
	@JsProperty
	public abstract void setBorder(final String value);

	/**
	 * Sets or retrieves the border color of the object.
	 */
	@JsProperty
	public abstract Object getBorderColor();

	/**
	 * Sets or retrieves the border color of the object.
	 */
	@JsProperty
	public abstract void setBorderColor(final Object value);

	/**
	 * Retrieves the caption object of a table.
	 */
	@JsProperty
	public abstract HTMLTableCaptionElement getCaption();

	/**
	 * Retrieves the caption object of a table.
	 */
	@JsProperty
	public abstract void setCaption(final HTMLTableCaptionElement value);

	/**
	 * Sets or retrieves the amount of space between the border of the cell and
	 * the content of the cell.
	 */
	@JsProperty
	public abstract String getCellPadding();

	/**
	 * Sets or retrieves the amount of space between the border of the cell and
	 * the content of the cell.
	 */
	@JsProperty
	public abstract void setCellPadding(final String value);

	/**
	 * Sets or retrieves the amount of space between cells in a table.
	 */
	@JsProperty
	public abstract String getCellSpacing();

	/**
	 * Sets or retrieves the amount of space between cells in a table.
	 */
	@JsProperty
	public abstract void setCellSpacing(final String value);

	/**
	 * Sets or retrieves the number of columns in the table.
	 */
	@JsProperty
	public abstract double getCols();

	/**
	 * Sets or retrieves the number of columns in the table.
	 */
	@JsProperty
	public abstract void setCols(final double value);

	/**
	 * Sets or retrieves the way the border frame around the table is displayed.
	 */
	@JsProperty
	public abstract String getFrame();

	/**
	 * Sets or retrieves the way the border frame around the table is displayed.
	 */
	@JsProperty
	public abstract void setFrame(final String value);

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
	 * Sets or retrieves which dividing lines (inner borders) are displayed.
	 */
	@JsProperty
	public abstract String getRules();

	/**
	 * Sets or retrieves which dividing lines (inner borders) are displayed.
	 */
	@JsProperty
	public abstract void setRules(final String value);

	@JsProperty
	public abstract String getSummary();

	@JsProperty
	public abstract void setSummary(final String value);

	/**
	 * Retrieves a collection of all tBody objects in the table. Objects in this
	 * collection are in source order.
	 */
	@JsProperty
	public abstract HTMLCollection getTBodies();

	/**
	 * Retrieves a collection of all tBody objects in the table. Objects in this
	 * collection are in source order.
	 */
	@JsProperty
	public abstract void setTBodies(final HTMLCollection value);

	/**
	 * Retrieves the tFoot object of the table.
	 */
	@JsProperty
	public abstract HTMLTableSectionElement getTFoot();

	/**
	 * Retrieves the tFoot object of the table.
	 */
	@JsProperty
	public abstract void setTFoot(final HTMLTableSectionElement value);

	/**
	 * Retrieves the tHead object of the table.
	 */
	@JsProperty
	public abstract HTMLTableSectionElement getTHead();

	/**
	 * Retrieves the tHead object of the table.
	 */
	@JsProperty
	public abstract void setTHead(final HTMLTableSectionElement value);

	/**
	 * Sets or retrieves the width of the object.
	 */
	@JsProperty
	public abstract String getWidth();

	/**
	 * Sets or retrieves the width of the object.
	 */
	@JsProperty
	public abstract void setWidth(final String value);

	/**
	 * Creates an empty caption element in the table.
	 */
	@JsMethod
	public abstract HTMLTableCaptionElement createCaption();

	/**
	 * Creates an empty tBody element in the table.
	 */
	@JsMethod
	public abstract HTMLTableSectionElement createTBody();

	/**
	 * Creates an empty tFoot element in the table.
	 */
	@JsMethod
	public abstract HTMLTableSectionElement createTFoot();

	/**
	 * Returns the tHead element object if successful, or null otherwise.
	 */
	@JsMethod
	public abstract HTMLTableSectionElement createTHead();

	/**
	 * Deletes the caption element and its contents from the table.
	 */
	@JsMethod
	public abstract void deleteCaption();

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
	 * Deletes the tFoot element and its contents from the table.
	 */
	@JsMethod
	public abstract void deleteTFoot();

	/**
	 * Deletes the tHead element and its contents from the table.
	 */
	@JsMethod
	public abstract void deleteTHead();

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
}
