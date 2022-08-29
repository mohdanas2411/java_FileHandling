package fileHandling.outputStream.myFilterIOStream.subClasses;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyDataOutputStream {
    public static void main(String[] args) throws IOException {

        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("/home/admin1/IdeaProjects/Test/src/fileHandling/outputStream/myFilterIOStream/subClasses/MyDataIOStream.txt"));
        dataOutputStream.writeInt(10);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeByte(56);
        dataOutputStream.writeBytes("fdsdf");
        dataOutputStream.writeChar(65);
        dataOutputStream.writeChars("anas");
        dataOutputStream.writeDouble(99.909);
        dataOutputStream.writeFloat(100.909f);
        dataOutputStream.writeLong(112345678);
        dataOutputStream.writeUTF("dfgh");

        System.out.println(dataOutputStream.size());
        dataOutputStream.close();
    }
}
