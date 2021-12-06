package packageio;

import java.io.*;

class WriterDemo {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:\\Users\\Swega\\Desktop\\see.txt", true);

        writer.write("kumar"); // appends data without line space
        writer.close();
    }
}

//1. FileWriter
class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\Swega\\Desktop\\see5.txt", true);

        writer.write("sakthi"); // appends data without line space
        writer.close();
    }
}

//2. BufferedWriter
class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Swega\\Desktop\\see4.txt", true));

        writer.write("snega"); // appends data without line space
        writer.newLine(); // explicitly creating a new line
        writer.write("harish");
        writer.close();
    }
}

//3. PrintWriter
class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\Swega\\Desktop\\see2.txt", true));

        writer.write("mani"); // appends data without line space
        writer.print(100);
        writer.println(1.5);
        writer.println("this is string");
        writer.write("harish");
        writer.close();
    }
}