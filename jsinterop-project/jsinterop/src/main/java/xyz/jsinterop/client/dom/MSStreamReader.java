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
public interface MSStreamReader extends EventTarget, MSBaseReader {
	@JsProperty
	public abstract DOMError getError();

	@JsProperty
	public abstract void setError(final DOMError value);

	@JsMethod
	public abstract void readAsArrayBuffer(final MSStream stream);

	@JsMethod
	public abstract void readAsArrayBuffer(final MSStream stream, final double size);

	@JsMethod
	public abstract void readAsBinaryString(final MSStream stream);

	@JsMethod
	public abstract void readAsBinaryString(final MSStream stream, final double size);

	@JsMethod
	public abstract void readAsBlob(final MSStream stream);

	@JsMethod
	public abstract void readAsBlob(final MSStream stream, final double size);

	@JsMethod
	public abstract void readAsDataURL(final MSStream stream);

	@JsMethod
	public abstract void readAsDataURL(final MSStream stream, final double size);

	@JsMethod
	public abstract void readAsText(final MSStream stream);

	@JsMethod
	public abstract void readAsText(final MSStream stream, final String encoding);

	@JsMethod
	public abstract void readAsText(final MSStream stream, final String encoding, final double size);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener, final boolean useCapture);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener,
			final boolean useCapture);
}
