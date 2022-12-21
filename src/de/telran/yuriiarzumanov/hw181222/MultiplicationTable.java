package de.telran.yuriiarzumanov.hw181222;

//Необходимо написать программу, которая проверяет пользователя на знание таблицы умножения.
// Пользователь сам вводит два
//целых однозначных числа. Программа задаёт вопрос: результат умножения первого числа на второе.
//Пользователь должен ввести ответ и увидеть на экране правильно он ответил или нет.
// Если нет – показать еще и правильный результат.


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int s = scanner.nextInt();
        int actual = scanner.nextInt();
        if (f * s == actual) {
            System.out.println("Правильно");
        } else {
            System.out.printf("неправильно, должно быть  %s", f * s);
        }
    }
}






