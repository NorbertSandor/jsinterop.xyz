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
public interface HTMLAppletElement extends HTMLElement {
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

	@JsProperty
	public abstract String getCode();

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
	 * Address of a pointer to the document this page or frame contains. If
	 * there is no document, then null will be returned.
	 */
	@JsProperty
	public abstract Document getContentDocument();

	/**
	 * Address of a pointer to the document this page or frame contains. If
	 * there is no document, then null will be returned.
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

	/**
	 * Sets or retrieves a character string that can be used to implement your
	 * own declare functionality for the object.
	 */
	@JsProperty
	public abstract boolean isDeclare();

	/**
	 * Sets or retrieves a character string that can be used to implement your
	 * own declare functionality for the object.
	 */
	@JsProperty
	public abstract void setDeclare(final boolean value);

	@JsProperty
	public abstract HTMLFormElement getForm();

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
	 * Sets or retrieves the shape of the object.
	 */
	@JsProperty
	public abstract String getName();

	/**
	 * Sets or retrieves the shape of the object.
	 */
	@JsProperty
	public abstract void setName(final String value);

	@JsProperty
	public abstract String getObject();

	@JsProperty
	public abstract void setObject(final String value);

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

	@JsProperty
	public abstract double getVspace();

	@JsProperty
	public abstract void setVspace(final double value);

	@JsProperty
	public abstract double getWidth();

	@JsProperty
	public abstract void setWidth(final double value);
}
