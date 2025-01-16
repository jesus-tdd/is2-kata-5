package software.ulpgc.kata;

import com.google.gson.Gson;

public class RandomFactDeserializer implements FactDeserializer {
    @Override
    public Object deserialize(String content) {
        return new Gson().fromJson(content, RandomFactGetResponse.class);
    }
}
