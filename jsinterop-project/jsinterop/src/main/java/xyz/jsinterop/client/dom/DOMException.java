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
public interface DOMException {
	@JsProperty
	public abstract double getCode();

	@JsProperty
	public abstract void setCode(final double value);

	@JsProperty
	public abstract String getMessage();

	@JsProperty
	public abstract void setMessage(final String value);

	@JsProperty
	public abstract String getName();

	@JsProperty
	public abstract void setName(final String value);

	@JsProperty
	public abstract double getABORT_ERR();

	@JsProperty
	public abstract void setABORT_ERR(final double value);

	@JsProperty
	public abstract double getDATA_CLONE_ERR();

	@JsProperty
	public abstract void setDATA_CLONE_ERR(final double value);

	@JsProperty
	public abstract double getDOMSTRING_SIZE_ERR();

	@JsProperty
	public abstract void setDOMSTRING_SIZE_ERR(final double value);

	@JsProperty
	public abstract double getHIERARCHY_REQUEST_ERR();

	@JsProperty
	public abstract void setHIERARCHY_REQUEST_ERR(final double value);

	@JsProperty
	public abstract double getINDEX_SIZE_ERR();

	@JsProperty
	public abstract void setINDEX_SIZE_ERR(final double value);

	@JsProperty
	public abstract double getINUSE_ATTRIBUTE_ERR();

	@JsProperty
	public abstract void setINUSE_ATTRIBUTE_ERR(final double value);

	@JsProperty
	public abstract double getINVALID_ACCESS_ERR();

	@JsProperty
	public abstract void setINVALID_ACCESS_ERR(final double value);

	@JsProperty
	public abstract double getINVALID_CHARACTER_ERR();

	@JsProperty
	public abstract void setINVALID_CHARACTER_ERR(final double value);

	@JsProperty
	public abstract double getINVALID_MODIFICATION_ERR();

	@JsProperty
	public abstract void setINVALID_MODIFICATION_ERR(final double value);

	@JsProperty
	public abstract double getINVALID_NODE_TYPE_ERR();

	@JsProperty
	public abstract void setINVALID_NODE_TYPE_ERR(final double value);

	@JsProperty
	public abstract double getINVALID_STATE_ERR();

	@JsProperty
	public abstract void setINVALID_STATE_ERR(final double value);

	@JsProperty
	public abstract double getNAMESPACE_ERR();

	@JsProperty
	public abstract void setNAMESPACE_ERR(final double value);

	@JsProperty
	public abstract double getNETWORK_ERR();

	@JsProperty
	public abstract void setNETWORK_ERR(final double value);

	@JsProperty
	public abstract double getNOT_FOUND_ERR();

	@JsProperty
	public abstract void setNOT_FOUND_ERR(final double value);

	@JsProperty
	public abstract double getNOT_SUPPORTED_ERR();

	@JsProperty
	public abstract void setNOT_SUPPORTED_ERR(final double value);

	@JsProperty
	public abstract double getNO_DATA_ALLOWED_ERR();

	@JsProperty
	public abstract void setNO_DATA_ALLOWED_ERR(final double value);

	@JsProperty
	public abstract double getNO_MODIFICATION_ALLOWED_ERR();

	@JsProperty
	public abstract void setNO_MODIFICATION_ALLOWED_ERR(final double value);

	@JsProperty
	public abstract double getPARSE_ERR();

	@JsProperty
	public abstract void setPARSE_ERR(final double value);

	@JsProperty
	public abstract double getQUOTA_EXCEEDED_ERR();

	@JsProperty
	public abstract void setQUOTA_EXCEEDED_ERR(final double value);

	@JsProperty
	public abstract double getSECURITY_ERR();

	@JsProperty
	public abstract void setSECURITY_ERR(final double value);

	@JsProperty
	public abstract double getSERIALIZE_ERR();

	@JsProperty
	public abstract void setSERIALIZE_ERR(final double value);

	@JsProperty
	public abstract double getSYNTAX_ERR();

	@JsProperty
	public abstract void setSYNTAX_ERR(final double value);

	@JsProperty
	public abstract double getTIMEOUT_ERR();

	@JsProperty
	public abstract void setTIMEOUT_ERR(final double value);

	@JsProperty
	public abstract double getTYPE_MISMATCH_ERR();

	@JsProperty
	public abstract void setTYPE_MISMATCH_ERR(final double value);

	@JsProperty
	public abstract double getURL_MISMATCH_ERR();

	@JsProperty
	public abstract void setURL_MISMATCH_ERR(final double value);

	@JsProperty
	public abstract double getVALIDATION_ERR();

	@JsProperty
	public abstract void setVALIDATION_ERR(final double value);

	@JsProperty
	public abstract double getWRONG_DOCUMENT_ERR();

	@JsProperty
	public abstract void setWRONG_DOCUMENT_ERR(final double value);

	@JsMethod
	public abstract String toString();
}
