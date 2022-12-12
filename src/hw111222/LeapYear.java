package hw111222;

// напишите программу, которая принимает 1 число - год
// (можно с помощью Scanner или с помощью Random)
// и выводит високосный год или нет

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( " Введите год ");
        int year = scan.nextInt();
        if ((year % 4 == 0 ) && (year % 100 != 0)) {
            System.out.println( year + " високосный год ");
        } else if (( year % 4 == 0 ) && ( year % 100 == 0 ) && ( year % 400 == 0)) {
            System.out.println( year + " високосный год ");

        } else {
            System.out.println( year + " не високосный год ");
        }
    }
}
