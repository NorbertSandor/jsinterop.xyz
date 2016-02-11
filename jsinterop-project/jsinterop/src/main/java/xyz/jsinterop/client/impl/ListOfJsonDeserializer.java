package xyz.jsinterop.client.impl;

import com.github.nmorel.gwtjackson.client.JsonDeserializationContext;
import com.github.nmorel.gwtjackson.client.JsonDeserializer;
import com.github.nmorel.gwtjackson.client.JsonDeserializerParameters;
import com.github.nmorel.gwtjackson.client.stream.JsonReader;
import com.github.nmorel.gwtjackson.client.stream.JsonToken;

import xyz.jsinterop.client.core.JsArray;
import xyz.jsinterop.shared.core.util.ListOf;

public class ListOfJsonDeserializer<T> extends JsonDeserializer<ListOf<T>> {
	public static <T> ListOfJsonDeserializer<T> newInstance(JsonDeserializer<T> deserializer) {
		return new ListOfJsonDeserializer<T>(deserializer);
	}

	private final JsonDeserializer<T> deserializer;

	private ListOfJsonDeserializer(JsonDeserializer<T> deserializer) {
		this.deserializer = deserializer;
	}

	@Override
	protected ListOf<T> doDeserialize(JsonReader reader, JsonDeserializationContext ctx,
			JsonDeserializerParameters params) {
		JsArray<T> object = JsArray.of();

		reader.beginArray();
		while (JsonToken.END_ARRAY != reader.peek()) {
			object.push(deserializer.deserialize(reader, ctx, params));
		}
		reader.endArray();

		return object;
	}
}
