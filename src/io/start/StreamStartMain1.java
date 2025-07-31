package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain1 {

    public static void main(String[] args) throws IOException{
        //디렉터리는 안 만들어주고 파일은 만들어준다.
        FileOutputStream fos =  new FileOutputStream("temp/hello.dat");
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.close();

        // FileInputStream fis = new FileInputStream("temp/hello.dat");
        // System.out.println(fis.read());
        // System.out.println(fis.read());
        // System.out.println(fis.read());
        // System.out.println(fis.read());
        // fis.close();

        FileInputStream fis2 = new FileInputStream("temp/hello.dat");
        int data;
        while((data = fis2.read()) != -1){
            System.out.println(data);
        }
        fis2.close();
    }
}
