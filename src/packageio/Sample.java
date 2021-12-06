package packageio;

import java.io.*;

public class Sample {
    InputStream input;

    public void doSomething() throws IOException {
        input = new FileInputStream("C:\\Users\\Swega\\Downloads\\IMG20211126120254.jpg");
        int data = input.read();
        OutputStream output = new FileOutputStream("C:\\Users\\Swega\\Desktop\\IMG20211126120254.jpg");

        while(data != -1){
//            System.out.println(data);
            output.write(data);
            data = input.read();
        }
    }
}

class SampleMain {
    public static void main(String[] args) throws IOException {
        Sample sampleObj = new Sample();
        sampleObj.doSomething();
    }
}
