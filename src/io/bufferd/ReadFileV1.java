package io.bufferd;

import static io.bufferd.BufferedConst.FILE_NAME;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileV1 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        int fileSize = 0;
        int data;

        while((data = fis.read()) != -1){
            fileSize++;
        }
        
        fis.close();

        long endTime = System.currentTimeMillis();

        System.out.println("File name : " + FILE_NAME);
        System.out.println("File Size : " + fileSize / 1024 / 1024 + "MB");
        System.out.println("Time Taked : " + ((endTime - startTime)) +  "ms");
    }
}
