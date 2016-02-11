package xyz.jsinterop.client.impl;

import com.github.nmorel.gwtjackson.client.JsonDeserializationContext;
import com.github.nmorel.gwtjackson.client.JsonDeserializer;
import com.github.nmorel.gwtjackson.client.JsonDeserializerParameters;
import com.github.nmorel.gwtjackson.client.stream.JsonReader;
import com.github.nmorel.gwtjackson.client.stream.JsonToken;

import xyz.jsinterop.client.core.JsArrayString;
import xyz.jsinterop.shared.core.util.ListOfString;

public class ListOfStringJsonDeserializer extends JsonDeserializer<ListOfString> {
	@Override
	protected ListOfString doDeserialize(JsonReader reader, JsonDeserializationContext ctx,
			JsonDeserializerParameters params) {
		JsArrayString object = JsArrayString.of();

		reader.beginArray();
		while (JsonToken.END_ARRAY != reader.peek()) {
			object.push(reader.nextString());
		}
		reader.endArray();

		return object;
	}
}
