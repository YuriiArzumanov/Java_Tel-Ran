package de.telran.yuriiarzumanov.hw181222;

public class Fact {
    public static int fact(int number) {
        int res = 1;
        for (int i = 1; i < number; i++) {
            res *= i;
        }
        return res;
    }
}
