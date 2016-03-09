/*
 * #%L
 * JsInterop.xyz
 * %%
 * Copyright (C) 2016 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */
package xyz.jsinterop.shared.core.util;

import java.util.List;

public interface ListOfString {
	String get(int index);
	
	void set(int index, String value);
	
	void add(String value);
	
	int size();
	
	List<String> asList();
}
