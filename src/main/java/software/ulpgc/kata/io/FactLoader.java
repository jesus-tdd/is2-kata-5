package software.ulpgc.kata.io;

import software.ulpgc.kata.model.Fact;

import java.io.IOException;

public class FactLoader {
    private final FactReader reader;
    private final FactDeserializer deserializer;
    private final FactAdapter adapter;

    public FactLoader(FactReader reader, FactDeserializer deserializer, FactAdapter adapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.adapter = adapter;
    }

    public Fact load() throws IOException {
        return adapter.adapt(deserializer.deserialize(reader.read()));
    }
}
