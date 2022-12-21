package de.telran.yuriiarzumanov.hw181222;

//данная строка из 6 чисел проверить что сумма первых 3 цифр равняется сумме 2-3 цифр

public class SrNumbers {
    public static void main(String[] args) {
            String s = "123456";
            int sum = 0;
            int sum2 = 0;
            for (int i = 0; i < s.length() /2; i++) {
                int val = (int) s.charAt(i);
                sum += val;
                System.out.println(val);
            }
        }


}


