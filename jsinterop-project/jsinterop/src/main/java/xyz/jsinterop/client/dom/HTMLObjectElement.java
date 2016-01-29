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
public interface HTMLObjectElement extends HTMLElement, GetSVGDocument {
	/**
	 * Retrieves a string of the URL where the object tag can be found. This is
	 * often the href of the document that the object is in, or the value set by
	 * a base element.
	 */
	@JsProperty
	public abstract String getBaseHref();

	/**
	 * Retrieves a string of the URL where the object tag can be found. This is
	 * often the href of the document that the object is in, or the value set by
	 * a base element.
	 */
	@JsProperty
	public abstract void setBaseHref(final String value);

	@JsProperty
	public abstract String getAlign();

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
	 * Gets or sets the optional alternative HTML script to execute if the
	 * object fails to load.
	 */
	@JsProperty
	public abstract String getAltHtml();

	/**
	 * Gets or sets the optional alternative HTML script to execute if the
	 * object fails to load.
	 */
	@JsProperty
	public abstract void setAltHtml(final String value);

	/**
	 * Sets or retrieves a character string that can be used to implement your
	 * own archive functionality for the object.
	 */
	@JsProperty
	public abstract String getArchive();

	/**
	 * Sets or retrieves a character string that can be used to implement your
	 * own archive functionality for the object.
	 */
	@JsProperty
	public abstract void setArchive(final String value);

	@JsProperty
	public abstract String getBorder();

	@JsProperty
	public abstract void setBorder(final String value);

	/**
	 * Sets or retrieves the URL of the file containing the compiled Java class.
	 */
	@JsProperty
	public abstract String getCode();

	/**
	 * Sets or retrieves the URL of the file containing the compiled Java class.
	 */
	@JsProperty
	public abstract void setCode(final String value);

	/**
	 * Sets or retrieves the URL of the component.
	 */
	@JsProperty
	public abstract String getCodeBase();

	/**
	 * Sets or retrieves the URL of the component.
	 */
	@JsProperty
	public abstract void setCodeBase(final String value);

	/**
	 * Sets or retrieves the Internet media type for the code associated with
	 * the object.
	 */
	@JsProperty
	public abstract String getCodeType();

	/**
	 * Sets or retrieves the Internet media type for the code associated with
	 * the object.
	 */
	@JsProperty
	public abstract void setCodeType(final String value);

	/**
	 * Retrieves the document object of the page or frame.
	 */
	@JsProperty
	public abstract Document getContentDocument();

	/**
	 * Retrieves the document object of the page or frame.
	 */
	@JsProperty
	public abstract void setContentDocument(final Document value);

	/**
	 * Sets or retrieves the URL that references the data of the object.
	 */
	@JsProperty
	public abstract String getData();

	/**
	 * Sets or retrieves the URL that references the data of the object.
	 */
	@JsProperty
	public abstract void setData(final String value);

	@JsProperty
	public abstract boolean isDeclare();

	@JsProperty
	public abstract void setDeclare(final boolean value);

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
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract String getHeight();

	/**
	 * Sets or retrieves the height of the object.
	 */
	@JsProperty
	public abstract void setHeight(final String value);

	@JsProperty
	public abstract double getHspace();

	@JsProperty
	public abstract void setHspace(final double value);

	/**
	 * Gets or sets whether the DLNA PlayTo device is available.
	 */
	@JsProperty
	public abstract boolean isMsPlayToDisabled();

	/**
	 * Gets or sets whether the DLNA PlayTo device is available.
	 */
	@JsProperty
	public abstract void setMsPlayToDisabled(final boolean value);

	/**
	 * Gets or sets the path to the preferred media source. This enables the
	 * Play To target device to stream the media content, which can be DRM
	 * protected, from a different location, such as a cloud media server.
	 */
	@JsProperty
	public abstract String getMsPlayToPreferredSourceUri();

	/**
	 * Gets or sets the path to the preferred media source. This enables the
	 * Play To target device to stream the media content, which can be DRM
	 * protected, from a different location, such as a cloud media server.
	 */
	@JsProperty
	public abstract void setMsPlayToPreferredSourceUri(final String value);

	/**
	 * Gets or sets the primary DLNA PlayTo device.
	 */
	@JsProperty
	public abstract boolean isMsPlayToPrimary();

	/**
	 * Gets or sets the primary DLNA PlayTo device.
	 */
	@JsProperty
	public abstract void setMsPlayToPrimary(final boolean value);

	/**
	 * Gets the source associated with the media element for use by the
	 * PlayToManager.
	 */
	@JsProperty
	public abstract Object getMsPlayToSource();

	/**
	 * Gets the source associated with the media element for use by the
	 * PlayToManager.
	 */
	@JsProperty
	public abstract void setMsPlayToSource(final Object value);

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
	 * Retrieves the contained object.
	 */
	@JsProperty
	public abstract Object getObject();

	/**
	 * Retrieves the contained object.
	 */
	@JsProperty
	public abstract void setObject(final Object value);

	@JsProperty
	public abstract double getReadyState();

	@JsProperty
	public abstract void setReadyState(final double value);

	/**
	 * Sets or retrieves a message to be displayed while an object is loading.
	 */
	@JsProperty
	public abstract String getStandby();

	/**
	 * Sets or retrieves a message to be displayed while an object is loading.
	 */
	@JsProperty
	public abstract void setStandby(final String value);

	/**
	 * Sets or retrieves the MIME type of the object.
	 */
	@JsProperty
	public abstract String getType();

	/**
	 * Sets or retrieves the MIME type of the object.
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

	@JsProperty
	public abstract double getVspace();

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
	 * Sets a custom error message that is displayed when a form is submitted.
	 * 
	 * @param error
	 *            Sets a custom error message that is displayed when a form is
	 *            submitted.
	 */
	@JsMethod
	public abstract void setCustomValidity(final String error);

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
