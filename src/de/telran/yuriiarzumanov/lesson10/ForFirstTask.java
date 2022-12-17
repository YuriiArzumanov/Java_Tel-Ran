package de.telran.yuriiarzumanov.lesson10;

public class ForFirstTask {
    public static void main(String[] args) {
        int sum = 0 ;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0){
                System.out.println(i);
                sum += i;
            }



        }
        System.out.println( "Сумма" + sum  );
    }
}
 /* если поменять делить на 2 но не елить на 3
  public class ForFirstTask
  public static void main(String[] args) {
       int sum = 0 ;
        for (int i = 0; i < 100; i++) {
            if (i % 3 != 0 && i % 2 == 0 ){
                System.out.println(i);
                sum += i;
            }



        }
        System.out.println( " Сумма " + sum  );

  деления равные 3

public class ForFirstTask {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 1; i < 100; i++) {// 1 2 3не делится на 3 то пропустить
			if (i % 3 != 0) {
				continue;
			}
			System.out.println(i);
			sum += i;
			count++;
			if (count == 3) {
				break;
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println(count);
	}
}

  */
