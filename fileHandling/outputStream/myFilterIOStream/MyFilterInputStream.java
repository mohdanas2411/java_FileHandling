package fileHandling.outputStream.myFilterIOStream;

import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyFilterInputStream {
    public static void main(String[] args) {
   InputStream in  = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

   //can't be initialised protected constructor;
        //FilterInputStream filterInputStream = new FilterInputStream(in);

    }
}

