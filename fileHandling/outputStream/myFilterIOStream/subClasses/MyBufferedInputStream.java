package fileHandling.outputStream.myFilterIOStream.subClasses;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyBufferedInputStream {

    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("/home/admin1/IdeaProjects/Test/src/fileHandling/outputStream/myFilterIOStream/subClasses/MyBufferedIOStream.txt"));
        System.out.println( bufferedInputStream.available());
        System.out.println(bufferedInputStream.read());
    }
}
