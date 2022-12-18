package de.telran.yuriiarzumanov.hw181222;

//написать программу которая выводит результат умножения одного числа на другое,
// не используя знак умножения. только знаки сложения
//   Подсказка: 5 умножить на 3 = 5+5+5. (используйте цикл)

public class WithoutMultiplication {
    public static void main(String[] args) {
        int num = 9;
        int sum = 0;
        for (int i = num; i <= num ; i++) {
            for (int j = num; j <= num ; j++) {
                for (int k = num; k <=num ; k++) {
                    System.out.println( i + "+" + j + "+" + k);
                }
                System.out.println("");


            }


        }

    }
}
