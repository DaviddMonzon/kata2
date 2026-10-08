package software.ulpgc.katas;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    static void main() {
        String a = "¡Hola Mundo!";
        byte[] bytes = a.getBytes();
        String s = new String(bytes, StandardCharsets.ISO_8859_1);
        System.out.println(s);
    }
}
