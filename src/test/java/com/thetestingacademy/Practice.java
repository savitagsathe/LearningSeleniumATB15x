package com.thetestingacademy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int num[]={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

//        Arrays.sort(num);
//        System.out.println(num[num.length-1]);
          int max=num[0];
          for (int i=0;i<num.length;i++){
              if (num[i]>max){
                  max=num[i];
              }
          }
        System.out.println("Largest num in array is="+max);
        int min = num[0];
        for (int i = 0; i < num.length; i++) {

            if (num[i] < min) {
                min = num[i];
            }


        }

        System.out.println(min);

    }}