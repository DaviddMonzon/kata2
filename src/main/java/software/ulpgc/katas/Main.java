package software.ulpgc.katas;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    static void main() throws IOException {
        File file = new File("hello.txt");
        try (FileReader reader = new FileReader(file)) {
            List<String> content = reader.readAllLines();
            for (String line : content) {
                System.out.println(line);
            }
        }
    }
}
