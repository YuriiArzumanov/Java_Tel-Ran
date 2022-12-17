package de.telran.yuriiarzumanov.lesson10;

public class Palindrom {
    public static void main(String[] args) {
        String str = "арозаупаланалапуазора";
        boolean isPalidrom = true;
        for (int i = 0; i < str.length() / 2 ; i++) {
            char firstPart = str.charAt(i);
            char secondPart =str.charAt(str.length() -1 -i);
            if (firstPart != secondPart){
                isPalidrom = false;
                break;
            }

        }
        System.out.println(isPalidrom);
    }
}
