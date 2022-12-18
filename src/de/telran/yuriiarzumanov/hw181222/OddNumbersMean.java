package de.telran.yuriiarzumanov.hw181222;

//вывести на консоль среднее значение всех нечетных чисел от 0 до 100
//   Подсказка: сначала нужно в цикле посчитать сумму,
//   после цикла разделить сумму на количество элементов

public class OddNumbersMean {
    public static void main(String[] args) {
        int sum = 0 ;
        for (int i = 1; i <=100; i+=2) {
            sum += i;
            System.out.println(i);
        }
            System.out.println(sum);

    }
}

// Дальше не пойму действия какие делать "после цикла разделить сумму на количество элементов"
