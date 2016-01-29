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
public interface HTMLTextAreaElement extends HTMLElement {
	/**
	 * Provides a way to direct a user to a specific field when a document
	 * loads. This can provide both direction and convenience for a user,
	 * reducing the need to click or tab to a field when a page opens. This
	 * attribute is true when present on an element, and false when missing.
	 */
	@JsProperty
	public abstract boolean isAutofocus();

	/**
	 * Provides a way to direct a user to a specific field when a document
	 * loads. This can provide both direction and convenience for a user,
	 * reducing the need to click or tab to a field when a page opens. This
	 * attribute is true when present on an element, and false when missing.
	 */
	@JsProperty
	public abstract void setAutofocus(final boolean value);

	/**
	 * Sets or retrieves the width of the object.
	 */
	@JsProperty
	public abstract double getCols();

	/**
	 * Sets or retrieves the width of the object.
	 */
	@JsProperty
	public abstract void setCols(final double value);

	/**
	 * Sets or retrieves the initial contents of the object.
	 */
	@JsProperty
	public abstract String getDefaultValue();

	/**
	 * Sets or retrieves the initial contents of the object.
	 */
	@JsProperty
	public abstract void setDefaultValue(final String value);

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
	 * Sets or retrieves the maximum number of characters that the user can
	 * enter in a text control.
	 */
	@JsProperty
	public abstract double getMaxLength();

	/**
	 * Sets or retrieves the maximum number of characters that the user can
	 * enter in a text control.
	 */
	@JsProperty
	public abstract void setMaxLength(final double value);

	/**
	 * Sets or retrieves the name of the object.
	 */
	@JsProperty
	public abstract String getName();

	/**
	 * Sets or retrieves the name of the object.
	 */
	@JsProperty
	public abstract void setName(final String value);

	/**
	 * Gets or sets a text string that is displayed in an input field as a hint
	 * or prompt to users as the format or type of information they need to
	 * enter.The text appears in an input field until the user puts focus on the
	 * field.
	 */
	@JsProperty
	public abstract String getPlaceholder();

	/**
	 * Gets or sets a text string that is displayed in an input field as a hint
	 * or prompt to users as the format or type of information they need to
	 * enter.The text appears in an input field until the user puts focus on the
	 * field.
	 */
	@JsProperty
	public abstract void setPlaceholder(final String value);

	/**
	 * Sets or retrieves the value indicated whether the content of the object
	 * is read-only.
	 */
	@JsProperty
	public abstract boolean isReadOnly();

	/**
	 * Sets or retrieves the value indicated whether the content of the object
	 * is read-only.
	 */
	@JsProperty
	public abstract void setReadOnly(final boolean value);

	/**
	 * When present, marks an element that can't be submitted without a value.
	 */
	@JsProperty
	public abstract boolean isRequired();

	/**
	 * When present, marks an element that can't be submitted without a value.
	 */
	@JsProperty
	public abstract void setRequired(final boolean value);

	/**
	 * Sets or retrieves the number of horizontal rows contained in the object.
	 */
	@JsProperty
	public abstract double getRows();

	/**
	 * Sets or retrieves the number of horizontal rows contained in the object.
	 */
	@JsProperty
	public abstract void setRows(final double value);

	/**
	 * Gets or sets the end position or offset of a text selection.
	 */
	@JsProperty
	public abstract double getSelectionEnd();

	/**
	 * Gets or sets the end position or offset of a text selection.
	 */
	@JsProperty
	public abstract void setSelectionEnd(final double value);

	/**
	 * Gets or sets the starting position or offset of a text selection.
	 */
	@JsProperty
	public abstract double getSelectionStart();

	/**
	 * Gets or sets the starting position or offset of a text selection.
	 */
	@JsProperty
	public abstract void setSelectionStart(final double value);

	/**
	 * Sets or retrieves the value indicating whether the control is selected.
	 */
	@JsProperty
	public abstract Object getStatus();

	/**
	 * Sets or retrieves the value indicating whether the control is selected.
	 */
	@JsProperty
	public abstract void setStatus(final Object value);

	/**
	 * Retrieves the type of control.
	 */
	@JsProperty
	public abstract String getType();

	/**
	 * Retrieves the type of control.
	 */
	@JsProperty
	public abstract void setType(final String value);

	/**
	 * Returns the error message that would be displayed if the user submits the
	 * form, or an empty string if no error message. It also triggers the
	 * standard error message, such as "this is a required field". The result is
	 * that the user sees validation messages without actually submitting.
	 */
	@JsProperty
	public abstract String getValidationMessage();

	/**
	 * Returns the error message that would be displayed if the user submits the
	 * form, or an empty string if no error message. It also triggers the
	 * standard error message, such as "this is a required field". The result is
	 * that the user sees validation messages without actually submitting.
	 */
	@JsProperty
	public abstract void setValidationMessage(final String value);

	/**
	 * Returns a ValidityState object that represents the validity states of an
	 * element.
	 */
	@JsProperty
	public abstract ValidityState getValidity();

	/**
	 * Returns a ValidityState object that represents the validity states of an
	 * element.
	 */
	@JsProperty
	public abstract void setValidity(final ValidityState value);

	/**
	 * Retrieves or sets the text in the entry field of the textArea element.
	 */
	@JsProperty
	public abstract String getValue();

	/**
	 * Retrieves or sets the text in the entry field of the textArea element.
	 */
	@JsProperty
	public abstract void setValue(final String value);

	/**
	 * Returns whether an element will successfully validate based on forms
	 * validation rules and constraints.
	 */
	@JsProperty
	public abstract boolean isWillValidate();

	/**
	 * Returns whether an element will successfully validate based on forms
	 * validation rules and constraints.
	 */
	@JsProperty
	public abstract void setWillValidate(final boolean value);

	/**
	 * Sets or retrieves how to handle wordwrapping in the object.
	 */
	@JsProperty
	public abstract String getWrap();

	/**
	 * Sets or retrieves how to handle wordwrapping in the object.
	 */
	@JsProperty
	public abstract void setWrap(final String value);

	/**
	 * Returns whether a form will validate when it is submitted, without having
	 * to submit it.
	 */
	@JsMethod
	public abstract boolean checkValidity();

	/**
	 * Creates a TextRange object for the element.
	 */
	@JsMethod
	public abstract TextRange createTextRange();

	/**
	 * Highlights the input area of a form element.
	 */
	@JsMethod
	public abstract void select();

	/**
	 * Sets a custom error message that is displayed when a form is submitted.
	 * 
	 * @param error
	 *            Sets a custom error message that is displayed when a form is
	 *            submitted.
	 */
	@JsMethod
	public abstract void setCustomValidity(final String error);

	/**
	 * Sets the start and end positions of a selection in a text field.
	 * 
	 * @param start
	 *            The offset into the text field for the start of the selection.
	 * @param end
	 *            The offset into the text field for the end of the selection.
	 */
	@JsMethod
	public abstract void setSelectionRange(final double start, final double end);
}
