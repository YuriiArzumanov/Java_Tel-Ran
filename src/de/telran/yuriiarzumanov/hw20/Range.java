package de.telran.yuriiarzumanov.hw20;
//3. Нужно пройтись от -40 до 40, возвести каждое значение в квадрат, отфильтровать все что больше 100 и собрать в
// - List
//- Set
//- LinkedList (посмотрите в документации что принимает `Collectors.toCollection(..)`)

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Range {
    public static void Range (String[] args) {
        List<Integer> squaredList = IntStream.rangeClosed(-40, 40)
                .map(x -> x * x)
                .filter(x -> x > 100)
                .boxed() // Преобразуем в Integer
                .collect(Collectors.toList());
        Set<Integer> squaredSet = IntStream.rangeClosed(-40, 40)
                .map(x -> x * x)
                .filter(x -> x > 100)
                .boxed() // Преобразуем в Integer
                .collect(Collectors.toSet());
        LinkedList<Integer> squaredLinkedList = IntStream.rangeClosed(-40, 40)
                .map(x -> x * x)
                .filter(x -> x > 100)
                .boxed() // Преобразуем в Integer
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("List: " + squaredList);
        System.out.println("Set: " + squaredSet);
        System.out.println("LinkedList: " + squaredLinkedList);
    }
}
//IntStream.rangeClosed создания диапазона значений от -40 до 40, затем возводит каждое значение в квадрат,
// фильтрует числа, которые больше 100, и собирает результаты в List, Set и LinkedList с помощью методов collect.
