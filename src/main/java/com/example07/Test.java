package com.example07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args)  {
        try(FileInputStream in = new FileInputStream("D:/input.txt");FileOutputStream out = new FileOutputStream("D:/output.txt")){
            byte[] buffer = new byte[4];
            int len = 0;
            while ((len = in.read(buffer))!= -1){
                out.write(buffer, 0, len);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
