package com.example.learnJava;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FourtyThree {
    public static void main(String[] args) throws Exception{
        Scanner keyboard = new Scanner(System.in);
        String coin, again, bestName, saveFileName = "coin-flip-score.txt";
        int streak = 0, best;
        boolean gotHeads;

        File f = new File(saveFileName);
        if(f.exists() && f.length() > 0){ /// if a game has been played and file has been created, lets pull out the
            Scanner input = new Scanner(f); /// last score, or the last highest score if played more than once
            bestName= input.next();
            best = input.nextInt();
            input.close();
            System.out.println("High Score is "+ best);
            System.out.println(" flips in a row by "+ bestName);
        }else{
            System.out.println("Save game file doesn't exist");
            best = -1;
            bestName= "";
        }
        do{
            gotHeads = Math.random() < 0.5;

            if( gotHeads)
                coin= "Heads";
                else
                    coin="TAILS";
                System.out.println("You flipped a coin and got "+ coin);


            if(gotHeads){
                streak++;
                System.out.println("\t That's  "+ streak + " in a row!");
                System.out.println("\t Would you like to flip again? (Y/N)");
                again= keyboard.next();
            }
            else{
                streak = 0;
                again= "N";
            }


        }while(again.equals("Y"));

        System.out.println("Final Score "+ streak);

        if(streak > best){
            System.out.println("That's a new high score!");
            System.out.println("Your name: ");
            bestName = keyboard.next();
            best=streak;

        }else if( streak == best){
            System.out.println("That ties the high score!");

        }else{
            System.out.println("You suck!");

        }
        PrintWriter out = new PrintWriter(f); // the text file is either created or updated.
        out.println(bestName);
        out.println(best);
        out.close();

    }
}
