package de.telran.yuriiarzumanov.hw221222;

// Есть два массива char[] first = {‘a’,’b’,’c’,’d’,’e’}
// и char[] second = {‘f’,’g’,’h’,’i’,’g’}
// создать массив соединяющий два этих массива в один новый

public class Task1level1 {
    public static void main(String[] args) {
        char[] first = {'a', 'b', 'c', 'd', 'e'};
        char[] second = {'f', 'g', 'h', 'i', 'g'};
        char[] result = new char[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            result[i + first.length] = second[i];
        }
        System.out.println(result);

    }


}

