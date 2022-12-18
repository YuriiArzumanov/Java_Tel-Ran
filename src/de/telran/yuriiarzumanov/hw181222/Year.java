package de.telran.yuriiarzumanov.hw181222;

//пользователь вводит с консоли (Scanner) 2 числа (2 года)
//написать программу, которая считает сколько годов между двумя числами високосные
//Например
//(2000,2022) -> 6 ( для простоты считайте что год високосный если делится на 4 без остатка)


import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        System.out.println(" Введите год ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(" Введите еще один год ");
        Scanner scan = new Scanner(System.in);
        int year2 = scanner.nextInt();
        int sum = 0;
        for (int i = year; i < year2; i++) {
            if (i % 4 == 0) {
                sum++;
            }
        }
        System.out.println( sum + " годов между високосными " );
    }

}