package com.company.task1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        // тип входного аргумента должен быть целочисленным, либо перечислением, либо строкой и char
        switch (month) { // () - входной аргумент должен быть переменной
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default: // выполнится в том случае если не сработает не один из кейсов
                System.out.println("Unknown month");
        }

        // пример со строкой
        String text = "hello";
        switch (text) {
            case "hello":
                System.out.println("world!!!");
                break;
            default:
                System.out.println("good bye");
        }

        // вывести по номеру месяца пору года
        switch (month) { // () - входной аргумент должен быть переменной
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("НЕТ ТАКОГО СЕЗОНА");


        }


    }
}
