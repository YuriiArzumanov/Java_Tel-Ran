package de.telran.yuriiarzumanov.hw221222;

// Есть два массива char[] first = {‘a’,’b’,’c’,’d’,’e’}
// и char[] second = {‘f’,’g’,’h’,’i’,’g’}
// создать массив соединяющий два этих массива в один новый

public class Task1level1 {
    public static void main(String[] args) {
        char[] first = {'a', 'b', 'c', 'd', 'e'};
        char[] second = {'f', 'g', 'h', 'i', 'g'};
        for (int i = 0; i < first.length; i++) {
            System.out.println(first[i]);
        }
        for (int j = 0; j < second.length; j++) {
            System.out.println(second[j]);
        }

    }
}
