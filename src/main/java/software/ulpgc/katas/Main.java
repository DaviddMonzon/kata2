package software.ulpgc.katas;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    static void main() {
        String a = "¡Hola Mundo!";
        byte[] bytes = a.getBytes(StandardCharsets.ISO_8859_1);
        String s = new String(bytes);
        System.out.println(s);
    }
}
