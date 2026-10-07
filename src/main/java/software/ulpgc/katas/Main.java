package software.ulpgc.katas;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/DaviddMonzon/kata2/refs/heads/main/movies.tsv");
        try (Reader reader = new InputStreamReader(url.openStream())) {
            List<Movie> movies = toMovies(reader.readAllLines());
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }

    private static List<Movie> toMovies(List<String> strings) {
        List<Movie> result = new ArrayList<>();
        for (int i = 1; i < strings.size(); i++) {
            result.add(toMovie(strings.get(i)));
        }
        return result;
    }

    private static Movie toMovie(String string) {
        String[] fields = string.split("\t");
        return toMovie(fields);
    }

    private static Movie toMovie(String[] fields) {
        return new Movie(fields[0], toInt(fields[1]), fields[2], toInt(fields[3]));
    }

    private static int toInt(String field) {
        return Integer.parseInt(field);
    }
}
