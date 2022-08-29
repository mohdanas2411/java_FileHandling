package fileHandling.outputStream.myByteArrayOutputStream;

import java.io.*;

public class MyByteArrayOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream1 = new FileOutputStream("/home/admin1/IdeaProjects/Test/src/fileHandling/outputStream/myByteArrayOutputStream/MyByteArrayIOStream1.txt");
        FileOutputStream fileOutputStream2 = new FileOutputStream("/home/admin1/IdeaProjects/Test/src/fileHandling/outputStream/myByteArrayOutputStream/MyByteArrayIOStream2.txt");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(777);

        byteArrayOutputStream.write(78);
        byteArrayOutputStream.writeTo(fileOutputStream1);
        byteArrayOutputStream.writeTo(fileOutputStream2);

        System.out.println(byteArrayOutputStream.toString());
        byteArrayOutputStream.close();

    }
}
