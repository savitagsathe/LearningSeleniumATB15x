package com.thetestingacademy;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //Write a Java program to count the total number of characters in a given string (excluding spaces).ava program to convert a given string into uppercase and print the result.
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1=s.nextLine();
        //tring rev="";

for (int i=1;i<= str1.length();i++)  {
        System.out.print(str1.charAt(str1.length()-i));
    }
}}