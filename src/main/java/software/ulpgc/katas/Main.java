package software.ulpgc.katas;

import java.io.*;
import java.util.List;

public class Main {
    static void main() throws IOException {
        File file = new File("hello.txt");
        try (InputStream is = new BufferedInputStream(new FileInputStream(file))) {
            byte[] bytes = is.readAllBytes();
            String s = new String(bytes);
            System.out.println(s);
        }
    }
}
