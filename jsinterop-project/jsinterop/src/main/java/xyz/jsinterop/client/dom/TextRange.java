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
public interface TextRange {
	@JsProperty
	public abstract double getBoundingHeight();

	@JsProperty
	public abstract void setBoundingHeight(final double value);

	@JsProperty
	public abstract double getBoundingLeft();

	@JsProperty
	public abstract void setBoundingLeft(final double value);

	@JsProperty
	public abstract double getBoundingTop();

	@JsProperty
	public abstract void setBoundingTop(final double value);

	@JsProperty
	public abstract double getBoundingWidth();

	@JsProperty
	public abstract void setBoundingWidth(final double value);

	@JsProperty
	public abstract String getHtmlText();

	@JsProperty
	public abstract void setHtmlText(final String value);

	@JsProperty
	public abstract double getOffsetLeft();

	@JsProperty
	public abstract void setOffsetLeft(final double value);

	@JsProperty
	public abstract double getOffsetTop();

	@JsProperty
	public abstract void setOffsetTop(final double value);

	@JsProperty
	public abstract String getText();

	@JsProperty
	public abstract void setText(final String value);

	@JsMethod
	public abstract void collapse();

	@JsMethod
	public abstract void collapse(final boolean start);

	@JsMethod
	public abstract double compareEndPoints(final String how, final TextRange sourceRange);

	@JsMethod
	public abstract TextRange duplicate();

	@JsMethod
	public abstract boolean execCommand(final String cmdID);

	@JsMethod
	public abstract boolean execCommand(final String cmdID, final boolean showUI);

	@JsMethod
	public abstract boolean execCommand(final String cmdID, final boolean showUI, final Object value);

	@JsMethod
	public abstract boolean execCommandShowHelp(final String cmdID);

	@JsMethod
	public abstract boolean expand(final String Unit);

	@JsMethod
	public abstract boolean findText(final String string);

	@JsMethod
	public abstract boolean findText(final String string, final double count);

	@JsMethod
	public abstract boolean findText(final String string, final double count, final double flags);

	@JsMethod
	public abstract String getBookmark();

	@JsMethod
	public abstract ClientRect getBoundingClientRect();

	@JsMethod
	public abstract ClientRectList getClientRects();

	@JsMethod
	public abstract boolean inRange(final TextRange range);

	@JsMethod
	public abstract boolean isEqual(final TextRange range);

	@JsMethod
	public abstract double move(final String unit);

	@JsMethod
	public abstract double move(final String unit, final double count);

	@JsMethod
	public abstract double moveEnd(final String unit);

	@JsMethod
	public abstract double moveEnd(final String unit, final double count);

	@JsMethod
	public abstract double moveStart(final String unit);

	@JsMethod
	public abstract double moveStart(final String unit, final double count);

	@JsMethod
	public abstract boolean moveToBookmark(final String bookmark);

	@JsMethod
	public abstract void moveToElementText(final Element element);

	@JsMethod
	public abstract void moveToPoint(final double x, final double y);

	@JsMethod
	public abstract Element parentElement();

	@JsMethod
	public abstract void pasteHTML(final String html);

	@JsMethod
	public abstract boolean queryCommandEnabled(final String cmdID);

	@JsMethod
	public abstract boolean queryCommandIndeterm(final String cmdID);

	@JsMethod
	public abstract boolean queryCommandState(final String cmdID);

	@JsMethod
	public abstract boolean queryCommandSupported(final String cmdID);

	@JsMethod
	public abstract String queryCommandText(final String cmdID);

	@JsMethod
	public abstract Object queryCommandValue(final String cmdID);

	@JsMethod
	public abstract void scrollIntoView();

	@JsMethod
	public abstract void scrollIntoView(final boolean fStart);

	@JsMethod
	public abstract void select();

	@JsMethod
	public abstract void setEndPoint(final String how, final TextRange SourceRange);
}
