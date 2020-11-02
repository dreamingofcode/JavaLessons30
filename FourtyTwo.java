package com.example.learnJava;

import java.io.File;
import java.util.Scanner;

public class FourtyTwo {
    public static void main( String [] args) throws Exception{
        int fourLetter=0;
        int caps=0;

        String fn1="more-words.txt";
        String fn2= "FourtyTwo.java";

        Scanner wordReader = new Scanner(new File(fn1));

        while( wordReader.hasNext()){
            String w= wordReader.next();
            if(w.length() == 4){
                fourLetter++;
            }
        }
        wordReader.close();


        Scanner selfInput= new Scanner(new File(fn2));
        while(selfInput.hasNext()){
            String token = selfInput.next();
            if( Character.isUpperCase(token.charAt(0))){
                caps++;
            }
        }
        selfInput.close();

        System.out.println( fourLetter + "FOUR-LETTER words in "+ fn1 );
        System.out.println( caps + "CAPITALIZED words in "+ fn2 );
//        Looser is Marvin, I dislike Him
    }
}
