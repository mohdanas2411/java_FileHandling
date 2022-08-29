package fileHandling.outputStream.myByteArrayOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class MyByteArrayInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/home/admin1/IdeaProjects/Test/src/fileHandling/outputStream/myFileIOStream/MyByteArrayIOStream.txt");
        System.out.println(fileInputStream.available());
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.markSupported());
        fileInputStream.close();
    }
}
