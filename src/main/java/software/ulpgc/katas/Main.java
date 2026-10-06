package software.ulpgc.katas;

import java.util.Arrays;

public class Main {
    static void main() {
        String a = "¡Hola Mundo!";
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(Arrays.toString(a.getBytes()));
        System.out.println(a.getBytes().length);
    }
}
