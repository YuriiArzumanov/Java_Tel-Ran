package de.telran.yuriiarzumanov.hw20;
//2. Пусть дана коллекция состоящая из строк. Arrays.asList(«Highload», «High», «Load», «Highload»).
//   - Вывести, сколько раз объект «High» встречается в коллекции.
//   - Какой элемент в коллекции находится на первом месте? Если мы получили пустую коллекцию, то пусть возвращается 0.

import java.util.Arrays;
import java.util.List;

public class High {
    public static void High (String [] args) {
        List<String> strings = Arrays.asList("Highload", "High", "Load", "Highload");
        long countHigh = strings.stream().filter(s -> s.equals("High")).count();//сколько раз "High" встречается в коллекции
        System.out.println("Количество 'High' в коллекции: " + countHigh);
        String firstElement = strings.isEmpty() ? "0" : strings.get(0);// первый элемент в коллекции или возвращаем 0
        System.out.println("Первый элемент в коллекции: " + firstElement);
    }
}
//сначала использует stream() для создания потока из списка строк. Затем он считает количество раз, которое "High"
// встречается в коллекции, с помощью filter и count. И, наконец, он находит первый элемент в коллекции с
// использованием get(0) или возвращает "0", если коллекция пуста.