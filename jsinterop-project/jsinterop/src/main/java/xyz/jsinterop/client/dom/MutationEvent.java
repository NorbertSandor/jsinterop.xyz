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
public interface MutationEvent extends Event {
	@JsProperty
	public abstract double getAttrChange();

	@JsProperty
	public abstract void setAttrChange(final double value);

	@JsProperty
	public abstract String getAttrName();

	@JsProperty
	public abstract void setAttrName(final String value);

	@JsProperty
	public abstract String getNewValue();

	@JsProperty
	public abstract void setNewValue(final String value);

	@JsProperty
	public abstract String getPrevValue();

	@JsProperty
	public abstract void setPrevValue(final String value);

	@JsProperty
	public abstract Node getRelatedNode();

	@JsProperty
	public abstract void setRelatedNode(final Node value);

	@JsProperty
	public abstract double getADDITION();

	@JsProperty
	public abstract void setADDITION(final double value);

	@JsProperty
	public abstract double getMODIFICATION();

	@JsProperty
	public abstract void setMODIFICATION(final double value);

	@JsProperty
	public abstract double getREMOVAL();

	@JsProperty
	public abstract void setREMOVAL(final double value);

	@JsMethod
	public abstract void initMutationEvent(final String typeArg, final boolean canBubbleArg,
			final boolean cancelableArg, final Node relatedNodeArg, final String prevValueArg, final String newValueArg,
			final String attrNameArg, final double attrChangeArg);
}
