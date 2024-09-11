/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask6;
import java.util.Scanner;
/**
 *
 * @author Katlego Mohlala
 */
public class ICETASK6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Prompt user for input
        System.out.println("Enter your word");
        String input = sc.next();
        //Calculate the number of vowels using vowel count method
        int vowelCount = countVowel(input);
        //Display the number of vowels calculated
        System.out.println("Number of vowels is: " + vowelCount);
        //Close the Scanner
        sc.close();
    }
    
    //method to count the number of vowels a sentence has
    public static int countVowel(String sentence) {
        //Change the sentence to lower case to disable case sensitivity
        sentence = sentence.toLowerCase();
        //initialize the count to 0
        int count = 0;
        //Iterate through the sentence to check each character for a vowel
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            //Check if character is a vowel
            if (isVowel(ch)) {
                count++;
            } else {
            }
        }
        return count;
    }
    
    // Helper method to determine if a character is a vowel
    public static boolean isVowel(char ch) {
        // Define a string of vowels
        String vowels = "aeiou";
        
        // Check if the character is in the vowels string
        return vowels.indexOf(ch) != -1;
    }
}
