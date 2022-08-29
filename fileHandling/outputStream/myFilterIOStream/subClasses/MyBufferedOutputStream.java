package fileHandling.outputStream.myFilterIOStream.subClasses;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MyBufferedOutputStream {

    public static void main(String[] args) throws FileNotFoundException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("/home/admin1/IdeaProjects/Test/src/fileHandling/outputStream/myFilterIOStream/subClasses/MyBufferedIOStream.txt"));
    }
}
