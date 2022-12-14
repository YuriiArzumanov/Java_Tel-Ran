package de.telran.yuriiarzumanov.hw171122;
//Дано трехзначное число. Вывести на экран все цифры этого числа Например дано число 246,
// в результате должно быть 2 4 6.
// Подсказка: используйте операторы / и % (к примеру чтобы найти сколько десятых частей
// в числе 25 нужно 25 /10, чтобы найти сколько единичных частей 25 % 10)

public class threeDigitNumber {
    public static void main(String[] args) {
        int number = 246 ;
        int hundreds = number / 100 ;
        int dec = ( number % 100) / 10 ;
        int num = number % 10 ;
    System.out.println(hundreds);
    System.out.println(dec);
    System.out.println(num);

    }
}
