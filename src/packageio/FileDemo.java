package packageio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("c://users//swega//desktop//practice");
        System.out.println(file.exists());
        file.mkdir();
        System.out.println(file.exists());

        File file2 = new File("c://users//swega//desktop//practice//fileDemo.txt");
        System.out.println(file2.exists());
        file2.createNewFile();
        System.out.println(file2.exists());
    }
}
