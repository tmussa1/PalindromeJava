package com.company;

/*
 * PalindromeTester.java
 *
 * Tests a string as entered by the user
 * to see whether or not it is a palindrome or not.
 * A palindrome would be the same string forwards
 * as it is backwards.
 * Examples: Anna, civic and of, course:
 * A man a plan a canal Panama.
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // The palindrome will be entered by the user at the keyboard
        Scanner in = new Scanner(System.in);

        System.out.println("Palindrome Checker");
        System.out.print("What phrase would you like to check? ");
        String original = in.nextLine();

        // Convert to lower case to simplify comparing strings
        String phrase = original.toLowerCase();

        String backwards = ""; //to be compared
        String forwardLetter = ""; //to be compared

        char [] charPhrase = phrase.toCharArray(); //change to a character array


        // loop through the string forwards, starting with the first character and append to a string
        for(int i = 0; i < charPhrase.length; i++){

            if( charPhrase[i] >= 'a' && charPhrase[i] <= 'z'){
                forwardLetter += charPhrase[i];
            }
        }
        // loop through the string backwards, starting with the last character and append to a string
        for (int i = charPhrase.length - 1; i >= 0; i--) {

            if( charPhrase[i] >= 'a' && charPhrase[i] <= 'z'){
                backwards += charPhrase[i];
            }

            /*
            // Extract each letter as the next character
            // and build the backwards string
            String letter = phrase.substring(i, i + 1);
            backwards += letter;
            */
        }

        // A palindrome is a word or phrase that is the same forward or
        // backward. This is where we check that.
        if (forwardLetter.equals(backwards)) {
            System.out.println(original + " is a palindrome!");
        } else {
            System.out.println(original + " is not a palindrome!");
        }

    }
}