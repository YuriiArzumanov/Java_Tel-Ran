package de.telran.yuriiarzumanov.hw181222;

//Вывести на консоль те двузначные числа которые делятся на 4, но не делятся на 6.

public class DivisionTest {
    public static void main(String[] args) {
        int sum = 0 ;
        for (int i = 10; i <100 ; i++) {
            if (i % 4 == 0 && i % 6 != 0 ) {
                System.out.println(i);
            }

        }
    }
}
