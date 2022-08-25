package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
       Map<String,String> languages = new HashMap<>();
       languages.put("Java","A compiled high level, object oriented, platform independent language");
       languages.put("Python","An interpreted high level, object oriented, platform independent language");
        languages.put("Algol","An algorithmic language");
        languages.put("Basic","Beginners all purpose symbolic instruction code");
        languages.put("Lisp","There in lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java","Blah blah blah");
        }
//        System.out.println(languages.put("Java","This is about Java"));
//        System.out.println((languages.get("Java")));
        System.out.println("===========================================");

//        languages.remove("Lisp");
        if(languages.remove("Algol","a family of algorthmic languages")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, key value paid not found");
        }


       if(languages.replace("lisp","Thsi will not work","This will work")){
           System.out.println("Lisp");
       } else{
           System.out.println("Lisp was not replaced");
       }
        System.out.println(languages.replace("Scala","This will not be added"));
        for(String key: languages.keySet()){
            System.out.println(key+" : "+languages.get(key));
        }


    }
}
