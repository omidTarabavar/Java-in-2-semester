package Chapter14;

import java.io.IOException;

public class TextException {
    public static int getInteger() throws IOException {
        byte[] buffer = new byte[512];
        System.in.read(buffer);
        String s= new String(buffer);
        s = s.trim();
        return Integer.parseInt(s);
    }
}
