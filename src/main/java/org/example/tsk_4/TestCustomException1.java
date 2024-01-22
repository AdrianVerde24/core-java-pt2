package org.example.tsk_4;

public class TestCustomException1 {

    // method to check the age
    static void validate (String str) throws  BeatlesException {
        if(str.contains("Show must go on!")){

            // throw an object of user defined exception
            throw new BeatlesException("Beatles Found");
        }
        else {
            System.out.println("All good");
        }
    }
}

