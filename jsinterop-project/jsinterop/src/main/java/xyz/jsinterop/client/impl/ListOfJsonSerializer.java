package xyz.jsinterop.client.impl;

import java.util.List;

import com.github.nmorel.gwtjackson.client.JsonSerializationContext;
import com.github.nmorel.gwtjackson.client.JsonSerializer;
import com.github.nmorel.gwtjackson.client.JsonSerializerParameters;
import com.github.nmorel.gwtjackson.client.stream.JsonWriter;

import xyz.jsinterop.shared.core.util.ListOf;

public class ListOfJsonSerializer<T> extends JsonSerializer<ListOf<T>> {
	public static <T> ListOfJsonSerializer<T> newInstance(JsonSerializer<T> serializer) {
		return new ListOfJsonSerializer<T>(serializer);
	}

	private final JsonSerializer<T> serializer;

	private ListOfJsonSerializer(JsonSerializer<T> serializer) {
		this.serializer = serializer;
	}

	@Override
	protected void doSerialize(JsonWriter writer, ListOf<T> object, JsonSerializationContext ctx,
			JsonSerializerParameters params) {
		List<T> list = object.asList();

		writer.beginArray();

		for (T value : list) {
			serializer.serialize(writer, value, ctx, params);
		}

		writer.endArray();
	}
}
