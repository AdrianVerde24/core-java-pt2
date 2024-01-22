package org.example.tsk_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOpener {

     public static String fileopener(String str){
         String data = "";
         try {
             File myObj = new File(str);
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
                 data = myReader.nextLine();
//                 System.out.println(data);
             }
             myReader.close();
         } catch (FileNotFoundException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
         return data;
     }

}
