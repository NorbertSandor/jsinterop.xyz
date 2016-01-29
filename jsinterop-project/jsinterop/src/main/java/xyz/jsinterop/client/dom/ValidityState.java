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
public interface ValidityState {
	@JsProperty
	public abstract boolean isBadInput();

	@JsProperty
	public abstract void setBadInput(final boolean value);

	@JsProperty
	public abstract boolean isCustomError();

	@JsProperty
	public abstract void setCustomError(final boolean value);

	@JsProperty
	public abstract boolean isPatternMismatch();

	@JsProperty
	public abstract void setPatternMismatch(final boolean value);

	@JsProperty
	public abstract boolean isRangeOverflow();

	@JsProperty
	public abstract void setRangeOverflow(final boolean value);

	@JsProperty
	public abstract boolean isRangeUnderflow();

	@JsProperty
	public abstract void setRangeUnderflow(final boolean value);

	@JsProperty
	public abstract boolean isStepMismatch();

	@JsProperty
	public abstract void setStepMismatch(final boolean value);

	@JsProperty
	public abstract boolean isTooLong();

	@JsProperty
	public abstract void setTooLong(final boolean value);

	@JsProperty
	public abstract boolean isTypeMismatch();

	@JsProperty
	public abstract void setTypeMismatch(final boolean value);

	@JsProperty
	public abstract boolean isValid();

	@JsProperty
	public abstract void setValid(final boolean value);

	@JsProperty
	public abstract boolean isValueMissing();

	@JsProperty
	public abstract void setValueMissing(final boolean value);
}
