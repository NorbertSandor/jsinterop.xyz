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
import xyz.jsinterop.client.core.Date;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface HTMLInputElement extends HTMLElement {
	/**
	 * Sets or retrieves a comma-separated list of content types.
	 */
	@JsProperty
	public abstract String getAccept();

	/**
	 * Sets or retrieves a comma-separated list of content types.
	 */
	@JsProperty
	public abstract void setAccept(final String value);

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
	 * Sets or retrieves a text alternative to the graphic.
	 */
	@JsProperty
	public abstract String getAlt();

	/**
	 * Sets or retrieves a text alternative to the graphic.
	 */
	@JsProperty
	public abstract void setAlt(final String value);

	/**
	 * Specifies whether autocomplete is applied to an editable text field.
	 */
	@JsProperty
	public abstract String getAutocomplete();

	/**
	 * Specifies whether autocomplete is applied to an editable text field.
	 */
	@JsProperty
	public abstract void setAutocomplete(final String value);

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
	 * Sets or retrieves the state of the check box or radio button.
	 */
	@JsProperty
	public abstract boolean isChecked();

	/**
	 * Sets or retrieves the state of the check box or radio button.
	 */
	@JsProperty
	public abstract void setChecked(final boolean value);

	/**
	 * Retrieves whether the object is fully loaded.
	 */
	@JsProperty
	public abstract boolean isComplete();

	/**
	 * Retrieves whether the object is fully loaded.
	 */
	@JsProperty
	public abstract void setComplete(final boolean value);

	/**
	 * Sets or retrieves the state of the check box or radio button.
	 */
	@JsProperty
	public abstract boolean isDefaultChecked();

	/**
	 * Sets or retrieves the state of the check box or radio button.
	 */
	@JsProperty
	public abstract void setDefaultChecked(final boolean value);

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
	 * Returns a FileList object on a file type input object.
	 */
	@JsProperty
	public abstract FileList getFiles();

	/**
	 * Returns a FileList object on a file type input object.
	 */
	@JsProperty
	public abstract void setFiles(final FileList value);

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
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract String getHeight();

	/**
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract void setHeight(final String value);

	/**
	 * Sets or retrieves the width of the border to draw around the object.
	 */
	@JsProperty
	public abstract double getHspace();

	/**
	 * Sets or retrieves the width of the border to draw around the object.
	 */
	@JsProperty
	public abstract void setHspace(final double value);

	@JsProperty
	public abstract boolean isIndeterminate();

	@JsProperty
	public abstract void setIndeterminate(final boolean value);

	/**
	 * Specifies the ID of a pre-defined datalist of options for an input
	 * element.
	 */
	@JsProperty
	public abstract HTMLElement getList();

	/**
	 * Specifies the ID of a pre-defined datalist of options for an input
	 * element.
	 */
	@JsProperty
	public abstract void setList(final HTMLElement value);

	/**
	 * Defines the maximum acceptable value for an input element with
	 * type="number".When used with the min and step attributes, lets you
	 * control the range and increment (such as only even numbers) that the user
	 * can enter into an input field.
	 */
	@JsProperty
	public abstract String getMax();

	/**
	 * Defines the maximum acceptable value for an input element with
	 * type="number".When used with the min and step attributes, lets you
	 * control the range and increment (such as only even numbers) that the user
	 * can enter into an input field.
	 */
	@JsProperty
	public abstract void setMax(final String value);

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
	 * Defines the minimum acceptable value for an input element with
	 * type="number". When used with the max and step attributes, lets you
	 * control the range and increment (such as even numbers only) that the user
	 * can enter into an input field.
	 */
	@JsProperty
	public abstract String getMin();

	/**
	 * Defines the minimum acceptable value for an input element with
	 * type="number". When used with the max and step attributes, lets you
	 * control the range and increment (such as even numbers only) that the user
	 * can enter into an input field.
	 */
	@JsProperty
	public abstract void setMin(final String value);

	/**
	 * Sets or retrieves the Boolean value indicating whether multiple items can
	 * be selected from a list.
	 */
	@JsProperty
	public abstract boolean isMultiple();

	/**
	 * Sets or retrieves the Boolean value indicating whether multiple items can
	 * be selected from a list.
	 */
	@JsProperty
	public abstract void setMultiple(final boolean value);

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
	 * Gets or sets a string containing a regular expression that the user's
	 * input must match.
	 */
	@JsProperty
	public abstract String getPattern();

	/**
	 * Gets or sets a string containing a regular expression that the user's
	 * input must match.
	 */
	@JsProperty
	public abstract void setPattern(final String value);

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

	@JsProperty
	public abstract boolean isReadOnly();

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

	@JsProperty
	public abstract double getSize();

	@JsProperty
	public abstract void setSize(final double value);

	/**
	 * The address or URL of the a media resource that is to be considered.
	 */
	@JsProperty
	public abstract String getSrc();

	/**
	 * The address or URL of the a media resource that is to be considered.
	 */
	@JsProperty
	public abstract void setSrc(final String value);

	@JsProperty
	public abstract boolean isStatus();

	@JsProperty
	public abstract void setStatus(final boolean value);

	/**
	 * Defines an increment or jump between values that you want to allow the
	 * user to enter. When used with the max and min attributes, lets you
	 * control the range and increment (for example, allow only even numbers)
	 * that the user can enter into an input field.
	 */
	@JsProperty
	public abstract String getStep();

	/**
	 * Defines an increment or jump between values that you want to allow the
	 * user to enter. When used with the max and min attributes, lets you
	 * control the range and increment (for example, allow only even numbers)
	 * that the user can enter into an input field.
	 */
	@JsProperty
	public abstract void setStep(final String value);

	/**
	 * Returns the content type of the object.
	 */
	@JsProperty
	public abstract String getType();

	/**
	 * Returns the content type of the object.
	 */
	@JsProperty
	public abstract void setType(final String value);

	/**
	 * Sets or retrieves the URL, often with a bookmark extension (#name), to
	 * use as a client-side image map.
	 */
	@JsProperty
	public abstract String getUseMap();

	/**
	 * Sets or retrieves the URL, often with a bookmark extension (#name), to
	 * use as a client-side image map.
	 */
	@JsProperty
	public abstract void setUseMap(final String value);

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
	 * Returns the value of the data at the cursor's current position.
	 */
	@JsProperty
	public abstract String getValue();

	/**
	 * Returns the value of the data at the cursor's current position.
	 */
	@JsProperty
	public abstract void setValue(final String value);

	@JsProperty
	public abstract Date getValueAsDate();

	@JsProperty
	public abstract void setValueAsDate(final Date value);

	/**
	 * Returns the input field value as a number.
	 */
	@JsProperty
	public abstract double getValueAsNumber();

	/**
	 * Returns the input field value as a number.
	 */
	@JsProperty
	public abstract void setValueAsNumber(final double value);

	/**
	 * Sets or retrieves the vertical margin for the object.
	 */
	@JsProperty
	public abstract double getVspace();

	/**
	 * Sets or retrieves the vertical margin for the object.
	 */
	@JsProperty
	public abstract void setVspace(final double value);

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
	 * Makes the selection equal to the current object.
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

	/**
	 * Decrements a range input control's value by the value given by the Step
	 * attribute. If the optional parameter is used, it will decrement the input
	 * control's step value multiplied by the parameter's value.
	 * 
	 * @param n
	 *            Value to decrement the value by.
	 */
	@JsMethod
	public abstract void stepDown();

	/**
	 * Decrements a range input control's value by the value given by the Step
	 * attribute. If the optional parameter is used, it will decrement the input
	 * control's step value multiplied by the parameter's value.
	 * 
	 * @param n
	 *            Value to decrement the value by.
	 */
	@JsMethod
	public abstract void stepDown(final double n);

	/**
	 * Increments a range input control's value by the value given by the Step
	 * attribute. If the optional parameter is used, will increment the input
	 * control's value by that value.
	 * 
	 * @param n
	 *            Value to increment the value by.
	 */
	@JsMethod
	public abstract void stepUp();

	/**
	 * Increments a range input control's value by the value given by the Step
	 * attribute. If the optional parameter is used, will increment the input
	 * control's value by that value.
	 * 
	 * @param n
	 *            Value to increment the value by.
	 */
	@JsMethod
	public abstract void stepUp(final double n);
}
