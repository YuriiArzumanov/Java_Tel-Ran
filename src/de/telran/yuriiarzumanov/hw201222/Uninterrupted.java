package de.telran.yuriiarzumanov.hw201222;

//Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введёт 0.
// После ввода нуля, показать на экран количество чисел, которые были введены,
// их общую сумму и среднее арифметическое. Подсказка: необходимо объявить переменную-счетчик,
// которая будет считать количество введенных чисел, и переменную,
// которая будет накапливать общую сумму чисел.

import java.util.Scanner;

public class Uninterrupted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i ;
        int sum = 0 ;
        int count = 0 ;
        do {
            i = scanner.nextInt();
            sum += i;
            if (i != 0) {
                count++;
            }
        }while ( i != 0) ;
        System.out.println(sum);
        System.out.println(sum/count);
    }
}
