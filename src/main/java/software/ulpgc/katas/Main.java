package software.ulpgc.katas;

import java.io.*;
import java.util.List;

public class Main {
    static void main() throws IOException {
        File file = new File("hello.txt");
        try (Reader reader = new BufferedReader(new FileReader(file))) {
            List<String> content = reader.readAllLines();
            for (String line : content) {
                System.out.println(line);
            }
        }
    }
}
