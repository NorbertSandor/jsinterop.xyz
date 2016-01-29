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
public interface MouseEvent extends UIEvent {
	@JsProperty
	public abstract boolean isAltKey();

	@JsProperty
	public abstract void setAltKey(final boolean value);

	@JsProperty
	public abstract double getButton();

	@JsProperty
	public abstract void setButton(final double value);

	@JsProperty
	public abstract double getButtons();

	@JsProperty
	public abstract void setButtons(final double value);

	@JsProperty
	public abstract double getClientX();

	@JsProperty
	public abstract void setClientX(final double value);

	@JsProperty
	public abstract double getClientY();

	@JsProperty
	public abstract void setClientY(final double value);

	@JsProperty
	public abstract boolean isCtrlKey();

	@JsProperty
	public abstract void setCtrlKey(final boolean value);

	@JsProperty
	public abstract Element getFromElement();

	@JsProperty
	public abstract void setFromElement(final Element value);

	@JsProperty
	public abstract double getLayerX();

	@JsProperty
	public abstract void setLayerX(final double value);

	@JsProperty
	public abstract double getLayerY();

	@JsProperty
	public abstract void setLayerY(final double value);

	@JsProperty
	public abstract boolean isMetaKey();

	@JsProperty
	public abstract void setMetaKey(final boolean value);

	@JsProperty
	public abstract double getMovementX();

	@JsProperty
	public abstract void setMovementX(final double value);

	@JsProperty
	public abstract double getMovementY();

	@JsProperty
	public abstract void setMovementY(final double value);

	@JsProperty
	public abstract double getOffsetX();

	@JsProperty
	public abstract void setOffsetX(final double value);

	@JsProperty
	public abstract double getOffsetY();

	@JsProperty
	public abstract void setOffsetY(final double value);

	@JsProperty
	public abstract double getPageX();

	@JsProperty
	public abstract void setPageX(final double value);

	@JsProperty
	public abstract double getPageY();

	@JsProperty
	public abstract void setPageY(final double value);

	@JsProperty
	public abstract EventTarget getRelatedTarget();

	@JsProperty
	public abstract void setRelatedTarget(final EventTarget value);

	@JsProperty
	public abstract double getScreenX();

	@JsProperty
	public abstract void setScreenX(final double value);

	@JsProperty
	public abstract double getScreenY();

	@JsProperty
	public abstract void setScreenY(final double value);

	@JsProperty
	public abstract boolean isShiftKey();

	@JsProperty
	public abstract void setShiftKey(final boolean value);

	@JsProperty
	public abstract Element getToElement();

	@JsProperty
	public abstract void setToElement(final Element value);

	@JsProperty
	public abstract double getWhich();

	@JsProperty
	public abstract void setWhich(final double value);

	@JsProperty
	public abstract double getX();

	@JsProperty
	public abstract void setX(final double value);

	@JsProperty
	public abstract double getY();

	@JsProperty
	public abstract void setY(final double value);

	@JsMethod
	public abstract boolean getModifierState(final String keyArg);

	@JsMethod
	public abstract void initMouseEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg,
			final Window viewArg, final double detailArg, final double screenXArg, final double screenYArg,
			final double clientXArg, final double clientYArg, final boolean ctrlKeyArg, final boolean altKeyArg,
			final boolean shiftKeyArg, final boolean metaKeyArg, final double buttonArg,
			final EventTarget relatedTargetArg);
}
