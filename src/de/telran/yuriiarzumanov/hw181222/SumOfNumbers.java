package de.telran.yuriiarzumanov.hw181222;

//Вывести на консоль сумму чисел от 0 до 100

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i ;
            System.out.println(i);
        }
            System.out.println("Сумма чисел" + sum);


    }
}
