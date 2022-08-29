package fileHandling.outputStream.myFilterIOStream.subClasses;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class MyDataInputStream {
    public static void main(String[] args) throws IOException {

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("/home/admin1/IdeaProjects/Test/src/fileHandling/outputStream/myFilterIOStream/subClasses/MyDataIOStream.txt"));
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readBoolean());
        System.out.println(dataInputStream.readByte());
        System.out.println(dataInputStream.readChar());
        System.out.println(dataInputStream.read());
        System.out.println(dataInputStream.readDouble());
        System.out.println(dataInputStream.readFloat());
        System.out.println(dataInputStream.readLong());
        try {
            String s;
            while ((s = dataInputStream.readUTF()) != null)
                System.out.println(s);
        } catch (EOFException e) {
        }


        dataInputStream.close();
    }
}
