package xyz.jsinterop.client.impl;

import java.util.List;

import com.github.nmorel.gwtjackson.client.JsonSerializationContext;
import com.github.nmorel.gwtjackson.client.JsonSerializer;
import com.github.nmorel.gwtjackson.client.JsonSerializerParameters;
import com.github.nmorel.gwtjackson.client.stream.JsonWriter;

import xyz.jsinterop.shared.core.util.ListOfString;

public class ListOfStringJsonSerializer extends JsonSerializer<ListOfString> {
	@Override
	protected void doSerialize(JsonWriter writer, ListOfString object, JsonSerializationContext ctx,
			JsonSerializerParameters params) {
		List<String> list = object.asList();

		writer.beginArray();

		for (String value : list) {
			writer.value(value);
		}

		writer.endArray();
	}
}
