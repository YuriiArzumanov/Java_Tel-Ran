package de.telran.yuriiarzumanov.hw221222;

//Есть массив чисел. Создайте его сами, и наполните сами. Нужно напечатать на консоль:
//значение каждой ячейки массива (пройтись циклом)
//значение каждой ячейки всего массива с конца в начало
//сумму значений всех ячеек
//напечатать кого в массиве больше, четных или нечетных?
//Все элементы массива поделить на значение наибольшего элемента этого массива.
//Задача состоит из двух подзадач:
//Поиск максимума.
//Деление на него элементов массива
public class Task5 {
    public static void main(String[] args) {
        int[] myArray = new int[70];
        int sum = 0 ;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            System.out.println(myArray[i]);
        }
        for (int j = myArray.length - 1 ; j >= 0 ; j--) {
            System.out.println(myArray[j]);
        }
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);

    }

}




