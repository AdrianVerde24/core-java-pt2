package org.example.tsk_6_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindnumofOrders {

    public static int findnumoforders(String str){
    // Define the regex pattern to match the number of orders
    String regex = "Total orders successfully processed: \\[(\\d+)\\]";

    // Compile the regex pattern
    Pattern pattern = Pattern.compile(regex);

    // Create a Matcher object for the input string
    Matcher matcher = pattern.matcher(str);

    // Find the first match
        if (matcher.find()) {
        // Extract the number of orders from the capturing group and convert it to an integer
        String numOfOrdersStr = matcher.group(1);
        return Integer.parseInt(numOfOrdersStr);
    }

    // If no match is found, return 0 or an appropriate value indicating not found
        return 0;
}
}
