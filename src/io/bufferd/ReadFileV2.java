package io.bufferd;

import java.io.FileInputStream;
import java.io.IOException;
import static io.bufferd.BufferedConst.*;

public class ReadFileV2 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        byte [] buffer = new byte[BUFFER_SIZE];
        int size;
        int fileSize = 0;

        while((size = fis.read(buffer)) != -1){
            fileSize += size;
        }
        
        fis.close();

        long endTime = System.currentTimeMillis();

        System.out.println("File name : " + FILE_NAME);
        System.out.println("File Size : " + fileSize / 1024 / 1024 + "MB");
        System.out.println("Time Taked : " + ((endTime - startTime)) +  "ms");
    }
}
