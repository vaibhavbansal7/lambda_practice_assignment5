package com.knoldus;
import java.util.*;

public class MainClass {
    public static void main (String [] args){
        ArrayList<String> distinctList = new ArrayList<>(Arrays.asList("java", "scala", "java", "clojure", "clojure"));

        DistinctWords distinctWords = new DistinctWords();

        List<String> distinctWordList = distinctWords.distinctListOfWords.getDistincts(distinctList);

        System.out.println(distinctWordList);

    }
}
