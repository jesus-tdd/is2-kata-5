package software.ulpgc.kata.io;

import software.ulpgc.kata.io.pojo.RandomFactGetResponse;
import software.ulpgc.kata.model.Fact;

public class RandomFactAdapter implements FactAdapter {
    @Override
    public Fact adapt(Object object) {
        return adapt(((RandomFactGetResponse)object).text());
    }

    public Fact adapt(String fact) {
        return new Fact(fact);
    }
}
