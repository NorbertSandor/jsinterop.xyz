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
public interface HTMLOptGroupElement extends HTMLElement {
	/**
	 * Sets or retrieves the status of an option.
	 */
	@JsProperty
	public abstract boolean isDefaultSelected();

	/**
	 * Sets or retrieves the status of an option.
	 */
	@JsProperty
	public abstract void setDefaultSelected(final boolean value);

	@JsProperty
	public abstract boolean isDisabled();

	@JsProperty
	public abstract void setDisabled(final boolean value);

	/**
	 * Retrieves a reference to the form that the object is embedded in.
	 */
	@JsProperty
	public abstract HTMLFormElement getForm();

	/**
	 * Retrieves a reference to the form that the object is embedded in.
	 */
	@JsProperty
	public abstract void setForm(final HTMLFormElement value);

	/**
	 * Sets or retrieves the ordinal position of an option in a list box.
	 */
	@JsProperty
	public abstract double getIndex();

	/**
	 * Sets or retrieves the ordinal position of an option in a list box.
	 */
	@JsProperty
	public abstract void setIndex(final double value);

	/**
	 * Sets or retrieves a value that you can use to implement your own label
	 * functionality for the object.
	 */
	@JsProperty
	public abstract String getLabel();

	/**
	 * Sets or retrieves a value that you can use to implement your own label
	 * functionality for the object.
	 */
	@JsProperty
	public abstract void setLabel(final String value);

	/**
	 * Sets or retrieves whether the option in the list box is the default item.
	 */
	@JsProperty
	public abstract boolean isSelected();

	/**
	 * Sets or retrieves whether the option in the list box is the default item.
	 */
	@JsProperty
	public abstract void setSelected(final boolean value);

	/**
	 * Sets or retrieves the text string specified by the option tag.
	 */
	@JsProperty
	public abstract String getText();

	/**
	 * Sets or retrieves the text string specified by the option tag.
	 */
	@JsProperty
	public abstract void setText(final String value);

	/**
	 * Sets or retrieves the value which is returned to the server when the form
	 * control is submitted.
	 */
	@JsProperty
	public abstract String getValue();

	/**
	 * Sets or retrieves the value which is returned to the server when the form
	 * control is submitted.
	 */
	@JsProperty
	public abstract void setValue(final String value);
}
