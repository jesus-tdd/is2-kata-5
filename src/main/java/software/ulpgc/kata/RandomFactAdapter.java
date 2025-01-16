package software.ulpgc.kata;

public class RandomFactAdapter implements FactAdapter {
    @Override
    public Fact adapt(Object object) {
        return adapt(((RandomFactGetResponse)object).text());
    }

    public Fact adapt(String fact) {
        return new Fact(fact);
    }
}
