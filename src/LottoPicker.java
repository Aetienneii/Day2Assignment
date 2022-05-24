
/*
    LottoPicker will generate and print out 5 distinct random whole integer between 0-30 to the user
        1 - Figure out how to generate random number
        2 - Repeat step 1, 5 times
        3 - We need to store the result of step 2
        4 - We need to find a way to print the results that were stored along the way
 */

// casing?? Where are the capital
//     PascalCase - where the first letter and every first letter of every new word is capitalized
//     camelcase - the first letter of the first word is lower case, but every other first letter is capitalized

// void - used when nothing is expected back in return
// double - used when something is expected to return

import java.util.Random;

public class LottoPicker {
    public static void main(String[] args) {
        // dataType variableName = theValueToBeStored
        String nameOfIt = "Application started...";
        System.out.println(nameOfIt);
        Random random = new Random();

        int numberOfNumbersGenerated = 0;
        int total = 5;

        while (numberOfNumbersGenerated < total){
            int randomNumber = random.nextInt(30);
            System.out.println(randomNumber);
            numberOfNumbersGenerated = numberOfNumbersGenerated + 1;




            // (numberOfNumbersGenerated < total) -> evaluates to true or false
            // needs to be a statement that evaluates to true or false



        /*

         - Programming is the combination of iteratives and conditionals
              - Iteratives - repeating a process over and over
              - Conditionals - checking a condition (true/false) to decide what to do or if I should keep doing something

         - Control Flow - Different types of statements that affect the flow of the program
              - Iterative - loops:
                    - while loop - while a condition is true, keep executing
                    - do while loop - similar to a while loop, guaranteed to run once

              - Condition -
                    - if - checks if a condition is true, if it is it will execute once
                    - else - executes if an if statement evaluates
        */

        }
    }
}