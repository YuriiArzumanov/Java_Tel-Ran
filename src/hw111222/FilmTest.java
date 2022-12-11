package hw111222;

//С консоли вводится число - возраст человека
//после чего вызывается метод, который возвращает ответ можно ли этому человеку смотреть фильм,
// у фильма ограничение по возрасту не меньше 18.
//Пример:
//на входе число 19 пишется Можно идти смотреть кино
//на входе число 7 пишется Нельзя идти смотреть кино

import java.util.Scanner;

public class FilmTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Введите возраст");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println(" можно смотреть фильм ");
        } else {
            System.out.println(" Нельзя смотреть фильм ");
        }


    }
}