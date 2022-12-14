package de.telran.yuriiarzumanov.hw111222;


import java.util.Random;

//напишите программу, которая говорит выпал орел или решка
//true - орел
//false -решка
//используйте Random и метод nextBoolean,
public class MonetaTest {
    public static void main(String[] args) {
        Random random = new Random();
        boolean valMoneta = random.nextBoolean();
        boolean eagle = true ;
        boolean tails = false ;
        System.out.println(valMoneta);



    }


    //напишите программу, которая говорит выпал орел или решка
    //   true - орел
    //   false -решка
    //   используйте Random и метод nextBoolean,
    public static void check() {
        Random random = new Random();
        boolean isTail = random.nextBoolean();
        if (!isTail) { // isTail -> true   !isTail -> false
            //..
        } else {
            //
        }
    }
}
