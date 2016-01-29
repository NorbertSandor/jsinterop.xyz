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
public interface HTMLButtonElement extends HTMLElement {
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
	 * Overrides the action attribute (where the data on a form is sent) on the
	 * parent form element.
	 */
	@JsProperty
	public abstract String getFormAction();

	/**
	 * Overrides the action attribute (where the data on a form is sent) on the
	 * parent form element.
	 */
	@JsProperty
	public abstract void setFormAction(final String value);

	/**
	 * Used to override the encoding (formEnctype attribute) specified on the
	 * form element.
	 */
	@JsProperty
	public abstract String getFormEnctype();

	/**
	 * Used to override the encoding (formEnctype attribute) specified on the
	 * form element.
	 */
	@JsProperty
	public abstract void setFormEnctype(final String value);

	/**
	 * Overrides the submit method attribute previously specified on a form
	 * element.
	 */
	@JsProperty
	public abstract String getFormMethod();

	/**
	 * Overrides the submit method attribute previously specified on a form
	 * element.
	 */
	@JsProperty
	public abstract void setFormMethod(final String value);

	/**
	 * Overrides any validation or required attributes on a form or form
	 * elements to allow it to be submitted without validation. This can be used
	 * to create a "save draft"-type submit option.
	 */
	@JsProperty
	public abstract String getFormNoValidate();

	/**
	 * Overrides any validation or required attributes on a form or form
	 * elements to allow it to be submitted without validation. This can be used
	 * to create a "save draft"-type submit option.
	 */
	@JsProperty
	public abstract void setFormNoValidate(final String value);

	/**
	 * Overrides the target attribute on a form element.
	 */
	@JsProperty
	public abstract String getFormTarget();

	/**
	 * Overrides the target attribute on a form element.
	 */
	@JsProperty
	public abstract void setFormTarget(final String value);

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

	@JsProperty
	public abstract Object getStatus();

	@JsProperty
	public abstract void setStatus(final Object value);

	/**
	 * Gets the classification and default behavior of the button.
	 */
	@JsProperty
	public abstract String getType();

	/**
	 * Gets the classification and default behavior of the button.
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
	 * Sets or retrieves the default or selected value of the control.
	 */
	@JsProperty
	public abstract String getValue();

	/**
	 * Sets or retrieves the default or selected value of the control.
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
	 * Sets a custom error message that is displayed when a form is submitted.
	 * 
	 * @param error
	 *            Sets a custom error message that is displayed when a form is
	 *            submitted.
	 */
	@JsMethod
	public abstract void setCustomValidity(final String error);
}
