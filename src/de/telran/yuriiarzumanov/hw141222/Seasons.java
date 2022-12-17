package de.telran.yuriiarzumanov.hw141222;

//В переменной month лежит какое-то число из интервала от 1 до 12.
// Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).

import java.util.Scanner;


public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch(month) {
            case 1,2,12:
                System.out.println("зима");
                break;
            case 3,4,5:
                System.out.println("весна");
                break;
            case 6,7,8:
                System.out.println("лето");
                break;
            case 9,10,11:
                System.out.println("осень");
                break;
            default:
                System.out.println("non supported");
        }
    }
}
