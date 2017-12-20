package lt.vcs.manvydas.printer;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try (
                FileInputStream in = new FileInputStream("File.txt")
        ) {
            int data;
            char character;
            while ((data = in.read()) != -1) {
                character = (char) data;
                System.out.print(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
