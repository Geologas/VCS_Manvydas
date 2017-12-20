package lt.vcs.manvydas.printer;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamsExample {
    public static void main(String[] args) {
        try (
                FileOutputStream out =
                        new FileOutputStream("File.txt")
        ) {
            out.write("Important message".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
