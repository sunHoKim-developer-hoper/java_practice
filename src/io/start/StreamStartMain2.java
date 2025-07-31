package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain2 {

    public static void main(String[] args) throws IOException {
        // 디렉터리는 안 만들어주고 파일은 만들어준다.
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        byte[] input = { 65, 66, 67, 68, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65};
        fos.write(input);
        fos.close();

        // FileInputStream fis = new FileInputStream("temp/hello.dat");
        // byte[] buffer = new byte[10];
        // int readCount = fis.read(buffer, 0, 10);
        // System.out.println("readCount : " + readCount);
        // System.out.println(Arrays.toString(buffer));
        // fis.close();

        // FileInputStream fis = new FileInputStream("temp/hello.dat");
        // byte[] readBytes = fis.readAllBytes();
        // System.out.println(Arrays.toString(readBytes));
        // fis.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        int readCount;
        byte[] buffer = new byte[10];
        while((readCount = fis.read(buffer)) != -1){
            for(int i = 0; i< readCount; i++){
                System.out.print(buffer[i]);
                if(i < readCount - 1 || fis.available() > 0)
                    System.out.print(", ");
            }
        }
        fis.close();
    }
}
