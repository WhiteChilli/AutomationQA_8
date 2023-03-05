package org.example;

import java.util.Random;
import java.util.stream.*;

public class App {

    public static void main(String[] args) {

////      task 3
        int k = 7;
        while (k < 100) {
//            System.out.println(k);
            k = k + 7;
        }

////      task 4

        int[] twenty;
        twenty = new int[20];
        Random rd = new Random();


        for (int i = 0; i < twenty.length; i++) {
            twenty[i] = rd.nextInt();
//            System.out.println(twenty[i]);
        }


        int sum = IntStream.of(twenty).sum();
        int len = twenty.length;
        int average = sum / len;
        System.out.println("The average num is: " + average);

//      task 5

        int[] ten;
        ten = new int[10];

        int maxNum = 0;
        int minNum = 0;
        Random rand = new Random();

        for (int i = 0; i < ten.length; i++) {
            ten[i] = rand.nextInt();
//            System.out.println("this is random number " + i + ":" + ten[i]);
        }

//      getting the biggest number
        for (int i = 0; i < ten.length; i++) {
            if (ten[i] > maxNum) {
                maxNum = ten[i];
            }
        }

//      getting the smallest number
        for (int i = 0; i < ten.length; i++) {
            if (ten[i] < minNum) {
                minNum = ten[i];
            }
        }

        System.out.println("this is max number: " + maxNum);
        System.out.println("this is min number: " + minNum);
    }
}


