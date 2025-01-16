package software.ulpgc.kata.io;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class RandomFactReader implements FactReader {
    @Override
    public String read() throws IOException {
        return read(FactApi.GET_RANDOM_FACT);
    }

    private String read(String url) throws IOException {
        Connection.Response response = Jsoup.connect(url)
                .ignoreContentType(true)
                .method(Connection.Method.GET)
                .execute();
        if(response.statusCode() != 200) throw new RuntimeException();
        return response.body();
    }
}
