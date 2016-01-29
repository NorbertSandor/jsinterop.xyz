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
public interface HTMLTrackElement extends HTMLElement {
	@JsProperty
	public abstract boolean isDefault();

	@JsProperty
	public abstract void setDefault(final boolean value);

	@JsProperty
	public abstract String getKind();

	@JsProperty
	public abstract void setKind(final String value);

	@JsProperty
	public abstract String getLabel();

	@JsProperty
	public abstract void setLabel(final String value);

	@JsProperty
	public abstract double getReadyState();

	@JsProperty
	public abstract void setReadyState(final double value);

	@JsProperty
	public abstract String getSrc();

	@JsProperty
	public abstract void setSrc(final String value);

	@JsProperty
	public abstract String getSrclang();

	@JsProperty
	public abstract void setSrclang(final String value);

	@JsProperty
	public abstract TextTrack getTrack();

	@JsProperty
	public abstract void setTrack(final TextTrack value);

	@JsProperty
	public abstract double getERROR();

	@JsProperty
	public abstract void setERROR(final double value);

	@JsProperty
	public abstract double getLOADED();

	@JsProperty
	public abstract void setLOADED(final double value);

	@JsProperty
	public abstract double getLOADING();

	@JsProperty
	public abstract void setLOADING(final double value);

	@JsProperty
	public abstract double getNONE();

	@JsProperty
	public abstract void setNONE(final double value);
}
