package org.example.tsk_1;
import java.util.HashMap;
public class StringCount {
    public static HashMap<String, Integer> stringcount(String lyrics){
        String lowerCase = lyrics.toLowerCase(); // converts
        HashMap<String, Integer> dict= new HashMap<>();
        String[] AofLyrics;
        AofLyrics = lowerCase.split("@");
        for (int i = 0; i < AofLyrics.length; i++) {
            if (dict.containsKey(AofLyrics[i]) == true){
                continue;
            }
            dict.put(AofLyrics[i],0);
        }

        for (int i = 0; i <AofLyrics.length ; i++) {
            if (dict.containsKey(AofLyrics[i])==true){
                   dict.put(AofLyrics[i],dict.get(AofLyrics[i])+1);
            }
        }
    return dict;
    }
}
