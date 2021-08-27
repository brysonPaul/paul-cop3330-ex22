/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        nums[0]=Integer.parseInt(strIO("Enter the first number: ",sc));
        nums[1]=Integer.parseInt(strIO("Enter the second number: ",sc));
        nums[2]=Integer.parseInt(strIO("Enter the third number: ",sc));
        int max = Integer.MIN_VALUE;
        for(int x=0 ; x < nums.length ; x++) {
           for(int y = x+1 ; y < nums.length ; y++){
               if(nums[x] == nums[y]){
                   return;
               }

           }
            if(nums[x] > max) {
                max=nums[x];
            }
        }
        System.out.println("The largest number is " + max);
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
