package de.telran.yuriiarzumanov.hw20;
//1. Дана коллекция Arrays.asList("f10", "f15", "f2", "f4", "f4"). Нужно выполнить сортировку в обратном алфавитном
//порядке и удалить дубликаты. В массиве должны оказаться только уникальные значения

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void Sorting(String [] args) {
        List<String> strings = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        Collections.sort(strings, Collections.reverseOrder());// Сортировка в обратном алфавитном порядке
        List<String> uniqueStrings = new ArrayList<>(strings);
        uniqueStrings.removeIf(s -> Collections.frequency(uniqueStrings, s) > 1);// Удаление дубликатов
        System.out.println(uniqueStrings);// Вывод уникальных значений
    }
}

// код сначала сортирует элементы в обратном алфавитном порядке с помощью Collections.sort. Затем он создает
// новый список uniqueStrings, который будет содержать только уникальные значения, и удаляет дубликаты из исходного
// списка с использованием метода removeIf. После выполнения этого кода, в списке uniqueStrings будут только
// уникальные значения в обратном алфавитном порядке.
