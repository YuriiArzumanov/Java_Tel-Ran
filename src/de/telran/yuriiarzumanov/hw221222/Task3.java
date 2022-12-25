package de.telran.yuriiarzumanov.hw221222;

//Создайте массив из пяти фамилий и выведите их на экран столбиком.

public class Task3 {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] = " Mukha ";
        str[1] = " Arzumanov ";
        str[2] = " Ambrosio ";
        str[3] = " Pagano " ;
        str[4] = " Russo " ;
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);

        }
    }
}



