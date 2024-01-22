package org.example.tsk_4;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class Main {


    String randomString = "Show must go on!";

    public static void main(String[] args) {
//        String data="";
//        try {
//                File myObj = new File("song.txt");
//                Scanner myReader = new Scanner(myObj);
//                while (myReader.hasNextLine()) {
//                     data = data + myReader.nextLine();
//                    System.out.println(data);
//                }
//                myReader.close();
//            } catch (FileNotFoundException e) {
//                System.out.println("An error occurred.");
//                e.printStackTrace();
//            }

        String data = FileOpener.fileopener("/Users/adriangreen/IdeaProjects/core-java-pt_2/songs.txt");

        try
        {
            // calling the method
            TestCustomException1.validate(data);
        }
        catch (BeatlesException ex)
        {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

        System.out.println("rest of the code...");
    }
        }

