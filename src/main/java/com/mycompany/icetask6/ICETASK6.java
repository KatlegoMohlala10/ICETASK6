/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask6;
import java,util.Scanner;
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
    public static int countVowe(String sentence) {
        sentence = sentence.toLowerCase();
        
    }
}
