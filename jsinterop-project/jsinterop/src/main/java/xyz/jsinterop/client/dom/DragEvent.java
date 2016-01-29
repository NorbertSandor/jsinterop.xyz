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
public interface DragEvent extends MouseEvent {
	@JsProperty
	public abstract DataTransfer getDataTransfer();

	@JsProperty
	public abstract void setDataTransfer(final DataTransfer value);

	@JsMethod
	public abstract void initDragEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg,
			final Window viewArg, final double detailArg, final double screenXArg, final double screenYArg,
			final double clientXArg, final double clientYArg, final boolean ctrlKeyArg, final boolean altKeyArg,
			final boolean shiftKeyArg, final boolean metaKeyArg, final double buttonArg,
			final EventTarget relatedTargetArg, final DataTransfer dataTransferArg);

	@JsMethod
	public abstract void msConvertURL(final File file, final String targetType);

	@JsMethod
	public abstract void msConvertURL(final File file, final String targetType, final String targetURL);
}
