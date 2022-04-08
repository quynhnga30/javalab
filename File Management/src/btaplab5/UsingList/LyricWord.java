package btaplab5.UsingList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LyricWord {
    private static final String[] lyric = {"you", "say", "it", "best", "when", "you", "say", "nothing", "at", "all"};
    public static void main(String[] args){
        //create a list that's implemented by ArrayList
        List words = new ArrayList();
          // add all string in String array to list
        for (String w : lyric)
            words.add(w);

        //Traverse the list
        for (Object o : words)
            System.out.print(o + " ");
        System.out.println("\n-------------------");

        System.out.println("Contains [you]?:" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
        System.out.println("Where's [say]?:" + words.indexOf("say"));
        System.out.println("Where's the last [say]?:  " + words.lastIndexOf("say"));
        //sort words
        Collections.sort(words);
        //show all elememt of words
        for (Object o : words) {
            System.out.println(o + " ");
            
        }

    }
}
