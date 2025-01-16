package software.ulpgc.kata.io;

import com.google.gson.Gson;
import software.ulpgc.kata.io.pojo.RandomFactGetResponse;

public class RandomFactDeserializer implements FactDeserializer {
    @Override
    public Object deserialize(String content) {
        return new Gson().fromJson(content, RandomFactGetResponse.class);
    }
}
