package de.telran.yuriiarzumanov.hw221222;

import java.util.Random;

//С 8 до 20 часов температура воздуха измерялась ежечасно.
// Известно, что в течение этого времени температура понижалась.
// Определите, в котором часу была впервые отмечена отрицательная температура.
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int temp = random.nextInt(-10, 10);
        int hour = 8;
        int hour2 = 20;
        int index = 0;
        for (int i = hour; i <= hour2; i++) {
            index = i;
            if (temp < 0) {
                break;
            }
        }
            System.out.println(index);
            System.out.println(temp);
    }
}