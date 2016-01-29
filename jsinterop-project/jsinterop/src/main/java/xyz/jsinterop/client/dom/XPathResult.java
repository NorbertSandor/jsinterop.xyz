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
public interface XPathResult {
	@JsProperty
	public abstract boolean isBooleanValue();

	@JsProperty
	public abstract void setBooleanValue(final boolean value);

	@JsProperty
	public abstract boolean isInvalidIteratorState();

	@JsProperty
	public abstract void setInvalidIteratorState(final boolean value);

	@JsProperty
	public abstract double getNumberValue();

	@JsProperty
	public abstract void setNumberValue(final double value);

	@JsProperty
	public abstract double getResultType();

	@JsProperty
	public abstract void setResultType(final double value);

	@JsProperty
	public abstract Node getSingleNodeValue();

	@JsProperty
	public abstract void setSingleNodeValue(final Node value);

	@JsProperty
	public abstract double getSnapshotLength();

	@JsProperty
	public abstract void setSnapshotLength(final double value);

	@JsProperty
	public abstract String getStringValue();

	@JsProperty
	public abstract void setStringValue(final String value);

	@JsProperty
	public abstract double getANY_TYPE();

	@JsProperty
	public abstract void setANY_TYPE(final double value);

	@JsProperty
	public abstract double getANY_UNORDERED_NODE_TYPE();

	@JsProperty
	public abstract void setANY_UNORDERED_NODE_TYPE(final double value);

	@JsProperty
	public abstract double getBOOLEAN_TYPE();

	@JsProperty
	public abstract void setBOOLEAN_TYPE(final double value);

	@JsProperty
	public abstract double getFIRST_ORDERED_NODE_TYPE();

	@JsProperty
	public abstract void setFIRST_ORDERED_NODE_TYPE(final double value);

	@JsProperty
	public abstract double getNUMBER_TYPE();

	@JsProperty
	public abstract void setNUMBER_TYPE(final double value);

	@JsProperty
	public abstract double getORDERED_NODE_ITERATOR_TYPE();

	@JsProperty
	public abstract void setORDERED_NODE_ITERATOR_TYPE(final double value);

	@JsProperty
	public abstract double getORDERED_NODE_SNAPSHOT_TYPE();

	@JsProperty
	public abstract void setORDERED_NODE_SNAPSHOT_TYPE(final double value);

	@JsProperty
	public abstract double getSTRING_TYPE();

	@JsProperty
	public abstract void setSTRING_TYPE(final double value);

	@JsProperty
	public abstract double getUNORDERED_NODE_ITERATOR_TYPE();

	@JsProperty
	public abstract void setUNORDERED_NODE_ITERATOR_TYPE(final double value);

	@JsProperty
	public abstract double getUNORDERED_NODE_SNAPSHOT_TYPE();

	@JsProperty
	public abstract void setUNORDERED_NODE_SNAPSHOT_TYPE(final double value);

	@JsMethod
	public abstract Node iterateNext();

	@JsMethod
	public abstract Node snapshotItem(final double index);
}
