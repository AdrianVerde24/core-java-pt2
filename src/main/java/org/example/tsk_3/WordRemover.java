package org.example.tsk_3;

import java.util.*;


public class WordRemover {
        public static ArrayList<String>  wordremover(String lyrics){ // "rex,arc,rex"
            String lowerCase = lyrics.toLowerCase();
            ArrayList<String> LofLyrics = new ArrayList<>(); // Create an ArrayList object
            lowerCase.replaceAll(" ", "@"); // Replaced undesirable char in string
            LofLyrics.addAll(Arrays.asList(lowerCase.split("@")));
            LofLyrics.removeAll(List.of("yellow","Submarine","submarines","submarine"," Submarine"," yellow",""));
            return LofLyrics;
        }
    }
