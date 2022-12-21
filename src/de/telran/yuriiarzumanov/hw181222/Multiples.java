package de.telran.yuriiarzumanov.hw181222;

//Вывести на консоль произведение двузначных нечетных чисел кратных 13.


public class Multiples {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 13 == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

