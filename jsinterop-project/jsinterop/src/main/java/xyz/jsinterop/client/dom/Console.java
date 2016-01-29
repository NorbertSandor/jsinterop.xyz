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

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface Console {
	@JsMethod
	public abstract void assert_();

	@JsMethod
	public abstract void assert_(final boolean test);

	@JsMethod
	public abstract void assert_(final boolean test, final String message);

	@JsMethod
	public abstract void assert_(final boolean test, final String message, final Object optionalParams);

	@JsMethod
	public abstract void clear();

	@JsMethod
	public abstract void count();

	@JsMethod
	public abstract void count(final String countTitle);

	@JsMethod
	public abstract void debug();

	@JsMethod
	public abstract void debug(final String message);

	@JsMethod
	public abstract void debug(final String message, final Object optionalParams);

	@JsMethod
	public abstract void dir();

	@JsMethod
	public abstract void dir(final Object value);

	@JsMethod
	public abstract void dir(final Object value, final Object optionalParams);

	@JsMethod
	public abstract void dirxml(final Object value);

	@JsMethod
	public abstract void error();

	@JsMethod
	public abstract void error(final Object message);

	@JsMethod
	public abstract void error(final Object message, final Object optionalParams);

	@JsMethod
	public abstract void group();

	@JsMethod
	public abstract void group(final String groupTitle);

	@JsMethod
	public abstract void groupCollapsed();

	@JsMethod
	public abstract void groupCollapsed(final String groupTitle);

	@JsMethod
	public abstract void groupEnd();

	@JsMethod
	public abstract void info();

	@JsMethod
	public abstract void info(final Object message);

	@JsMethod
	public abstract void info(final Object message, final Object optionalParams);

	@JsMethod
	public abstract void log();

	@JsMethod
	public abstract void log(final Object message);

	@JsMethod
	public abstract void log(final Object message, final Object optionalParams);

	@JsMethod
	public abstract boolean msIsIndependentlyComposed(final Element element);

	@JsMethod
	public abstract void profile();

	@JsMethod
	public abstract void profile(final String reportName);

	@JsMethod
	public abstract void profileEnd();

	@JsMethod
	public abstract void select(final Element element);

	@JsMethod
	public abstract void time();

	@JsMethod
	public abstract void time(final String timerName);

	@JsMethod
	public abstract void timeEnd();

	@JsMethod
	public abstract void timeEnd(final String timerName);

	@JsMethod
	public abstract void trace();

	@JsMethod
	public abstract void warn();

	@JsMethod
	public abstract void warn(final Object message);

	@JsMethod
	public abstract void warn(final Object message, final Object optionalParams);
}
