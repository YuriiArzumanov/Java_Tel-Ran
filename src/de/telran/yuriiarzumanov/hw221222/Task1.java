package de.telran.yuriiarzumanov.hw221222;

//Создайте массив А[1..100] с помощью генератора случайных чисел
// и выведите его на экран.
// Увеличьте все его элементы в 2 раза.


import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        int count = 0 ;
        for (int i = 1; i < numbers.length ; i++) {
            count++;
        }
        System.out.println(count * 2);

    }

}
