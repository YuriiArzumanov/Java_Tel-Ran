package de.telran.yuriiarzumanov.lesson12;

//создать прогу выводящую на экран случайное сгенерированное трёхзначное натуральное число и его наибольшую цифру.

import java.util.Random;

public class TaskNumberThree {
    public static void main(String[] args) {
        Random random = new Random();
        int val = random.nextInt(100, 1000);
        System.out.println(val);
        int max = 0;
        while ( val > 0){
            int currentDigit = val % 10 ;
            val = val / 10 ;
            if (currentDigit > max){
                max = currentDigit;

            }
        }
        System.out.println(max);
    }
}
