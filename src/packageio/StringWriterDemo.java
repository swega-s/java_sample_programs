package packageio;

import java.io.IOException;
import java.io.StringWriter;

public class StringWriterDemo {
    public static void main(String[] args) throws IOException {
        StringWriter stringWriter = new StringWriter();

        //write characters to writer.
        stringWriter.write("Hello this is a StringWriter example");

        String data = stringWriter.toString();
        StringBuffer dataBuffer = stringWriter.getBuffer();
        System.out.println(data);
        System.out.println(dataBuffer);

        stringWriter.close();
    }
}
