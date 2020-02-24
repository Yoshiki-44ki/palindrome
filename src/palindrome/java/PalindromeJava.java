/*
 *Yoshiki Harada
 * 24/02/2020
 * thid code 
 */

package palindrome.java;

/**
 *
 * @author yohar3320
 */

import java.util.Scanner;
public class PalindromeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in); //declare a scanner 
        System.out.println("Type a palindrome");
       
        String line = in.nextLine();//read userinput 
        char store [] = new char [line.length()];//use to store letters
        
        for (int i =0; i<line.length();i++){//repeats as many times as the number of letters in the word
        store[i]=line.charAt(i);//stores in an array in the order of the letters 
        }
        
        for (int i = 0; i<line.length(); i++ ){//make an array to output in the oppsite order 
        System.out.print(store[line.length()-1-i]);
        }
        
        
    }
    
}
