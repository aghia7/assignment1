import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/file1.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println("Hello World!");
            String line = sc.nextLine();
            Point point = Parser.parsePoint(line);
            System.out.println(point);
        }
    }
}
