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
public interface CSSStyleSheet extends StyleSheet {
	@JsProperty
	public abstract CSSRuleList getCssRules();

	@JsProperty
	public abstract void setCssRules(final CSSRuleList value);

	@JsProperty
	public abstract String getCssText();

	@JsProperty
	public abstract void setCssText(final String value);

	@JsProperty
	public abstract String getHref();

	@JsProperty
	public abstract void setHref(final String value);

	@JsProperty
	public abstract String getId();

	@JsProperty
	public abstract void setId(final String value);

	@JsProperty
	public abstract StyleSheetList getImports();

	@JsProperty
	public abstract void setImports(final StyleSheetList value);

	@JsProperty
	public abstract boolean isIsAlternate();

	@JsProperty
	public abstract void setIsAlternate(final boolean value);

	@JsProperty
	public abstract boolean isIsPrefAlternate();

	@JsProperty
	public abstract void setIsPrefAlternate(final boolean value);

	@JsProperty
	public abstract CSSRule getOwnerRule();

	@JsProperty
	public abstract void setOwnerRule(final CSSRule value);

	@JsProperty
	public abstract Element getOwningElement();

	@JsProperty
	public abstract void setOwningElement(final Element value);

	@JsProperty
	public abstract StyleSheetPageList getPages();

	@JsProperty
	public abstract void setPages(final StyleSheetPageList value);

	@JsProperty
	public abstract boolean isReadOnly();

	@JsProperty
	public abstract void setReadOnly(final boolean value);

	@JsProperty
	public abstract CSSRuleList getRules();

	@JsProperty
	public abstract void setRules(final CSSRuleList value);

	@JsMethod
	public abstract double addImport(final String bstrURL);

	@JsMethod
	public abstract double addImport(final String bstrURL, final double lIndex);

	@JsMethod
	public abstract double addPageRule(final String bstrSelector, final String bstrStyle);

	@JsMethod
	public abstract double addPageRule(final String bstrSelector, final String bstrStyle, final double lIndex);

	@JsMethod
	public abstract double addRule(final String bstrSelector);

	@JsMethod
	public abstract double addRule(final String bstrSelector, final String bstrStyle);

	@JsMethod
	public abstract double addRule(final String bstrSelector, final String bstrStyle, final double lIndex);

	@JsMethod
	public abstract void deleteRule();

	@JsMethod
	public abstract void deleteRule(final double index);

	@JsMethod
	public abstract double insertRule(final String rule);

	@JsMethod
	public abstract double insertRule(final String rule, final double index);

	@JsMethod
	public abstract void removeImport(final double lIndex);

	@JsMethod
	public abstract void removeRule(final double lIndex);
}
