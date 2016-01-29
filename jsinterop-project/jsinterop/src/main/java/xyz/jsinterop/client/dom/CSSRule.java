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
public interface CSSRule {
	@JsProperty
	public abstract String getCssText();

	@JsProperty
	public abstract void setCssText(final String value);

	@JsProperty
	public abstract CSSRule getParentRule();

	@JsProperty
	public abstract void setParentRule(final CSSRule value);

	@JsProperty
	public abstract CSSStyleSheet getParentStyleSheet();

	@JsProperty
	public abstract void setParentStyleSheet(final CSSStyleSheet value);

	@JsProperty
	public abstract double getType();

	@JsProperty
	public abstract void setType(final double value);

	@JsProperty
	public abstract double getCHARSET_RULE();

	@JsProperty
	public abstract void setCHARSET_RULE(final double value);

	@JsProperty
	public abstract double getFONT_FACE_RULE();

	@JsProperty
	public abstract void setFONT_FACE_RULE(final double value);

	@JsProperty
	public abstract double getIMPORT_RULE();

	@JsProperty
	public abstract void setIMPORT_RULE(final double value);

	@JsProperty
	public abstract double getKEYFRAMES_RULE();

	@JsProperty
	public abstract void setKEYFRAMES_RULE(final double value);

	@JsProperty
	public abstract double getKEYFRAME_RULE();

	@JsProperty
	public abstract void setKEYFRAME_RULE(final double value);

	@JsProperty
	public abstract double getMEDIA_RULE();

	@JsProperty
	public abstract void setMEDIA_RULE(final double value);

	@JsProperty
	public abstract double getNAMESPACE_RULE();

	@JsProperty
	public abstract void setNAMESPACE_RULE(final double value);

	@JsProperty
	public abstract double getPAGE_RULE();

	@JsProperty
	public abstract void setPAGE_RULE(final double value);

	@JsProperty
	public abstract double getSTYLE_RULE();

	@JsProperty
	public abstract void setSTYLE_RULE(final double value);

	@JsProperty
	public abstract double getSUPPORTS_RULE();

	@JsProperty
	public abstract void setSUPPORTS_RULE(final double value);

	@JsProperty
	public abstract double getUNKNOWN_RULE();

	@JsProperty
	public abstract void setUNKNOWN_RULE(final double value);

	@JsProperty
	public abstract double getVIEWPORT_RULE();

	@JsProperty
	public abstract void setVIEWPORT_RULE(final double value);
}
