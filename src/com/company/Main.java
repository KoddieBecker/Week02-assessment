package com.company;
import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	// generate a random integer between 1 and 10000. Prompt the user to enter a guess.
    // For each guess, output “HIGHER” if the guess is smaller than the random integer or “LOWER”
    // if the user’s guess is larger than the random integer. Also output the new range of eligible guesses.
    //When the user guesses the random integer, output a message that says so and displays the number guesses
    // it took to get to the right number. Additionally, it should show what numbers the user guessed along
   //the way.

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        final int var = 10000;
        int guess;
        int answer;
        String another = "y";
        boolean yes = true;
        boolean no = false;



     //       while (yes) {
         var = random.nextInt(var) + 1;

     //           while (no) {
     //           if (guess < 5000); {

                    System.out.println("Guess a number between 1 and " + var);
     //           }


    //    System.out.println("LOWER");

     //   } //while true

      //                  {

      //          if answer }
      //  System.out.println("HIGHER");





     //   System.out.println("You guessed the right! "+ gen);




    } //void
} //class
