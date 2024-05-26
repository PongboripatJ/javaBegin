package me.sit.dev.io;

import java.io.*;
import java.util.Scanner;

public class JavaIOStream {

    public static void main(String[] args) {

        readText();
//        try {
//            InputStream fis = new FileInputStream("src/main/resources/text.txt");
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            OutputStream fos = new FileOutputStream("src/main/resources/fileDestination.txt");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//
//            int data = bis.read();
//            while (data != -1) {
//                System.out.println(data);
//                if ((char) data != 'a') {
//                    bos.write(data);
//                }
////                bos.write(data);
//                bos.flush();
//                data = bis.read();
//            }
//            fis.close();
//            bis.close();
//            fos.close();
//            bos.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    private static void readText() {
        try {
            InputStream fis = new FileInputStream("src/main/resources/text.txt");
//            BufferedInputStream bis = new BufferedInputStream(fis);

            Scanner scanner = new Scanner(fis);
            scanner.useDelimiter("\\s");

              while (scanner.hasNext()) {
                    System.out.println(scanner.next());
              }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
