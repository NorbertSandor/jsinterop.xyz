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
public interface HTMLTableCellElement extends HTMLElement, HTMLTableAlignment {
	/**
	 * Sets or retrieves abbreviated text for the object.
	 */
	@JsProperty
	public abstract String getAbbr();

	/**
	 * Sets or retrieves abbreviated text for the object.
	 */
	@JsProperty
	public abstract void setAbbr(final String value);

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

	/**
	 * Sets or retrieves a comma-delimited list of conceptual categories
	 * associated with the object.
	 */
	@JsProperty
	public abstract String getAxis();

	/**
	 * Sets or retrieves a comma-delimited list of conceptual categories
	 * associated with the object.
	 */
	@JsProperty
	public abstract void setAxis(final String value);

	@JsProperty
	public abstract Object getBgColor();

	@JsProperty
	public abstract void setBgColor(final Object value);

	/**
	 * Retrieves the position of the object in the cells collection of a row.
	 */
	@JsProperty
	public abstract double getCellIndex();

	/**
	 * Retrieves the position of the object in the cells collection of a row.
	 */
	@JsProperty
	public abstract void setCellIndex(final double value);

	/**
	 * Sets or retrieves the number columns in the table that the object should
	 * span.
	 */
	@JsProperty
	public abstract double getColSpan();

	/**
	 * Sets or retrieves the number columns in the table that the object should
	 * span.
	 */
	@JsProperty
	public abstract void setColSpan(final double value);

	/**
	 * Sets or retrieves a list of header cells that provide information for the
	 * object.
	 */
	@JsProperty
	public abstract String getHeaders();

	/**
	 * Sets or retrieves a list of header cells that provide information for the
	 * object.
	 */
	@JsProperty
	public abstract void setHeaders(final String value);

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
	 * Sets or retrieves whether the browser automatically performs wordwrap.
	 */
	@JsProperty
	public abstract boolean isNoWrap();

	/**
	 * Sets or retrieves whether the browser automatically performs wordwrap.
	 */
	@JsProperty
	public abstract void setNoWrap(final boolean value);

	/**
	 * Sets or retrieves how many rows in a table the cell should span.
	 */
	@JsProperty
	public abstract double getRowSpan();

	/**
	 * Sets or retrieves how many rows in a table the cell should span.
	 */
	@JsProperty
	public abstract void setRowSpan(final double value);

	/**
	 * Sets or retrieves the group of cells in a table to which the object's
	 * information applies.
	 */
	@JsProperty
	public abstract String getScope();

	/**
	 * Sets or retrieves the group of cells in a table to which the object's
	 * information applies.
	 */
	@JsProperty
	public abstract void setScope(final String value);

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
