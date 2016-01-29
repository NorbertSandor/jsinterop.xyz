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
public interface ErrorEvent extends Event {
	@JsProperty
	public abstract double getColno();

	@JsProperty
	public abstract void setColno(final double value);

	@JsProperty
	public abstract Object getError();

	@JsProperty
	public abstract void setError(final Object value);

	@JsProperty
	public abstract String getFilename();

	@JsProperty
	public abstract void setFilename(final String value);

	@JsProperty
	public abstract double getLineno();

	@JsProperty
	public abstract void setLineno(final double value);

	@JsProperty
	public abstract String getMessage();

	@JsProperty
	public abstract void setMessage(final String value);

	@JsMethod
	public abstract void initErrorEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg,
			final String messageArg, final String filenameArg, final double linenoArg);
}
