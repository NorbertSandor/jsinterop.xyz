package xyz.jsinterop.impl.gwt;

import com.github.nmorel.gwtjackson.client.AbstractConfiguration;

import xyz.jsinterop.client.impl.ListOfJsonDeserializer;
import xyz.jsinterop.client.impl.ListOfJsonSerializer;
import xyz.jsinterop.client.impl.ListOfStringJsonDeserializer;
import xyz.jsinterop.client.impl.ListOfStringJsonSerializer;
import xyz.jsinterop.shared.core.util.ListOf;
import xyz.jsinterop.shared.core.util.ListOfString;

public class GwtJacksonConfigurator extends AbstractConfiguration {
	@Override
	protected void configure() {
		type(ListOfString.class).serializer(ListOfStringJsonSerializer.class)
				.deserializer(ListOfStringJsonDeserializer.class);
		type(ListOf.class).serializer(ListOfJsonSerializer.class).deserializer(ListOfJsonDeserializer.class);
	}
}
