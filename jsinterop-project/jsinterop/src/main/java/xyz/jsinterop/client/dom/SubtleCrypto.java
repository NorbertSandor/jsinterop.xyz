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
import jsinterop.annotations.JsType;
import xyz.jsinterop.client.core.ArrayBufferView;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface SubtleCrypto {
	@JsMethod
	public abstract Object decrypt(final Object algorithm, final CryptoKey key, final ArrayBufferView data);

	@JsMethod
	public abstract Object deriveBits(final Object algorithm, final CryptoKey baseKey, final double length);

	@JsMethod
	public abstract Object deriveKey(final Object algorithm, final CryptoKey baseKey, final Object derivedKeyType,
			final boolean extractable, final Object keyUsages);

	@JsMethod
	public abstract Object digest(final Object algorithm, final ArrayBufferView data);

	@JsMethod
	public abstract Object encrypt(final Object algorithm, final CryptoKey key, final ArrayBufferView data);

	@JsMethod
	public abstract Object exportKey(final String format, final CryptoKey key);

	@JsMethod
	public abstract Object generateKey(final Object algorithm, final boolean extractable, final Object keyUsages);

	@JsMethod
	public abstract Object importKey(final String format, final ArrayBufferView keyData, final Object algorithm,
			final boolean extractable, final Object keyUsages);

	@JsMethod
	public abstract Object sign(final Object algorithm, final CryptoKey key, final ArrayBufferView data);

	@JsMethod
	public abstract Object unwrapKey(final String format, final ArrayBufferView wrappedKey,
			final CryptoKey unwrappingKey, final Object unwrapAlgorithm, final Object unwrappedKeyAlgorithm,
			final boolean extractable, final Object keyUsages);

	@JsMethod
	public abstract Object verify(final Object algorithm, final CryptoKey key, final ArrayBufferView signature,
			final ArrayBufferView data);

	@JsMethod
	public abstract Object wrapKey(final String format, final CryptoKey key, final CryptoKey wrappingKey,
			final Object wrapAlgorithm);
}
