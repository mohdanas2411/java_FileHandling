package fileHandling.outputStream.myFileIOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/home/admin1/IdeaProjects/Test/src/fileHandling/outputStream/myFileIOStream/MyByteArrayIOStream.txt");
        System.out.println(fileOutputStream.getChannel());
        System.out.println(fileOutputStream.getFD());
        fileOutputStream.write(3);
        fileOutputStream.close();
    }
}
