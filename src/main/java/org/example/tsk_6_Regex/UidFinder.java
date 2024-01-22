package org.example.tsk_6_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UidFinder {
    public static String uidfinder(String str){

        String txt = "test 2667843 (test_email@griddynamics.com) test 67483 some string \n" +
                "\n";

        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object for the input string
        Matcher matcher = pattern.matcher(str);

        // Find the first match
        if (matcher.find()) {
            // Return the matched email
            return matcher.group();
        }

        // If no match is found, return null or an appropriate value indicating not found
        return null;
    }
    }

