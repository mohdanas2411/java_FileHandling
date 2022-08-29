package fileHandling.outputStream.myFilterIOStream;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyFilterOutputStream {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int i) throws IOException {
                System.out.println(i);
            }
        };

        FilterOutputStream filterOutputStream = new FilterOutputStream(outputStream);
        filterOutputStream.write(78);

    }
}
