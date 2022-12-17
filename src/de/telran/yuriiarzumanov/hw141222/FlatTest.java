package de.telran.yuriiarzumanov.hw141222;


// В первом подъезде квартиры с 1 по 20. Во втором с 21 по 48. В третьем с 49 по 90.
// Пользователь вводит номер квартиры.
// Программа должна указать в каком подъезде находится данная квартира.


import java.util.Scanner;

public class FlatTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ( number <= 0 || number > 90) {
            System.out.println(" такой квартиры нет ");
        } else if ( number <= 20) {
            System.out.println(" Подъезд + 1");
        }
        else if ( number <= 48) {
            System.out.println(" Подъезд + 2");
        } else {
            System.out.println(" Подъезд + 3 ");
        }
    }
}

