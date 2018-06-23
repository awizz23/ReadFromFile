package readfromfile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readfromfile {

    public static void main(String[] args) {
        try {
            File file = new File("test1.txt");
            FileReader fileReader = new FileReader(file);
            StringBuffer stringBuffer = new StringBuffer();
            int numCharsRead;
            char[] charArray = new char[1024];
            while ((numCharsRead = fileReader.read(charArray)) > 0) {
                stringBuffer.append(charArray, 0, numCharsRead);
            }
            fileReader.close();
            System.out.println("Sadržaj file-a:");
            System.out.println(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
