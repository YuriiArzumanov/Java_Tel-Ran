package hw111222;

//Покупатель приходит в магазин печенья, 1 печенье стоит 0.5 евро
//Напишите программу которая спрашивает у покупатель сколько он хочет купить печенья,
// после этого с помощью Scanner считывается число сколько печенья хочет купить покупатель,
//после спрашивается сколько денег у покупателя и считывается число (сколько денег у покупателя),
//программа должна написать может ли купить столько печенья за такие деньги, например
//покупатель хочет купить 10 печенек, у него 4 евро ответ  нельзя
//покупатель хочет купить 12 печенек, у него 8 евро ответ  можно

import java.util.Scanner;

public class CookieTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( " Сколько Вы хотите купить печенья ? ");
        int howManyCookies = scan.nextInt();
        System.out.println( " Сколько денег у Вас ?");
        int howMoney = scan.nextInt();
        double price = 0.5 ;
        double reshowManyCookies = (int) (howMoney / price) ;

        if ( reshowManyCookies >= howManyCookies ){
            System.out.println( " Можно ");
        }
        else {
            System.out.println( "Нельзя ");

        }




        }




    }



