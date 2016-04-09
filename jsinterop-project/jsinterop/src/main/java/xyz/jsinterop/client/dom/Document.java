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
public interface Document extends Node, GlobalEventHandlers, NodeSelector, DocumentEvent {
	/**
	 * Sets or gets the URL for the current document.
	 */
	@JsProperty
	public abstract String getURL();

	/**
	 * Sets or gets the URL for the current document.
	 */
	@JsProperty
	public abstract void setURL(final String value);

	/**
	 * Gets the URL for the document, stripped of any character encoding.
	 */
	@JsProperty
	public abstract String getURLUnencoded();

	/**
	 * Gets the URL for the document, stripped of any character encoding.
	 */
	@JsProperty
	public abstract void setURLUnencoded(final String value);

	/**
	 * Gets the object that has the focus when the parent document has focus.
	 */
	@JsProperty
	public abstract Element getActiveElement();

	/**
	 * Gets the object that has the focus when the parent document has focus.
	 */
	@JsProperty
	public abstract void setActiveElement(final Element value);

	/**
	 * Sets or gets the color of all active links in the document.
	 */
	@JsProperty
	public abstract String getAlinkColor();

	/**
	 * Sets or gets the color of all active links in the document.
	 */
	@JsProperty
	public abstract void setAlinkColor(final String value);

	/**
	 * Returns a reference to the collection of elements contained by the
	 * object.
	 */
	@JsProperty
	public abstract HTMLCollection getAll();

	/**
	 * Returns a reference to the collection of elements contained by the
	 * object.
	 */
	@JsProperty
	public abstract void setAll(final HTMLCollection value);

	@JsProperty
	public abstract HTMLCollection getAnchors();

	@JsProperty
	public abstract void setAnchors(final HTMLCollection value);

	/**
	 * Retrieves a collection of all applet objects in the document.
	 */
	@JsProperty
	public abstract HTMLCollection getApplets();

	/**
	 * Retrieves a collection of all applet objects in the document.
	 */
	@JsProperty
	public abstract void setApplets(final HTMLCollection value);

	/**
	 * Deprecated. Sets or retrieves a value that indicates the background color
	 * behind the object.
	 */
	@JsProperty
	public abstract String getBgColor();

	/**
	 * Deprecated. Sets or retrieves a value that indicates the background color
	 * behind the object.
	 */
	@JsProperty
	public abstract void setBgColor(final String value);

	/**
	 * Specifies the beginning and end of the document body.
	 */
	@JsProperty
	public abstract HTMLElement getBody();

	/**
	 * Specifies the beginning and end of the document body.
	 */
	@JsProperty
	public abstract void setBody(final HTMLElement value);

	@JsProperty
	public abstract String getCharacterSet();

	@JsProperty
	public abstract void setCharacterSet(final String value);

	/**
	 * Gets or sets the character set used to encode the object.
	 */
	@JsProperty
	public abstract String getCharset();

	/**
	 * Gets or sets the character set used to encode the object.
	 */
	@JsProperty
	public abstract void setCharset(final String value);

	/**
	 * Gets a value that indicates whether standards-compliant mode is switched
	 * on for the object.
	 */
	@JsProperty
	public abstract String getCompatMode();

	/**
	 * Gets a value that indicates whether standards-compliant mode is switched
	 * on for the object.
	 */
	@JsProperty
	public abstract void setCompatMode(final String value);

	@JsProperty
	public abstract String getCookie();

	@JsProperty
	public abstract void setCookie(final String value);

	/**
	 * Gets the default character set from the current regional language
	 * settings.
	 */
	@JsProperty
	public abstract String getDefaultCharset();

	/**
	 * Gets the default character set from the current regional language
	 * settings.
	 */
	@JsProperty
	public abstract void setDefaultCharset(final String value);

	@JsProperty
	public abstract Window getDefaultView();

	@JsProperty
	public abstract void setDefaultView(final Window value);

	/**
	 * Sets or gets a value that indicates whether the document can be edited.
	 */
	@JsProperty
	public abstract String getDesignMode();

	/**
	 * Sets or gets a value that indicates whether the document can be edited.
	 */
	@JsProperty
	public abstract void setDesignMode(final String value);

	/**
	 * Sets or retrieves a value that indicates the reading order of the object.
	 */
	@JsProperty
	public abstract String getDir();

	/**
	 * Sets or retrieves a value that indicates the reading order of the object.
	 */
	@JsProperty
	public abstract void setDir(final String value);

	/**
	 * Gets an object representing the document type declaration associated with
	 * the current document.
	 */
	@JsProperty
	public abstract DocumentType getDoctype();

	/**
	 * Gets an object representing the document type declaration associated with
	 * the current document.
	 */
	@JsProperty
	public abstract void setDoctype(final DocumentType value);

	/**
	 * Gets a reference to the root node of the document.
	 */
	@JsProperty
	public abstract HTMLElement getDocumentElement();

	/**
	 * Gets a reference to the root node of the document.
	 */
	@JsProperty
	public abstract void setDocumentElement(final HTMLElement value);

	/**
	 * Sets or gets the security domain of the document.
	 */
	@JsProperty
	public abstract String getDomain();

	/**
	 * Sets or gets the security domain of the document.
	 */
	@JsProperty
	public abstract void setDomain(final String value);

	/**
	 * Retrieves a collection of all embed objects in the document.
	 */
	@JsProperty
	public abstract HTMLCollection getEmbeds();

	/**
	 * Retrieves a collection of all embed objects in the document.
	 */
	@JsProperty
	public abstract void setEmbeds(final HTMLCollection value);

	/**
	 * Sets or gets the foreground (text) color of the document.
	 */
	@JsProperty
	public abstract String getFgColor();

	/**
	 * Sets or gets the foreground (text) color of the document.
	 */
	@JsProperty
	public abstract void setFgColor(final String value);

	/**
	 * Retrieves a collection, in source order, of all form objects in the
	 * document.
	 */
	@JsProperty
	public abstract HTMLCollection getForms();

	/**
	 * Retrieves a collection, in source order, of all form objects in the
	 * document.
	 */
	@JsProperty
	public abstract void setForms(final HTMLCollection value);

	@JsProperty
	public abstract Element getFullscreenElement();

	@JsProperty
	public abstract void setFullscreenElement(final Element value);

	@JsProperty
	public abstract boolean isFullscreenEnabled();

	@JsProperty
	public abstract void setFullscreenEnabled(final boolean value);

	@JsProperty
	public abstract HTMLHeadElement getHead();

	@JsProperty
	public abstract void setHead(final HTMLHeadElement value);

	@JsProperty
	public abstract boolean isHidden();

	@JsProperty
	public abstract void setHidden(final boolean value);

	/**
	 * Retrieves a collection, in source order, of img objects in the document.
	 */
	@JsProperty
	public abstract HTMLCollection getImages();

	/**
	 * Retrieves a collection, in source order, of img objects in the document.
	 */
	@JsProperty
	public abstract void setImages(final HTMLCollection value);

	/**
	 * Gets the implementation object of the current document.
	 */
	@JsProperty
	public abstract DOMImplementation getImplementation();

	/**
	 * Gets the implementation object of the current document.
	 */
	@JsProperty
	public abstract void setImplementation(final DOMImplementation value);

	/**
	 * Returns the character encoding used to create the webpage that is loaded
	 * into the document object.
	 */
	@JsProperty
	public abstract String getInputEncoding();

	/**
	 * Returns the character encoding used to create the webpage that is loaded
	 * into the document object.
	 */
	@JsProperty
	public abstract void setInputEncoding(final String value);

	/**
	 * Gets the date that the page was last modified, if the page supplies one.
	 */
	@JsProperty
	public abstract String getLastModified();

	/**
	 * Gets the date that the page was last modified, if the page supplies one.
	 */
	@JsProperty
	public abstract void setLastModified(final String value);

	/**
	 * Sets or gets the color of the document links.
	 */
	@JsProperty
	public abstract String getLinkColor();

	/**
	 * Sets or gets the color of the document links.
	 */
	@JsProperty
	public abstract void setLinkColor(final String value);

	/**
	 * Retrieves a collection of all a objects that specify the href property
	 * and all area objects in the document.
	 */
	@JsProperty
	public abstract HTMLCollection getLinks();

	/**
	 * Retrieves a collection of all a objects that specify the href property
	 * and all area objects in the document.
	 */
	@JsProperty
	public abstract void setLinks(final HTMLCollection value);

	/**
	 * Contains information about the current URL.
	 */
	@JsProperty
	public abstract Location getLocation();

	/**
	 * Contains information about the current URL.
	 */
	@JsProperty
	public abstract void setLocation(final Location value);

	@JsProperty
	public abstract String getMedia();

	@JsProperty
	public abstract void setMedia(final String value);

	@JsProperty
	public abstract boolean isMsCSSOMElementFloatMetrics();

	@JsProperty
	public abstract void setMsCSSOMElementFloatMetrics(final boolean value);

	@JsProperty
	public abstract boolean isMsCapsLockWarningOff();

	@JsProperty
	public abstract void setMsCapsLockWarningOff(final boolean value);

	@JsProperty
	public abstract boolean isMsHidden();

	@JsProperty
	public abstract void setMsHidden(final boolean value);

	@JsProperty
	public abstract String getMsVisibilityState();

	@JsProperty
	public abstract void setMsVisibilityState(final String value);

	/**
	 * Fires when the user aborts the download.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnabort();

	/**
	 * Fires when the user aborts the download.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnabort(final EventListener<Event> value);

	/**
	 * Fires when the object is set as the active element.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<UIEvent> getOnactivate();

	/**
	 * Fires when the object is set as the active element.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnactivate(final EventListener<UIEvent> value);

	/**
	 * Fires immediately before the object is set as the active element.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<UIEvent> getOnbeforeactivate();

	/**
	 * Fires immediately before the object is set as the active element.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnbeforeactivate(final EventListener<UIEvent> value);

	/**
	 * Fires immediately before the activeElement is changed from the current
	 * object to another object in the parent document.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<UIEvent> getOnbeforedeactivate();

	/**
	 * Fires immediately before the activeElement is changed from the current
	 * object to another object in the parent document.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnbeforedeactivate(final EventListener<UIEvent> value);

	/**
	 * Fires when the object loses the input focus.
	 * 
	 * @param ev
	 *            The focus event.
	 */
	@JsProperty
	public abstract EventListener<FocusEvent> getOnblur();

	/**
	 * Fires when the object loses the input focus.
	 * 
	 * @param ev
	 *            The focus event.
	 */
	@JsProperty
	public abstract void setOnblur(final EventListener<FocusEvent> value);

	/**
	 * Occurs when playback is possible, but would require further buffering.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOncanplay();

	/**
	 * Occurs when playback is possible, but would require further buffering.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOncanplay(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOncanplaythrough();

	@JsProperty
	public abstract void setOncanplaythrough(final EventListener<Event> value);

	/**
	 * Fires when the contents of the object or selection have changed.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnchange();

	/**
	 * Fires when the contents of the object or selection have changed.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnchange(final EventListener<Event> value);

	/**
	 * Fires when the user clicks the left mouse button on the object
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract EventListener<MouseEvent> getOnclick();

	/**
	 * Fires when the user clicks the left mouse button on the object
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract void setOnclick(final EventListener<MouseEvent> value);

	/**
	 * Fires when the user clicks the right mouse button in the client area,
	 * opening the context menu.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract EventListener<PointerEvent> getOncontextmenu();

	/**
	 * Fires when the user clicks the right mouse button in the client area,
	 * opening the context menu.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract void setOncontextmenu(final EventListener<PointerEvent> value);

	/**
	 * Fires when the user double-clicks the object.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract EventListener<MouseEvent> getOndblclick();

	/**
	 * Fires when the user double-clicks the object.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract void setOndblclick(final EventListener<MouseEvent> value);

	/**
	 * Fires when the activeElement is changed from the current object to
	 * another object in the parent document.
	 * 
	 * @param ev
	 *            The UI Event
	 */
	@JsProperty
	public abstract EventListener<UIEvent> getOndeactivate();

	/**
	 * Fires when the activeElement is changed from the current object to
	 * another object in the parent document.
	 * 
	 * @param ev
	 *            The UI Event
	 */
	@JsProperty
	public abstract void setOndeactivate(final EventListener<UIEvent> value);

	/**
	 * Fires on the source object continuously during a drag operation.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<DragEvent> getOndrag();

	/**
	 * Fires on the source object continuously during a drag operation.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOndrag(final EventListener<DragEvent> value);

	/**
	 * Fires on the source object when the user releases the mouse at the close
	 * of a drag operation.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<DragEvent> getOndragend();

	/**
	 * Fires on the source object when the user releases the mouse at the close
	 * of a drag operation.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOndragend(final EventListener<DragEvent> value);

	/**
	 * Fires on the target element when the user drags the object to a valid
	 * drop target.
	 * 
	 * @param ev
	 *            The drag event.
	 */
	@JsProperty
	public abstract EventListener<DragEvent> getOndragenter();

	/**
	 * Fires on the target element when the user drags the object to a valid
	 * drop target.
	 * 
	 * @param ev
	 *            The drag event.
	 */
	@JsProperty
	public abstract void setOndragenter(final EventListener<DragEvent> value);

	/**
	 * Fires on the target object when the user moves the mouse out of a valid
	 * drop target during a drag operation.
	 * 
	 * @param ev
	 *            The drag event.
	 */
	@JsProperty
	public abstract EventListener<DragEvent> getOndragleave();

	/**
	 * Fires on the target object when the user moves the mouse out of a valid
	 * drop target during a drag operation.
	 * 
	 * @param ev
	 *            The drag event.
	 */
	@JsProperty
	public abstract void setOndragleave(final EventListener<DragEvent> value);

	/**
	 * Fires on the target element continuously while the user drags the object
	 * over a valid drop target.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<DragEvent> getOndragover();

	/**
	 * Fires on the target element continuously while the user drags the object
	 * over a valid drop target.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOndragover(final EventListener<DragEvent> value);

	/**
	 * Fires on the source object when the user starts to drag a text selection
	 * or selected object.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<DragEvent> getOndragstart();

	/**
	 * Fires on the source object when the user starts to drag a text selection
	 * or selected object.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOndragstart(final EventListener<DragEvent> value);

	@JsProperty
	public abstract EventListener<DragEvent> getOndrop();

	@JsProperty
	public abstract void setOndrop(final EventListener<DragEvent> value);

	/**
	 * Occurs when the duration attribute is updated.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOndurationchange();

	/**
	 * Occurs when the duration attribute is updated.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOndurationchange(final EventListener<Event> value);

	/**
	 * Occurs when the media element is reset to its initial state.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnemptied();

	/**
	 * Occurs when the media element is reset to its initial state.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnemptied(final EventListener<Event> value);

	/**
	 * Occurs when the end of playback is reached.
	 * 
	 * @param ev
	 *            The event
	 */
	@JsProperty
	public abstract EventListener<Event> getOnended();

	/**
	 * Occurs when the end of playback is reached.
	 * 
	 * @param ev
	 *            The event
	 */
	@JsProperty
	public abstract void setOnended(final EventListener<Event> value);

	/**
	 * Fires when an error occurs during object loading.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnerror();

	/**
	 * Fires when an error occurs during object loading.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnerror(final EventListener<Event> value);

	/**
	 * Fires when the object receives focus.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<FocusEvent> getOnfocus();

	/**
	 * Fires when the object receives focus.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnfocus(final EventListener<FocusEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnfullscreenchange();

	@JsProperty
	public abstract void setOnfullscreenchange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnfullscreenerror();

	@JsProperty
	public abstract void setOnfullscreenerror(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOninput();

	@JsProperty
	public abstract void setOninput(final EventListener<Event> value);

	/**
	 * Fires when the user presses a key.
	 * 
	 * @param ev
	 *            The keyboard event
	 */
	@JsProperty
	public abstract EventListener<KeyboardEvent> getOnkeydown();

	/**
	 * Fires when the user presses a key.
	 * 
	 * @param ev
	 *            The keyboard event
	 */
	@JsProperty
	public abstract void setOnkeydown(final EventListener<KeyboardEvent> value);

	/**
	 * Fires when the user presses an alphanumeric key.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<KeyboardEvent> getOnkeypress();

	/**
	 * Fires when the user presses an alphanumeric key.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnkeypress(final EventListener<KeyboardEvent> value);

	/**
	 * Fires when the user releases a key.
	 * 
	 * @param ev
	 *            The keyboard event
	 */
	@JsProperty
	public abstract EventListener<KeyboardEvent> getOnkeyup();

	/**
	 * Fires when the user releases a key.
	 * 
	 * @param ev
	 *            The keyboard event
	 */
	@JsProperty
	public abstract void setOnkeyup(final EventListener<KeyboardEvent> value);

	/**
	 * Fires immediately after the browser loads the object.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnload();

	/**
	 * Fires immediately after the browser loads the object.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnload(final EventListener<Event> value);

	/**
	 * Occurs when media data is loaded at the current playback position.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnloadeddata();

	/**
	 * Occurs when media data is loaded at the current playback position.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnloadeddata(final EventListener<Event> value);

	/**
	 * Occurs when the duration and dimensions of the media have been
	 * determined.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnloadedmetadata();

	/**
	 * Occurs when the duration and dimensions of the media have been
	 * determined.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnloadedmetadata(final EventListener<Event> value);

	/**
	 * Occurs when Internet Explorer begins looking for media data.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnloadstart();

	/**
	 * Occurs when Internet Explorer begins looking for media data.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnloadstart(final EventListener<Event> value);

	/**
	 * Fires when the user clicks the object with either mouse button.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract EventListener<MouseEvent> getOnmousedown();

	/**
	 * Fires when the user clicks the object with either mouse button.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract void setOnmousedown(final EventListener<MouseEvent> value);

	/**
	 * Fires when the user moves the mouse over the object.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract EventListener<MouseEvent> getOnmousemove();

	/**
	 * Fires when the user moves the mouse over the object.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract void setOnmousemove(final EventListener<MouseEvent> value);

	/**
	 * Fires when the user moves the mouse pointer outside the boundaries of the
	 * object.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract EventListener<MouseEvent> getOnmouseout();

	/**
	 * Fires when the user moves the mouse pointer outside the boundaries of the
	 * object.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract void setOnmouseout(final EventListener<MouseEvent> value);

	/**
	 * Fires when the user moves the mouse pointer into the object.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract EventListener<MouseEvent> getOnmouseover();

	/**
	 * Fires when the user moves the mouse pointer into the object.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract void setOnmouseover(final EventListener<MouseEvent> value);

	/**
	 * Fires when the user releases a mouse button while the mouse is over the
	 * object.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract EventListener<MouseEvent> getOnmouseup();

	/**
	 * Fires when the user releases a mouse button while the mouse is over the
	 * object.
	 * 
	 * @param ev
	 *            The mouse event.
	 */
	@JsProperty
	public abstract void setOnmouseup(final EventListener<MouseEvent> value);

	/**
	 * Fires when the wheel button is rotated.
	 * 
	 * @param ev
	 *            The mouse event
	 */
	@JsProperty
	public abstract EventListener<MouseWheelEvent> getOnmousewheel();

	/**
	 * Fires when the wheel button is rotated.
	 * 
	 * @param ev
	 *            The mouse event
	 */
	@JsProperty
	public abstract void setOnmousewheel(final EventListener<MouseWheelEvent> value);

	@JsProperty
	public abstract EventListener<UIEvent> getOnmscontentzoom();

	@JsProperty
	public abstract void setOnmscontentzoom(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturechange();

	@JsProperty
	public abstract void setOnmsgesturechange(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturedoubletap();

	@JsProperty
	public abstract void setOnmsgesturedoubletap(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgestureend();

	@JsProperty
	public abstract void setOnmsgestureend(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturehold();

	@JsProperty
	public abstract void setOnmsgesturehold(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturestart();

	@JsProperty
	public abstract void setOnmsgesturestart(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturetap();

	@JsProperty
	public abstract void setOnmsgesturetap(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsinertiastart();

	@JsProperty
	public abstract void setOnmsinertiastart(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSManipulationEvent> getOnmsmanipulationstatechanged();

	@JsProperty
	public abstract void setOnmsmanipulationstatechanged(final EventListener<MSManipulationEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointercancel();

	@JsProperty
	public abstract void setOnmspointercancel(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerdown();

	@JsProperty
	public abstract void setOnmspointerdown(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerenter();

	@JsProperty
	public abstract void setOnmspointerenter(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerleave();

	@JsProperty
	public abstract void setOnmspointerleave(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointermove();

	@JsProperty
	public abstract void setOnmspointermove(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerout();

	@JsProperty
	public abstract void setOnmspointerout(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerover();

	@JsProperty
	public abstract void setOnmspointerover(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerup();

	@JsProperty
	public abstract void setOnmspointerup(final EventListener<MSPointerEvent> value);

	/**
	 * Occurs when an item is removed from a Jump List of a webpage running in
	 * Site Mode.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<MSSiteModeEvent> getOnmssitemodejumplistitemremoved();

	/**
	 * Occurs when an item is removed from a Jump List of a webpage running in
	 * Site Mode.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnmssitemodejumplistitemremoved(final EventListener<MSSiteModeEvent> value);

	/**
	 * Occurs when a user clicks a button in a Thumbnail Toolbar of a webpage
	 * running in Site Mode.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<MSSiteModeEvent> getOnmsthumbnailclick();

	/**
	 * Occurs when a user clicks a button in a Thumbnail Toolbar of a webpage
	 * running in Site Mode.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnmsthumbnailclick(final EventListener<MSSiteModeEvent> value);

	/**
	 * Occurs when playback is paused.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnpause();

	/**
	 * Occurs when playback is paused.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnpause(final EventListener<Event> value);

	/**
	 * Occurs when the play method is requested.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnplay();

	/**
	 * Occurs when the play method is requested.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnplay(final EventListener<Event> value);

	/**
	 * Occurs when the audio or video has started playing.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnplaying();

	/**
	 * Occurs when the audio or video has started playing.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnplaying(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnpointerlockchange();

	@JsProperty
	public abstract void setOnpointerlockchange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnpointerlockerror();

	@JsProperty
	public abstract void setOnpointerlockerror(final EventListener<Event> value);

	/**
	 * Occurs to indicate progress while downloading media data.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<ProgressEvent> getOnprogress();

	/**
	 * Occurs to indicate progress while downloading media data.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnprogress(final EventListener<ProgressEvent> value);

	/**
	 * Occurs when the playback rate is increased or decreased.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnratechange();

	/**
	 * Occurs when the playback rate is increased or decreased.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnratechange(final EventListener<Event> value);

	/**
	 * Fires when the state of the object has changed.
	 * 
	 * @param ev
	 *            The event
	 */
	@JsProperty
	public abstract EventListener<ProgressEvent> getOnreadystatechange();

	/**
	 * Fires when the state of the object has changed.
	 * 
	 * @param ev
	 *            The event
	 */
	@JsProperty
	public abstract void setOnreadystatechange(final EventListener<ProgressEvent> value);

	/**
	 * Fires when the user resets a form.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnreset();

	/**
	 * Fires when the user resets a form.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnreset(final EventListener<Event> value);

	/**
	 * Fires when the user repositions the scroll box in the scroll bar on the
	 * object.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<UIEvent> getOnscroll();

	/**
	 * Fires when the user repositions the scroll box in the scroll bar on the
	 * object.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnscroll(final EventListener<UIEvent> value);

	/**
	 * Occurs when the seek operation ends.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnseeked();

	/**
	 * Occurs when the seek operation ends.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnseeked(final EventListener<Event> value);

	/**
	 * Occurs when the current playback position is moved.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnseeking();

	/**
	 * Occurs when the current playback position is moved.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnseeking(final EventListener<Event> value);

	/**
	 * Fires when the current selection changes.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<UIEvent> getOnselect();

	/**
	 * Fires when the current selection changes.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnselect(final EventListener<UIEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnselectstart();

	@JsProperty
	public abstract void setOnselectstart(final EventListener<Event> value);

	/**
	 * Occurs when the download has stopped.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnstalled();

	/**
	 * Occurs when the download has stopped.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnstalled(final EventListener<Event> value);

	/**
	 * Fires when the user clicks the Stop button or leaves the Web page.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnstop();

	/**
	 * Fires when the user clicks the Stop button or leaves the Web page.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnstop(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnsubmit();

	@JsProperty
	public abstract void setOnsubmit(final EventListener<Event> value);

	/**
	 * Occurs if the load operation has been intentionally halted.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnsuspend();

	/**
	 * Occurs if the load operation has been intentionally halted.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnsuspend(final EventListener<Event> value);

	/**
	 * Occurs to indicate the current playback position.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOntimeupdate();

	/**
	 * Occurs to indicate the current playback position.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOntimeupdate(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<TouchEvent> getOntouchcancel();

	@JsProperty
	public abstract void setOntouchcancel(final EventListener<TouchEvent> value);

	@JsProperty
	public abstract EventListener<TouchEvent> getOntouchend();

	@JsProperty
	public abstract void setOntouchend(final EventListener<TouchEvent> value);

	@JsProperty
	public abstract EventListener<TouchEvent> getOntouchmove();

	@JsProperty
	public abstract void setOntouchmove(final EventListener<TouchEvent> value);

	@JsProperty
	public abstract EventListener<TouchEvent> getOntouchstart();

	@JsProperty
	public abstract void setOntouchstart(final EventListener<TouchEvent> value);

	/**
	 * Occurs when the volume is changed, or playback is muted or unmuted.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnvolumechange();

	/**
	 * Occurs when the volume is changed, or playback is muted or unmuted.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnvolumechange(final EventListener<Event> value);

	/**
	 * Occurs when playback stops because the next frame of a video resource is
	 * not available.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract EventListener<Event> getOnwaiting();

	/**
	 * Occurs when playback stops because the next frame of a video resource is
	 * not available.
	 * 
	 * @param ev
	 *            The event.
	 */
	@JsProperty
	public abstract void setOnwaiting(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnwebkitfullscreenchange();

	@JsProperty
	public abstract void setOnwebkitfullscreenchange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnwebkitfullscreenerror();

	@JsProperty
	public abstract void setOnwebkitfullscreenerror(final EventListener<Event> value);

	@JsProperty
	public abstract HTMLCollection getPlugins();

	@JsProperty
	public abstract void setPlugins(final HTMLCollection value);

	@JsProperty
	public abstract Element getPointerLockElement();

	@JsProperty
	public abstract void setPointerLockElement(final Element value);

	/**
	 * Retrieves a value that indicates the current state of the object.
	 */
	@JsProperty
	public abstract String getReadyState();

	/**
	 * Retrieves a value that indicates the current state of the object.
	 */
	@JsProperty
	public abstract void setReadyState(final String value);

	/**
	 * Gets the URL of the location that referred the user to the current page.
	 */
	@JsProperty
	public abstract String getReferrer();

	/**
	 * Gets the URL of the location that referred the user to the current page.
	 */
	@JsProperty
	public abstract void setReferrer(final String value);

	/**
	 * Gets the root svg element in the document hierarchy.
	 */
	@JsProperty
	public abstract SVGSVGElement getRootElement();

	/**
	 * Gets the root svg element in the document hierarchy.
	 */
	@JsProperty
	public abstract void setRootElement(final SVGSVGElement value);

	/**
	 * Retrieves a collection of all script objects in the document.
	 */
	@JsProperty
	public abstract HTMLCollection getScripts();

	/**
	 * Retrieves a collection of all script objects in the document.
	 */
	@JsProperty
	public abstract void setScripts(final HTMLCollection value);

	@JsProperty
	public abstract String getSecurity();

	@JsProperty
	public abstract void setSecurity(final String value);

	/**
	 * Retrieves a collection of styleSheet objects representing the style
	 * sheets that correspond to each instance of a link or style object in the
	 * document.
	 */
	@JsProperty
	public abstract StyleSheetList getStyleSheets();

	/**
	 * Retrieves a collection of styleSheet objects representing the style
	 * sheets that correspond to each instance of a link or style object in the
	 * document.
	 */
	@JsProperty
	public abstract void setStyleSheets(final StyleSheetList value);

	/**
	 * Contains the title of the document.
	 */
	@JsProperty
	public abstract String getTitle();

	/**
	 * Contains the title of the document.
	 */
	@JsProperty
	public abstract void setTitle(final String value);

	@JsProperty
	public abstract String getVisibilityState();

	@JsProperty
	public abstract void setVisibilityState(final String value);

	/**
	 * Sets or gets the color of the links that the user has visited.
	 */
	@JsProperty
	public abstract String getVlinkColor();

	/**
	 * Sets or gets the color of the links that the user has visited.
	 */
	@JsProperty
	public abstract void setVlinkColor(final String value);

	@JsProperty
	public abstract Element getWebkitCurrentFullScreenElement();

	@JsProperty
	public abstract void setWebkitCurrentFullScreenElement(final Element value);

	@JsProperty
	public abstract Element getWebkitFullscreenElement();

	@JsProperty
	public abstract void setWebkitFullscreenElement(final Element value);

	@JsProperty
	public abstract boolean isWebkitFullscreenEnabled();

	@JsProperty
	public abstract void setWebkitFullscreenEnabled(final boolean value);

	@JsProperty
	public abstract boolean isWebkitIsFullScreen();

	@JsProperty
	public abstract void setWebkitIsFullScreen(final boolean value);

	@JsProperty
	public abstract String getXmlEncoding();

	@JsProperty
	public abstract void setXmlEncoding(final String value);

	@JsProperty
	public abstract boolean isXmlStandalone();

	@JsProperty
	public abstract void setXmlStandalone(final boolean value);

	/**
	 * Gets or sets the version attribute specified in the declaration of an XML
	 * document.
	 */
	@JsProperty
	public abstract String getXmlVersion();

	/**
	 * Gets or sets the version attribute specified in the declaration of an XML
	 * document.
	 */
	@JsProperty
	public abstract void setXmlVersion(final String value);

	@JsProperty
	public abstract HTMLScriptElement getCurrentScript();

	@JsProperty
	public abstract void setCurrentScript(final HTMLScriptElement value);

	@JsMethod
	public abstract Node adoptNode(final Node source);

	@JsMethod
	public abstract void captureEvents();

	@JsMethod
	public abstract void clear();

	/**
	 * Closes an output stream and forces the sent data to display.
	 */
	@JsMethod
	public abstract void close();

	/**
	 * Creates an attribute object with a specified name.
	 * 
	 * @param name
	 *            String that sets the attribute object's name.
	 */
	@JsMethod
	public abstract Attr createAttribute(final String name);

	@JsMethod
	public abstract Attr createAttributeNS(final String namespaceURI, final String qualifiedName);

	@JsMethod
	public abstract CDATASection createCDATASection(final String data);

	/**
	 * Creates a comment object with the specified data.
	 * 
	 * @param data
	 *            Sets the comment object's data.
	 */
	@JsMethod
	public abstract Comment createComment(final String data);

	/**
	 * Creates a new document.
	 */
	@JsMethod
	public abstract DocumentFragment createDocumentFragment();

	@JsOverlay
	public default HTMLAnchorElement createElementA() {
		return (HTMLAnchorElement) createElement("a");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementAbbr() {
		return (HTMLPhraseElement) createElement("abbr");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementAcronym() {
		return (HTMLPhraseElement) createElement("acronym");
	}

	@JsOverlay
	public default HTMLBlockElement createElementAddress() {
		return (HTMLBlockElement) createElement("address");
	}

	@JsOverlay
	public default HTMLAppletElement createElementApplet() {
		return (HTMLAppletElement) createElement("applet");
	}

	@JsOverlay
	public default HTMLAreaElement createElementArea() {
		return (HTMLAreaElement) createElement("area");
	}

	@JsOverlay
	public default HTMLAudioElement createElementAudio() {
		return (HTMLAudioElement) createElement("audio");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementB() {
		return (HTMLPhraseElement) createElement("b");
	}

	@JsOverlay
	public default HTMLBaseElement createElementBase() {
		return (HTMLBaseElement) createElement("base");
	}

	@JsOverlay
	public default HTMLBaseFontElement createElementBasefont() {
		return (HTMLBaseFontElement) createElement("basefont");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementBdo() {
		return (HTMLPhraseElement) createElement("bdo");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementBig() {
		return (HTMLPhraseElement) createElement("big");
	}

	@JsOverlay
	public default HTMLBlockElement createElementBlockquote() {
		return (HTMLBlockElement) createElement("blockquote");
	}

	@JsOverlay
	public default HTMLBodyElement createElementBody() {
		return (HTMLBodyElement) createElement("body");
	}

	@JsOverlay
	public default HTMLBRElement createElementBr() {
		return (HTMLBRElement) createElement("br");
	}

	@JsOverlay
	public default HTMLButtonElement createElementButton() {
		return (HTMLButtonElement) createElement("button");
	}

	@JsOverlay
	public default HTMLCanvasElement createElementCanvas() {
		return (HTMLCanvasElement) createElement("canvas");
	}

	@JsOverlay
	public default HTMLTableCaptionElement createElementCaption() {
		return (HTMLTableCaptionElement) createElement("caption");
	}

	@JsOverlay
	public default HTMLBlockElement createElementCenter() {
		return (HTMLBlockElement) createElement("center");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementCite() {
		return (HTMLPhraseElement) createElement("cite");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementCode() {
		return (HTMLPhraseElement) createElement("code");
	}

	@JsOverlay
	public default HTMLTableColElement createElementCol() {
		return (HTMLTableColElement) createElement("col");
	}

	@JsOverlay
	public default HTMLTableColElement createElementColgroup() {
		return (HTMLTableColElement) createElement("colgroup");
	}

	@JsOverlay
	public default HTMLDataListElement createElementDatalist() {
		return (HTMLDataListElement) createElement("datalist");
	}

	@JsOverlay
	public default HTMLDDElement createElementDd() {
		return (HTMLDDElement) createElement("dd");
	}

	@JsOverlay
	public default HTMLModElement createElementDel() {
		return (HTMLModElement) createElement("del");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementDfn() {
		return (HTMLPhraseElement) createElement("dfn");
	}

	@JsOverlay
	public default HTMLDirectoryElement createElementDir() {
		return (HTMLDirectoryElement) createElement("dir");
	}

	@JsOverlay
	public default HTMLDivElement createElementDiv() {
		return (HTMLDivElement) createElement("div");
	}

	@JsOverlay
	public default HTMLDListElement createElementDl() {
		return (HTMLDListElement) createElement("dl");
	}

	@JsOverlay
	public default HTMLDTElement createElementDt() {
		return (HTMLDTElement) createElement("dt");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementEm() {
		return (HTMLPhraseElement) createElement("em");
	}

	@JsOverlay
	public default HTMLEmbedElement createElementEmbed() {
		return (HTMLEmbedElement) createElement("embed");
	}

	@JsOverlay
	public default HTMLFieldSetElement createElementFieldset() {
		return (HTMLFieldSetElement) createElement("fieldset");
	}

	@JsOverlay
	public default HTMLFontElement createElementFont() {
		return (HTMLFontElement) createElement("font");
	}

	@JsOverlay
	public default HTMLFormElement createElementForm() {
		return (HTMLFormElement) createElement("form");
	}

	@JsOverlay
	public default HTMLFrameElement createElementFrame() {
		return (HTMLFrameElement) createElement("frame");
	}

	@JsOverlay
	public default HTMLFrameSetElement createElementFrameset() {
		return (HTMLFrameSetElement) createElement("frameset");
	}

	@JsOverlay
	public default HTMLHeadingElement createElementH1() {
		return (HTMLHeadingElement) createElement("h1");
	}

	@JsOverlay
	public default HTMLHeadingElement createElementH2() {
		return (HTMLHeadingElement) createElement("h2");
	}

	@JsOverlay
	public default HTMLHeadingElement createElementH3() {
		return (HTMLHeadingElement) createElement("h3");
	}

	@JsOverlay
	public default HTMLHeadingElement createElementH4() {
		return (HTMLHeadingElement) createElement("h4");
	}

	@JsOverlay
	public default HTMLHeadingElement createElementH5() {
		return (HTMLHeadingElement) createElement("h5");
	}

	@JsOverlay
	public default HTMLHeadingElement createElementH6() {
		return (HTMLHeadingElement) createElement("h6");
	}

	@JsOverlay
	public default HTMLHeadElement createElementHead() {
		return (HTMLHeadElement) createElement("head");
	}

	@JsOverlay
	public default HTMLHRElement createElementHr() {
		return (HTMLHRElement) createElement("hr");
	}

	@JsOverlay
	public default HTMLHtmlElement createElementHtml() {
		return (HTMLHtmlElement) createElement("html");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementI() {
		return (HTMLPhraseElement) createElement("i");
	}

	@JsOverlay
	public default HTMLIFrameElement createElementIframe() {
		return (HTMLIFrameElement) createElement("iframe");
	}

	@JsOverlay
	public default HTMLImageElement createElementImg() {
		return (HTMLImageElement) createElement("img");
	}

	@JsOverlay
	public default HTMLInputElement createElementInput() {
		return (HTMLInputElement) createElement("input");
	}

	@JsOverlay
	public default HTMLModElement createElementIns() {
		return (HTMLModElement) createElement("ins");
	}

	@JsOverlay
	public default HTMLIsIndexElement createElementIsindex() {
		return (HTMLIsIndexElement) createElement("isindex");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementKbd() {
		return (HTMLPhraseElement) createElement("kbd");
	}

	@JsOverlay
	public default HTMLBlockElement createElementKeygen() {
		return (HTMLBlockElement) createElement("keygen");
	}

	@JsOverlay
	public default HTMLLabelElement createElementLabel() {
		return (HTMLLabelElement) createElement("label");
	}

	@JsOverlay
	public default HTMLLegendElement createElementLegend() {
		return (HTMLLegendElement) createElement("legend");
	}

	@JsOverlay
	public default HTMLLIElement createElementLi() {
		return (HTMLLIElement) createElement("li");
	}

	@JsOverlay
	public default HTMLLinkElement createElementLink() {
		return (HTMLLinkElement) createElement("link");
	}

	@JsOverlay
	public default HTMLBlockElement createElementListing() {
		return (HTMLBlockElement) createElement("listing");
	}

	@JsOverlay
	public default HTMLMapElement createElementMap() {
		return (HTMLMapElement) createElement("map");
	}

	@JsOverlay
	public default HTMLMarqueeElement createElementMarquee() {
		return (HTMLMarqueeElement) createElement("marquee");
	}

	@JsOverlay
	public default HTMLMenuElement createElementMenu() {
		return (HTMLMenuElement) createElement("menu");
	}

	@JsOverlay
	public default HTMLMetaElement createElementMeta() {
		return (HTMLMetaElement) createElement("meta");
	}

	@JsOverlay
	public default HTMLNextIdElement createElementNextid() {
		return (HTMLNextIdElement) createElement("nextid");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementNobr() {
		return (HTMLPhraseElement) createElement("nobr");
	}

	@JsOverlay
	public default HTMLObjectElement createElementObject() {
		return (HTMLObjectElement) createElement("object");
	}

	@JsOverlay
	public default HTMLOListElement createElementOl() {
		return (HTMLOListElement) createElement("ol");
	}

	@JsOverlay
	public default HTMLOptGroupElement createElementOptgroup() {
		return (HTMLOptGroupElement) createElement("optgroup");
	}

	@JsOverlay
	public default HTMLOptionElement createElementOption() {
		return (HTMLOptionElement) createElement("option");
	}

	@JsOverlay
	public default HTMLParagraphElement createElementP() {
		return (HTMLParagraphElement) createElement("p");
	}

	@JsOverlay
	public default HTMLParamElement createElementParam() {
		return (HTMLParamElement) createElement("param");
	}

	@JsOverlay
	public default HTMLBlockElement createElementPlaintext() {
		return (HTMLBlockElement) createElement("plaintext");
	}

	@JsOverlay
	public default HTMLPreElement createElementPre() {
		return (HTMLPreElement) createElement("pre");
	}

	@JsOverlay
	public default HTMLProgressElement createElementProgress() {
		return (HTMLProgressElement) createElement("progress");
	}

	@JsOverlay
	public default HTMLQuoteElement createElementQ() {
		return (HTMLQuoteElement) createElement("q");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementRt() {
		return (HTMLPhraseElement) createElement("rt");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementRuby() {
		return (HTMLPhraseElement) createElement("ruby");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementS() {
		return (HTMLPhraseElement) createElement("s");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementSamp() {
		return (HTMLPhraseElement) createElement("samp");
	}

	@JsOverlay
	public default HTMLScriptElement createElementScript() {
		return (HTMLScriptElement) createElement("script");
	}

	@JsOverlay
	public default HTMLSelectElement createElementSelect() {
		return (HTMLSelectElement) createElement("select");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementSmall() {
		return (HTMLPhraseElement) createElement("small");
	}

	@JsOverlay
	public default HTMLSourceElement createElementSource() {
		return (HTMLSourceElement) createElement("source");
	}

	@JsOverlay
	public default HTMLSpanElement createElementSpan() {
		return (HTMLSpanElement) createElement("span");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementStrike() {
		return (HTMLPhraseElement) createElement("strike");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementStrong() {
		return (HTMLPhraseElement) createElement("strong");
	}

	@JsOverlay
	public default HTMLStyleElement createElementStyle() {
		return (HTMLStyleElement) createElement("style");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementSub() {
		return (HTMLPhraseElement) createElement("sub");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementSup() {
		return (HTMLPhraseElement) createElement("sup");
	}

	@JsOverlay
	public default HTMLTableElement createElementTable() {
		return (HTMLTableElement) createElement("table");
	}

	@JsOverlay
	public default HTMLTableSectionElement createElementTbody() {
		return (HTMLTableSectionElement) createElement("tbody");
	}

	@JsOverlay
	public default HTMLTableDataCellElement createElementTd() {
		return (HTMLTableDataCellElement) createElement("td");
	}

	@JsOverlay
	public default HTMLTextAreaElement createElementTextarea() {
		return (HTMLTextAreaElement) createElement("textarea");
	}

	@JsOverlay
	public default HTMLTableSectionElement createElementTfoot() {
		return (HTMLTableSectionElement) createElement("tfoot");
	}

	@JsOverlay
	public default HTMLTableHeaderCellElement createElementTh() {
		return (HTMLTableHeaderCellElement) createElement("th");
	}

	@JsOverlay
	public default HTMLTableSectionElement createElementThead() {
		return (HTMLTableSectionElement) createElement("thead");
	}

	@JsOverlay
	public default HTMLTitleElement createElementTitle() {
		return (HTMLTitleElement) createElement("title");
	}

	@JsOverlay
	public default HTMLTableRowElement createElementTr() {
		return (HTMLTableRowElement) createElement("tr");
	}

	@JsOverlay
	public default HTMLTrackElement createElementTrack() {
		return (HTMLTrackElement) createElement("track");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementTt() {
		return (HTMLPhraseElement) createElement("tt");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementU() {
		return (HTMLPhraseElement) createElement("u");
	}

	@JsOverlay
	public default HTMLUListElement createElementUl() {
		return (HTMLUListElement) createElement("ul");
	}

	@JsOverlay
	public default HTMLPhraseElement createElementVar() {
		return (HTMLPhraseElement) createElement("var");
	}

	@JsOverlay
	public default HTMLVideoElement createElementVideo() {
		return (HTMLVideoElement) createElement("video");
	}

	@JsOverlay
	public default MSHTMLWebViewElement createElementXMsWebview() {
		return (MSHTMLWebViewElement) createElement("x-ms-webview");
	}

	@JsOverlay
	public default HTMLBlockElement createElementXmp() {
		return (HTMLBlockElement) createElement("xmp");
	}

	@JsMethod
	public abstract HTMLElement createElement(final String tagName);

	@JsOverlay
	public default SVGAElement createElementNSHttpWwwW3Org2000SvgA() {
		return (SVGAElement) createElementNS("http://www.w3.org/2000/svg", "a");
	}

	@JsOverlay
	public default SVGCircleElement createElementNSHttpWwwW3Org2000SvgCircle() {
		return (SVGCircleElement) createElementNS("http://www.w3.org/2000/svg", "circle");
	}

	@JsOverlay
	public default SVGClipPathElement createElementNSHttpWwwW3Org2000SvgClipPath() {
		return (SVGClipPathElement) createElementNS("http://www.w3.org/2000/svg", "clipPath");
	}

	@JsOverlay
	public default SVGComponentTransferFunctionElement createElementNSHttpWwwW3Org2000SvgComponentTransferFunction() {
		return (SVGComponentTransferFunctionElement) createElementNS("http://www.w3.org/2000/svg",
				"componentTransferFunction");
	}

	@JsOverlay
	public default SVGDefsElement createElementNSHttpWwwW3Org2000SvgDefs() {
		return (SVGDefsElement) createElementNS("http://www.w3.org/2000/svg", "defs");
	}

	@JsOverlay
	public default SVGDescElement createElementNSHttpWwwW3Org2000SvgDesc() {
		return (SVGDescElement) createElementNS("http://www.w3.org/2000/svg", "desc");
	}

	@JsOverlay
	public default SVGEllipseElement createElementNSHttpWwwW3Org2000SvgEllipse() {
		return (SVGEllipseElement) createElementNS("http://www.w3.org/2000/svg", "ellipse");
	}

	@JsOverlay
	public default SVGFEBlendElement createElementNSHttpWwwW3Org2000SvgFeBlend() {
		return (SVGFEBlendElement) createElementNS("http://www.w3.org/2000/svg", "feBlend");
	}

	@JsOverlay
	public default SVGFEColorMatrixElement createElementNSHttpWwwW3Org2000SvgFeColorMatrix() {
		return (SVGFEColorMatrixElement) createElementNS("http://www.w3.org/2000/svg", "feColorMatrix");
	}

	@JsOverlay
	public default SVGFEComponentTransferElement createElementNSHttpWwwW3Org2000SvgFeComponentTransfer() {
		return (SVGFEComponentTransferElement) createElementNS("http://www.w3.org/2000/svg", "feComponentTransfer");
	}

	@JsOverlay
	public default SVGFECompositeElement createElementNSHttpWwwW3Org2000SvgFeComposite() {
		return (SVGFECompositeElement) createElementNS("http://www.w3.org/2000/svg", "feComposite");
	}

	@JsOverlay
	public default SVGFEConvolveMatrixElement createElementNSHttpWwwW3Org2000SvgFeConvolveMatrix() {
		return (SVGFEConvolveMatrixElement) createElementNS("http://www.w3.org/2000/svg", "feConvolveMatrix");
	}

	@JsOverlay
	public default SVGFEDiffuseLightingElement createElementNSHttpWwwW3Org2000SvgFeDiffuseLighting() {
		return (SVGFEDiffuseLightingElement) createElementNS("http://www.w3.org/2000/svg", "feDiffuseLighting");
	}

	@JsOverlay
	public default SVGFEDisplacementMapElement createElementNSHttpWwwW3Org2000SvgFeDisplacementMap() {
		return (SVGFEDisplacementMapElement) createElementNS("http://www.w3.org/2000/svg", "feDisplacementMap");
	}

	@JsOverlay
	public default SVGFEDistantLightElement createElementNSHttpWwwW3Org2000SvgFeDistantLight() {
		return (SVGFEDistantLightElement) createElementNS("http://www.w3.org/2000/svg", "feDistantLight");
	}

	@JsOverlay
	public default SVGFEFloodElement createElementNSHttpWwwW3Org2000SvgFeFlood() {
		return (SVGFEFloodElement) createElementNS("http://www.w3.org/2000/svg", "feFlood");
	}

	@JsOverlay
	public default SVGFEFuncAElement createElementNSHttpWwwW3Org2000SvgFeFuncA() {
		return (SVGFEFuncAElement) createElementNS("http://www.w3.org/2000/svg", "feFuncA");
	}

	@JsOverlay
	public default SVGFEFuncBElement createElementNSHttpWwwW3Org2000SvgFeFuncB() {
		return (SVGFEFuncBElement) createElementNS("http://www.w3.org/2000/svg", "feFuncB");
	}

	@JsOverlay
	public default SVGFEFuncGElement createElementNSHttpWwwW3Org2000SvgFeFuncG() {
		return (SVGFEFuncGElement) createElementNS("http://www.w3.org/2000/svg", "feFuncG");
	}

	@JsOverlay
	public default SVGFEFuncRElement createElementNSHttpWwwW3Org2000SvgFeFuncR() {
		return (SVGFEFuncRElement) createElementNS("http://www.w3.org/2000/svg", "feFuncR");
	}

	@JsOverlay
	public default SVGFEGaussianBlurElement createElementNSHttpWwwW3Org2000SvgFeGaussianBlur() {
		return (SVGFEGaussianBlurElement) createElementNS("http://www.w3.org/2000/svg", "feGaussianBlur");
	}

	@JsOverlay
	public default SVGFEImageElement createElementNSHttpWwwW3Org2000SvgFeImage() {
		return (SVGFEImageElement) createElementNS("http://www.w3.org/2000/svg", "feImage");
	}

	@JsOverlay
	public default SVGFEMergeElement createElementNSHttpWwwW3Org2000SvgFeMerge() {
		return (SVGFEMergeElement) createElementNS("http://www.w3.org/2000/svg", "feMerge");
	}

	@JsOverlay
	public default SVGFEMergeNodeElement createElementNSHttpWwwW3Org2000SvgFeMergeNode() {
		return (SVGFEMergeNodeElement) createElementNS("http://www.w3.org/2000/svg", "feMergeNode");
	}

	@JsOverlay
	public default SVGFEMorphologyElement createElementNSHttpWwwW3Org2000SvgFeMorphology() {
		return (SVGFEMorphologyElement) createElementNS("http://www.w3.org/2000/svg", "feMorphology");
	}

	@JsOverlay
	public default SVGFEOffsetElement createElementNSHttpWwwW3Org2000SvgFeOffset() {
		return (SVGFEOffsetElement) createElementNS("http://www.w3.org/2000/svg", "feOffset");
	}

	@JsOverlay
	public default SVGFEPointLightElement createElementNSHttpWwwW3Org2000SvgFePointLight() {
		return (SVGFEPointLightElement) createElementNS("http://www.w3.org/2000/svg", "fePointLight");
	}

	@JsOverlay
	public default SVGFESpecularLightingElement createElementNSHttpWwwW3Org2000SvgFeSpecularLighting() {
		return (SVGFESpecularLightingElement) createElementNS("http://www.w3.org/2000/svg", "feSpecularLighting");
	}

	@JsOverlay
	public default SVGFESpotLightElement createElementNSHttpWwwW3Org2000SvgFeSpotLight() {
		return (SVGFESpotLightElement) createElementNS("http://www.w3.org/2000/svg", "feSpotLight");
	}

	@JsOverlay
	public default SVGFETileElement createElementNSHttpWwwW3Org2000SvgFeTile() {
		return (SVGFETileElement) createElementNS("http://www.w3.org/2000/svg", "feTile");
	}

	@JsOverlay
	public default SVGFETurbulenceElement createElementNSHttpWwwW3Org2000SvgFeTurbulence() {
		return (SVGFETurbulenceElement) createElementNS("http://www.w3.org/2000/svg", "feTurbulence");
	}

	@JsOverlay
	public default SVGFilterElement createElementNSHttpWwwW3Org2000SvgFilter() {
		return (SVGFilterElement) createElementNS("http://www.w3.org/2000/svg", "filter");
	}

	@JsOverlay
	public default SVGForeignObjectElement createElementNSHttpWwwW3Org2000SvgForeignObject() {
		return (SVGForeignObjectElement) createElementNS("http://www.w3.org/2000/svg", "foreignObject");
	}

	@JsOverlay
	public default SVGGElement createElementNSHttpWwwW3Org2000SvgG() {
		return (SVGGElement) createElementNS("http://www.w3.org/2000/svg", "g");
	}

	@JsOverlay
	public default SVGImageElement createElementNSHttpWwwW3Org2000SvgImage() {
		return (SVGImageElement) createElementNS("http://www.w3.org/2000/svg", "image");
	}

	@JsOverlay
	public default SVGGradientElement createElementNSHttpWwwW3Org2000SvgGradient() {
		return (SVGGradientElement) createElementNS("http://www.w3.org/2000/svg", "gradient");
	}

	@JsOverlay
	public default SVGLineElement createElementNSHttpWwwW3Org2000SvgLine() {
		return (SVGLineElement) createElementNS("http://www.w3.org/2000/svg", "line");
	}

	@JsOverlay
	public default SVGLinearGradientElement createElementNSHttpWwwW3Org2000SvgLinearGradient() {
		return (SVGLinearGradientElement) createElementNS("http://www.w3.org/2000/svg", "linearGradient");
	}

	@JsOverlay
	public default SVGMarkerElement createElementNSHttpWwwW3Org2000SvgMarker() {
		return (SVGMarkerElement) createElementNS("http://www.w3.org/2000/svg", "marker");
	}

	@JsOverlay
	public default SVGMaskElement createElementNSHttpWwwW3Org2000SvgMask() {
		return (SVGMaskElement) createElementNS("http://www.w3.org/2000/svg", "mask");
	}

	@JsOverlay
	public default SVGPathElement createElementNSHttpWwwW3Org2000SvgPath() {
		return (SVGPathElement) createElementNS("http://www.w3.org/2000/svg", "path");
	}

	@JsOverlay
	public default SVGMetadataElement createElementNSHttpWwwW3Org2000SvgMetadata() {
		return (SVGMetadataElement) createElementNS("http://www.w3.org/2000/svg", "metadata");
	}

	@JsOverlay
	public default SVGPatternElement createElementNSHttpWwwW3Org2000SvgPattern() {
		return (SVGPatternElement) createElementNS("http://www.w3.org/2000/svg", "pattern");
	}

	@JsOverlay
	public default SVGPolygonElement createElementNSHttpWwwW3Org2000SvgPolygon() {
		return (SVGPolygonElement) createElementNS("http://www.w3.org/2000/svg", "polygon");
	}

	@JsOverlay
	public default SVGPolylineElement createElementNSHttpWwwW3Org2000SvgPolyline() {
		return (SVGPolylineElement) createElementNS("http://www.w3.org/2000/svg", "polyline");
	}

	@JsOverlay
	public default SVGRadialGradientElement createElementNSHttpWwwW3Org2000SvgRadialGradient() {
		return (SVGRadialGradientElement) createElementNS("http://www.w3.org/2000/svg", "radialGradient");
	}

	@JsOverlay
	public default SVGRectElement createElementNSHttpWwwW3Org2000SvgRect() {
		return (SVGRectElement) createElementNS("http://www.w3.org/2000/svg", "rect");
	}

	@JsOverlay
	public default SVGSVGElement createElementNSHttpWwwW3Org2000SvgSvg() {
		return (SVGSVGElement) createElementNS("http://www.w3.org/2000/svg", "svg");
	}

	@JsOverlay
	public default SVGScriptElement createElementNSHttpWwwW3Org2000SvgScript() {
		return (SVGScriptElement) createElementNS("http://www.w3.org/2000/svg", "script");
	}

	@JsOverlay
	public default SVGStopElement createElementNSHttpWwwW3Org2000SvgStop() {
		return (SVGStopElement) createElementNS("http://www.w3.org/2000/svg", "stop");
	}

	@JsOverlay
	public default SVGStyleElement createElementNSHttpWwwW3Org2000SvgStyle() {
		return (SVGStyleElement) createElementNS("http://www.w3.org/2000/svg", "style");
	}

	@JsOverlay
	public default SVGSwitchElement createElementNSHttpWwwW3Org2000SvgSwitch() {
		return (SVGSwitchElement) createElementNS("http://www.w3.org/2000/svg", "switch");
	}

	@JsOverlay
	public default SVGSymbolElement createElementNSHttpWwwW3Org2000SvgSymbol() {
		return (SVGSymbolElement) createElementNS("http://www.w3.org/2000/svg", "symbol");
	}

	@JsOverlay
	public default SVGTSpanElement createElementNSHttpWwwW3Org2000SvgTspan() {
		return (SVGTSpanElement) createElementNS("http://www.w3.org/2000/svg", "tspan");
	}

	@JsOverlay
	public default SVGTextContentElement createElementNSHttpWwwW3Org2000SvgTextContent() {
		return (SVGTextContentElement) createElementNS("http://www.w3.org/2000/svg", "textContent");
	}

	@JsOverlay
	public default SVGTextElement createElementNSHttpWwwW3Org2000SvgText() {
		return (SVGTextElement) createElementNS("http://www.w3.org/2000/svg", "text");
	}

	@JsOverlay
	public default SVGTextPathElement createElementNSHttpWwwW3Org2000SvgTextPath() {
		return (SVGTextPathElement) createElementNS("http://www.w3.org/2000/svg", "textPath");
	}

	@JsOverlay
	public default SVGTextPositioningElement createElementNSHttpWwwW3Org2000SvgTextPositioning() {
		return (SVGTextPositioningElement) createElementNS("http://www.w3.org/2000/svg", "textPositioning");
	}

	@JsOverlay
	public default SVGTitleElement createElementNSHttpWwwW3Org2000SvgTitle() {
		return (SVGTitleElement) createElementNS("http://www.w3.org/2000/svg", "title");
	}

	@JsOverlay
	public default SVGUseElement createElementNSHttpWwwW3Org2000SvgUse() {
		return (SVGUseElement) createElementNS("http://www.w3.org/2000/svg", "use");
	}

	@JsOverlay
	public default SVGViewElement createElementNSHttpWwwW3Org2000SvgView() {
		return (SVGViewElement) createElementNS("http://www.w3.org/2000/svg", "view");
	}

	@JsOverlay
	public default SVGElement createElementNSHttpWwwW3Org2000Svg(final String qualifiedName) {
		return (SVGElement) createElementNS("http://www.w3.org/2000/svg", qualifiedName);
	}

	@JsMethod
	public abstract Element createElementNS(final String namespaceURI, final String qualifiedName);

	@JsMethod
	public abstract XPathExpression createExpression(final String expression, final XPathNSResolver resolver);

	@JsMethod
	public abstract XPathNSResolver createNSResolver(final Node nodeResolver);

	/**
	 * Creates a NodeIterator object that you can use to traverse filtered lists
	 * of nodes or elements in a document.
	 * 
	 * @param root
	 *            The root element or node to start traversing on.
	 * @param whatToShow
	 *            The type of nodes or elements to appear in the node list
	 * @param filter
	 *            A custom NodeFilter function to use. For more information, see
	 *            filter. Use null for no filter.
	 * @param entityReferenceExpansion
	 *            A flag that specifies whether entity reference nodes are
	 *            expanded.
	 */
	@JsMethod
	public abstract NodeIterator createNodeIterator(final Node root);

	/**
	 * Creates a NodeIterator object that you can use to traverse filtered lists
	 * of nodes or elements in a document.
	 * 
	 * @param root
	 *            The root element or node to start traversing on.
	 * @param whatToShow
	 *            The type of nodes or elements to appear in the node list
	 * @param filter
	 *            A custom NodeFilter function to use. For more information, see
	 *            filter. Use null for no filter.
	 * @param entityReferenceExpansion
	 *            A flag that specifies whether entity reference nodes are
	 *            expanded.
	 */
	@JsMethod
	public abstract NodeIterator createNodeIterator(final Node root, final double whatToShow);

	/**
	 * Creates a NodeIterator object that you can use to traverse filtered lists
	 * of nodes or elements in a document.
	 * 
	 * @param root
	 *            The root element or node to start traversing on.
	 * @param whatToShow
	 *            The type of nodes or elements to appear in the node list
	 * @param filter
	 *            A custom NodeFilter function to use. For more information, see
	 *            filter. Use null for no filter.
	 * @param entityReferenceExpansion
	 *            A flag that specifies whether entity reference nodes are
	 *            expanded.
	 */
	@JsMethod
	public abstract NodeIterator createNodeIterator(final Node root, final double whatToShow, final NodeFilter filter);

	/**
	 * Creates a NodeIterator object that you can use to traverse filtered lists
	 * of nodes or elements in a document.
	 * 
	 * @param root
	 *            The root element or node to start traversing on.
	 * @param whatToShow
	 *            The type of nodes or elements to appear in the node list
	 * @param filter
	 *            A custom NodeFilter function to use. For more information, see
	 *            filter. Use null for no filter.
	 * @param entityReferenceExpansion
	 *            A flag that specifies whether entity reference nodes are
	 *            expanded.
	 */
	@JsMethod
	public abstract NodeIterator createNodeIterator(final Node root, final double whatToShow, final NodeFilter filter,
			final boolean entityReferenceExpansion);

	@JsMethod
	public abstract ProcessingInstruction createProcessingInstruction(final String target, final String data);

	/**
	 * Returns an empty range object that has both of its boundary points
	 * positioned at the beginning of the document.
	 */
	@JsMethod
	public abstract Range createRange();

	/**
	 * Creates a text string from the specified value.
	 * 
	 * @param data
	 *            String that specifies the nodeValue property of the text node.
	 */
	@JsMethod
	public abstract Text createTextNode(final String data);

	@JsMethod
	public abstract Touch createTouch(final Object view, final EventTarget target, final double identifier,
			final double pageX, final double pageY, final double screenX, final double screenY);

	@JsMethod
	public abstract TouchList createTouchList();

	@JsMethod
	public abstract TouchList createTouchList(final Object touches);

	/**
	 * Creates a TreeWalker object that you can use to traverse filtered lists
	 * of nodes or elements in a document.
	 * 
	 * @param root
	 *            The root element or node to start traversing on.
	 * @param whatToShow
	 *            The type of nodes or elements to appear in the node list. For
	 *            more information, see whatToShow.
	 * @param filter
	 *            A custom NodeFilter function to use.
	 * @param entityReferenceExpansion
	 *            A flag that specifies whether entity reference nodes are
	 *            expanded.
	 */
	@JsMethod
	public abstract TreeWalker createTreeWalker(final Node root);

	/**
	 * Creates a TreeWalker object that you can use to traverse filtered lists
	 * of nodes or elements in a document.
	 * 
	 * @param root
	 *            The root element or node to start traversing on.
	 * @param whatToShow
	 *            The type of nodes or elements to appear in the node list. For
	 *            more information, see whatToShow.
	 * @param filter
	 *            A custom NodeFilter function to use.
	 * @param entityReferenceExpansion
	 *            A flag that specifies whether entity reference nodes are
	 *            expanded.
	 */
	@JsMethod
	public abstract TreeWalker createTreeWalker(final Node root, final double whatToShow);

	/**
	 * Creates a TreeWalker object that you can use to traverse filtered lists
	 * of nodes or elements in a document.
	 * 
	 * @param root
	 *            The root element or node to start traversing on.
	 * @param whatToShow
	 *            The type of nodes or elements to appear in the node list. For
	 *            more information, see whatToShow.
	 * @param filter
	 *            A custom NodeFilter function to use.
	 * @param entityReferenceExpansion
	 *            A flag that specifies whether entity reference nodes are
	 *            expanded.
	 */
	@JsMethod
	public abstract TreeWalker createTreeWalker(final Node root, final double whatToShow, final NodeFilter filter);

	/**
	 * Creates a TreeWalker object that you can use to traverse filtered lists
	 * of nodes or elements in a document.
	 * 
	 * @param root
	 *            The root element or node to start traversing on.
	 * @param whatToShow
	 *            The type of nodes or elements to appear in the node list. For
	 *            more information, see whatToShow.
	 * @param filter
	 *            A custom NodeFilter function to use.
	 * @param entityReferenceExpansion
	 *            A flag that specifies whether entity reference nodes are
	 *            expanded.
	 */
	@JsMethod
	public abstract TreeWalker createTreeWalker(final Node root, final double whatToShow, final NodeFilter filter,
			final boolean entityReferenceExpansion);

	/**
	 * Returns the element for the specified x coordinate and the specified y
	 * coordinate.
	 * 
	 * @param x
	 *            The x-offset
	 * @param y
	 *            The y-offset
	 */
	@JsMethod
	public abstract Element elementFromPoint(final double x, final double y);

	@JsMethod
	public abstract XPathResult evaluate(final String expression, final Node contextNode,
			final XPathNSResolver resolver, final double type, final XPathResult result);

	/**
	 * Executes a command on the current document, current selection, or the
	 * given range.
	 * 
	 * @param commandId
	 *            String that specifies the command to execute. This command can
	 *            be any of the command identifiers that can be executed in
	 *            script.
	 * @param showUI
	 *            Display the user interface, defaults to false.
	 * @param value
	 *            Value to assign.
	 */
	@JsMethod
	public abstract boolean execCommand(final String commandId);

	/**
	 * Executes a command on the current document, current selection, or the
	 * given range.
	 * 
	 * @param commandId
	 *            String that specifies the command to execute. This command can
	 *            be any of the command identifiers that can be executed in
	 *            script.
	 * @param showUI
	 *            Display the user interface, defaults to false.
	 * @param value
	 *            Value to assign.
	 */
	@JsMethod
	public abstract boolean execCommand(final String commandId, final boolean showUI);

	/**
	 * Executes a command on the current document, current selection, or the
	 * given range.
	 * 
	 * @param commandId
	 *            String that specifies the command to execute. This command can
	 *            be any of the command identifiers that can be executed in
	 *            script.
	 * @param showUI
	 *            Display the user interface, defaults to false.
	 * @param value
	 *            Value to assign.
	 */
	@JsMethod
	public abstract boolean execCommand(final String commandId, final boolean showUI, final Object value);

	/**
	 * Displays help information for the given command identifier.
	 * 
	 * @param commandId
	 *            Displays help information for the given command identifier.
	 */
	@JsMethod
	public abstract boolean execCommandShowHelp(final String commandId);

	@JsMethod
	public abstract void exitFullscreen();

	@JsMethod
	public abstract void exitPointerLock();

	/**
	 * Causes the element to receive the focus and executes the code specified
	 * by the onfocus event.
	 */
	@JsMethod
	public abstract void focus();

	/**
	 * Returns a reference to the first object with the specified value of the
	 * ID or NAME attribute.
	 * 
	 * @param elementId
	 *            String that specifies the ID value. Case-insensitive.
	 */
	@JsMethod
	public abstract HTMLElement getElementById(final String elementId);

	@JsMethod
	public abstract NodeListOf<Element> getElementsByClassName(final String classNames);

	/**
	 * Gets a collection of objects based on the value of the NAME or ID
	 * attribute.
	 * 
	 * @param elementName
	 *            Gets a collection of objects based on the value of the NAME or
	 *            ID attribute.
	 */
	@JsMethod
	public abstract NodeListOf<Element> getElementsByName(final String elementName);

	@JsOverlay
	public default NodeListOf<HTMLAnchorElement> getElementsByTagNameA() {
		return (NodeListOf<HTMLAnchorElement>) getElementsByTagName("a");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameAbbr() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("abbr");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameAcronym() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("acronym");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameAddress() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("address");
	}

	@JsOverlay
	public default NodeListOf<HTMLAppletElement> getElementsByTagNameApplet() {
		return (NodeListOf<HTMLAppletElement>) getElementsByTagName("applet");
	}

	@JsOverlay
	public default NodeListOf<HTMLAreaElement> getElementsByTagNameArea() {
		return (NodeListOf<HTMLAreaElement>) getElementsByTagName("area");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameArticle() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("article");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameAside() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("aside");
	}

	@JsOverlay
	public default NodeListOf<HTMLAudioElement> getElementsByTagNameAudio() {
		return (NodeListOf<HTMLAudioElement>) getElementsByTagName("audio");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameB() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("b");
	}

	@JsOverlay
	public default NodeListOf<HTMLBaseElement> getElementsByTagNameBase() {
		return (NodeListOf<HTMLBaseElement>) getElementsByTagName("base");
	}

	@JsOverlay
	public default NodeListOf<HTMLBaseFontElement> getElementsByTagNameBasefont() {
		return (NodeListOf<HTMLBaseFontElement>) getElementsByTagName("basefont");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameBdo() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("bdo");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameBig() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("big");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameBlockquote() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("blockquote");
	}

	@JsOverlay
	public default NodeListOf<HTMLBodyElement> getElementsByTagNameBody() {
		return (NodeListOf<HTMLBodyElement>) getElementsByTagName("body");
	}

	@JsOverlay
	public default NodeListOf<HTMLBRElement> getElementsByTagNameBr() {
		return (NodeListOf<HTMLBRElement>) getElementsByTagName("br");
	}

	@JsOverlay
	public default NodeListOf<HTMLButtonElement> getElementsByTagNameButton() {
		return (NodeListOf<HTMLButtonElement>) getElementsByTagName("button");
	}

	@JsOverlay
	public default NodeListOf<HTMLCanvasElement> getElementsByTagNameCanvas() {
		return (NodeListOf<HTMLCanvasElement>) getElementsByTagName("canvas");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableCaptionElement> getElementsByTagNameCaption() {
		return (NodeListOf<HTMLTableCaptionElement>) getElementsByTagName("caption");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameCenter() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("center");
	}

	@JsOverlay
	public default NodeListOf<SVGCircleElement> getElementsByTagNameCircle() {
		return (NodeListOf<SVGCircleElement>) getElementsByTagName("circle");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameCite() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("cite");
	}

	@JsOverlay
	public default NodeListOf<SVGClipPathElement> getElementsByTagNameClippath() {
		return (NodeListOf<SVGClipPathElement>) getElementsByTagName("clippath");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameCode() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("code");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableColElement> getElementsByTagNameCol() {
		return (NodeListOf<HTMLTableColElement>) getElementsByTagName("col");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableColElement> getElementsByTagNameColgroup() {
		return (NodeListOf<HTMLTableColElement>) getElementsByTagName("colgroup");
	}

	@JsOverlay
	public default NodeListOf<HTMLDataListElement> getElementsByTagNameDatalist() {
		return (NodeListOf<HTMLDataListElement>) getElementsByTagName("datalist");
	}

	@JsOverlay
	public default NodeListOf<HTMLDDElement> getElementsByTagNameDd() {
		return (NodeListOf<HTMLDDElement>) getElementsByTagName("dd");
	}

	@JsOverlay
	public default NodeListOf<SVGDefsElement> getElementsByTagNameDefs() {
		return (NodeListOf<SVGDefsElement>) getElementsByTagName("defs");
	}

	@JsOverlay
	public default NodeListOf<HTMLModElement> getElementsByTagNameDel() {
		return (NodeListOf<HTMLModElement>) getElementsByTagName("del");
	}

	@JsOverlay
	public default NodeListOf<SVGDescElement> getElementsByTagNameDesc() {
		return (NodeListOf<SVGDescElement>) getElementsByTagName("desc");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameDfn() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("dfn");
	}

	@JsOverlay
	public default NodeListOf<HTMLDirectoryElement> getElementsByTagNameDir() {
		return (NodeListOf<HTMLDirectoryElement>) getElementsByTagName("dir");
	}

	@JsOverlay
	public default NodeListOf<HTMLDivElement> getElementsByTagNameDiv() {
		return (NodeListOf<HTMLDivElement>) getElementsByTagName("div");
	}

	@JsOverlay
	public default NodeListOf<HTMLDListElement> getElementsByTagNameDl() {
		return (NodeListOf<HTMLDListElement>) getElementsByTagName("dl");
	}

	@JsOverlay
	public default NodeListOf<HTMLDTElement> getElementsByTagNameDt() {
		return (NodeListOf<HTMLDTElement>) getElementsByTagName("dt");
	}

	@JsOverlay
	public default NodeListOf<SVGEllipseElement> getElementsByTagNameEllipse() {
		return (NodeListOf<SVGEllipseElement>) getElementsByTagName("ellipse");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameEm() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("em");
	}

	@JsOverlay
	public default NodeListOf<HTMLEmbedElement> getElementsByTagNameEmbed() {
		return (NodeListOf<HTMLEmbedElement>) getElementsByTagName("embed");
	}

	@JsOverlay
	public default NodeListOf<SVGFEBlendElement> getElementsByTagNameFeblend() {
		return (NodeListOf<SVGFEBlendElement>) getElementsByTagName("feblend");
	}

	@JsOverlay
	public default NodeListOf<SVGFEColorMatrixElement> getElementsByTagNameFecolormatrix() {
		return (NodeListOf<SVGFEColorMatrixElement>) getElementsByTagName("fecolormatrix");
	}

	@JsOverlay
	public default NodeListOf<SVGFEComponentTransferElement> getElementsByTagNameFecomponenttransfer() {
		return (NodeListOf<SVGFEComponentTransferElement>) getElementsByTagName("fecomponenttransfer");
	}

	@JsOverlay
	public default NodeListOf<SVGFECompositeElement> getElementsByTagNameFecomposite() {
		return (NodeListOf<SVGFECompositeElement>) getElementsByTagName("fecomposite");
	}

	@JsOverlay
	public default NodeListOf<SVGFEConvolveMatrixElement> getElementsByTagNameFeconvolvematrix() {
		return (NodeListOf<SVGFEConvolveMatrixElement>) getElementsByTagName("feconvolvematrix");
	}

	@JsOverlay
	public default NodeListOf<SVGFEDiffuseLightingElement> getElementsByTagNameFediffuselighting() {
		return (NodeListOf<SVGFEDiffuseLightingElement>) getElementsByTagName("fediffuselighting");
	}

	@JsOverlay
	public default NodeListOf<SVGFEDisplacementMapElement> getElementsByTagNameFedisplacementmap() {
		return (NodeListOf<SVGFEDisplacementMapElement>) getElementsByTagName("fedisplacementmap");
	}

	@JsOverlay
	public default NodeListOf<SVGFEDistantLightElement> getElementsByTagNameFedistantlight() {
		return (NodeListOf<SVGFEDistantLightElement>) getElementsByTagName("fedistantlight");
	}

	@JsOverlay
	public default NodeListOf<SVGFEFloodElement> getElementsByTagNameFeflood() {
		return (NodeListOf<SVGFEFloodElement>) getElementsByTagName("feflood");
	}

	@JsOverlay
	public default NodeListOf<SVGFEFuncAElement> getElementsByTagNameFefunca() {
		return (NodeListOf<SVGFEFuncAElement>) getElementsByTagName("fefunca");
	}

	@JsOverlay
	public default NodeListOf<SVGFEFuncBElement> getElementsByTagNameFefuncb() {
		return (NodeListOf<SVGFEFuncBElement>) getElementsByTagName("fefuncb");
	}

	@JsOverlay
	public default NodeListOf<SVGFEFuncGElement> getElementsByTagNameFefuncg() {
		return (NodeListOf<SVGFEFuncGElement>) getElementsByTagName("fefuncg");
	}

	@JsOverlay
	public default NodeListOf<SVGFEFuncRElement> getElementsByTagNameFefuncr() {
		return (NodeListOf<SVGFEFuncRElement>) getElementsByTagName("fefuncr");
	}

	@JsOverlay
	public default NodeListOf<SVGFEGaussianBlurElement> getElementsByTagNameFegaussianblur() {
		return (NodeListOf<SVGFEGaussianBlurElement>) getElementsByTagName("fegaussianblur");
	}

	@JsOverlay
	public default NodeListOf<SVGFEImageElement> getElementsByTagNameFeimage() {
		return (NodeListOf<SVGFEImageElement>) getElementsByTagName("feimage");
	}

	@JsOverlay
	public default NodeListOf<SVGFEMergeElement> getElementsByTagNameFemerge() {
		return (NodeListOf<SVGFEMergeElement>) getElementsByTagName("femerge");
	}

	@JsOverlay
	public default NodeListOf<SVGFEMergeNodeElement> getElementsByTagNameFemergenode() {
		return (NodeListOf<SVGFEMergeNodeElement>) getElementsByTagName("femergenode");
	}

	@JsOverlay
	public default NodeListOf<SVGFEMorphologyElement> getElementsByTagNameFemorphology() {
		return (NodeListOf<SVGFEMorphologyElement>) getElementsByTagName("femorphology");
	}

	@JsOverlay
	public default NodeListOf<SVGFEOffsetElement> getElementsByTagNameFeoffset() {
		return (NodeListOf<SVGFEOffsetElement>) getElementsByTagName("feoffset");
	}

	@JsOverlay
	public default NodeListOf<SVGFEPointLightElement> getElementsByTagNameFepointlight() {
		return (NodeListOf<SVGFEPointLightElement>) getElementsByTagName("fepointlight");
	}

	@JsOverlay
	public default NodeListOf<SVGFESpecularLightingElement> getElementsByTagNameFespecularlighting() {
		return (NodeListOf<SVGFESpecularLightingElement>) getElementsByTagName("fespecularlighting");
	}

	@JsOverlay
	public default NodeListOf<SVGFESpotLightElement> getElementsByTagNameFespotlight() {
		return (NodeListOf<SVGFESpotLightElement>) getElementsByTagName("fespotlight");
	}

	@JsOverlay
	public default NodeListOf<SVGFETileElement> getElementsByTagNameFetile() {
		return (NodeListOf<SVGFETileElement>) getElementsByTagName("fetile");
	}

	@JsOverlay
	public default NodeListOf<SVGFETurbulenceElement> getElementsByTagNameFeturbulence() {
		return (NodeListOf<SVGFETurbulenceElement>) getElementsByTagName("feturbulence");
	}

	@JsOverlay
	public default NodeListOf<HTMLFieldSetElement> getElementsByTagNameFieldset() {
		return (NodeListOf<HTMLFieldSetElement>) getElementsByTagName("fieldset");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameFigcaption() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("figcaption");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameFigure() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("figure");
	}

	@JsOverlay
	public default NodeListOf<SVGFilterElement> getElementsByTagNameFilter() {
		return (NodeListOf<SVGFilterElement>) getElementsByTagName("filter");
	}

	@JsOverlay
	public default NodeListOf<HTMLFontElement> getElementsByTagNameFont() {
		return (NodeListOf<HTMLFontElement>) getElementsByTagName("font");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameFooter() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("footer");
	}

	@JsOverlay
	public default NodeListOf<SVGForeignObjectElement> getElementsByTagNameForeignobject() {
		return (NodeListOf<SVGForeignObjectElement>) getElementsByTagName("foreignobject");
	}

	@JsOverlay
	public default NodeListOf<HTMLFormElement> getElementsByTagNameForm() {
		return (NodeListOf<HTMLFormElement>) getElementsByTagName("form");
	}

	@JsOverlay
	public default NodeListOf<HTMLFrameElement> getElementsByTagNameFrame() {
		return (NodeListOf<HTMLFrameElement>) getElementsByTagName("frame");
	}

	@JsOverlay
	public default NodeListOf<HTMLFrameSetElement> getElementsByTagNameFrameset() {
		return (NodeListOf<HTMLFrameSetElement>) getElementsByTagName("frameset");
	}

	@JsOverlay
	public default NodeListOf<SVGGElement> getElementsByTagNameG() {
		return (NodeListOf<SVGGElement>) getElementsByTagName("g");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH1() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h1");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH2() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h2");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH3() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h3");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH4() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h4");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH5() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h5");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH6() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h6");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadElement> getElementsByTagNameHead() {
		return (NodeListOf<HTMLHeadElement>) getElementsByTagName("head");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameHeader() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("header");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameHgroup() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("hgroup");
	}

	@JsOverlay
	public default NodeListOf<HTMLHRElement> getElementsByTagNameHr() {
		return (NodeListOf<HTMLHRElement>) getElementsByTagName("hr");
	}

	@JsOverlay
	public default NodeListOf<HTMLHtmlElement> getElementsByTagNameHtml() {
		return (NodeListOf<HTMLHtmlElement>) getElementsByTagName("html");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameI() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("i");
	}

	@JsOverlay
	public default NodeListOf<HTMLIFrameElement> getElementsByTagNameIframe() {
		return (NodeListOf<HTMLIFrameElement>) getElementsByTagName("iframe");
	}

	@JsOverlay
	public default NodeListOf<SVGImageElement> getElementsByTagNameImage() {
		return (NodeListOf<SVGImageElement>) getElementsByTagName("image");
	}

	@JsOverlay
	public default NodeListOf<HTMLImageElement> getElementsByTagNameImg() {
		return (NodeListOf<HTMLImageElement>) getElementsByTagName("img");
	}

	@JsOverlay
	public default NodeListOf<HTMLInputElement> getElementsByTagNameInput() {
		return (NodeListOf<HTMLInputElement>) getElementsByTagName("input");
	}

	@JsOverlay
	public default NodeListOf<HTMLModElement> getElementsByTagNameIns() {
		return (NodeListOf<HTMLModElement>) getElementsByTagName("ins");
	}

	@JsOverlay
	public default NodeListOf<HTMLIsIndexElement> getElementsByTagNameIsindex() {
		return (NodeListOf<HTMLIsIndexElement>) getElementsByTagName("isindex");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameKbd() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("kbd");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameKeygen() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("keygen");
	}

	@JsOverlay
	public default NodeListOf<HTMLLabelElement> getElementsByTagNameLabel() {
		return (NodeListOf<HTMLLabelElement>) getElementsByTagName("label");
	}

	@JsOverlay
	public default NodeListOf<HTMLLegendElement> getElementsByTagNameLegend() {
		return (NodeListOf<HTMLLegendElement>) getElementsByTagName("legend");
	}

	@JsOverlay
	public default NodeListOf<HTMLLIElement> getElementsByTagNameLi() {
		return (NodeListOf<HTMLLIElement>) getElementsByTagName("li");
	}

	@JsOverlay
	public default NodeListOf<SVGLineElement> getElementsByTagNameLine() {
		return (NodeListOf<SVGLineElement>) getElementsByTagName("line");
	}

	@JsOverlay
	public default NodeListOf<SVGLinearGradientElement> getElementsByTagNameLineargradient() {
		return (NodeListOf<SVGLinearGradientElement>) getElementsByTagName("lineargradient");
	}

	@JsOverlay
	public default NodeListOf<HTMLLinkElement> getElementsByTagNameLink() {
		return (NodeListOf<HTMLLinkElement>) getElementsByTagName("link");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameListing() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("listing");
	}

	@JsOverlay
	public default NodeListOf<HTMLMapElement> getElementsByTagNameMap() {
		return (NodeListOf<HTMLMapElement>) getElementsByTagName("map");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameMark() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("mark");
	}

	@JsOverlay
	public default NodeListOf<SVGMarkerElement> getElementsByTagNameMarker() {
		return (NodeListOf<SVGMarkerElement>) getElementsByTagName("marker");
	}

	@JsOverlay
	public default NodeListOf<HTMLMarqueeElement> getElementsByTagNameMarquee() {
		return (NodeListOf<HTMLMarqueeElement>) getElementsByTagName("marquee");
	}

	@JsOverlay
	public default NodeListOf<SVGMaskElement> getElementsByTagNameMask() {
		return (NodeListOf<SVGMaskElement>) getElementsByTagName("mask");
	}

	@JsOverlay
	public default NodeListOf<HTMLMenuElement> getElementsByTagNameMenu() {
		return (NodeListOf<HTMLMenuElement>) getElementsByTagName("menu");
	}

	@JsOverlay
	public default NodeListOf<HTMLMetaElement> getElementsByTagNameMeta() {
		return (NodeListOf<HTMLMetaElement>) getElementsByTagName("meta");
	}

	@JsOverlay
	public default NodeListOf<SVGMetadataElement> getElementsByTagNameMetadata() {
		return (NodeListOf<SVGMetadataElement>) getElementsByTagName("metadata");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameNav() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("nav");
	}

	@JsOverlay
	public default NodeListOf<HTMLNextIdElement> getElementsByTagNameNextid() {
		return (NodeListOf<HTMLNextIdElement>) getElementsByTagName("nextid");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameNobr() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("nobr");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameNoframes() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("noframes");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameNoscript() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("noscript");
	}

	@JsOverlay
	public default NodeListOf<HTMLObjectElement> getElementsByTagNameObject() {
		return (NodeListOf<HTMLObjectElement>) getElementsByTagName("object");
	}

	@JsOverlay
	public default NodeListOf<HTMLOListElement> getElementsByTagNameOl() {
		return (NodeListOf<HTMLOListElement>) getElementsByTagName("ol");
	}

	@JsOverlay
	public default NodeListOf<HTMLOptGroupElement> getElementsByTagNameOptgroup() {
		return (NodeListOf<HTMLOptGroupElement>) getElementsByTagName("optgroup");
	}

	@JsOverlay
	public default NodeListOf<HTMLOptionElement> getElementsByTagNameOption() {
		return (NodeListOf<HTMLOptionElement>) getElementsByTagName("option");
	}

	@JsOverlay
	public default NodeListOf<HTMLParagraphElement> getElementsByTagNameP() {
		return (NodeListOf<HTMLParagraphElement>) getElementsByTagName("p");
	}

	@JsOverlay
	public default NodeListOf<HTMLParamElement> getElementsByTagNameParam() {
		return (NodeListOf<HTMLParamElement>) getElementsByTagName("param");
	}

	@JsOverlay
	public default NodeListOf<SVGPathElement> getElementsByTagNamePath() {
		return (NodeListOf<SVGPathElement>) getElementsByTagName("path");
	}

	@JsOverlay
	public default NodeListOf<SVGPatternElement> getElementsByTagNamePattern() {
		return (NodeListOf<SVGPatternElement>) getElementsByTagName("pattern");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNamePlaintext() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("plaintext");
	}

	@JsOverlay
	public default NodeListOf<SVGPolygonElement> getElementsByTagNamePolygon() {
		return (NodeListOf<SVGPolygonElement>) getElementsByTagName("polygon");
	}

	@JsOverlay
	public default NodeListOf<SVGPolylineElement> getElementsByTagNamePolyline() {
		return (NodeListOf<SVGPolylineElement>) getElementsByTagName("polyline");
	}

	@JsOverlay
	public default NodeListOf<HTMLPreElement> getElementsByTagNamePre() {
		return (NodeListOf<HTMLPreElement>) getElementsByTagName("pre");
	}

	@JsOverlay
	public default NodeListOf<HTMLProgressElement> getElementsByTagNameProgress() {
		return (NodeListOf<HTMLProgressElement>) getElementsByTagName("progress");
	}

	@JsOverlay
	public default NodeListOf<HTMLQuoteElement> getElementsByTagNameQ() {
		return (NodeListOf<HTMLQuoteElement>) getElementsByTagName("q");
	}

	@JsOverlay
	public default NodeListOf<SVGRadialGradientElement> getElementsByTagNameRadialgradient() {
		return (NodeListOf<SVGRadialGradientElement>) getElementsByTagName("radialgradient");
	}

	@JsOverlay
	public default NodeListOf<SVGRectElement> getElementsByTagNameRect() {
		return (NodeListOf<SVGRectElement>) getElementsByTagName("rect");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameRt() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("rt");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameRuby() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("ruby");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameS() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("s");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameSamp() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("samp");
	}

	@JsOverlay
	public default NodeListOf<HTMLScriptElement> getElementsByTagNameScript() {
		return (NodeListOf<HTMLScriptElement>) getElementsByTagName("script");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameSection() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("section");
	}

	@JsOverlay
	public default NodeListOf<HTMLSelectElement> getElementsByTagNameSelect() {
		return (NodeListOf<HTMLSelectElement>) getElementsByTagName("select");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameSmall() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("small");
	}

	@JsOverlay
	public default NodeListOf<HTMLSourceElement> getElementsByTagNameSource() {
		return (NodeListOf<HTMLSourceElement>) getElementsByTagName("source");
	}

	@JsOverlay
	public default NodeListOf<HTMLSpanElement> getElementsByTagNameSpan() {
		return (NodeListOf<HTMLSpanElement>) getElementsByTagName("span");
	}

	@JsOverlay
	public default NodeListOf<SVGStopElement> getElementsByTagNameStop() {
		return (NodeListOf<SVGStopElement>) getElementsByTagName("stop");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameStrike() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("strike");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameStrong() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("strong");
	}

	@JsOverlay
	public default NodeListOf<HTMLStyleElement> getElementsByTagNameStyle() {
		return (NodeListOf<HTMLStyleElement>) getElementsByTagName("style");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameSub() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("sub");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameSup() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("sup");
	}

	@JsOverlay
	public default NodeListOf<SVGSVGElement> getElementsByTagNameSvg() {
		return (NodeListOf<SVGSVGElement>) getElementsByTagName("svg");
	}

	@JsOverlay
	public default NodeListOf<SVGSwitchElement> getElementsByTagNameSwitch() {
		return (NodeListOf<SVGSwitchElement>) getElementsByTagName("switch");
	}

	@JsOverlay
	public default NodeListOf<SVGSymbolElement> getElementsByTagNameSymbol() {
		return (NodeListOf<SVGSymbolElement>) getElementsByTagName("symbol");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableElement> getElementsByTagNameTable() {
		return (NodeListOf<HTMLTableElement>) getElementsByTagName("table");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableSectionElement> getElementsByTagNameTbody() {
		return (NodeListOf<HTMLTableSectionElement>) getElementsByTagName("tbody");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableDataCellElement> getElementsByTagNameTd() {
		return (NodeListOf<HTMLTableDataCellElement>) getElementsByTagName("td");
	}

	@JsOverlay
	public default NodeListOf<SVGTextElement> getElementsByTagNameText() {
		return (NodeListOf<SVGTextElement>) getElementsByTagName("text");
	}

	@JsOverlay
	public default NodeListOf<SVGTextPathElement> getElementsByTagNameTextpath() {
		return (NodeListOf<SVGTextPathElement>) getElementsByTagName("textpath");
	}

	@JsOverlay
	public default NodeListOf<HTMLTextAreaElement> getElementsByTagNameTextarea() {
		return (NodeListOf<HTMLTextAreaElement>) getElementsByTagName("textarea");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableSectionElement> getElementsByTagNameTfoot() {
		return (NodeListOf<HTMLTableSectionElement>) getElementsByTagName("tfoot");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableHeaderCellElement> getElementsByTagNameTh() {
		return (NodeListOf<HTMLTableHeaderCellElement>) getElementsByTagName("th");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableSectionElement> getElementsByTagNameThead() {
		return (NodeListOf<HTMLTableSectionElement>) getElementsByTagName("thead");
	}

	@JsOverlay
	public default NodeListOf<HTMLTitleElement> getElementsByTagNameTitle() {
		return (NodeListOf<HTMLTitleElement>) getElementsByTagName("title");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableRowElement> getElementsByTagNameTr() {
		return (NodeListOf<HTMLTableRowElement>) getElementsByTagName("tr");
	}

	@JsOverlay
	public default NodeListOf<HTMLTrackElement> getElementsByTagNameTrack() {
		return (NodeListOf<HTMLTrackElement>) getElementsByTagName("track");
	}

	@JsOverlay
	public default NodeListOf<SVGTSpanElement> getElementsByTagNameTspan() {
		return (NodeListOf<SVGTSpanElement>) getElementsByTagName("tspan");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameTt() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("tt");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameU() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("u");
	}

	@JsOverlay
	public default NodeListOf<HTMLUListElement> getElementsByTagNameUl() {
		return (NodeListOf<HTMLUListElement>) getElementsByTagName("ul");
	}

	@JsOverlay
	public default NodeListOf<SVGUseElement> getElementsByTagNameUse() {
		return (NodeListOf<SVGUseElement>) getElementsByTagName("use");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameVar() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("var");
	}

	@JsOverlay
	public default NodeListOf<HTMLVideoElement> getElementsByTagNameVideo() {
		return (NodeListOf<HTMLVideoElement>) getElementsByTagName("video");
	}

	@JsOverlay
	public default NodeListOf<SVGViewElement> getElementsByTagNameView() {
		return (NodeListOf<SVGViewElement>) getElementsByTagName("view");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameWbr() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("wbr");
	}

	@JsOverlay
	public default NodeListOf<MSHTMLWebViewElement> getElementsByTagNameXMsWebview() {
		return (NodeListOf<MSHTMLWebViewElement>) getElementsByTagName("x-ms-webview");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameXmp() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("xmp");
	}

	@JsMethod
	public abstract NodeListOf<? extends Element> getElementsByTagName(final String tagname);

	@JsMethod
	public abstract NodeListOf<? extends Element> getElementsByTagNameNS(final String namespaceURI,
			final String localName);

	/**
	 * Returns an object representing the current selection of the document that
	 * is loaded into the object displaying a webpage.
	 */
	@JsMethod
	public abstract Selection getSelection();

	/**
	 * Gets a value indicating whether the object currently has focus.
	 */
	@JsMethod
	public abstract boolean hasFocus();

	@JsMethod
	public abstract Node importNode(final Node importedNode, final boolean deep);

	@JsMethod
	public abstract NodeList msElementsFromPoint(final double x, final double y);

	@JsMethod
	public abstract NodeList msElementsFromRect(final double left, final double top, final double width,
			final double height);

	/**
	 * Opens a new window and loads a document specified by a given URL. Also,
	 * opens a new window that uses the url parameter and the name parameter to
	 * collect the output of the write method and the writeln method.
	 * 
	 * @param url
	 *            Specifies a MIME type for the document.
	 * @param name
	 *            Specifies the name of the window. This name is used as the
	 *            value for the TARGET attribute on a form or an anchor element.
	 * @param features
	 *            Contains a list of items separated by commas. Each item
	 *            consists of an option and a value, separated by an equals sign
	 *            (for example, "fullscreen=yes, toolbar=yes"). The following
	 *            values are supported.
	 * @param replace
	 *            Specifies whether the existing entry for the document is
	 *            replaced in the history list.
	 */
	@JsMethod
	public abstract Document open();

	/**
	 * Opens a new window and loads a document specified by a given URL. Also,
	 * opens a new window that uses the url parameter and the name parameter to
	 * collect the output of the write method and the writeln method.
	 * 
	 * @param url
	 *            Specifies a MIME type for the document.
	 * @param name
	 *            Specifies the name of the window. This name is used as the
	 *            value for the TARGET attribute on a form or an anchor element.
	 * @param features
	 *            Contains a list of items separated by commas. Each item
	 *            consists of an option and a value, separated by an equals sign
	 *            (for example, "fullscreen=yes, toolbar=yes"). The following
	 *            values are supported.
	 * @param replace
	 *            Specifies whether the existing entry for the document is
	 *            replaced in the history list.
	 */
	@JsMethod
	public abstract Document open(final String url);

	/**
	 * Opens a new window and loads a document specified by a given URL. Also,
	 * opens a new window that uses the url parameter and the name parameter to
	 * collect the output of the write method and the writeln method.
	 * 
	 * @param url
	 *            Specifies a MIME type for the document.
	 * @param name
	 *            Specifies the name of the window. This name is used as the
	 *            value for the TARGET attribute on a form or an anchor element.
	 * @param features
	 *            Contains a list of items separated by commas. Each item
	 *            consists of an option and a value, separated by an equals sign
	 *            (for example, "fullscreen=yes, toolbar=yes"). The following
	 *            values are supported.
	 * @param replace
	 *            Specifies whether the existing entry for the document is
	 *            replaced in the history list.
	 */
	@JsMethod
	public abstract Document open(final String url, final String name);

	/**
	 * Opens a new window and loads a document specified by a given URL. Also,
	 * opens a new window that uses the url parameter and the name parameter to
	 * collect the output of the write method and the writeln method.
	 * 
	 * @param url
	 *            Specifies a MIME type for the document.
	 * @param name
	 *            Specifies the name of the window. This name is used as the
	 *            value for the TARGET attribute on a form or an anchor element.
	 * @param features
	 *            Contains a list of items separated by commas. Each item
	 *            consists of an option and a value, separated by an equals sign
	 *            (for example, "fullscreen=yes, toolbar=yes"). The following
	 *            values are supported.
	 * @param replace
	 *            Specifies whether the existing entry for the document is
	 *            replaced in the history list.
	 */
	@JsMethod
	public abstract Document open(final String url, final String name, final String features);

	/**
	 * Opens a new window and loads a document specified by a given URL. Also,
	 * opens a new window that uses the url parameter and the name parameter to
	 * collect the output of the write method and the writeln method.
	 * 
	 * @param url
	 *            Specifies a MIME type for the document.
	 * @param name
	 *            Specifies the name of the window. This name is used as the
	 *            value for the TARGET attribute on a form or an anchor element.
	 * @param features
	 *            Contains a list of items separated by commas. Each item
	 *            consists of an option and a value, separated by an equals sign
	 *            (for example, "fullscreen=yes, toolbar=yes"). The following
	 *            values are supported.
	 * @param replace
	 *            Specifies whether the existing entry for the document is
	 *            replaced in the history list.
	 */
	@JsMethod
	public abstract Document open(final String url, final String name, final String features, final boolean replace);

	/**
	 * Returns a Boolean value that indicates whether a specified command can be
	 * successfully executed using execCommand, given the current state of the
	 * document.
	 * 
	 * @param commandId
	 *            Specifies a command identifier.
	 */
	@JsMethod
	public abstract boolean queryCommandEnabled(final String commandId);

	/**
	 * Returns a Boolean value that indicates whether the specified command is
	 * in the indeterminate state.
	 * 
	 * @param commandId
	 *            String that specifies a command identifier.
	 */
	@JsMethod
	public abstract boolean queryCommandIndeterm(final String commandId);

	/**
	 * Returns a Boolean value that indicates the current state of the command.
	 * 
	 * @param commandId
	 *            String that specifies a command identifier.
	 */
	@JsMethod
	public abstract boolean queryCommandState(final String commandId);

	/**
	 * Returns a Boolean value that indicates whether the current command is
	 * supported on the current range.
	 * 
	 * @param commandId
	 *            Specifies a command identifier.
	 */
	@JsMethod
	public abstract boolean queryCommandSupported(final String commandId);

	/**
	 * Retrieves the string associated with a command.
	 * 
	 * @param commandId
	 *            String that contains the identifier of a command. This can be
	 *            any command identifier given in the list of Command
	 *            Identifiers.
	 */
	@JsMethod
	public abstract String queryCommandText(final String commandId);

	/**
	 * Returns the current value of the document, range, or current selection
	 * for the given command.
	 * 
	 * @param commandId
	 *            String that specifies a command identifier.
	 */
	@JsMethod
	public abstract String queryCommandValue(final String commandId);

	@JsMethod
	public abstract void releaseEvents();

	/**
	 * Allows updating the print settings for the page.
	 */
	@JsMethod
	public abstract void updateSettings();

	@JsMethod
	public abstract void webkitCancelFullScreen();

	@JsMethod
	public abstract void webkitExitFullscreen();

	/**
	 * Writes one or more HTML expressions to a document in the specified
	 * window.
	 * 
	 * @param content
	 *            Specifies the text and HTML tags to write.
	 */
	@JsMethod
	public abstract void write();

	/**
	 * Writes one or more HTML expressions to a document in the specified
	 * window.
	 * 
	 * @param content
	 *            Specifies the text and HTML tags to write.
	 */
	@JsMethod
	public abstract void write(final Object content);

	/**
	 * Writes one or more HTML expressions, followed by a carriage return, to a
	 * document in the specified window.
	 * 
	 * @param content
	 *            The text and HTML tags to write.
	 */
	@JsMethod
	public abstract void writeln();

	/**
	 * Writes one or more HTML expressions, followed by a carriage return, to a
	 * document in the specified window.
	 * 
	 * @param content
	 *            The text and HTML tags to write.
	 */
	@JsMethod
	public abstract void writeln(final Object content);

	@JsOverlay
	public default HTMLPictureElement createElementPicture() {
		return (HTMLPictureElement) createElement("picture");
	}
	
	@JsOverlay
	public default NodeListOf<HTMLPictureElement> getElementsByTagNamePicture() {
		return (NodeListOf<HTMLPictureElement>) getElementsByTagName("picture");
	}

	@JsOverlay
	public default void addEventListenerMSContentZoom(final EventListener<UIEvent> listener) {
		addEventListener("MSContentZoom", listener);
	}

	@JsOverlay
	public default void addEventListenerMSContentZoom(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("MSContentZoom", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureChange(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureChange", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureChange(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureChange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureDoubleTap(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureDoubleTap", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureDoubleTap(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureDoubleTap", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureEnd(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureEnd", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureEnd(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureEnd", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureHold(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureHold", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureHold(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureHold", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureStart(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureStart", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureStart(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureStart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureTap(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureTap", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureTap(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureTap", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSInertiaStart", listener);
	}

	@JsOverlay
	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSInertiaStart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSManipulationStateChanged(final EventListener<MSManipulationEvent> listener) {
		addEventListener("MSManipulationStateChanged", listener);
	}

	@JsOverlay
	public default void addEventListenerMSManipulationStateChanged(final EventListener<MSManipulationEvent> listener,
			final boolean useCapture) {
		addEventListener("MSManipulationStateChanged", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerCancel(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerCancel", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerCancel(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerCancel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerDown(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerDown", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerDown(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerDown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerEnter(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerEnter", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerEnter(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerEnter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerLeave(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerLeave", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerLeave(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerLeave", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerMove(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerMove", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerMove(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerMove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOut(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerOut", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOut(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerOut", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOver(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerOver", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOver(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerOver", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerUp(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerUp", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerUp(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerUp", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerAbort(final EventListener<UIEvent> listener) {
		addEventListener("abort", listener);
	}

	@JsOverlay
	public default void addEventListenerAbort(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("abort", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerActivate(final EventListener<UIEvent> listener) {
		addEventListener("activate", listener);
	}

	@JsOverlay
	public default void addEventListenerActivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("activate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforeactivate(final EventListener<UIEvent> listener) {
		addEventListener("beforeactivate", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforeactivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("beforeactivate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforedeactivate(final EventListener<UIEvent> listener) {
		addEventListener("beforedeactivate", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforedeactivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("beforedeactivate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBlur(final EventListener<FocusEvent> listener) {
		addEventListener("blur", listener);
	}

	@JsOverlay
	public default void addEventListenerBlur(final EventListener<FocusEvent> listener, final boolean useCapture) {
		addEventListener("blur", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCanplay(final EventListener<Event> listener) {
		addEventListener("canplay", listener);
	}

	@JsOverlay
	public default void addEventListenerCanplay(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("canplay", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCanplaythrough(final EventListener<Event> listener) {
		addEventListener("canplaythrough", listener);
	}

	@JsOverlay
	public default void addEventListenerCanplaythrough(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("canplaythrough", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerChange(final EventListener<Event> listener) {
		addEventListener("change", listener);
	}

	@JsOverlay
	public default void addEventListenerChange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("change", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerClick(final EventListener<MouseEvent> listener) {
		addEventListener("click", listener);
	}

	@JsOverlay
	public default void addEventListenerClick(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("click", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerContextmenu(final EventListener<PointerEvent> listener) {
		addEventListener("contextmenu", listener);
	}

	@JsOverlay
	public default void addEventListenerContextmenu(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("contextmenu", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener) {
		addEventListener("dblclick", listener);
	}

	@JsOverlay
	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("dblclick", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDeactivate(final EventListener<UIEvent> listener) {
		addEventListener("deactivate", listener);
	}

	@JsOverlay
	public default void addEventListenerDeactivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("deactivate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDrag(final EventListener<DragEvent> listener) {
		addEventListener("drag", listener);
	}

	@JsOverlay
	public default void addEventListenerDrag(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("drag", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragend(final EventListener<DragEvent> listener) {
		addEventListener("dragend", listener);
	}

	@JsOverlay
	public default void addEventListenerDragend(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragend", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragenter(final EventListener<DragEvent> listener) {
		addEventListener("dragenter", listener);
	}

	@JsOverlay
	public default void addEventListenerDragenter(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragenter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragleave(final EventListener<DragEvent> listener) {
		addEventListener("dragleave", listener);
	}

	@JsOverlay
	public default void addEventListenerDragleave(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragleave", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragover(final EventListener<DragEvent> listener) {
		addEventListener("dragover", listener);
	}

	@JsOverlay
	public default void addEventListenerDragover(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragover", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragstart(final EventListener<DragEvent> listener) {
		addEventListener("dragstart", listener);
	}

	@JsOverlay
	public default void addEventListenerDragstart(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDrop(final EventListener<DragEvent> listener) {
		addEventListener("drop", listener);
	}

	@JsOverlay
	public default void addEventListenerDrop(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("drop", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDurationchange(final EventListener<Event> listener) {
		addEventListener("durationchange", listener);
	}

	@JsOverlay
	public default void addEventListenerDurationchange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("durationchange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerEmptied(final EventListener<Event> listener) {
		addEventListener("emptied", listener);
	}

	@JsOverlay
	public default void addEventListenerEmptied(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("emptied", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerEnded(final EventListener<Event> listener) {
		addEventListener("ended", listener);
	}

	@JsOverlay
	public default void addEventListenerEnded(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("ended", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerError(final EventListener<ErrorEvent> listener) {
		addEventListener("error", listener);
	}

	@JsOverlay
	public default void addEventListenerError(final EventListener<ErrorEvent> listener, final boolean useCapture) {
		addEventListener("error", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerFocus(final EventListener<FocusEvent> listener) {
		addEventListener("focus", listener);
	}

	@JsOverlay
	public default void addEventListenerFocus(final EventListener<FocusEvent> listener, final boolean useCapture) {
		addEventListener("focus", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerFullscreenchange(final EventListener<Event> listener) {
		addEventListener("fullscreenchange", listener);
	}

	@JsOverlay
	public default void addEventListenerFullscreenchange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("fullscreenchange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerFullscreenerror(final EventListener<Event> listener) {
		addEventListener("fullscreenerror", listener);
	}

	@JsOverlay
	public default void addEventListenerFullscreenerror(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("fullscreenerror", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerInput(final EventListener<Event> listener) {
		addEventListener("input", listener);
	}

	@JsOverlay
	public default void addEventListenerInput(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("input", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerKeydown(final EventListener<KeyboardEvent> listener) {
		addEventListener("keydown", listener);
	}

	@JsOverlay
	public default void addEventListenerKeydown(final EventListener<KeyboardEvent> listener, final boolean useCapture) {
		addEventListener("keydown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerKeypress(final EventListener<KeyboardEvent> listener) {
		addEventListener("keypress", listener);
	}

	@JsOverlay
	public default void addEventListenerKeypress(final EventListener<KeyboardEvent> listener, final boolean useCapture) {
		addEventListener("keypress", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerKeyup(final EventListener<KeyboardEvent> listener) {
		addEventListener("keyup", listener);
	}

	@JsOverlay
	public default void addEventListenerKeyup(final EventListener<KeyboardEvent> listener, final boolean useCapture) {
		addEventListener("keyup", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoad(final EventListener<Event> listener) {
		addEventListener("load", listener);
	}

	@JsOverlay
	public default void addEventListenerLoad(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("load", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoadeddata(final EventListener<Event> listener) {
		addEventListener("loadeddata", listener);
	}

	@JsOverlay
	public default void addEventListenerLoadeddata(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("loadeddata", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoadedmetadata(final EventListener<Event> listener) {
		addEventListener("loadedmetadata", listener);
	}

	@JsOverlay
	public default void addEventListenerLoadedmetadata(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("loadedmetadata", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoadstart(final EventListener<Event> listener) {
		addEventListener("loadstart", listener);
	}

	@JsOverlay
	public default void addEventListenerLoadstart(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("loadstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMousedown(final EventListener<MouseEvent> listener) {
		addEventListener("mousedown", listener);
	}

	@JsOverlay
	public default void addEventListenerMousedown(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mousedown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMousemove(final EventListener<MouseEvent> listener) {
		addEventListener("mousemove", listener);
	}

	@JsOverlay
	public default void addEventListenerMousemove(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mousemove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseout(final EventListener<MouseEvent> listener) {
		addEventListener("mouseout", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseout(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseout", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseover(final EventListener<MouseEvent> listener) {
		addEventListener("mouseover", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseover(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseover", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseup(final EventListener<MouseEvent> listener) {
		addEventListener("mouseup", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseup(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseup", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMousewheel(final EventListener<MouseWheelEvent> listener) {
		addEventListener("mousewheel", listener);
	}

	@JsOverlay
	public default void addEventListenerMousewheel(final EventListener<MouseWheelEvent> listener, final boolean useCapture) {
		addEventListener("mousewheel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMssitemodejumplistitemremoved(final EventListener<MSSiteModeEvent> listener) {
		addEventListener("mssitemodejumplistitemremoved", listener);
	}

	@JsOverlay
	public default void addEventListenerMssitemodejumplistitemremoved(final EventListener<MSSiteModeEvent> listener,
			final boolean useCapture) {
		addEventListener("mssitemodejumplistitemremoved", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMsthumbnailclick(final EventListener<MSSiteModeEvent> listener) {
		addEventListener("msthumbnailclick", listener);
	}

	@JsOverlay
	public default void addEventListenerMsthumbnailclick(final EventListener<MSSiteModeEvent> listener, final boolean useCapture) {
		addEventListener("msthumbnailclick", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPause(final EventListener<Event> listener) {
		addEventListener("pause", listener);
	}

	@JsOverlay
	public default void addEventListenerPause(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("pause", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPlay(final EventListener<Event> listener) {
		addEventListener("play", listener);
	}

	@JsOverlay
	public default void addEventListenerPlay(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("play", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPlaying(final EventListener<Event> listener) {
		addEventListener("playing", listener);
	}

	@JsOverlay
	public default void addEventListenerPlaying(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("playing", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerlockchange(final EventListener<Event> listener) {
		addEventListener("pointerlockchange", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerlockchange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("pointerlockchange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerlockerror(final EventListener<Event> listener) {
		addEventListener("pointerlockerror", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerlockerror(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("pointerlockerror", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerProgress(final EventListener<ProgressEvent> listener) {
		addEventListener("progress", listener);
	}

	@JsOverlay
	public default void addEventListenerProgress(final EventListener<ProgressEvent> listener, final boolean useCapture) {
		addEventListener("progress", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerRatechange(final EventListener<Event> listener) {
		addEventListener("ratechange", listener);
	}

	@JsOverlay
	public default void addEventListenerRatechange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("ratechange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerReadystatechange(final EventListener<ProgressEvent> listener) {
		addEventListener("readystatechange", listener);
	}

	@JsOverlay
	public default void addEventListenerReadystatechange(final EventListener<ProgressEvent> listener, final boolean useCapture) {
		addEventListener("readystatechange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerReset(final EventListener<Event> listener) {
		addEventListener("reset", listener);
	}

	@JsOverlay
	public default void addEventListenerReset(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("reset", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerScroll(final EventListener<UIEvent> listener) {
		addEventListener("scroll", listener);
	}

	@JsOverlay
	public default void addEventListenerScroll(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("scroll", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSeeked(final EventListener<Event> listener) {
		addEventListener("seeked", listener);
	}

	@JsOverlay
	public default void addEventListenerSeeked(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("seeked", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSeeking(final EventListener<Event> listener) {
		addEventListener("seeking", listener);
	}

	@JsOverlay
	public default void addEventListenerSeeking(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("seeking", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSelect(final EventListener<UIEvent> listener) {
		addEventListener("select", listener);
	}

	@JsOverlay
	public default void addEventListenerSelect(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("select", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSelectstart(final EventListener<Event> listener) {
		addEventListener("selectstart", listener);
	}

	@JsOverlay
	public default void addEventListenerSelectstart(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("selectstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerStalled(final EventListener<Event> listener) {
		addEventListener("stalled", listener);
	}

	@JsOverlay
	public default void addEventListenerStalled(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("stalled", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerStop(final EventListener<Event> listener) {
		addEventListener("stop", listener);
	}

	@JsOverlay
	public default void addEventListenerStop(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("stop", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSubmit(final EventListener<Event> listener) {
		addEventListener("submit", listener);
	}

	@JsOverlay
	public default void addEventListenerSubmit(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("submit", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSuspend(final EventListener<Event> listener) {
		addEventListener("suspend", listener);
	}

	@JsOverlay
	public default void addEventListenerSuspend(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("suspend", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTimeupdate(final EventListener<Event> listener) {
		addEventListener("timeupdate", listener);
	}

	@JsOverlay
	public default void addEventListenerTimeupdate(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("timeupdate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchcancel(final EventListener<TouchEvent> listener) {
		addEventListener("touchcancel", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchcancel(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchcancel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchend(final EventListener<TouchEvent> listener) {
		addEventListener("touchend", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchend(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchend", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchmove(final EventListener<TouchEvent> listener) {
		addEventListener("touchmove", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchmove(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchmove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchstart(final EventListener<TouchEvent> listener) {
		addEventListener("touchstart", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchstart(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerVolumechange(final EventListener<Event> listener) {
		addEventListener("volumechange", listener);
	}

	@JsOverlay
	public default void addEventListenerVolumechange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("volumechange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWaiting(final EventListener<Event> listener) {
		addEventListener("waiting", listener);
	}

	@JsOverlay
	public default void addEventListenerWaiting(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("waiting", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenchange(final EventListener<Event> listener) {
		addEventListener("webkitfullscreenchange", listener);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenchange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("webkitfullscreenchange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenerror(final EventListener<Event> listener) {
		addEventListener("webkitfullscreenerror", listener);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenerror(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("webkitfullscreenerror", listener, useCapture);
	}

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
