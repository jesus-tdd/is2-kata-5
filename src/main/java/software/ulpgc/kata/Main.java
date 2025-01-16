package software.ulpgc.kata;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FactLoader loader = createLoader();
        for (int i = 0; i < 5; i++) {
            System.out.print("Fact " + (i + 1) + ": ");
            System.out.println(loader.load().fact());
        }
    }

    private static FactLoader createLoader() {
        return new FactLoader(new RandomFactReader(), new RandomFactDeserializer(), new RandomFactAdapter());
    }
}
