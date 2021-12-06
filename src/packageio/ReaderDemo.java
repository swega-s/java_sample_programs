package packageio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

class ReaderDemo {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:\\Users\\Swega\\Desktop\\see.txt"); // Reader is an abstract cls

        int data = reader.read();
        while(data != -1){
//            System.out.println(data); prints the ascii
            char dataChar = (char) data;
            System.out.println(dataChar); // prints the real character
            data = reader.read();
        }
        reader.close();
    }
}

// 1. FileReader
class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Swega\\Desktop\\see.txt");

        int data = fr.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fr.read();
        }
        fr.close();
    }
}


// 2. BufferedReader
class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Swega\\Desktop\\see.txt"));

        int data = br.read();
        while (data != -1) {
            System.out.print((char) data);
            data = br.read();
        }
        br.close();
    }
}