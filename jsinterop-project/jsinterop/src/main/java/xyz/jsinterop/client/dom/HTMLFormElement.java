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
public interface HTMLFormElement extends HTMLElement {
	/**
	 * Sets or retrieves a list of character encodings for input data that must
	 * be accepted by the server processing the form.
	 */
	@JsProperty
	public abstract String getAcceptCharset();

	/**
	 * Sets or retrieves a list of character encodings for input data that must
	 * be accepted by the server processing the form.
	 */
	@JsProperty
	public abstract void setAcceptCharset(final String value);

	/**
	 * Sets or retrieves the URL to which the form content is sent for
	 * processing.
	 */
	@JsProperty
	public abstract String getAction();

	/**
	 * Sets or retrieves the URL to which the form content is sent for
	 * processing.
	 */
	@JsProperty
	public abstract void setAction(final String value);

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
	 * Retrieves a collection, in source order, of all controls in a given form.
	 */
	@JsProperty
	public abstract HTMLCollection getElements();

	/**
	 * Retrieves a collection, in source order, of all controls in a given form.
	 */
	@JsProperty
	public abstract void setElements(final HTMLCollection value);

	/**
	 * Sets or retrieves the MIME encoding for the form.
	 */
	@JsProperty
	public abstract String getEncoding();

	/**
	 * Sets or retrieves the MIME encoding for the form.
	 */
	@JsProperty
	public abstract void setEncoding(final String value);

	/**
	 * Sets or retrieves the encoding type for the form.
	 */
	@JsProperty
	public abstract String getEnctype();

	/**
	 * Sets or retrieves the encoding type for the form.
	 */
	@JsProperty
	public abstract void setEnctype(final String value);

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
	 * Sets or retrieves how to send the form data to the server.
	 */
	@JsProperty
	public abstract String getMethod();

	/**
	 * Sets or retrieves how to send the form data to the server.
	 */
	@JsProperty
	public abstract void setMethod(final String value);

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
	 * Designates a form that is not validated when submitted.
	 */
	@JsProperty
	public abstract boolean isNoValidate();

	/**
	 * Designates a form that is not validated when submitted.
	 */
	@JsProperty
	public abstract void setNoValidate(final boolean value);

	/**
	 * Sets or retrieves the window or frame at which to target content.
	 */
	@JsProperty
	public abstract String getTarget();

	/**
	 * Sets or retrieves the window or frame at which to target content.
	 */
	@JsProperty
	public abstract void setTarget(final String value);

	@JsOverlay
	public default Object get(final String name) {
		return (Object) xyz.jsinterop.client.core.JsMaps.getItem(this, name);
	}

	@JsOverlay
	public default void set(final String name, final Object value) {
		xyz.jsinterop.client.core.JsMaps.setItem(this, name, value);
	}

	/**
	 * Returns whether a form will validate when it is submitted, without having
	 * to submit it.
	 */
	@JsMethod
	public abstract boolean checkValidity();

	/**
	 * Retrieves a form object or an object from an elements collection.
	 * 
	 * @param name
	 *            Variant of type Number or String that specifies the object or
	 *            collection to retrieve. If this parameter is a Number, it is
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
	 * Retrieves a form object or an object from an elements collection.
	 * 
	 * @param name
	 *            Variant of type Number or String that specifies the object or
	 *            collection to retrieve. If this parameter is a Number, it is
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
	 * Retrieves a form object or an object from an elements collection.
	 * 
	 * @param name
	 *            Variant of type Number or String that specifies the object or
	 *            collection to retrieve. If this parameter is a Number, it is
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
	 * Retrieves a form object or an object from an elements collection.
	 */
	@JsMethod
	public abstract Object namedItem(final String name);

	/**
	 * Fires when the user resets a form.
	 */
	@JsMethod
	public abstract void reset();

	/**
	 * Fires when a FORM is about to be submitted.
	 */
	@JsMethod
	public abstract void submit();
}
