package de.telran.yuriiarzumanov.hw141222;

////Переменная num может принимать 4 значения: 1, 2, 3 или 4. Если она имеет значение '1',
//// то в переменную result запишем 'зима', если имеет значение '2' – 'весна' и так далее.
//// Решите задачу через switch-case.

import java.util.Random;

public class NumVal {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(1,4);

        if ( num == 1) {
            System.out.println(" Зима ");
        } else if ( num == 2 ) {
            System.out.println(" Весна ");
        } else if ( num == 3 ) {
            System.out.println(" Лето ");
        } else if ( num == 4 ) {
            System.out.println(" Осень ");
        } else {
            System.out.println();
        }
    }
}
