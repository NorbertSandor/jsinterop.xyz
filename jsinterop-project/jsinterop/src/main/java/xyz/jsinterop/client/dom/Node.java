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
public interface Node extends EventTarget {
	@JsProperty
	public abstract NamedNodeMap getAttributes();

	@JsProperty
	public abstract void setAttributes(final NamedNodeMap value);

	@JsProperty
	public abstract String getBaseURI();

	@JsProperty
	public abstract void setBaseURI(final String value);

	@JsProperty
	public abstract NodeList getChildNodes();

	@JsProperty
	public abstract void setChildNodes(final NodeList value);

	@JsProperty
	public abstract Node getFirstChild();

	@JsProperty
	public abstract void setFirstChild(final Node value);

	@JsProperty
	public abstract Node getLastChild();

	@JsProperty
	public abstract void setLastChild(final Node value);

	@JsProperty
	public abstract String getLocalName();

	@JsProperty
	public abstract void setLocalName(final String value);

	@JsProperty
	public abstract String getNamespaceURI();

	@JsProperty
	public abstract void setNamespaceURI(final String value);

	@JsProperty
	public abstract Node getNextSibling();

	@JsProperty
	public abstract void setNextSibling(final Node value);

	@JsProperty
	public abstract String getNodeName();

	@JsProperty
	public abstract void setNodeName(final String value);

	@JsProperty
	public abstract double getNodeType();

	@JsProperty
	public abstract void setNodeType(final double value);

	@JsProperty
	public abstract String getNodeValue();

	@JsProperty
	public abstract void setNodeValue(final String value);

	@JsProperty
	public abstract Document getOwnerDocument();

	@JsProperty
	public abstract void setOwnerDocument(final Document value);

	@JsProperty
	public abstract HTMLElement getParentElement();

	@JsProperty
	public abstract void setParentElement(final HTMLElement value);

	@JsProperty
	public abstract Node getParentNode();

	@JsProperty
	public abstract void setParentNode(final Node value);

	@JsProperty
	public abstract String getPrefix();

	@JsProperty
	public abstract void setPrefix(final String value);

	@JsProperty
	public abstract Node getPreviousSibling();

	@JsProperty
	public abstract void setPreviousSibling(final Node value);

	@JsProperty
	public abstract String getTextContent();

	@JsProperty
	public abstract void setTextContent(final String value);

	@JsProperty
	public abstract double getATTRIBUTE_NODE();

	@JsProperty
	public abstract void setATTRIBUTE_NODE(final double value);

	@JsProperty
	public abstract double getCDATA_SECTION_NODE();

	@JsProperty
	public abstract void setCDATA_SECTION_NODE(final double value);

	@JsProperty
	public abstract double getCOMMENT_NODE();

	@JsProperty
	public abstract void setCOMMENT_NODE(final double value);

	@JsProperty
	public abstract double getDOCUMENT_FRAGMENT_NODE();

	@JsProperty
	public abstract void setDOCUMENT_FRAGMENT_NODE(final double value);

	@JsProperty
	public abstract double getDOCUMENT_NODE();

	@JsProperty
	public abstract void setDOCUMENT_NODE(final double value);

	@JsProperty
	public abstract double getDOCUMENT_POSITION_CONTAINED_BY();

	@JsProperty
	public abstract void setDOCUMENT_POSITION_CONTAINED_BY(final double value);

	@JsProperty
	public abstract double getDOCUMENT_POSITION_CONTAINS();

	@JsProperty
	public abstract void setDOCUMENT_POSITION_CONTAINS(final double value);

	@JsProperty
	public abstract double getDOCUMENT_POSITION_DISCONNECTED();

	@JsProperty
	public abstract void setDOCUMENT_POSITION_DISCONNECTED(final double value);

	@JsProperty
	public abstract double getDOCUMENT_POSITION_FOLLOWING();

	@JsProperty
	public abstract void setDOCUMENT_POSITION_FOLLOWING(final double value);

	@JsProperty
	public abstract double getDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC();

	@JsProperty
	public abstract void setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(final double value);

	@JsProperty
	public abstract double getDOCUMENT_POSITION_PRECEDING();

	@JsProperty
	public abstract void setDOCUMENT_POSITION_PRECEDING(final double value);

	@JsProperty
	public abstract double getDOCUMENT_TYPE_NODE();

	@JsProperty
	public abstract void setDOCUMENT_TYPE_NODE(final double value);

	@JsProperty
	public abstract double getELEMENT_NODE();

	@JsProperty
	public abstract void setELEMENT_NODE(final double value);

	@JsProperty
	public abstract double getENTITY_NODE();

	@JsProperty
	public abstract void setENTITY_NODE(final double value);

	@JsProperty
	public abstract double getENTITY_REFERENCE_NODE();

	@JsProperty
	public abstract void setENTITY_REFERENCE_NODE(final double value);

	@JsProperty
	public abstract double getNOTATION_NODE();

	@JsProperty
	public abstract void setNOTATION_NODE(final double value);

	@JsProperty
	public abstract double getPROCESSING_INSTRUCTION_NODE();

	@JsProperty
	public abstract void setPROCESSING_INSTRUCTION_NODE(final double value);

	@JsProperty
	public abstract double getTEXT_NODE();

	@JsProperty
	public abstract void setTEXT_NODE(final double value);

	@JsMethod
	public abstract Node appendChild(final Node newChild);

	@JsMethod
	public abstract Node cloneNode();

	@JsMethod
	public abstract Node cloneNode(final boolean deep);

	@JsMethod
	public abstract double compareDocumentPosition(final Node other);

	@JsMethod
	public abstract boolean hasAttributes();

	@JsMethod
	public abstract boolean hasChildNodes();

	@JsMethod
	public abstract Node insertBefore(final Node newChild, final Node refChild);

	@JsMethod
	public abstract boolean isDefaultNamespace(final String namespaceURI);

	@JsMethod
	public abstract boolean isEqualNode(final Node arg);

	@JsMethod
	public abstract boolean isSameNode(final Node other);

	@JsMethod
	public abstract String lookupNamespaceURI(final String prefix);

	@JsMethod
	public abstract String lookupPrefix(final String namespaceURI);

	@JsMethod
	public abstract void normalize();

	@JsMethod
	public abstract Node removeChild(final Node oldChild);

	@JsMethod
	public abstract Node replaceChild(final Node newChild, final Node oldChild);

	@JsMethod
	public abstract boolean contains(final Node node);

	/**
	 * Inserts the specified node before the given index, shifting existing
	 * elements to the right.
	 * 
	 * @throw IllegalArgumentException if {@code index} is less than zero or
	 *        greater than the number of child nodes
	 */
	@JsOverlay
	public default void insertBefore(final Node newChild, int index) {
		if (index < 0 || index > getChildNodes().getLength()) {
			throw new IllegalArgumentException("index is out of range: " + index);
		}

		insertBefore(newChild, getChildNodes().get(index));
	}
}
