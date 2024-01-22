package org.example.tsk_2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.Comparator;

import java.util.ArrayList; // import the ArrayList class


public class Liststringcount {
        public static ArrayList<String>  stringcountwithlist(String lyrics){ // "rex,arc,rex"
            String lowerCase = lyrics.toLowerCase();
            ArrayList<String> LofLyrics = new ArrayList<>(); // Create an ArrayList object
            LofLyrics.addAll(Arrays.asList(lowerCase.split("@")));


            Set<String> uniqueWords = new LinkedHashSet<>(LofLyrics);
            Set<String> duplicateWords = new HashSet<>();

            for (String word : LofLyrics) {
                if (!uniqueWords.add(word)) {
                    duplicateWords.add(word);
                }
            }

            ArrayList<String> wordsListWithoutDuplicates = new ArrayList<>(LofLyrics);
            wordsListWithoutDuplicates.removeAll(duplicateWords);
            //System.out.println("Duplicate words in the song: " + duplicateWords); for testing
            //System.out.println("After Removing Duplicate Words: " + wordsListWithoutDuplicates); for testing

            ArrayList<String> sortedByLength = new ArrayList<>(uniqueWords);
            sortedByLength.sort(Comparator.comparingInt(String::length));
            //System.out.println("Words sorted by length: " + sortedByLength);  for testing

            return sortedByLength;
        }
    }
