package src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExceptions {
    public static void main(String[] args) {
        try {
            System.out.println("before reading file");
            readFile("C:\\Users\\aryba\\Downloads\\program.automatycy.selenium.poczatkujacy\\testgita\\src\\test");
            System.out.println("closing file");
        } catch (FileNotFoundException e) {
            System.out.println("wyjatek zostal wyrzucony");
            System.out.println(e.getMessage());
            // throw new RuntimeException(e);
        } finally {
                System.out.println("Closing file");
            }
        }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
