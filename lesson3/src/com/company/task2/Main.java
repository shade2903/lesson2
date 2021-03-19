package com.company.task2;

public class Main {
    public static void main(String[] args) {
        // Массивы
        // Массив - это совокупность элементов одного типа
        int [] array = new int [5];
        // new - динамическое выделение памяти
        // [5] - размерность массива( количество элементов массива )
        // все массивы в JAVA должны иметь фиксированный размер
        // индексация элементов массива начинается с 0;
        array [0] = 9; // присвоение о-й ячейке значения
        array [4] = 11;
        array [1] = array[0] + array[4];
        for(int i=0; i < array.length; i++ ){
            System.out.println(array[i]);

        }
        System.out.println(array.length);// количество элементов массива


        // Многомерные массивы
        float [][] multiArray = new float[3][4];
        multiArray[1][0] = 14.45f;
        // m[1].length - возвращение длинны подмассива

        System.out.println(multiArray.length);
        System.out.println(multiArray[1].length);
        System.out.println(multiArray.length*multiArray[0].length);// общее количество ячеек
        // inline объявление массивов
        int [] arr2 = {1,2,3,4,5,6};
        System.out.println("-------------------");
        System.out.println(arr2[3]);
        String [] arr3 = {"Hello", "World", "!!!!"};
        System.out.println(arr3[2]);
        int [][] arr4 = {{1,2}, {3,4}, {5,6}};
        // 1,2
        // 3,4
        // 5,6



    }
}
