package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if(i==7){
                continue;
            }
            System.out.println(i);
        }

        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));

        try {
            int[] numbers = {1, 2, 3, 4, 5,};
            System.out.println(numbers[6]);
        }
        catch(Exception e) {
            System.out.println("error message");
        }
    }





}
