package io.bufferd;

import static io.bufferd.BufferedConst.FILE_NAME;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import static io.bufferd.BufferedConst.*;

public class ReadFileV3 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
        long startTime = System.currentTimeMillis();

        int fileSize = 0;
        int data;

        while((data = bis.read()) != -1){
            fileSize++;
        }
        
        bis.close();

        long endTime = System.currentTimeMillis();

        System.out.println("File name : " + FILE_NAME);
        System.out.println("File Size : " + fileSize / 1024 / 1024 + "MB");
        System.out.println("Time Taked : " + ((endTime - startTime)) +  "ms");
    }
}
