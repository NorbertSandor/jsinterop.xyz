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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface HTMLSelectElement extends HTMLElement {
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
	 * Sets or retrieves the number of objects in a collection.
	 */
	@JsProperty
	public abstract double getLength();

	/**
	 * Sets or retrieves the number of objects in a collection.
	 */
	@JsProperty
	public abstract void setLength(final double value);

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

	@JsProperty
	public abstract HTMLCollection getOptions();

	@JsProperty
	public abstract void setOptions(final HTMLCollection value);

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
	 * Sets or retrieves the index of the selected option in a select object.
	 */
	@JsProperty
	public abstract double getSelectedIndex();

	/**
	 * Sets or retrieves the index of the selected option in a select object.
	 */
	@JsProperty
	public abstract void setSelectedIndex(final double value);

	/**
	 * Sets or retrieves the number of rows in the list box.
	 */
	@JsProperty
	public abstract double getSize();

	/**
	 * Sets or retrieves the number of rows in the list box.
	 */
	@JsProperty
	public abstract void setSize(final double value);

	/**
	 * Retrieves the type of select control based on the value of the MULTIPLE
	 * attribute.
	 */
	@JsProperty
	public abstract String getType();

	/**
	 * Retrieves the type of select control based on the value of the MULTIPLE
	 * attribute.
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

	@JsOverlay
	public default Object get(final String name) {
		return (Object) xyz.jsinterop.client.core.JsMaps.getItem(this, name);
	}

	@JsOverlay
	public default void set(final String name, final Object value) {
		xyz.jsinterop.client.core.JsMaps.setItem(this, name, value);
	}

	/**
	 * Adds an element to the areas, controlRange, or options collection.
	 * 
	 * @param element
	 *            Variant of type Number that specifies the index position in
	 *            the collection where the element is placed. If no value is
	 *            given, the method places the element at the end of the
	 *            collection.
	 * @param before
	 *            Variant of type Object that specifies an element to insert
	 *            before, or null to append the object to the collection.
	 */
	@JsMethod
	public abstract void add(final HTMLElement element);

	/**
	 * Adds an element to the areas, controlRange, or options collection.
	 * 
	 * @param element
	 *            Variant of type Number that specifies the index position in
	 *            the collection where the element is placed. If no value is
	 *            given, the method places the element at the end of the
	 *            collection.
	 * @param before
	 *            Variant of type Object that specifies an element to insert
	 *            before, or null to append the object to the collection.
	 */
	@JsMethod
	public abstract void add(final HTMLElement element, final Object before);

	/**
	 * Returns whether a form will validate when it is submitted, without having
	 * to submit it.
	 */
	@JsMethod
	public abstract boolean checkValidity();

	/**
	 * Retrieves a select object or an object from an options collection.
	 * 
	 * @param name
	 *            Variant of type Number or String that specifies the object or
	 *            collection to retrieve. If this parameter is an integer, it is
	 *            the zero-based index of the object. If this parameter is a
	 *            string, all objects with matching name or id properties are
	 *            retrieved, and a collection is returned if more than one match
	 *            is made.
	 * @param index
	 *            Variant of type Number that specifies the zero-based index of
	 *            the object to retrieve when a collection is returned.
	 */
	@JsMethod
	public abstract Object item();

	/**
	 * Retrieves a select object or an object from an options collection.
	 * 
	 * @param name
	 *            Variant of type Number or String that specifies the object or
	 *            collection to retrieve. If this parameter is an integer, it is
	 *            the zero-based index of the object. If this parameter is a
	 *            string, all objects with matching name or id properties are
	 *            retrieved, and a collection is returned if more than one match
	 *            is made.
	 * @param index
	 *            Variant of type Number that specifies the zero-based index of
	 *            the object to retrieve when a collection is returned.
	 */
	@JsMethod
	public abstract Object item(final Object name);

	/**
	 * Retrieves a select object or an object from an options collection.
	 * 
	 * @param name
	 *            Variant of type Number or String that specifies the object or
	 *            collection to retrieve. If this parameter is an integer, it is
	 *            the zero-based index of the object. If this parameter is a
	 *            string, all objects with matching name or id properties are
	 *            retrieved, and a collection is returned if more than one match
	 *            is made.
	 * @param index
	 *            Variant of type Number that specifies the zero-based index of
	 *            the object to retrieve when a collection is returned.
	 */
	@JsMethod
	public abstract Object item(final Object name, final Object index);

	/**
	 * Retrieves a select object or an object from an options collection.
	 * 
	 * @param namedItem
	 *            A String that specifies the name or id property of the object
	 *            to retrieve. A collection is returned if more than one match
	 *            is made.
	 */
	@JsMethod
	public abstract Object namedItem(final String name);

	/**
	 * Removes an element from the collection.
	 * 
	 * @param index
	 *            Number that specifies the zero-based index of the element to
	 *            remove from the collection.
	 */
	@JsMethod
	public abstract void remove();

	/**
	 * Removes an element from the collection.
	 * 
	 * @param index
	 *            Number that specifies the zero-based index of the element to
	 *            remove from the collection.
	 */
	@JsMethod
	public abstract void remove(final double index);

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
